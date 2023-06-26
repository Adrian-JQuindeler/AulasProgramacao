#Aqui estão sendo importados o que será usado no código, no caso, a biblioteca do Discord e os comandos nele utilizados.
import datetime
import discord
from discord.ext import commands, tasks

#Nesta linha está endo criada as intenções do bot.
intents = discord.Intents.all() 
#Nas duas linhas seguintes estão sendo definidas as intenções que o bot terá.
intents.typing = False
intents.presences = False

# Define o prefixo que será entendido pelo Bot para chamar comandos e eventos.
bot = commands.Bot("!")
palavroes = {"fdp","vsf","desgraçado","arrombado","pnc",}
#Evento criado para quando o bot rodar imprimir no terminal que ele está funcionando.
@bot.event
async def on_ready():
    print(f'Bot conectado como  {bot.user.name}')

#Comando para dar oi.
@bot.command(name='oi')
async def send_hello(ctx):
    name = ctx.author.name
    response = "'Oi' é a dama da noite que deu-lhe a luz " + name + ", se não possúi algo a dizer, gostaria que se dirigise para o centro de seu orifício excretor"
    await ctx.send(response)

#Evento criado para quando o bot receber uma mensagem
@bot.event
async def on_message(message):
    if message.author == bot.user:
        return
    for palavra in palavroes:
        if palavra.upper() in message.content.upper():
            await message.channel.send(
                f"Por obséquio {message.author.name}, não use este dialeto desagrágravel, apesar de ser típico de pessoas com déficit de massa encefálica, como você."
                )
            #await message.delete()
    await bot.process_commands(message)

#Comando para dizer a data.
@bot.command(name='data')
async def current_time(ctx):
    data = datetime.datetime.now()
    data = data.strftime("%d/%m/%Y")
    hora = datetime.datetime.now()
    hora = hora.strftime("%H:%M")
    await ctx.send("Hoje é " + data + ", e são " + hora + ". Já está com o cérebro tão corroído que não sabe as horas?")

#Comando para calcular.
@bot.command(name='calcular')
async def calculate_expression(cxt, *expression):
    expression = ''.join(expression)
    response = eval(expression)
    await cxt.send("A resposta é " + str(response))

bot.run('MTExOTc2MTg3NTU1MTQwNDA4NQ.GYijrh.IBRFW71kyGIfgdAAbDFtoSQj6nYWgdTgc2Iex0')
