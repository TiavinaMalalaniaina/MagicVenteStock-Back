-- 📌 Crée la base de données (à exécuter une seule fois)
CREATE DATABASE magicventestock;

-- Utiliser la base
\c magicventestock;

-- 📦 Création de la table produit
CREATE TABLE t_produit (
    reference VARCHAR PRIMARY KEY,
    libelle VARCHAR NOT NULL,
    prix REAL NOT NULL,
    est_du_jour BOOLEAN NOT NULL DEFAULT FALSE,
    quantite_en_stock INTEGER NOT NULL
);

INSERT INTO t_produit (reference, libelle, prix, est_du_jour, quantite_en_stock) VALUES
('P001', 'Lame d’Elendil reforgée', 150.0, TRUE, 2),
('P002', 'Cape d’invisibilité de Hobbit', 75.0, FALSE, 5),
('P003', 'Sacoche en Cuir du Gondor', 5.0, FALSE, 50);
