            package p000;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.lang.annotation.Annotation;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.charset.Charset;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fz1 implements dp1 {

                /* JADX INFO: renamed from: f */
                public static final Charset f8403f = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: g */
                public static final eh0 f8404g = new eh0("key", AbstractC0886en.m3516t(AbstractC0886en.m3515s(bz1.class, new C2327wd(1))));

                /* JADX INFO: renamed from: h */
                public static final eh0 f8405h = new eh0(FirebaseAnalytics.Param.VALUE, AbstractC0886en.m3516t(AbstractC0886en.m3515s(bz1.class, new C2327wd(2))));

                /* JADX INFO: renamed from: i */
                public static final f11 f8406i = new f11(1);

                /* JADX INFO: renamed from: a */
                public OutputStream f8407a;

                /* JADX INFO: renamed from: b */
                public final HashMap f8408b;

                /* JADX INFO: renamed from: c */
                public final HashMap f8409c;

                /* JADX INFO: renamed from: d */
                public final cp1 f8410d;

                /* JADX INFO: renamed from: e */
                public final gz1 f8411e = new gz1(this);

                public fz1(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, cp1 cp1Var) {
/* 11 */            this.f8407a = byteArrayOutputStream;
/* 13 */            this.f8408b = map;
/* 15 */            this.f8409c = map2;
/* 17 */            this.f8410d = cp1Var;
                }

                /* JADX INFO: renamed from: h */
                public static int m3860h(eh0 eh0Var) {
/* 11 */            bz1 bz1Var = (bz1) ((Annotation) eh0Var.f7688b.get(bz1.class));
/* 13 */            if (bz1Var != null) {
/* 15 */                return bz1Var.tag();
                    }
/* 27 */            throw new wd0("Field has no @Protobuf config");
                }

                @Override // p000.dp1
                /* JADX INFO: renamed from: a */
                public final dp1 mo3171a(eh0 eh0Var, Object obj) {
/* 2 */             m3863f(eh0Var, obj, true);
/* 5 */             return this;
                }

                /* JADX INFO: renamed from: b */
                public final void m3861b(eh0 eh0Var, int i, boolean z) {
/* 1 */             if (z && i == 0) {
/* 36 */                return;
                    }
/* 16 */            bz1 bz1Var = (bz1) ((Annotation) eh0Var.f7688b.get(bz1.class));
/* 18 */            if (bz1Var == null) {
/* 111 */               throw new wd0("Field has no @Protobuf config");
                    }
/* 24 */            int iOrdinal = bz1Var.intEncoding().ordinal();
/* 28 */            if (iOrdinal == 0) {
/* 97 */                m3865i(bz1Var.tag() << 3);
/* 100 */               m3865i(i);
                    } else if (iOrdinal == 1) {
/* 79 */                m3865i(bz1Var.tag() << 3);
/* 87 */                m3865i((i << 1) ^ (i >> 31));
                    } else {
/* 34 */                if (iOrdinal != 2) {
/* 36 */                    return;
                        }
/* 45 */                m3865i((bz1Var.tag() << 3) | 5);
/* 69 */                this.f8407a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m3862c(eh0 eh0Var, long j, boolean z) throws IOException {
/* 1 */             if (z && j == 0) {
/* 40 */                return;
                    }
/* 20 */            bz1 bz1Var = (bz1) ((Annotation) eh0Var.f7688b.get(bz1.class));
/* 22 */            if (bz1Var == null) {
/* 117 */               throw new wd0("Field has no @Protobuf config");
                    }
/* 28 */            int iOrdinal = bz1Var.intEncoding().ordinal();
/* 32 */            if (iOrdinal == 0) {
/* 103 */               m3865i(bz1Var.tag() << 3);
/* 106 */               m3866j(j);
                    } else if (iOrdinal == 1) {
/* 83 */                m3865i(bz1Var.tag() << 3);
/* 93 */                m3866j((j >> 63) ^ (j << 1));
                    } else {
/* 38 */                if (iOrdinal != 2) {
/* 40 */                    return;
                        }
/* 48 */                m3865i((bz1Var.tag() << 3) | 1);
/* 73 */                this.f8407a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                    }
                }

                @Override // p000.dp1
                /* JADX INFO: renamed from: d */
                public final dp1 mo3172d(eh0 eh0Var, int i) {
/* 2 */             m3861b(eh0Var, i, true);
/* 5 */             return this;
                }

                @Override // p000.dp1
                /* JADX INFO: renamed from: e */
                public final dp1 mo3173e(eh0 eh0Var, long j) throws IOException {
/* 2 */             m3862c(eh0Var, j, true);
/* 5 */             return this;
                }

                /* JADX INFO: renamed from: f */
                public final void m3863f(eh0 eh0Var, Object obj, boolean z) {
/* 1 */             if (obj == null) {
/* 259 */               return;
                    }
/* 7 */             if (obj instanceof CharSequence) {
/* 9 */                 CharSequence charSequence = (CharSequence) obj;
/* 11 */                if (z && charSequence.length() == 0) {
/* 259 */                   return;
                        }
/* 29 */                m3865i((m3860h(eh0Var) << 3) | 2);
/* 38 */                byte[] bytes = charSequence.toString().getBytes(f8403f);
/* 43 */                m3865i(bytes.length);
/* 48 */                this.f8407a.write(bytes);
/* 51 */                return;
                    }
/* 55 */            if (obj instanceof Collection) {
/* 59 */                Iterator it = ((Collection) obj).iterator();
/* 67 */                while (it.hasNext()) {
/* 73 */                    m3863f(eh0Var, it.next(), false);
                        }
/* 259 */               return;
                    }
/* 79 */            if (obj instanceof Map) {
/* 87 */                Iterator it2 = ((Map) obj).entrySet().iterator();
/* 95 */                while (it2.hasNext()) {
/* 105 */                   m3864g(f8406i, eh0Var, (Map.Entry) it2.next(), false);
                        }
/* 259 */               return;
                    }
/* 112 */           if (obj instanceof Double) {
/* 116 */               double dDoubleValue = ((Double) obj).doubleValue();
/* 120 */               if (z && dDoubleValue == 0.0d) {
/* 259 */                   return;
                        }
/* 137 */               m3865i((m3860h(eh0Var) << 3) | 1);
/* 162 */               this.f8407a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
/* 165 */               return;
                    }
/* 168 */           if (obj instanceof Float) {
/* 172 */               float fFloatValue = ((Float) obj).floatValue();
/* 176 */               if (z && fFloatValue == 0.0f) {
/* 259 */                   return;
                        }
/* 192 */               m3865i((m3860h(eh0Var) << 3) | 5);
/* 216 */               this.f8407a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
/* 219 */               return;
                    }
/* 222 */           if (obj instanceof Number) {
/* 230 */               m3862c(eh0Var, ((Number) obj).longValue(), z);
/* 233 */               return;
                    }
/* 236 */           if (obj instanceof Boolean) {
/* 244 */               m3861b(eh0Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
/* 247 */               return;
                    }
/* 250 */           if (obj instanceof byte[]) {
/* 252 */               byte[] bArr = (byte[]) obj;
/* 254 */               if (z && bArr.length == 0) {
/* 259 */                   return;
                        }
/* 268 */               m3865i((m3860h(eh0Var) << 3) | 2);
/* 272 */               m3865i(bArr.length);
/* 277 */               this.f8407a.write(bArr);
/* 280 */               return;
                    }
/* 291 */           cp1 cp1Var = (cp1) this.f8408b.get(obj.getClass());
/* 293 */           if (cp1Var != null) {
/* 295 */               m3864g(cp1Var, eh0Var, obj, z);
/* 298 */               return;
                    }
/* 309 */           s13 s13Var = (s13) this.f8409c.get(obj.getClass());
/* 311 */           if (s13Var != null) {
/* 313 */               gz1 gz1Var = this.f8411e;
/* 315 */               gz1Var.f8854a = false;
/* 317 */               gz1Var.f8856c = eh0Var;
/* 319 */               gz1Var.f8855b = z;
/* 321 */               s13Var.mo3633a(obj, gz1Var);
/* 324 */               return;
                    }
/* 327 */           if (obj instanceof wy1) {
/* 335 */               m3861b(eh0Var, ((wy1) obj).mo1560a(), true);
                    } else if (obj instanceof Enum) {
/* 349 */               m3861b(eh0Var, ((Enum) obj).ordinal(), true);
                    } else {
/* 355 */               m3864g(this.f8410d, eh0Var, obj, z);
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m3864g(cp1 cp1Var, eh0 eh0Var, Object obj, boolean z) throws IOException {
/* 3 */             p61 p61Var = new p61();
/* 8 */             p61Var.f14982a = 0L;
                    try {
/* 10 */                OutputStream outputStream = this.f8407a;
/* 12 */                this.f8407a = p61Var;
                        try {
/* 14 */                    cp1Var.mo3633a(obj, this);
/* 17 */                    this.f8407a = outputStream;
/* 19 */                    long j = p61Var.f14982a;
/* 21 */                    p61Var.close();
/* 24 */                    if (z && j == 0) {
/* 30 */                        return;
                            }
/* 39 */                    m3865i((m3860h(eh0Var) << 3) | 2);
/* 42 */                    m3866j(j);
/* 45 */                    cp1Var.mo3633a(obj, this);
                        } catch (Throwable th) {
/* 52 */                    this.f8407a = outputStream;
/* 54 */                    throw th;
                        }
                    } catch (Throwable th2) {
                        try {
/* 55 */                    p61Var.close();
                        } catch (Throwable th3) {
/* 60 */                    th2.addSuppressed(th3);
                        }
/* 63 */                throw th2;
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m3865i(int i) throws IOException {
                    while (true) {
/* 1 */                 long j = i & (-128);
/* 8 */                 OutputStream outputStream = this.f8407a;
/* 10 */                if (j == 0) {
/* 24 */                    outputStream.write(i & 127);
/* 27 */                    return;
                        } else {
/* 16 */                    outputStream.write((i & 127) | 128);
/* 19 */                    i >>>= 7;
                        }
                    }
                }

                /* JADX INFO: renamed from: j */
                public final void m3866j(long j) throws IOException {
                    while (true) {
/* 3 */                 long j2 = (-128) & j;
/* 8 */                 OutputStream outputStream = this.f8407a;
/* 10 */                if (j2 == 0) {
/* 26 */                    outputStream.write(((int) j) & 127);
/* 29 */                    return;
                        } else {
/* 17 */                    outputStream.write((((int) j) & 127) | 128);
/* 21 */                    j >>>= 7;
                        }
                    }
                }
            }
