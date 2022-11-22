// main
package main

import (
	"fmt"
	"html/template"
	"net/http"

	"github.com/gorilla/mux"
)

func handler_json1(response http.ResponseWriter, request *http.Request) {

	t, _ := template.ParseFiles("templates/1.json")

	err := t.Execute(response, nil)

	if err != nil {
		http.Error(response, err.Error(), 500)
		return
	}
}

func handler_json2(response http.ResponseWriter, request *http.Request) {

	t, _ := template.ParseFiles("templates/2.json")

	err := t.Execute(response, nil)

	if err != nil {
		http.Error(response, err.Error(), 500)
		return
	}
}

func handler_json3(response http.ResponseWriter, request *http.Request) {

	t, _ := template.ParseFiles("templates/3.json")

	err := t.Execute(response, nil)

	if err != nil {
		http.Error(response, err.Error(), 500)
		return
	}
}

func handler_html(response http.ResponseWriter, request *http.Request) {

	id := request.URL.Query().Get("id")
	if id == "" {
		fmt.Fprintf(response, "Not Found id")
		return
	}

	var sFile string
	if id == "1" {
		sFile = "templates/test1.html"
	} else if id == "2" {
		sFile = "templates/test2.html"
	} else if id == "3" {
		sFile = "templates/test3.html"
	}
	//fmt.Fprintf(response, "%s", sFile)

	t, err := template.ParseFiles(sFile)
	if err != nil {
		http.Error(response, err.Error(), 500)
		return
	}

	err2 := t.Execute(response, id) //err2 := t.Execute(response, nil)
	if err != nil {
		http.Error(response, err2.Error(), 500)
		return
	}
}

func main() {

	router := mux.NewRouter()
	router.HandleFunc("/", handler_html)
	router.HandleFunc("/1", handler_json1)
	router.HandleFunc("/2", handler_json2)
	router.HandleFunc("/3", handler_json3)
	http.ListenAndServe(":8080", router)

	fmt.Println("http://localhost:8080?id=1")
	fmt.Println("http://localhost:8080/1")

	fmt.Println("http://localhost:8080?id=2")
	fmt.Println("http://localhost:8080/2")

	fmt.Println("http://localhost:8080?id=3")
	fmt.Println("http://localhost:8080/3")
}
