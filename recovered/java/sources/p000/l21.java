            package p000;

            import android.util.Base64;
            import android.util.JsonWriter;
            import java.io.BufferedWriter;
            import java.io.IOException;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class l21 implements dp1, t13 {

                /* JADX INFO: renamed from: a */
                public final boolean f13078a = true;

                /* JADX INFO: renamed from: b */
                public final JsonWriter f13079b;

                /* JADX INFO: renamed from: c */
                public final Map f13080c;

                /* JADX INFO: renamed from: d */
                public final Map f13081d;

                /* JADX INFO: renamed from: e */
                public final cp1 f13082e;

                /* JADX INFO: renamed from: f */
                public final boolean f13083f;

                public l21(BufferedWriter bufferedWriter, HashMap map, HashMap map2, f11 f11Var, boolean z) {
/* 12 */            this.f13079b = new JsonWriter(bufferedWriter);
/* 14 */            this.f13080c = map;
/* 16 */            this.f13081d = map2;
/* 18 */            this.f13082e = f11Var;
/* 20 */            this.f13083f = z;
                }

                @Override // p000.dp1
                /* JADX INFO: renamed from: a */
                public final dp1 mo3171a(eh0 eh0Var, Object obj) throws IOException {
/* 3 */             m6330g(obj, eh0Var.f7687a);
/* 6 */             return this;
                }

                @Override // p000.t13
                /* JADX INFO: renamed from: b */
                public final t13 mo4052b(String str) throws IOException {
/* 1 */             m6331h();
/* 6 */             this.f13079b.value(str);
/* 9 */             return this;
                }

                @Override // p000.t13
                /* JADX INFO: renamed from: c */
                public final t13 mo4053c(boolean z) throws IOException {
/* 1 */             m6331h();
/* 6 */             this.f13079b.value(z);
/* 9 */             return this;
                }

                @Override // p000.dp1
                /* JADX INFO: renamed from: d */
                public final dp1 mo3172d(eh0 eh0Var, int i) throws IOException {
/* 1 */             String str = eh0Var.f7687a;
/* 3 */             m6331h();
/* 6 */             JsonWriter jsonWriter = this.f13079b;
/* 8 */             jsonWriter.name(str);
/* 11 */            m6331h();
/* 15 */            jsonWriter.value(i);
/* 18 */            return this;
                }

                @Override // p000.dp1
                /* JADX INFO: renamed from: e */
                public final dp1 mo3173e(eh0 eh0Var, long j) throws IOException {
/* 1 */             String str = eh0Var.f7687a;
/* 3 */             m6331h();
/* 6 */             JsonWriter jsonWriter = this.f13079b;
/* 8 */             jsonWriter.name(str);
/* 11 */            m6331h();
/* 14 */            jsonWriter.value(j);
/* 17 */            return this;
                }

                /* JADX INFO: renamed from: f */
                public final void m6329f(Object obj) throws IOException {
/* 1 */             JsonWriter jsonWriter = this.f13079b;
/* 3 */             if (obj == null) {
/* 5 */                 jsonWriter.nullValue();
/* 8 */                 return;
                    }
/* 11 */            if (obj instanceof Number) {
/* 15 */                jsonWriter.value((Number) obj);
/* 18 */                return;
                    }
/* 27 */            if (!obj.getClass().isArray()) {
/* 159 */               if (obj instanceof Collection) {
/* 163 */                   jsonWriter.beginArray();
/* 166 */                   Iterator it = ((Collection) obj).iterator();
/* 174 */                   while (it.hasNext()) {
/* 180 */                       m6329f(it.next());
                            }
/* 184 */                   jsonWriter.endArray();
/* 187 */                   return;
                        }
/* 190 */               if (obj instanceof Map) {
/* 194 */                   jsonWriter.beginObject();
/* 209 */                   for (Map.Entry entry : ((Map) obj).entrySet()) {
/* 217 */                       Object key = entry.getKey();
                                try {
/* 228 */                           m6330g(entry.getValue(), (String) key);
                                } catch (ClassCastException e) {
/* 252 */                           throw new wd0(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                                }
                            }
/* 253 */                   jsonWriter.endObject();
/* 256 */                   return;
                        }
/* 267 */               cp1 cp1Var = (cp1) this.f13080c.get(obj.getClass());
/* 269 */               if (cp1Var != null) {
/* 271 */                   jsonWriter.beginObject();
/* 274 */                   cp1Var.mo3633a(obj, this);
/* 277 */                   jsonWriter.endObject();
/* 280 */                   return;
                        }
/* 291 */               s13 s13Var = (s13) this.f13081d.get(obj.getClass());
/* 293 */               if (s13Var != null) {
/* 295 */                   s13Var.mo3633a(obj, this);
/* 298 */                   return;
                        }
/* 301 */               if (obj instanceof Enum) {
/* 305 */                   String strName = ((Enum) obj).name();
/* 309 */                   m6331h();
/* 312 */                   jsonWriter.value(strName);
/* 315 */                   return;
                        } else {
/* 316 */                   jsonWriter.beginObject();
/* 321 */                   this.f13082e.mo3633a(obj, this);
/* 324 */                   jsonWriter.endObject();
/* 327 */                   return;
                        }
                    }
/* 31 */            if (obj instanceof byte[]) {
/* 35 */                m6331h();
/* 43 */                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
/* 46 */                return;
                    }
/* 47 */            jsonWriter.beginArray();
/* 52 */            int i = 0;
/* 53 */            if (obj instanceof int[]) {
/* 55 */                int[] iArr = (int[]) obj;
/* 57 */                int length = iArr.length;
/* 58 */                while (i < length) {
/* 63 */                    jsonWriter.value(iArr[i]);
/* 66 */                    i++;
                        }
                    } else if (obj instanceof long[]) {
/* 73 */                long[] jArr = (long[]) obj;
/* 75 */                int length2 = jArr.length;
/* 76 */                while (i < length2) {
/* 78 */                    long j = jArr[i];
/* 80 */                    m6331h();
/* 83 */                    jsonWriter.value(j);
/* 86 */                    i++;
                        }
                    } else if (obj instanceof double[]) {
/* 93 */                double[] dArr = (double[]) obj;
/* 95 */                int length3 = dArr.length;
/* 96 */                while (i < length3) {
/* 100 */                   jsonWriter.value(dArr[i]);
/* 103 */                   i++;
                        }
                    } else if (obj instanceof boolean[]) {
/* 110 */               boolean[] zArr = (boolean[]) obj;
/* 112 */               int length4 = zArr.length;
/* 113 */               while (i < length4) {
/* 117 */                   jsonWriter.value(zArr[i]);
/* 120 */                   i++;
                        }
                    } else if (obj instanceof Number[]) {
/* 127 */               Number[] numberArr = (Number[]) obj;
/* 129 */               int length5 = numberArr.length;
/* 130 */               while (i < length5) {
/* 134 */                   m6329f(numberArr[i]);
/* 137 */                   i++;
                        }
                    } else {
/* 140 */               Object[] objArr = (Object[]) obj;
/* 142 */               int length6 = objArr.length;
/* 143 */               while (i < length6) {
/* 147 */                   m6329f(objArr[i]);
/* 150 */                   i++;
                        }
                    }
/* 153 */           jsonWriter.endArray();
                }

                /* JADX INFO: renamed from: g */
                public final void m6330g(Object obj, String str) throws IOException {
/* 1 */             boolean z = this.f13083f;
/* 3 */             JsonWriter jsonWriter = this.f13079b;
/* 5 */             if (z) {
/* 7 */                 if (obj == null) {
/* 9 */                     return;
                        }
/* 10 */                m6331h();
/* 13 */                jsonWriter.name(str);
/* 16 */                m6329f(obj);
/* 19 */                return;
                    }
/* 20 */            m6331h();
/* 23 */            jsonWriter.name(str);
/* 26 */            if (obj == null) {
/* 28 */                jsonWriter.nullValue();
                    } else {
/* 32 */                m6329f(obj);
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m6331h() {
/* 3 */             if (this.f13078a) {
/* 5 */                 return;
                    }
/* 8 */             f42.m3656l("Parent context used since this context was created. Cannot use this context anymore.");
                }
            }
