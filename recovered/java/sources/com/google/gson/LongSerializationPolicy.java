            package com.google.gson;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum LongSerializationPolicy {
                DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
                    @Override // com.google.gson.LongSerializationPolicy
                    public JsonElement serialize(Long l) {
                        return l == null ? JsonNull.INSTANCE : new JsonPrimitive(l);
                    }
                },
                STRING { // from class: com.google.gson.LongSerializationPolicy.2
                    @Override // com.google.gson.LongSerializationPolicy
                    public JsonElement serialize(Long l) {
                        return l == null ? JsonNull.INSTANCE : new JsonPrimitive(l.toString());
                    }
                };

                public abstract JsonElement serialize(Long l);
            }
