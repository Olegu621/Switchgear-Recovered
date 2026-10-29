            package com.google.gson;

            import com.google.gson.internal.NonNullElementWrapperList;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final class JsonArray extends JsonElement implements Iterable<JsonElement> {
                private final ArrayList<JsonElement> elements;

                public JsonArray() {
/* 9 */             this.elements = new ArrayList<>();
                }

                private JsonElement getAsSingleElement() {
/* 3 */             int size = this.elements.size();
/* 8 */             if (size == 1) {
/* 13 */                return this.elements.get(0);
                    }
/* 26 */            f42.m3656l(fm0.m3781g(size, "Array must have size 1, but has size "));
/* 29 */            return null;
                }

                public void add(Boolean bool) {
/* 14 */            this.elements.add(bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
                }

                public void addAll(JsonArray jsonArray) {
/* 5 */             this.elements.addAll(jsonArray.elements);
                }

                public List<JsonElement> asList() {
/* 5 */             return new NonNullElementWrapperList(this.elements);
                }

                public boolean contains(JsonElement jsonElement) {
/* 3 */             return this.elements.contains(jsonElement);
                }

                @Override // com.google.gson.JsonElement
                public JsonArray deepCopy() {
/* 7 */             if (this.elements.isEmpty()) {
/* 49 */                return new JsonArray();
                    }
/* 17 */            JsonArray jsonArray = new JsonArray(this.elements.size());
/* 22 */            Iterator<JsonElement> it = this.elements.iterator();
/* 30 */            while (it.hasNext()) {
/* 42 */                jsonArray.add(it.next().deepCopy());
                    }
/* 46 */            return jsonArray;
                }

                public boolean equals(Object obj) {
/* 1 */             if (obj != this) {
                        return (obj instanceof JsonArray) && ((JsonArray) obj).elements.equals(this.elements);
                    }
/* 22 */            return true;
                }

                public JsonElement get(int i) {
/* 3 */             return this.elements.get(i);
                }

                @Override // com.google.gson.JsonElement
                public BigDecimal getAsBigDecimal() {
/* 5 */             return getAsSingleElement().getAsBigDecimal();
                }

                @Override // com.google.gson.JsonElement
                public BigInteger getAsBigInteger() {
/* 5 */             return getAsSingleElement().getAsBigInteger();
                }

                @Override // com.google.gson.JsonElement
                public boolean getAsBoolean() {
/* 5 */             return getAsSingleElement().getAsBoolean();
                }

                @Override // com.google.gson.JsonElement
                public byte getAsByte() {
/* 5 */             return getAsSingleElement().getAsByte();
                }

                @Override // com.google.gson.JsonElement
                @Deprecated
                public char getAsCharacter() {
/* 5 */             return getAsSingleElement().getAsCharacter();
                }

                @Override // com.google.gson.JsonElement
                public double getAsDouble() {
/* 5 */             return getAsSingleElement().getAsDouble();
                }

                @Override // com.google.gson.JsonElement
                public float getAsFloat() {
/* 5 */             return getAsSingleElement().getAsFloat();
                }

                @Override // com.google.gson.JsonElement
                public int getAsInt() {
/* 5 */             return getAsSingleElement().getAsInt();
                }

                @Override // com.google.gson.JsonElement
                public long getAsLong() {
/* 5 */             return getAsSingleElement().getAsLong();
                }

                @Override // com.google.gson.JsonElement
                public Number getAsNumber() {
/* 5 */             return getAsSingleElement().getAsNumber();
                }

                @Override // com.google.gson.JsonElement
                public short getAsShort() {
/* 5 */             return getAsSingleElement().getAsShort();
                }

                @Override // com.google.gson.JsonElement
                public String getAsString() {
/* 5 */             return getAsSingleElement().getAsString();
                }

                public int hashCode() {
/* 3 */             return this.elements.hashCode();
                }

                public boolean isEmpty() {
/* 3 */             return this.elements.isEmpty();
                }

                @Override // java.lang.Iterable
                public Iterator<JsonElement> iterator() {
/* 3 */             return this.elements.iterator();
                }

                public JsonElement remove(int i) {
/* 3 */             return this.elements.remove(i);
                }

                public JsonElement set(int i, JsonElement jsonElement) {
/* 1 */             ArrayList<JsonElement> arrayList = this.elements;
/* 3 */             if (jsonElement == null) {
/* 5 */                 jsonElement = JsonNull.INSTANCE;
                    }
/* 7 */             return arrayList.set(i, jsonElement);
                }

                public int size() {
/* 3 */             return this.elements.size();
                }

/* 9 */         public boolean remove(JsonElement jsonElement) {
/* 10 */            return this.elements.remove(jsonElement);
                }

/* 11 */        public JsonArray(int i) {
/* 13 */            this.elements = new ArrayList<>(i);
                }

/* 17 */        public void add(Character ch) {
/* 18 */            this.elements.add(ch == null ? JsonNull.INSTANCE : new JsonPrimitive(ch));
                }

/* 18 */        public void add(Number number) {
/* 19 */            this.elements.add(number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
                }

/* 19 */        public void add(String str) {
/* 20 */            this.elements.add(str == null ? JsonNull.INSTANCE : new JsonPrimitive(str));
                }

/* 20 */        public void add(JsonElement jsonElement) {
                    if (jsonElement == null) {
/* 21 */                jsonElement = JsonNull.INSTANCE;
                    }
/* 22 */            this.elements.add(jsonElement);
                }
            }
