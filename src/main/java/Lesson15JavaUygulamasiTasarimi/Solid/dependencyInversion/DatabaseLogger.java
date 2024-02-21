package Lesson15JavaUygulamasiTasarimi.Solid.dependencyInversion;

class DatabaseLogger implements Logger
{
    @Override
    public void log(String message)
    {
        // Mesajı veritabanına kaydetme işlemi
    }
}