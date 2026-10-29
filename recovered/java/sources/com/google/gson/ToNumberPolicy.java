            package com.google.gson;

            import com.google.gson.internal.LazilyParsedNumber;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.MalformedJsonException;
            import java.io.IOException;
            import java.math.BigDecimal;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum ToNumberPolicy implements ToNumberStrategy {
                DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
                    @Override // com.google.gson.ToNumberStrategy
                    public Double readNumber(JsonReader jsonReader) throws IOException {
/* 5 */                 return Double.valueOf(jsonReader.nextDouble());
                    }
                },
                LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
                    @Override // com.google.gson.ToNumberStrategy
                    public Number readNumber(JsonReader jsonReader) throws IOException {
/* 7 */                 return new LazilyParsedNumber(jsonReader.nextString());
                    }
                },
                LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
                    @Override // com.google.gson.ToNumberStrategy
                    public Number readNumber(JsonReader jsonReader) throws JsonParseException, IOException {
/* 5 */                 String strNextString = jsonReader.nextString();
                        try {
                            try {
/* 13 */                        return Long.valueOf(Long.parseLong(strNextString));
                            } catch (NumberFormatException unused) {
/* 18 */                        Double dValueOf = Double.valueOf(strNextString);
/* 26 */                        if (dValueOf.isInfinite() || dValueOf.isNaN()) {
/* 41 */                            if (!jsonReader.isLenient()) {
/* 71 */                                throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.getPreviousPath());
                                    }
                                }
/* 43 */                        return dValueOf;
                            }
                        } catch (NumberFormatException e) {
/* 76 */                    StringBuilder sbM3513q = AbstractC0886en.m3513q("Cannot parse ", strNextString, "; at path ");
/* 84 */                    sbM3513q.append(jsonReader.getPreviousPath());
/* 94 */                    throw new JsonParseException(sbM3513q.toString(), e);
                        }
                    }
                },
                BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
                    @Override // com.google.gson.ToNumberStrategy
                    public BigDecimal readNumber(JsonReader jsonReader) throws IOException {
/* 1 */                 String strNextString = jsonReader.nextString();
                        try {
/* 7 */                     return new BigDecimal(strNextString);
                        } catch (NumberFormatException e) {
/* 18 */                    StringBuilder sbM3513q = AbstractC0886en.m3513q("Cannot parse ", strNextString, "; at path ");
/* 26 */                    sbM3513q.append(jsonReader.getPreviousPath());
/* 36 */                    throw new JsonParseException(sbM3513q.toString(), e);
                        }
                    }
                }
            }
