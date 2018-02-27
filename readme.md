# Exemple d'utilisation des categories JUnit

## Lancement des tests d'une catégorie simple

```shell
mvn test -Dgroups="info.francoisandre.testcategory.category.Unit"
mvn test -Dgroups="info.francoisandre.testcategory.category.Integration"

## Lancement des tests en excluant une ou plusieurs catégories

```shell
mvn test -DexcludedGroups="info.francoisandre.testcategory.category.Integration" 
mvn test -DexcludedGroups="info.francoisandre.testcategory.category.Integration,info.francoisandre.testcategory.category.Unit"

