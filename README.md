# 📱 Contact Manager – Exercice Java

Ce projet est un exercice simple en Java visant à implémenter un gestionnaire de contacts.  
Il permet d'ajouter des contacts manuellement et d'en rechercher un par son nom pour afficher son numéro de téléphone.

## 🎯 Objectif pédagogique

- Manipulation de classes et d’objets en Java
- Création et utilisation de méthodes personnalisées (`addContact`, `searchContact`)
- Stockage et recherche de données simples
- Utilisation de l’IDE IntelliJ IDEA

---


## ⚙️ Prérequis

- Java JDK 17+ ☕ *(ou la version utilisée dans ton IntelliJ)*
- IntelliJ IDEA (Community ou Ultimate)
- Avoir un projet Java configuré (JDK lié)

---

## 🚀 Instructions pour exécuter dans IntelliJ

1. Ouvre **IntelliJ IDEA** et clique sur **"Open"** pour ouvrir le dossier `Exercice-01_DevOps`.
2. Vérifie que le **JDK** est bien configuré (`File > Project Structure > SDKs`).
3. Clique-droit sur `Main.java` > **Run 'Main.main()'**.
4. Le programme affichera dans la console le numéro de téléphone du contact recherché (`Naej`).

---

## 💡 Fonctionnement du programme

- La classe `Contact` contient deux champs : `name` et `phoneNumber`.
- La classe `ContactManager` permet d’ajouter des contacts à une liste interne.
- Ensuite, on recherche un contact par son nom via `searchContact(String name)`.
- Si le contact est trouvé, son numéro est affiché dans la console :

## 🛠️ Auteur

> Réalisé par KOUASSI KOUAME JEAN-ELIE