import uvicorn
from fastapi import FastAPI, Request
from fastapi.responses import FileResponse
from fastapi.templating import Jinja2Templates

app = FastAPI()
templates = Jinja2Templates(directory="templates")


# http://127.0.0.1:8000/1
# http://127.0.0.1:8000/2
# http://127.0.0.1:8000/3
@app.get("/{index}")
async def json(index):
    # print(index)
    if index == "1":
        return FileResponse("templates/1.json")
    elif index == "2":
        return FileResponse("templates/2.json")
    elif index == "3":
        return FileResponse("templates/3.json")


# http://127.0.0.1:8000/api/1
@app.get("/api/1")
async def api1():
    return FileResponse("templates/test1.html", media_type='text/html')


# http://127.0.0.1:8000/api/2
@app.get("/api/2")
async def api2():
    return FileResponse("templates/test2.html", media_type='text/html')


# http://127.0.0.1:8000/api/3
@app.get("/api/3")
async def api3():
    return FileResponse("templates/test3.html", media_type='text/html')


@app.get("/")
async def root():
    return FileResponse("templates/test1.html", media_type='text/html')


if __name__ == "__main__":
    uvicorn.run(app, host="127.0.0.1", port=8000)
