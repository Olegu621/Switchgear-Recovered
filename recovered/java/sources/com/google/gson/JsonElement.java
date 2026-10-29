            package com.google.gson;

            import com.google.gson.internal.Streams;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.io.StringWriter;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import p000.C1951n4;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class JsonElement {
                @Deprecated
                public JsonElement() {
                }

                public abstract JsonElement deepCopy();

                public BigDecimal getAsBigDecimal() {
/* 14 */            throw new UnsupportedOperationException(getClass().getSimpleName());
                }

                public BigInteger getAsBigInteger() {
/* 14 */            throw new UnsupportedOperationException(getClass().getSimpleName());
                }

                public boolean getAsBoolean() {
/* 14 */            throw new UnsupportedOperationException(getClass().getSimpleName());
                }

                public byte getAsByte() {
/* 14 */            throw new UnsupportedOperationException(getClass().getSimpleName());
                }

                @Deprecated
                public char getAsCharacter() {
/* 14 */            throw new UnsupportedOperationException(getClass().getSimpleName());
                }

                public double getAsDouble() {
/* 14 */            throw new UnsupportedOperationException(getClass().getSimpleName());
                }

                public float getAsFloat() {
/* 14 */            throw new UnsupportedOperationException(getClass().getSimpleName());
                }

                public int getAsInt() {
/* 14 */            throw new UnsupportedOperationException(getClass().getSimpleName());
                }

                public JsonArray getAsJsonArray() {
/* 5 */             if (isJsonArray()) {
/* 7 */                 return (JsonArray) this;
                    }
/* 12 */            ds0.m3204u(this, "Not a JSON Array: ");
/* 15 */            return null;
                }

                public JsonNull getAsJsonNull() {
/* 5 */             if (isJsonNull()) {
/* 7 */                 return (JsonNull) this;
                    }
/* 12 */            ds0.m3204u(this, "Not a JSON Null: ");
/* 15 */            return null;
                }

                public JsonObject getAsJsonObject() {
/* 5 */             if (isJsonObject()) {
/* 7 */                 return (JsonObject) this;
                    }
/* 12 */            ds0.m3204u(this, "Not a JSON Object: ");
/* 15 */            return null;
                }

                public JsonPrimitive getAsJsonPrimitive() {
/* 5 */             if (isJsonPrimitive()) {
/* 7 */                 return (JsonPrimitive) this;
                    }
/* 12 */            ds0.m3204u(this, "Not a JSON Primitive: ");
/* 15 */            return null;
                }

                public long getAsLong() {
/* 14 */            throw new UnsupportedOperationException(getClass().getSimpleName());
                }

                public Number getAsNumber() {
/* 14 */            throw new UnsupportedOperationException(getClass().getSimpleName());
                }

                public short getAsShort() {
/* 14 */            throw new UnsupportedOperationException(getClass().getSimpleName());
                }

                public String getAsString() {
/* 14 */            throw new UnsupportedOperationException(getClass().getSimpleName());
                }

                public boolean isJsonArray() {
/* 1 */             return this instanceof JsonArray;
                }

                public boolean isJsonNull() {
/* 1 */             return this instanceof JsonNull;
                }

                public boolean isJsonObject() {
/* 1 */             return this instanceof JsonObject;
                }

                public boolean isJsonPrimitive() {
/* 1 */             return this instanceof JsonPrimitive;
                }

                public String toString() {
                    try {
/* 3 */                 StringWriter stringWriter = new StringWriter();
/* 8 */                 JsonWriter jsonWriter = new JsonWriter(stringWriter);
/* 12 */                jsonWriter.setLenient(true);
/* 15 */                Streams.write(this, jsonWriter);
/* 18 */                return stringWriter.toString();
                    } catch (IOException e) {
/* 24 */                C1951n4.m6856g(e);
/* 27 */                return null;
                    }
                }
            }
