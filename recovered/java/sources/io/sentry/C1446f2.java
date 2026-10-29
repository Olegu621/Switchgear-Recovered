            package io.sentry;

            import io.sentry.config.AbstractC1417a;
            import io.sentry.vendor.gson.stream.C1730a;
            import io.sentry.vendor.gson.stream.EnumC1731b;
            import java.io.IOException;
            import java.io.Reader;
            import java.util.AbstractMap;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.TimeZone;
            import p000.f42;
            
            /* JADX INFO: renamed from: io.sentry.f2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1446f2 implements InterfaceC1489i3 {

                /* JADX INFO: renamed from: a */
                public final C1730a f10936a;

                /* JADX INFO: renamed from: b */
                public final ArrayDeque f10937b = new ArrayDeque();

                /* JADX INFO: renamed from: c */
                public int f10938c = 0;

                public C1446f2(Reader reader) {
/* 19 */            this.f10936a = new C1730a(reader);
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: B */
                public final Long mo5227B() throws IOException {
/* 9 */             if (this.f10936a.peek() != EnumC1731b.NULL) {
/* 20 */                return Long.valueOf(nextLong());
                    }
/* 11 */            m5238h();
/* 14 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: G0 */
                public final Float mo5228G0() throws IOException {
/* 9 */             if (this.f10936a.peek() != EnumC1731b.NULL) {
/* 20 */                return Float.valueOf(nextFloat());
                    }
/* 11 */            m5238h();
/* 14 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: J */
                public final TimeZone mo5229J(ILogger iLogger) throws IOException {
/* 10 */            if (this.f10936a.peek() == EnumC1731b.NULL) {
/* 12 */                m5238h();
/* 9 */                 return null;
                    }
                    try {
/* 20 */                return TimeZone.getTimeZone(nextString());
                    } catch (Exception e) {
/* 30 */                iLogger.mo4671d(EnumC1553m5.ERROR, "Error when deserializing TimeZone", e);
/* 9 */                 return null;
                    }
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: K0 */
                public final Object mo5230K0(ILogger iLogger, InterfaceC1696u1 interfaceC1696u1) throws IOException {
/* 9 */             if (this.f10936a.peek() != EnumC1731b.NULL) {
/* 16 */                return interfaceC1696u1.mo5157a(this, iLogger);
                    }
/* 11 */            m5238h();
/* 14 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: M */
                public final String mo5231M() throws IOException {
/* 9 */             if (this.f10936a.peek() != EnumC1731b.NULL) {
/* 16 */                return nextString();
                    }
/* 11 */            m5238h();
/* 14 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: R0 */
                public final Object mo5232R0() throws IOException {
/* 3 */             C1425d2 c1425d2 = new C1425d2();
/* 7 */             boolean zM5192b = false;
/* 8 */             while (!zM5192b) {
/* 10 */                int[] iArr = AbstractC1735w1.f11796a;
/* 12 */                C1730a c1730a = this.f10936a;
/* 22 */                int i = iArr[c1730a.peek().ordinal()];
/* 24 */                ArrayList arrayList = c1425d2.f10848a;
                        switch (i) {
                            case 1:
/* 119 */                       beginArray();
/* 127 */                       arrayList.add(new C1759z1());
                                break;
                            case 2:
/* 111 */                       endArray();
/* 114 */                       zM5192b = c1425d2.m5192b();
                                break;
                            case 3:
/* 99 */                        beginObject();
/* 107 */                       arrayList.add(new C1157a2());
                                break;
                            case 4:
/* 91 */                        endObject();
/* 94 */                        zM5192b = c1425d2.m5192b();
                                break;
                            case 5:
/* 87 */                        arrayList.add(new C1378b2(c1730a.nextName()));
                                break;
                            case 6:
/* 73 */                        zM5192b = c1425d2.m5193c(new C1723v1(this, 0));
                                break;
                            case 7:
/* 63 */                        zM5192b = c1425d2.m5193c(new C1723v1(c1425d2, this));
                                break;
                            case 8:
/* 53 */                        zM5192b = c1425d2.m5193c(new C1723v1(this, 2));
                                break;
                            case 9:
/* 32 */                        m5238h();
/* 42 */                        zM5192b = c1425d2.m5193c(new f42(25));
                                break;
                            case 10:
/* 30 */                        zM5192b = true;
                                break;
                        }
                    }
/* 131 */           InterfaceC1751y1 interfaceC1751y1M5191a = c1425d2.m5191a();
/* 135 */           if (interfaceC1751y1M5191a != null) {
/* 137 */               return interfaceC1751y1M5191a.getValue();
                    }
/* 142 */           return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: T */
                public final HashMap mo5233T(ILogger iLogger, InterfaceC1696u1 interfaceC1696u1) throws IOException {
                    boolean z;
/* 1 */             C1730a c1730a = this.f10936a;
/* 9 */             if (c1730a.peek() == EnumC1731b.NULL) {
/* 11 */                m5238h();
/* 14 */                return null;
                    }
/* 16 */            beginObject();
/* 21 */            HashMap map = new HashMap();
/* 28 */            if (c1730a.hasNext()) {
                        while (true) {
/* 30 */                    String strNextName = c1730a.nextName();
/* 42 */                    C1434e2 c1434e2 = new C1434e2(this.f10938c, c1730a.peek());
/* 47 */                    this.f10937b.addLast(c1434e2);
                            try {
                                try {
/* 54 */                            map.put(strNextName, interfaceC1696u1.mo5157a(this, iLogger));
                                } catch (Exception e) {
/* 70 */                            iLogger.mo4671d(EnumC1553m5.WARNING, "Failed to deserialize object in map.", e);
                                    try {
/* 73 */                                m5240i(c1434e2);
/* 76 */                                z = true;
                                    } catch (Exception e2) {
/* 81 */                                iLogger.mo4671d(EnumC1553m5.ERROR, "Stream unrecoverable, aborting map deserialization.", e2);
/* 84 */                                z = false;
                                    }
/* 85 */                            if (!z) {
/* 87 */                                m5235c(c1434e2);
                                        break;
                                    }
/* 112 */                           endObject();
/* 115 */                           return map;
                                }
/* 57 */                        m5235c(c1434e2);
/* 97 */                        if (c1730a.peek() != EnumC1731b.BEGIN_OBJECT && c1730a.peek() != EnumC1731b.NAME) {
                                    break;
                                }
                            } catch (Throwable th) {
/* 108 */                       m5235c(c1434e2);
/* 111 */                       throw th;
                            }
                        }
                    }
/* 112 */           endObject();
/* 115 */           return map;
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: b0 */
                public final Double mo5234b0() throws IOException {
/* 9 */             if (this.f10936a.peek() != EnumC1731b.NULL) {
/* 20 */                return Double.valueOf(nextDouble());
                    }
/* 11 */            m5238h();
/* 14 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final void beginArray() throws IOException {
/* 1 */             C1730a c1730a = this.f10936a;
/* 3 */             int iM5499f = c1730a.f11781v;
/* 5 */             if (iM5499f == 0) {
/* 7 */                 iM5499f = c1730a.m5499f();
                    }
/* 12 */            if (iM5499f != 3) {
/* 41 */                StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
/* 48 */                sb.append(c1730a.peek());
/* 55 */                f42.m3659o(sb, c1730a.m5502i());
                    } else {
/* 15 */                c1730a.m5506n(1);
/* 24 */                c1730a.f11773Z[c1730a.f11771X - 1] = 0;
/* 26 */                c1730a.f11781v = 0;
/* 28 */                m5236f();
/* 34 */                this.f10938c++;
                    }
                }

                @Override // io.sentry.InterfaceC1489i3
                public final void beginObject() throws IOException {
/* 1 */             C1730a c1730a = this.f10936a;
/* 3 */             int iM5499f = c1730a.f11781v;
/* 5 */             if (iM5499f == 0) {
/* 7 */                 iM5499f = c1730a.m5499f();
                    }
/* 12 */            if (iM5499f != 1) {
/* 34 */                StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
/* 41 */                sb.append(c1730a.peek());
/* 48 */                f42.m3659o(sb, c1730a.m5502i());
                    } else {
/* 15 */                c1730a.m5506n(3);
/* 19 */                c1730a.f11781v = 0;
/* 21 */                m5236f();
/* 27 */                this.f10938c++;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m5235c(C1434e2 c1434e2) {
/* 1 */             if (c1434e2 == null) {
/* 3 */                 return;
                    }
/* 4 */             ArrayDeque arrayDeque = this.f10937b;
/* 10 */            if (arrayDeque.isEmpty() || arrayDeque.peekLast() != c1434e2) {
/* 22 */                arrayDeque.remove(c1434e2);
                    } else {
/* 18 */                arrayDeque.removeLast();
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
/* 3 */             this.f10936a.close();
                }

                @Override // io.sentry.InterfaceC1489i3
                public final void endArray() throws IOException {
/* 1 */             C1730a c1730a = this.f10936a;
/* 3 */             int iM5499f = c1730a.f11781v;
/* 5 */             if (iM5499f == 0) {
/* 7 */                 iM5499f = c1730a.m5499f();
                    }
/* 12 */            if (iM5499f != 4) {
/* 44 */                StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
/* 51 */                sb.append(c1730a.peek());
/* 58 */                f42.m3659o(sb, c1730a.m5502i());
/* 61 */                return;
                    }
/* 14 */            int i = c1730a.f11771X;
/* 18 */            c1730a.f11771X = i - 1;
/* 20 */            int[] iArr = c1730a.f11773Z;
/* 22 */            int i2 = i - 2;
/* 28 */            iArr[i2] = iArr[i2] + 1;
/* 31 */            c1730a.f11781v = 0;
/* 37 */            this.f10938c--;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final void endObject() throws IOException {
/* 1 */             C1730a c1730a = this.f10936a;
/* 3 */             int iM5499f = c1730a.f11781v;
/* 5 */             if (iM5499f == 0) {
/* 7 */                 iM5499f = c1730a.m5499f();
                    }
/* 12 */            if (iM5499f != 2) {
/* 48 */                StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
/* 55 */                sb.append(c1730a.peek());
/* 62 */                f42.m3659o(sb, c1730a.m5502i());
/* 65 */                return;
                    }
/* 14 */            int i = c1730a.f11771X;
/* 16 */            int i2 = i - 1;
/* 18 */            c1730a.f11771X = i2;
/* 23 */            c1730a.f11772Y[i2] = null;
/* 25 */            int[] iArr = c1730a.f11773Z;
/* 27 */            int i3 = i - 2;
/* 32 */            iArr[i3] = iArr[i3] + 1;
/* 35 */            c1730a.f11781v = 0;
/* 41 */            this.f10938c--;
                }

                /* JADX INFO: renamed from: f */
                public final void m5236f() {
/* 7 */             C1434e2 c1434e2 = (C1434e2) this.f10937b.peekLast();
/* 9 */             if (c1434e2 != null) {
/* 12 */                c1434e2.f10911c = true;
                    }
                }

                /* JADX INFO: renamed from: g */
                public final boolean m5237g() throws IOException {
/* 1 */             C1730a c1730a = this.f10936a;
/* 3 */             int iM5499f = c1730a.f11781v;
/* 5 */             if (iM5499f == 0) {
/* 7 */                 iM5499f = c1730a.m5499f();
                    }
/* 12 */            boolean z = false;
/* 14 */            if (iM5499f == 5) {
/* 16 */                c1730a.f11781v = 0;
/* 18 */                int[] iArr = c1730a.f11773Z;
/* 22 */                int i = c1730a.f11771X - 1;
/* 26 */                iArr[i] = iArr[i] + 1;
/* 28 */                z = true;
                    } else {
/* 31 */                if (iM5499f != 6) {
/* 53 */                    StringBuilder sb = new StringBuilder("Expected a boolean but was ");
/* 60 */                    sb.append(c1730a.peek());
/* 67 */                    f42.m3659o(sb, c1730a.m5502i());
/* 12 */                    return false;
                        }
/* 33 */                c1730a.f11781v = 0;
/* 35 */                int[] iArr2 = c1730a.f11773Z;
/* 39 */                int i2 = c1730a.f11771X - 1;
/* 43 */                iArr2[i2] = iArr2[i2] + 1;
                    }
/* 45 */            m5236f();
/* 48 */            return z;
                }

                /* JADX INFO: renamed from: h */
                public final void m5238h() throws IOException {
/* 1 */             C1730a c1730a = this.f10936a;
/* 3 */             int iM5499f = c1730a.f11781v;
/* 5 */             if (iM5499f == 0) {
/* 7 */                 iM5499f = c1730a.m5499f();
                    }
/* 12 */            if (iM5499f != 7) {
/* 37 */                StringBuilder sb = new StringBuilder("Expected null but was ");
/* 44 */                sb.append(c1730a.peek());
/* 51 */                f42.m3659o(sb, c1730a.m5502i());
                    } else {
/* 15 */                c1730a.f11781v = 0;
/* 17 */                int[] iArr = c1730a.f11773Z;
/* 21 */                int i = c1730a.f11771X - 1;
/* 27 */                iArr[i] = iArr[i] + 1;
/* 29 */                m5236f();
                    }
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: h1 */
                public final ArrayList mo5239h1(ILogger iLogger, InterfaceC1696u1 interfaceC1696u1) throws IOException {
                    boolean z;
/* 1 */             C1730a c1730a = this.f10936a;
/* 9 */             if (c1730a.peek() == EnumC1731b.NULL) {
/* 11 */                m5238h();
/* 14 */                return null;
                    }
/* 16 */            beginArray();
/* 21 */            ArrayList arrayList = new ArrayList();
/* 28 */            while (c1730a.hasNext()) {
/* 38 */                C1434e2 c1434e2 = new C1434e2(this.f10938c, c1730a.peek());
/* 43 */                this.f10937b.addLast(c1434e2);
                        try {
                            try {
/* 50 */                        arrayList.add(interfaceC1696u1.mo5157a(this, iLogger));
                            } catch (Exception e) {
/* 66 */                        iLogger.mo4671d(EnumC1553m5.WARNING, "Failed to deserialize object in list.", e);
                                try {
/* 69 */                            m5240i(c1434e2);
/* 72 */                            z = true;
                                } catch (Exception e2) {
/* 77 */                            iLogger.mo4671d(EnumC1553m5.ERROR, "Stream unrecoverable, aborting list deserialization.", e2);
/* 80 */                            z = false;
                                }
/* 81 */                        if (!z) {
/* 83 */                            m5235c(c1434e2);
/* 91 */                            endArray();
/* 94 */                            return arrayList;
                                }
                            }
/* 53 */                    m5235c(c1434e2);
                        } catch (Throwable th) {
/* 87 */                    m5235c(c1434e2);
/* 90 */                    throw th;
                        }
                    }
/* 91 */            endArray();
/* 94 */            return arrayList;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final boolean hasNext() {
/* 3 */             return this.f10936a.hasNext();
                }

                /* JADX INFO: renamed from: i */
                public final void m5240i(C1434e2 c1434e2) throws IOException {
                    C1730a c1730a;
                    while (true) {
/* 1 */                 int i = this.f10938c;
/* 3 */                 int i2 = c1434e2.f10909a;
/* 5 */                 c1730a = this.f10936a;
/* 7 */                 if (i <= i2) {
                            break;
                        }
/* 9 */                 EnumC1731b enumC1731bPeek = c1730a.peek();
/* 15 */                if (enumC1731bPeek == EnumC1731b.END_OBJECT) {
/* 17 */                    endObject();
                        } else if (enumC1731bPeek == EnumC1731b.END_ARRAY) {
/* 25 */                    endArray();
                        } else {
/* 29 */                    skipValue();
                        }
                    }
/* 35 */            if (c1434e2.f10911c || c1730a.peek() != c1434e2.f10910b) {
/* 48 */                return;
                    }
/* 45 */            skipValue();
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: l0 */
                public final Date mo5241l0(ILogger iLogger) throws IOException {
/* 10 */            if (this.f10936a.peek() == EnumC1731b.NULL) {
/* 12 */                m5238h();
/* 9 */                 return null;
                    }
/* 16 */            String strNextString = nextString();
/* 20 */            if (strNextString == null) {
/* 9 */                 return null;
                    }
                    try {
                        try {
/* 23 */                    return AbstractC1417a.m5174l(strNextString);
                        } catch (Exception e) {
/* 38 */                    iLogger.mo4671d(EnumC1553m5.ERROR, "Error when deserializing millis timestamp format.", e);
/* 9 */                     return null;
                        }
                    } catch (Exception unused) {
/* 28 */                return AbstractC1417a.m5175m(strNextString);
                    }
                }

                @Override // io.sentry.InterfaceC1489i3
                public final double nextDouble() throws IOException {
/* 3 */             double dNextDouble = this.f10936a.nextDouble();
/* 7 */             m5236f();
/* 10 */            return dNextDouble;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final float nextFloat() throws IOException {
/* 3 */             double dNextDouble = this.f10936a.nextDouble();
/* 7 */             m5236f();
/* 10 */            return (float) dNextDouble;
                }

                /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
                /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
                @Override // io.sentry.InterfaceC1489i3
                public final int nextInt() throws IOException {
                    int i;
                    double d;
/* 1 */             C1730a c1730a = this.f10936a;
/* 3 */             int iM5499f = c1730a.f11781v;
/* 5 */             if (iM5499f == 0) {
/* 7 */                 iM5499f = c1730a.m5499f();
                    }
/* 16 */            if (iM5499f == 15) {
/* 18 */                long j = c1730a.f11782w;
/* 20 */                i = (int) j;
/* 24 */                if (j != i) {
/* 68 */                    throw new NumberFormatException("Expected an int but was " + c1730a.f11782w + c1730a.m5502i());
                        }
/* 26 */                c1730a.f11781v = 0;
/* 28 */                int[] iArr = c1730a.f11773Z;
/* 32 */                int i2 = c1730a.f11771X - 1;
/* 38 */                iArr[i2] = iArr[i2] + 1;
                    } else {
/* 71 */                if (iM5499f == 16) {
/* 84 */                    c1730a.f11769V = new String(c1730a.f11776c, c1730a.f11777d, c1730a.f11768U);
/* 91 */                    c1730a.f11777d += c1730a.f11768U;
                        } else {
/* 98 */                    if (iM5499f != 8 && iM5499f != 9 && iM5499f != 10) {
/* 109 */                       StringBuilder sb = new StringBuilder("Expected an int but was ");
/* 116 */                       sb.append(c1730a.peek());
/* 123 */                       f42.m3659o(sb, c1730a.m5502i());
/* 13 */                        return 0;
                            }
/* 127 */                   if (iM5499f == 10) {
/* 133 */                       c1730a.f11769V = c1730a.m5505m();
                            } else {
/* 147 */                       c1730a.f11769V = c1730a.m5504l(iM5499f == 8 ? '\'' : '\"');
                            }
                            try {
/* 151 */                       i = Integer.parseInt(c1730a.f11769V);
/* 155 */                       c1730a.f11781v = 0;
/* 157 */                       int[] iArr2 = c1730a.f11773Z;
/* 161 */                       int i3 = c1730a.f11771X - 1;
/* 167 */                       iArr2[i3] = iArr2[i3] + 1;
                            } catch (NumberFormatException unused) {
/* 172 */                       c1730a.f11781v = 11;
/* 176 */                       d = Double.parseDouble(c1730a.f11769V);
/* 180 */                       i = (int) d;
/* 184 */                       if (i == d) {
/* 213 */                           f42.m3665u(c1730a.f11769V, "Expected an int but was ", c1730a.m5502i());
/* 13 */                            return 0;
                                }
/* 187 */                       c1730a.f11769V = null;
/* 189 */                       c1730a.f11781v = 0;
/* 191 */                       int[] iArr3 = c1730a.f11773Z;
/* 195 */                       int i4 = c1730a.f11771X - 1;
/* 201 */                       iArr3[i4] = iArr3[i4] + 1;
                            }
                        }
/* 172 */               c1730a.f11781v = 11;
/* 176 */               d = Double.parseDouble(c1730a.f11769V);
/* 180 */               i = (int) d;
/* 184 */               if (i == d) {
/* 213 */                   f42.m3665u(c1730a.f11769V, "Expected an int but was ", c1730a.m5502i());
/* 13 */                    return 0;
                        }
/* 187 */               c1730a.f11769V = null;
/* 189 */               c1730a.f11781v = 0;
/* 191 */               int[] iArr4 = c1730a.f11773Z;
/* 195 */               int i5 = c1730a.f11771X - 1;
/* 201 */               iArr4[i5] = iArr4[i5] + 1;
                    }
/* 203 */           m5236f();
/* 206 */           return i;
                }

                /* JADX WARN: Code duplicated, block: B:29:0x009b  */
                /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
                @Override // io.sentry.InterfaceC1489i3
                public final long nextLong() throws IOException {
                    long j;
                    double d;
                    long j2;
/* 1 */             C1730a c1730a = this.f10936a;
/* 3 */             int iM5499f = c1730a.f11781v;
/* 5 */             if (iM5499f == 0) {
/* 7 */                 iM5499f = c1730a.m5499f();
                    }
/* 14 */            if (iM5499f == 15) {
/* 16 */                c1730a.f11781v = 0;
/* 18 */                int[] iArr = c1730a.f11773Z;
/* 22 */                int i = c1730a.f11771X - 1;
/* 28 */                iArr[i] = iArr[i] + 1;
/* 30 */                j = c1730a.f11782w;
                    } else {
/* 40 */                if (iM5499f == 16) {
/* 53 */                    c1730a.f11769V = new String(c1730a.f11776c, c1730a.f11777d, c1730a.f11768U);
/* 60 */                    c1730a.f11777d += c1730a.f11768U;
                        } else {
/* 67 */                    if (iM5499f != 8 && iM5499f != 9 && iM5499f != 10) {
/* 78 */                        StringBuilder sb = new StringBuilder("Expected a long but was ");
/* 85 */                        sb.append(c1730a.peek());
/* 92 */                        f42.m3659o(sb, c1730a.m5502i());
/* 36 */                        return 0L;
                            }
/* 96 */                    if (iM5499f == 10) {
/* 102 */                       c1730a.f11769V = c1730a.m5505m();
                            } else {
/* 116 */                       c1730a.f11769V = c1730a.m5504l(iM5499f == 8 ? '\'' : '\"');
                            }
                            try {
/* 120 */                       long j3 = Long.parseLong(c1730a.f11769V);
/* 124 */                       c1730a.f11781v = 0;
/* 126 */                       int[] iArr2 = c1730a.f11773Z;
/* 130 */                       int i2 = c1730a.f11771X - 1;
/* 136 */                       iArr2[i2] = iArr2[i2] + 1;
/* 138 */                       j = j3;
                            } catch (NumberFormatException unused) {
/* 142 */                       c1730a.f11781v = 11;
/* 146 */                       d = Double.parseDouble(c1730a.f11769V);
/* 150 */                       j2 = (long) d;
/* 154 */                       if (j2 == d) {
/* 184 */                           f42.m3665u(c1730a.f11769V, "Expected a long but was ", c1730a.m5502i());
/* 36 */                            return 0L;
                                }
/* 157 */                       c1730a.f11769V = null;
/* 159 */                       c1730a.f11781v = 0;
/* 161 */                       int[] iArr3 = c1730a.f11773Z;
/* 165 */                       int i3 = c1730a.f11771X - 1;
/* 171 */                       iArr3[i3] = iArr3[i3] + 1;
/* 173 */                       j = j2;
                            }
                        }
/* 142 */               c1730a.f11781v = 11;
/* 146 */               d = Double.parseDouble(c1730a.f11769V);
/* 150 */               j2 = (long) d;
/* 154 */               if (j2 == d) {
/* 184 */                   f42.m3665u(c1730a.f11769V, "Expected a long but was ", c1730a.m5502i());
/* 36 */                    return 0L;
                        }
/* 157 */               c1730a.f11769V = null;
/* 159 */               c1730a.f11781v = 0;
/* 161 */               int[] iArr4 = c1730a.f11773Z;
/* 165 */               int i4 = c1730a.f11771X - 1;
/* 171 */               iArr4[i4] = iArr4[i4] + 1;
/* 173 */               j = j2;
                    }
/* 174 */           m5236f();
/* 177 */           return j;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final String nextName() {
/* 3 */             return this.f10936a.nextName();
                }

                @Override // io.sentry.InterfaceC1489i3
                public final String nextString() throws IOException {
                    String str;
/* 1 */             C1730a c1730a = this.f10936a;
/* 3 */             int iM5499f = c1730a.f11781v;
/* 5 */             if (iM5499f == 0) {
/* 7 */                 iM5499f = c1730a.m5499f();
                    }
/* 13 */            if (iM5499f == 10) {
/* 15 */                str = c1730a.m5505m();
                    } else if (iM5499f == 8) {
/* 26 */                str = c1730a.m5504l('\'');
                    } else if (iM5499f == 9) {
/* 37 */                str = c1730a.m5504l('\"');
                    } else if (iM5499f == 11) {
/* 47 */                str = c1730a.f11769V;
/* 49 */                c1730a.f11769V = null;
                    } else if (iM5499f == 15) {
/* 58 */                str = Long.toString(c1730a.f11782w);
                    } else {
/* 65 */                if (iM5499f != 16) {
/* 108 */                   StringBuilder sb = new StringBuilder("Expected a string but was ");
/* 115 */                   sb.append(c1730a.peek());
/* 122 */                   f42.m3659o(sb, c1730a.m5502i());
/* 44 */                    return null;
                        }
/* 75 */                str = new String(c1730a.f11776c, c1730a.f11777d, c1730a.f11768U);
/* 83 */                c1730a.f11777d += c1730a.f11768U;
                    }
/* 86 */            c1730a.f11781v = 0;
/* 88 */            int[] iArr = c1730a.f11773Z;
/* 92 */            int i = c1730a.f11771X - 1;
/* 98 */            iArr[i] = iArr[i] + 1;
/* 100 */           m5236f();
/* 103 */           return str;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final EnumC1731b peek() {
/* 3 */             return this.f10936a.peek();
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: q0 */
                public final Boolean mo5242q0() throws IOException {
/* 9 */             if (this.f10936a.peek() != EnumC1731b.NULL) {
/* 20 */                return Boolean.valueOf(m5237g());
                    }
/* 11 */            m5238h();
/* 14 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: r */
                public final Integer mo5243r() throws IOException {
/* 9 */             if (this.f10936a.peek() != EnumC1731b.NULL) {
/* 20 */                return Integer.valueOf(nextInt());
                    }
/* 11 */            m5238h();
/* 14 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final void setLenient(boolean z) {
/* 3 */             this.f10936a.f11775b = z;
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
                @Override // io.sentry.InterfaceC1489i3
                public final void skipValue() throws IOException {
                    C1730a c1730a;
/* 2 */             int i = 0;
/* 183 */           do {
/* 3 */                 c1730a = this.f10936a;
/* 5 */                 int iM5499f = c1730a.f11781v;
/* 7 */                 if (iM5499f == 0) {
/* 9 */                     iM5499f = c1730a.m5499f();
                        }
/* 15 */                if (iM5499f == 3) {
/* 17 */                    c1730a.m5506n(1);
                        } else {
/* 24 */                    if (iM5499f == 1) {
/* 26 */                        c1730a.m5506n(3);
                            } else if (iM5499f == 4 || iM5499f == 2) {
/* 48 */                        c1730a.f11771X--;
/* 38 */                        i--;
                            } else if (iM5499f == 14 || iM5499f == 10) {
                                while (true) {
/* 102 */                           int i2 = 0;
                                    while (true) {
/* 105 */                               int i3 = c1730a.f11777d + i2;
/* 108 */                               if (i3 < c1730a.f11778e) {
/* 112 */                                   char c = c1730a.f11776c[i3];
/* 114 */                                   if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
/* 128 */                                       if (c != '#') {
/* 132 */                                           if (c != ',') {
/* 136 */                                               if (c != '/' && c != '=') {
/* 144 */                                                   if (c != '{' && c != '}' && c != ':') {
/* 156 */                                                       if (c != ';') {
                                                                    switch (c) {
                                                                        case '[':
                                                                        case ']':
                                                                            break;
                                                                        case '\\':
                                                                            break;
                                                                        default:
/* 161 */                                                                   i2++;
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
/* 164 */                                       c1730a.m5498c();
                                            }
/* 170 */                                   c1730a.f11777d += i2;
                                        } else {
/* 173 */                                   c1730a.f11777d = i3;
/* 179 */                                   if (!c1730a.m5500g(1)) {
                                            }
                                        }
                                    }
                                }
                            } else if (iM5499f == 8 || iM5499f == 12) {
/* 98 */                        c1730a.m5508p('\'');
                            } else if (iM5499f == 9 || iM5499f == 13) {
/* 92 */                        c1730a.m5508p('\"');
                            } else if (iM5499f == 16) {
/* 87 */                        c1730a.f11777d += c1730a.f11768U;
                            }
/* 181 */                   c1730a.f11781v = 0;
                        }
/* 20 */                i++;
/* 181 */               c1730a.f11781v = 0;
/* 183 */           } while (i != 0);
/* 185 */           int[] iArr = c1730a.f11773Z;
/* 189 */           int i4 = c1730a.f11771X - 1;
/* 193 */           iArr[i4] = iArr[i4] + 1;
/* 199 */           c1730a.f11772Y[i4] = "null";
/* 201 */           m5236f();
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: w */
                public final void mo5244w(ILogger iLogger, AbstractMap abstractMap, String str) throws Throwable {
/* 1 */             C1434e2 c1434e2 = null;
                    try {
                        try {
/* 12 */                    C1434e2 c1434e3 = new C1434e2(this.f10938c, this.f10936a.peek());
/* 17 */                    this.f10937b.addLast(c1434e3);
                            try {
/* 24 */                        abstractMap.put(str, mo5232R0());
/* 27 */                        m5235c(c1434e3);
                            } catch (Exception e) {
/* 34 */                        e = e;
/* 35 */                        c1434e2 = c1434e3;
/* 46 */                        iLogger.mo4670b(EnumC1553m5.ERROR, e, "Error deserializing unknown key: %s", str);
/* 49 */                        if (c1434e2 != null) {
                                    try {
/* 51 */                                m5240i(c1434e2);
                                    } catch (Exception e2) {
/* 62 */                                iLogger.mo4671d(EnumC1553m5.ERROR, "Stream unrecoverable after unknown key deserialization failure.", e2);
                                    }
                                }
/* 65 */                        m5235c(c1434e2);
                            } catch (Throwable th) {
/* 31 */                        th = th;
/* 32 */                        c1434e2 = c1434e3;
/* 69 */                        m5235c(c1434e2);
/* 72 */                        throw th;
                            }
                        } catch (Throwable th2) {
/* 55 */                    th = th2;
                        }
                    } catch (Exception e3) {
/* 37 */                e = e3;
                    }
                }
            }
