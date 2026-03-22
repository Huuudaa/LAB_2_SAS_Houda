# TP Lab 2 — Calcul des taxes immobilières

## Description

Application Android permettant de calculer le montant total des taxes immobilières
d'un bien selon trois critères : la superficie, le nombre de chambres, et la présence
ou non d'un jardin.

---

## Fonctionnalités

- Saisie de la superficie en m²
- Saisie du nombre de chambres
- Case à cocher pour la présence d'un jardin
- Calcul et affichage détaillé : taxe de base, taxe supplémentaire, taxe totale

---

## Formule de calcul

```
Taxe de base        = superficie × 2
Taxe supplémentaire = (chambres × 50) + (jardin ? 100 : 0)
Taxe totale         = taxe de base + taxe supplémentaire
```

### Exemple

| Champ | Valeur |
|---|---|
| Superficie | 120 m² |
| Chambres | 4 |
| Jardin | Oui |

```
Taxe de base        = 120 × 2       = 240 DH
Taxe supplémentaire = (4×50) + 100  = 300 DH
Taxe totale                          = 540 DH
````

---

## Fichiers principaux

### `activity_main.xml`

| Composant | ID | Rôle |
|---|---|---|
| `EditText` | `edit_superficie` | Saisie de la superficie |
| `EditText` | `edit_chambres` | Saisie du nombre de chambres |
| `CheckBox` | `check_jardin` | Présence d'un jardin |
| `Button` | `btn_estimer` | Lancer le calcul |
| `TextView` | `text_resultat` | Afficher le résultat |

### `MainActivity.java`

- `Double.parseDouble()` pour convertir la superficie en nombre décimal
- `Integer.parseInt()` pour convertir le nombre de chambres en entier
- `isChecked()` pour lire l'état de la CheckBox
- Opérateur ternaire `(jardin ? 100 : 0)` pour le supplément conditionnel
- `setText()` pour afficher le résultat sur 3 lignes

---

## Concepts utilisés

| Concept | Description |
|---|---|
| `EditText` | Champ de saisie utilisateur |
| `CheckBox` | Case à cocher booléenne |
| `Double.parseDouble()` | Conversion String → double |
| `Integer.parseInt()` | Conversion String → int |
| `isChecked()` | Lecture de l'état d'une CheckBox |
| Opérateur ternaire `? :` | Condition sur une ligne |
| `dp` | Unité de taille adaptée à la densité écran |
| `sp` | Unité de taille adaptée pour les textes |

---

## Environnement

- **IDE** : Android Studio
- **Langage** : Java
- **API cible** : 36.1
- **Émulateur** : Medium Phone API 36.1
