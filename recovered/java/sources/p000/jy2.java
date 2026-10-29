            package p000;

            import java.lang.reflect.Field;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jy2 extends ly2 {
                @Override // p000.ly2
                /* JADX INFO: renamed from: c */
                public final boolean mo4394c(Object obj, long j) {
/* 3 */             return this.f13535a.getBoolean(obj, j);
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: d */
                public final double mo4395d(Object obj, long j) {
/* 3 */             return this.f13535a.getDouble(obj, j);
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: e */
                public final float mo4396e(Object obj, long j) {
/* 3 */             return this.f13535a.getFloat(obj, j);
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: j */
                public final void mo4397j(Object obj, long j, boolean z) {
/* 3 */             this.f13535a.putBoolean(obj, j, z);
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: k */
                public final void mo4398k(Object obj, long j, byte b) {
/* 3 */             this.f13535a.putByte(obj, j, b);
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: l */
                public final void mo4399l(Object obj, long j, double d) {
/* 3 */             this.f13535a.putDouble(obj, j, d);
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: m */
                public final void mo4400m(Object obj, long j, float f) {
/* 3 */             this.f13535a.putFloat(obj, j, f);
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: q */
                public final boolean mo5928q() {
/* 8 */             if (!super.mo5928q()) {
/* 7 */                 return false;
                    }
                    try {
/* 13 */                Class<?> cls = this.f13535a.getClass();
/* 19 */                Class cls2 = Long.TYPE;
/* 25 */                cls.getMethod("getByte", Object.class, cls2);
/* 36 */                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
/* 45 */                cls.getMethod("getBoolean", Object.class, cls2);
/* 56 */                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
/* 65 */                cls.getMethod("getFloat", Object.class, cls2);
/* 76 */                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
/* 85 */                cls.getMethod("getDouble", Object.class, cls2);
/* 96 */                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
/* 99 */                return true;
                    } catch (Throwable th) {
/* 102 */               ny2.m7069a(th);
/* 7 */                 return false;
                    }
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: r */
                public final boolean mo4401r() {
/* 7 */             Unsafe unsafe = this.f13535a;
/* 10 */            if (unsafe != null) {
                        try {
/* 13 */                    Class<?> cls = unsafe.getClass();
/* 25 */                    cls.getMethod("objectFieldOffset", Field.class);
/* 28 */                    Class cls2 = Long.TYPE;
/* 34 */                    cls.getMethod("getLong", Object.class, cls2);
/* 41 */                    if (ny2.m7075g() != null) {
                                try {
/* 46 */                            Class<?> cls3 = this.f13535a.getClass();
/* 56 */                            cls3.getMethod("getByte", cls2);
/* 67 */                            cls3.getMethod("putByte", cls2, Byte.TYPE);
/* 76 */                            cls3.getMethod("getInt", cls2);
/* 87 */                            cls3.getMethod("putInt", cls2, Integer.TYPE);
/* 94 */                            cls3.getMethod("getLong", cls2);
/* 103 */                           cls3.getMethod("putLong", cls2, cls2);
/* 110 */                           cls3.getMethod("copyMemory", cls2, cls2, cls2);
/* 117 */                           cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
/* 120 */                           return true;
                                } catch (Throwable th) {
/* 123 */                           ny2.m7069a(th);
/* 9 */                             return false;
                                }
                            }
                        } catch (Throwable th2) {
/* 128 */                   ny2.m7069a(th2);
                        }
                    }
/* 9 */             return false;
                }
            }
