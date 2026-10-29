            package com.google.gson;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 4 */     public final class JsonNull extends JsonElement {
                public static final JsonNull INSTANCE = new JsonNull();

                @Deprecated
                public JsonNull() {
                }

                public boolean equals(Object obj) {
/* 1 */             return obj instanceof JsonNull;
                }

                public int hashCode() {
/* 3 */             return JsonNull.class.hashCode();
                }

                @Override // com.google.gson.JsonElement
/* 5 */         public JsonNull deepCopy() {
/* 6 */             return INSTANCE;
                }
            }
