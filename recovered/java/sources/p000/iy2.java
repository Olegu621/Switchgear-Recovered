            package p000;

            import java.lang.reflect.Field;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class iy2 extends ky2 {
                @Override // p000.ky2
                /* JADX INFO: renamed from: c */
                public final boolean mo4043c(Object obj, long j) {
/* 3 */             return this.f13042a.getBoolean(obj, j);
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: d */
                public final byte mo4044d(Object obj, long j) {
/* 3 */             return this.f13042a.getByte(obj, j);
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: e */
                public final double mo4045e(Object obj, long j) {
/* 3 */             return this.f13042a.getDouble(obj, j);
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: f */
                public final float mo4046f(Object obj, long j) {
/* 3 */             return this.f13042a.getFloat(obj, j);
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: k */
                public final void mo4047k(Object obj, long j, boolean z) {
/* 3 */             this.f13042a.putBoolean(obj, j, z);
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: l */
                public final void mo4048l(Object obj, long j, byte b) {
/* 3 */             this.f13042a.putByte(obj, j, b);
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: m */
                public final void mo4049m(Object obj, long j, double d) {
/* 3 */             this.f13042a.putDouble(obj, j, d);
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: n */
                public final void mo4050n(Object obj, long j, float f) {
/* 3 */             this.f13042a.putFloat(obj, j, f);
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: r */
                public final boolean mo5627r() {
/* 8 */             if (!super.mo5627r()) {
/* 7 */                 return false;
                    }
                    try {
/* 13 */                Class<?> cls = this.f13042a.getClass();
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
/* 102 */               my2.m6815a(th);
/* 7 */                 return false;
                    }
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: s */
                public final boolean mo4051s() {
/* 7 */             Unsafe unsafe = this.f13042a;
/* 10 */            if (unsafe != null) {
                        try {
/* 13 */                    Class<?> cls = unsafe.getClass();
/* 25 */                    cls.getMethod("objectFieldOffset", Field.class);
/* 28 */                    Class cls2 = Long.TYPE;
/* 34 */                    cls.getMethod("getLong", Object.class, cls2);
/* 41 */                    if (my2.m6819e() != null) {
                                try {
/* 46 */                            Class<?> cls3 = this.f13042a.getClass();
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
/* 123 */                           my2.m6815a(th);
/* 9 */                             return false;
                                }
                            }
                        } catch (Throwable th2) {
/* 128 */                   my2.m6815a(th2);
                        }
                    }
/* 9 */             return false;
                }
            }
