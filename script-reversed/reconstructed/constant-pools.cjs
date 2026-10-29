'use strict';
// Readable reconstructions of main module functions f_0001..f_0004.
// These decode constant pools; this file is not the complete game modification.
function makeStringLookup(encoded, key = 14947) {
  let cache = null;
  return function lookup(index) {
    if (cache === null) {
      const decoded = new Array(encoded.length);
      for (let i = 0; i < encoded.length; i++) {
        decoded[i] = String.fromCharCode(encoded.charCodeAt(i) ^ key);
      }
      cache = decoded.join('').split('\0');
    }
    return cache[index];
  };
}
function makeNumberLookup(encoded, key = 14947) {
  let cache = null;
  return function lookup(index) {
    if (cache === null) {
      cache = new Array(encoded.length >> 1);
      for (let i = 0; i < cache.length; i++) {
        cache[i] = (encoded.charCodeAt(2 * i) ^ key) * 65536 +
                   (encoded.charCodeAt(2 * i + 1) ^ key);
      }
    }
    return cache[index];
  };
}
module.exports = { makeStringLookup, makeNumberLookup };
if (require.main === module) {
  const fs = require('fs');
  const path = require('path');
  const folder = path.join(__dirname, '..', 'data', 'modules');
  const atomsFile = fs.readdirSync(folder).find(n => n.startsWith('003-reader') && n.endsWith('.atoms.json'));
  const atoms = JSON.parse(fs.readFileSync(path.join(folder, atomsFile), 'utf8')).atoms;
  const strings = JSON.parse(fs.readFileSync(path.join(folder, 'string-pool-decoded.json'), 'utf8'));
  const numbers = JSON.parse(fs.readFileSync(path.join(folder, 'numeric-pool-decoded.json'), 'utf8'));
  const getString = makeStringLookup(atoms[4712].text);
  const getNumber = makeNumberLookup(atoms[4713].text);
  if (!strings.every((s, i) => s === getString(i))) throw new Error('String pool mismatch');
  if (!numbers.every((n, i) => n === getNumber(i))) throw new Error('Numeric pool mismatch');
  console.log(JSON.stringify({ string_entries: strings.length, numeric_entries: numbers.length, exact_match: true }));
}
