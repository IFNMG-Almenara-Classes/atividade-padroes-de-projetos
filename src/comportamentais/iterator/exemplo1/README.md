# Exemplo 1 — Iterator: Percorrendo uma Playlist

## Problema

`Playlist` guarda as músicas num array de tamanho fixo e expõe esse array
diretamente através de `getMusicas()`, junto com `getQuantidade()` para o
cliente saber até onde ler.

## Por que incomoda

O cliente precisa conhecer os detalhes internos da `Playlist` — que é um
array de tamanho fixo, e que só as primeiras `quantidade` posições são
válidas — para conseguir percorrê-la corretamente. Se a estrutura interna
mudar (por exemplo, para não ter mais limite de músicas), todo código
cliente que depende de array e de `quantidade` quebra.

## Solução (Iterator)

`Playlist` passa a implementar `Iteravel<String>` e expõe só
`criarIterador()`, devolvendo um `Iterador<String>` (`hasNext()` /
`next()`). A forma de percorrer a coleção fica isolada em
`PlaylistIterador`, que é o único que conhece a estrutura interna.

## O que mudou

O cliente percorre a playlist só com `hasNext()`/`next()`, sem saber nada
sobre array, índice ou tamanho. `Playlist` pode trocar sua estrutura
interna (array, lista, banco de dados) livremente — só `PlaylistIterador`
precisaria acompanhar a mudança, e o contrato com o cliente continua o
mesmo.
