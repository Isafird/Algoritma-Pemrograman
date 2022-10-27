from ursina import *

app = Ursina()
camera.orthographic = True
camera.pov = 10

car = Entity(
    model='quad',
    texture='assets\car',
    collider='box',
    scale=(2,1),
    rotation_z=-90
)

def update():
    car.x -=held_keys['a']*5*time.dt
    car.x +=held_keys['d']*5*time.dt

    
app.run()