            package com.google.gson;

            import com.google.gson.internal.LazilyParsedNumber;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.util.Objects;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 4 */     public final class JsonPrimitive extends JsonElement {
                private final Object value;

                public JsonPrimitive(Character ch) {
/* 4 */             Objects.requireNonNull(ch);
/* 11 */            this.value = ch.toString();
                }

                private static boolean isIntegral(JsonPrimitive jsonPrimitive) {
/* 1 */             Object obj = jsonPrimitive.value;
/* 6 */             if (!(obj instanceof Number)) {
/* 5 */                 return false;
                    }
/* 8 */             Number number = (Number) obj;
                    return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || JsonPrimitive.class != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 17 */            JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
/* 21 */            if (this.value == null) {
                        return jsonPrimitive.value == null;
                    }
/* 33 */            if (isIntegral(this) && isIntegral(jsonPrimitive)) {
                        return getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue();
                    }
/* 63 */            Object obj2 = this.value;
/* 67 */            if (!(obj2 instanceof Number) || !(jsonPrimitive.value instanceof Number)) {
/* 112 */               return obj2.equals(jsonPrimitive.value);
                    }
/* 79 */            double dDoubleValue = getAsNumber().doubleValue();
/* 87 */            double dDoubleValue2 = jsonPrimitive.getAsNumber().doubleValue();
                    return dDoubleValue == dDoubleValue2 || (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2));
                }

                @Override // com.google.gson.JsonElement
                public BigDecimal getAsBigDecimal() {
/* 1 */             Object obj = this.value;
                    return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(getAsString());
                }

                @Override // com.google.gson.JsonElement
                public BigInteger getAsBigInteger() {
/* 1 */             Object obj = this.value;
                    return obj instanceof BigInteger ? (BigInteger) obj : new BigInteger(getAsString());
                }

                @Override // com.google.gson.JsonElement
                public boolean getAsBoolean() {
                    return isBoolean() ? ((Boolean) this.value).booleanValue() : Boolean.parseBoolean(getAsString());
                }

                @Override // com.google.gson.JsonElement
                public byte getAsByte() {
                    return isNumber() ? getAsNumber().byteValue() : Byte.parseByte(getAsString());
                }

                @Override // com.google.gson.JsonElement
                @Deprecated
                public char getAsCharacter() {
/* 1 */             String asString = getAsString();
/* 10 */            if (!asString.isEmpty()) {
/* 12 */                return asString.charAt(0);
                    }
/* 19 */            C1951n4.m6866q("String value is empty");
/* 9 */             return (char) 0;
                }

                @Override // com.google.gson.JsonElement
                public double getAsDouble() {
                    return isNumber() ? getAsNumber().doubleValue() : Double.parseDouble(getAsString());
                }

                @Override // com.google.gson.JsonElement
                public float getAsFloat() {
                    return isNumber() ? getAsNumber().floatValue() : Float.parseFloat(getAsString());
                }

                @Override // com.google.gson.JsonElement
                public int getAsInt() {
                    return isNumber() ? getAsNumber().intValue() : Integer.parseInt(getAsString());
                }

                @Override // com.google.gson.JsonElement
                public long getAsLong() {
                    return isNumber() ? getAsNumber().longValue() : Long.parseLong(getAsString());
                }

                @Override // com.google.gson.JsonElement
                public Number getAsNumber() {
/* 1 */             Object obj = this.value;
/* 5 */             if (obj instanceof Number) {
/* 7 */                 return (Number) obj;
                    }
/* 12 */            if (obj instanceof String) {
/* 18 */                return new LazilyParsedNumber((String) obj);
                    }
/* 24 */            C1951n4.m6866q("Primitive is neither a number nor a string");
/* 27 */            return null;
                }

                @Override // com.google.gson.JsonElement
                public short getAsShort() {
                    return isNumber() ? getAsNumber().shortValue() : Short.parseShort(getAsString());
                }

                @Override // com.google.gson.JsonElement
                public String getAsString() {
/* 1 */             Object obj = this.value;
/* 5 */             if (obj instanceof String) {
/* 7 */                 return (String) obj;
                    }
/* 14 */            if (isNumber()) {
/* 20 */                return getAsNumber().toString();
                    }
/* 25 */            boolean zIsBoolean = isBoolean();
/* 29 */            Object obj2 = this.value;
/* 31 */            if (zIsBoolean) {
/* 35 */                return ((Boolean) obj2).toString();
                    }
/* 63 */            throw new AssertionError("Unexpected value type: " + obj2.getClass());
                }

                public int hashCode() {
                    long jDoubleToLongBits;
/* 3 */             if (this.value == null) {
/* 5 */                 return 31;
                    }
/* 14 */            if (isIntegral(this)) {
/* 20 */                jDoubleToLongBits = getAsNumber().longValue();
                    } else {
/* 29 */                Object obj = this.value;
/* 33 */                if (!(obj instanceof Number)) {
/* 48 */                    return obj.hashCode();
                        }
/* 43 */                jDoubleToLongBits = Double.doubleToLongBits(getAsNumber().doubleValue());
                    }
/* 27 */            return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
                }

                public boolean isBoolean() {
/* 3 */             return this.value instanceof Boolean;
                }

                public boolean isNumber() {
/* 3 */             return this.value instanceof Number;
                }

                public boolean isString() {
/* 3 */             return this.value instanceof String;
                }

                @Override // com.google.gson.JsonElement
/* 5 */         public JsonPrimitive deepCopy() {
/* 6 */             return this;
                }

/* 13 */        public JsonPrimitive(Number number) {
/* 15 */            Objects.requireNonNull(number);
                    this.value = number;
                }

/* 15 */        public JsonPrimitive(String str) {
/* 17 */            Objects.requireNonNull(str);
                    this.value = str;
                }

/* 17 */        public JsonPrimitive(Boolean bool) {
/* 19 */            Objects.requireNonNull(bool);
                    this.value = bool;
                }
            }
