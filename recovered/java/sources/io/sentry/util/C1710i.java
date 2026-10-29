            package io.sentry.util;

            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1489i3;
            import io.sentry.InterfaceC1696u1;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.vendor.gson.stream.EnumC1731b;
            import java.io.IOException;
            import java.util.AbstractMap;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.TimeZone;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: renamed from: io.sentry.util.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1710i implements InterfaceC1489i3 {

                /* JADX INFO: renamed from: a */
                public final ArrayDeque f11733a;

                public C1710i(Map map) {
/* 6 */             ArrayDeque arrayDeque = new ArrayDeque();
/* 9 */             this.f11733a = arrayDeque;
/* 17 */            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: B */
                public final Long mo5227B() throws IOException {
/* 1 */             Object objM5476c = m5476c();
/* 7 */             if (objM5476c instanceof Number) {
/* 15 */                return Long.valueOf(((Number) objM5476c).longValue());
                    }
/* 20 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: G0 */
                public final Float mo5228G0() throws IOException {
/* 1 */             Object objM5476c = m5476c();
/* 7 */             if (objM5476c instanceof Number) {
/* 15 */                return Float.valueOf(((Number) objM5476c).floatValue());
                    }
/* 20 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: J */
                public final TimeZone mo5229J(ILogger iLogger) {
/* 5 */             String str = (String) m5476c();
/* 7 */             if (str != null) {
/* 9 */                 return TimeZone.getTimeZone(str);
                    }
/* 14 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: K0 */
                public final Object mo5230K0(ILogger iLogger, InterfaceC1696u1 interfaceC1696u1) {
/* 1 */             ArrayDeque arrayDeque = this.f11733a;
/* 7 */             Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
/* 9 */             if (entry == null) {
/* 11 */                return null;
                    }
/* 13 */            Object value = entry.getValue();
/* 17 */            if (iLogger != null) {
/* 19 */                return interfaceC1696u1.mo5157a(this, iLogger);
                    }
/* 24 */            arrayDeque.removeLast();
/* 27 */            return value;
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: M */
                public final String mo5231M() {
/* 5 */             return (String) m5476c();
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: R0 */
                public final Object mo5232R0() {
/* 1 */             return m5476c();
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: T */
                public final HashMap mo5233T(ILogger iLogger, InterfaceC1696u1 interfaceC1696u1) throws IOException {
/* 7 */             if (peek() == EnumC1731b.NULL) {
/* 14 */                if (m5476c() == null) {
/* 13 */                    return null;
                        }
/* 23 */                f42.m3661q(peek(), "Expected null but was ");
/* 13 */                return null;
                    }
                    try {
/* 27 */                beginObject();
/* 32 */                HashMap map = new HashMap();
/* 41 */                if (peek() == EnumC1731b.NAME) {
                            while (true) {
/* 43 */                        String strNextName = nextName();
/* 49 */                        int size = this.f11733a.size();
                                try {
/* 57 */                            map.put(strNextName, interfaceC1696u1.mo5157a(this, iLogger));
                                } catch (Exception e) {
/* 66 */                            iLogger.mo4671d(EnumC1553m5.WARNING, "Failed to deserialize object in map.", e);
/* 69 */                            m5477f(size);
                                }
/* 78 */                        if (peek() != EnumC1731b.BEGIN_OBJECT && peek() != EnumC1731b.NAME) {
                                    break;
                                }
                            }
                        }
/* 88 */                endObject();
/* 91 */                return map;
                    } catch (Exception e2) {
/* 98 */                throw new IOException(e2);
                    }
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: b0 */
                public final Double mo5234b0() throws IOException {
/* 1 */             Object objM5476c = m5476c();
/* 7 */             if (objM5476c instanceof Number) {
/* 15 */                return Double.valueOf(((Number) objM5476c).doubleValue());
                    }
/* 20 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final void beginArray() throws IOException {
/* 1 */             ArrayDeque arrayDeque = this.f11733a;
/* 7 */             Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
/* 9 */             if (entry == null) {
/* 67 */                ds0.m3195l("No more entries");
/* 70 */                return;
                    }
/* 11 */            Object value = entry.getValue();
/* 17 */            if (!(value instanceof List)) {
/* 61 */                ds0.m3195l("Current token is not an object");
/* 64 */                return;
                    }
/* 19 */            arrayDeque.removeLast();
/* 30 */            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, EnumC1731b.END_ARRAY));
/* 33 */            List list = (List) value;
/* 41 */            for (int size = list.size() - 1; size >= 0; size--) {
/* 52 */                arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
                    }
                }

                @Override // io.sentry.InterfaceC1489i3
                public final void beginObject() throws IOException {
/* 1 */             ArrayDeque arrayDeque = this.f11733a;
/* 7 */             Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
/* 9 */             if (entry == null) {
/* 68 */                ds0.m3195l("No more entries");
/* 71 */                return;
                    }
/* 11 */            Object value = entry.getValue();
/* 17 */            if (!(value instanceof Map)) {
/* 62 */                ds0.m3195l("Current token is not an object");
/* 65 */                return;
                    }
/* 19 */            arrayDeque.removeLast();
/* 30 */            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, EnumC1731b.END_OBJECT));
/* 39 */            Iterator it = ((Map) value).entrySet().iterator();
/* 47 */            while (it.hasNext()) {
/* 55 */                arrayDeque.addLast((Map.Entry) it.next());
                    }
                }

                /* JADX INFO: renamed from: c */
                public final Object m5476c() throws IOException {
                    try {
/* 1 */                 ArrayDeque arrayDeque = this.f11733a;
/* 7 */                 Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
/* 9 */                 if (entry == null) {
/* 11 */                    return null;
                        }
/* 13 */                Object value = entry.getValue();
/* 17 */                arrayDeque.removeLast();
/* 20 */                return value;
                    } catch (Exception e) {
/* 27 */                throw new IOException(e);
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 3 */             this.f11733a.clear();
                }

                @Override // io.sentry.InterfaceC1489i3
                public final void endArray() {
/* 1 */             ArrayDeque arrayDeque = this.f11733a;
/* 8 */             if (arrayDeque.size() > 1) {
/* 10 */                arrayDeque.removeLast();
                    }
                }

                @Override // io.sentry.InterfaceC1489i3
                public final void endObject() {
/* 1 */             ArrayDeque arrayDeque = this.f11733a;
/* 8 */             if (arrayDeque.size() > 1) {
/* 10 */                arrayDeque.removeLast();
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m5477f(int i) {
                    while (true) {
/* 1 */                 ArrayDeque arrayDeque = this.f11733a;
/* 7 */                 if (arrayDeque.isEmpty() || arrayDeque.size() < i) {
/* 19 */                    return;
                        } else {
/* 15 */                    arrayDeque.removeLast();
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: h1 */
                public final ArrayList mo5239h1(ILogger iLogger, InterfaceC1696u1 interfaceC1696u1) throws IOException {
/* 7 */             if (peek() == EnumC1731b.NULL) {
/* 14 */                if (m5476c() == null) {
/* 13 */                    return null;
                        }
/* 23 */                f42.m3661q(peek(), "Expected null but was ");
/* 13 */                return null;
                    }
                    try {
/* 27 */                beginArray();
/* 32 */                ArrayList arrayList = new ArrayList();
/* 41 */                while (peek() != EnumC1731b.END_ARRAY) {
/* 45 */                    int size = this.f11733a.size();
                            try {
/* 53 */                        arrayList.add(interfaceC1696u1.mo5157a(this, iLogger));
                            } catch (Exception e) {
/* 62 */                        iLogger.mo4671d(EnumC1553m5.WARNING, "Failed to deserialize object in list.", e);
/* 65 */                        m5477f(size);
                            }
                        }
/* 69 */                endArray();
/* 72 */                return arrayList;
                    } catch (Exception e2) {
/* 79 */                throw new IOException(e2);
                    }
                }

                @Override // io.sentry.InterfaceC1489i3
                public final boolean hasNext() {
/* 7 */             return !this.f11733a.isEmpty();
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: l0 */
                public final Date mo5241l0(ILogger iLogger) {
/* 5 */             String str = (String) m5476c();
/* 8 */             if (str == null) {
/* 7 */                 return null;
                    }
                    try {
                        try {
/* 11 */                    return AbstractC1417a.m5174l(str);
                        } catch (Exception unused) {
/* 16 */                    return AbstractC1417a.m5175m(str);
                        }
                    } catch (Exception e) {
/* 26 */                iLogger.mo4671d(EnumC1553m5.ERROR, "Error when deserializing millis timestamp format.", e);
/* 7 */                 return null;
                    }
                }

                @Override // io.sentry.InterfaceC1489i3
                public final double nextDouble() throws IOException {
/* 1 */             Object objM5476c = m5476c();
/* 7 */             if (objM5476c instanceof Number) {
/* 11 */                return ((Number) objM5476c).doubleValue();
                    }
/* 18 */            ds0.m3195l("Expected double");
/* 21 */            return 0.0d;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final float nextFloat() throws IOException {
/* 1 */             Object objM5476c = m5476c();
/* 7 */             if (objM5476c instanceof Number) {
/* 11 */                return ((Number) objM5476c).floatValue();
                    }
/* 18 */            ds0.m3195l("Expected float");
/* 21 */            return 0.0f;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final int nextInt() throws IOException {
/* 1 */             Object objM5476c = m5476c();
/* 7 */             if (objM5476c instanceof Number) {
/* 11 */                return ((Number) objM5476c).intValue();
                    }
/* 18 */            ds0.m3195l("Expected int");
/* 21 */            return 0;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final long nextLong() throws IOException {
/* 1 */             Object objM5476c = m5476c();
/* 7 */             if (objM5476c instanceof Number) {
/* 11 */                return ((Number) objM5476c).longValue();
                    }
/* 18 */            ds0.m3195l("Expected long");
/* 21 */            return 0L;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final String nextName() throws IOException {
/* 7 */             Map.Entry entry = (Map.Entry) this.f11733a.peekLast();
/* 9 */             if (entry != null && entry.getKey() != null) {
/* 21 */                return (String) entry.getKey();
                    }
/* 30 */            f42.m3661q(peek(), "Expected a name but was ");
/* 33 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final String nextString() throws IOException {
/* 5 */             String str = (String) m5476c();
/* 7 */             if (str != null) {
/* 9 */                 return str;
                    }
/* 12 */            ds0.m3195l("Expected string");
/* 15 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final EnumC1731b peek() {
/* 1 */             ArrayDeque arrayDeque = this.f11733a;
/* 7 */             if (arrayDeque.isEmpty()) {
/* 9 */                 return EnumC1731b.END_DOCUMENT;
                    }
/* 16 */            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
/* 18 */            if (entry == null) {
/* 20 */                return EnumC1731b.END_DOCUMENT;
                    }
/* 27 */            if (entry.getKey() != null) {
/* 29 */                return EnumC1731b.NAME;
                    }
/* 32 */            Object value = entry.getValue();
/* 38 */            if (value instanceof Map) {
/* 40 */                return EnumC1731b.BEGIN_OBJECT;
                    }
/* 45 */            if (value instanceof List) {
/* 47 */                return EnumC1731b.BEGIN_ARRAY;
                    }
/* 52 */            if (value instanceof String) {
/* 54 */                return EnumC1731b.STRING;
                    }
/* 59 */            if (value instanceof Number) {
/* 61 */                return EnumC1731b.NUMBER;
                    }
/* 66 */            if (value instanceof Boolean) {
/* 68 */                return EnumC1731b.BOOLEAN;
                    }
                    return value instanceof EnumC1731b ? (EnumC1731b) value : EnumC1731b.END_DOCUMENT;
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: q0 */
                public final Boolean mo5242q0() {
/* 5 */             return (Boolean) m5476c();
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: r */
                public final Integer mo5243r() throws IOException {
/* 1 */             Object objM5476c = m5476c();
/* 7 */             if (objM5476c instanceof Number) {
/* 15 */                return Integer.valueOf(((Number) objM5476c).intValue());
                    }
/* 20 */            return null;
                }

                @Override // io.sentry.InterfaceC1489i3
                public final void setLenient(boolean z) {
                }

                @Override // io.sentry.InterfaceC1489i3
                public final void skipValue() {
/* 1 */             ArrayDeque arrayDeque = this.f11733a;
/* 7 */             if (arrayDeque.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             arrayDeque.removeLast();
                }

                @Override // io.sentry.InterfaceC1489i3
                /* JADX INFO: renamed from: w */
                public final void mo5244w(ILogger iLogger, AbstractMap abstractMap, String str) {
/* 3 */             int size = this.f11733a.size();
                    try {
/* 11 */                abstractMap.put(str, m5476c());
                    } catch (Exception e) {
/* 24 */                iLogger.mo4670b(EnumC1553m5.ERROR, e, "Error deserializing unknown key: %s", str);
/* 27 */                m5477f(size);
                    }
                }
            }
