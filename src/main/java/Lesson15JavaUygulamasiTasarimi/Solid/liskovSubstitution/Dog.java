package Lesson15JavaUygulamasiTasarimi.Solid.liskovSubstitution;

import Lesson15JavaUygulamasiTasarimi.Solid.liskovSubstitution.Animal;

class Dog extends Animal
{
    @Override
    public void MakeSound()
    {
        System.out.println("Dog is barking.");
    }
}