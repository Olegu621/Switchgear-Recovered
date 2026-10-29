            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class h23 {

                /* JADX INFO: renamed from: a */
                public final C1024id f8874a;

                /* JADX INFO: renamed from: b */
                public final C1024id f8875b;

                /* JADX INFO: renamed from: c */
                public final C1024id f8876c;

                public h23(C1024id c1024id, C1024id c1024id2, C1024id c1024id3) {
/* 4 */             this.f8874a = c1024id;
/* 6 */             this.f8875b = c1024id2;
/* 8 */             this.f8876c = c1024id3;
                }

                /* JADX INFO: renamed from: a */
                public abstract i23 mo4087a();

                /* JADX INFO: renamed from: b */
                public final Class m4088b(Class cls) throws ClassNotFoundException {
/* 1 */             String name = cls.getName();
/* 6 */             C1024id c1024id = this.f8876c;
/* 12 */            Class cls2 = (Class) c1024id.getOrDefault(name, null);
/* 14 */            if (cls2 != null) {
/* 52 */                return cls2;
                    }
/* 41 */            Class<?> cls3 = Class.forName(pm2.m7489l(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
/* 49 */            c1024id.put(cls.getName(), cls3);
/* 52 */            return cls3;
                }

                /* JADX INFO: renamed from: c */
                public final Method m4089c(String str) throws NoSuchMethodException {
/* 2 */             C1024id c1024id = this.f8874a;
/* 8 */             Method method = (Method) c1024id.getOrDefault(str, null);
/* 10 */            if (method != null) {
/* 39 */                return method;
                    }
/* 12 */            System.currentTimeMillis();
/* 32 */            Method declaredMethod = Class.forName(str, true, h23.class.getClassLoader()).getDeclaredMethod("read", h23.class);
/* 36 */            c1024id.put(str, declaredMethod);
/* 39 */            return declaredMethod;
                }

                /* JADX INFO: renamed from: d */
                public final Method m4090d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
/* 1 */             String name = cls.getName();
/* 6 */             C1024id c1024id = this.f8875b;
/* 12 */            Method method = (Method) c1024id.getOrDefault(name, null);
/* 14 */            if (method != null) {
/* 43 */                return method;
                    }
/* 16 */            Class clsM4088b = m4088b(cls);
/* 20 */            System.currentTimeMillis();
/* 31 */            Method declaredMethod = clsM4088b.getDeclaredMethod("write", cls, h23.class);
/* 39 */            c1024id.put(cls.getName(), declaredMethod);
/* 42 */            return declaredMethod;
                }

                /* JADX INFO: renamed from: e */
                public abstract boolean mo4091e(int i);

                /* JADX INFO: renamed from: f */
                public final int m4092f(int i, int i2) {
                    return !mo4091e(i2) ? i : ((i23) this).f9423e.readInt();
                }

                /* JADX INFO: renamed from: g */
                public final Parcelable m4093g(Parcelable parcelable, int i) {
/* 5 */             if (!mo4091e(i)) {
/* 7 */                 return parcelable;
                    }
/* 18 */            return ((i23) this).f9423e.readParcelable(i23.class.getClassLoader());
                }

                /* JADX INFO: renamed from: h */
                public final j23 m4094h() {
/* 6 */             String string = ((i23) this).f9423e.readString();
/* 11 */            if (string == null) {
/* 10 */                return null;
                    }
                    try {
/* 30 */                return (j23) m4089c(string).invoke(null, mo4087a());
                    } catch (ClassNotFoundException e) {
/* 43 */                ds0.m3198o("VersionedParcel encountered ClassNotFoundException", e);
/* 10 */                return null;
                    } catch (IllegalAccessException e2) {
/* 76 */                ds0.m3198o("VersionedParcel encountered IllegalAccessException", e2);
/* 10 */                return null;
                    } catch (NoSuchMethodException e3) {
/* 49 */                ds0.m3198o("VersionedParcel encountered NoSuchMethodException", e3);
/* 10 */                return null;
                    } catch (InvocationTargetException e4) {
/* 59 */                if (e4.getCause() instanceof RuntimeException) {
/* 73 */                    throw ((RuntimeException) e4.getCause());
                        }
/* 63 */                ds0.m3198o("VersionedParcel encountered InvocationTargetException", e4);
/* 10 */                return null;
                    }
                }

                /* JADX INFO: renamed from: i */
                public abstract void mo4095i(int i);

                /* JADX INFO: renamed from: j */
                public final void m4096j(int i, int i2) {
/* 1 */             mo4095i(i2);
/* 8 */             ((i23) this).f9423e.writeInt(i);
                }

                /* JADX INFO: renamed from: k */
                public final void m4097k(j23 j23Var) {
/* 2 */             if (j23Var == null) {
/* 8 */                 ((i23) this).f9423e.writeString(null);
/* 11 */                return;
                    }
                    try {
/* 29 */                ((i23) this).f9423e.writeString(m4088b(j23Var.getClass()).getName());
/* 32 */                i23 i23VarMo4087a = mo4087a();
                        try {
/* 48 */                    m4090d(j23Var.getClass()).invoke(null, j23Var, i23VarMo4087a);
/* 51 */                    Parcel parcel = i23VarMo4087a.f9423e;
/* 53 */                    int i = i23VarMo4087a.f9427i;
/* 55 */                    if (i >= 0) {
/* 59 */                        int i2 = i23VarMo4087a.f9422d.get(i);
/* 63 */                        int iDataPosition = parcel.dataPosition();
/* 69 */                        parcel.setDataPosition(i2);
/* 72 */                        parcel.writeInt(iDataPosition - i2);
/* 75 */                        parcel.setDataPosition(iDataPosition);
                            }
                        } catch (ClassNotFoundException e) {
/* 82 */                    ds0.m3198o("VersionedParcel encountered ClassNotFoundException", e);
                        } catch (IllegalAccessException e2) {
/* 118 */                   ds0.m3198o("VersionedParcel encountered IllegalAccessException", e2);
                        } catch (NoSuchMethodException e3) {
/* 89 */                    ds0.m3198o("VersionedParcel encountered NoSuchMethodException", e3);
                        } catch (InvocationTargetException e4) {
/* 100 */                   if (e4.getCause() instanceof RuntimeException) {
/* 114 */                       throw ((RuntimeException) e4.getCause());
                            }
/* 104 */                   ds0.m3198o("VersionedParcel encountered InvocationTargetException", e4);
                        }
                    } catch (ClassNotFoundException e5) {
/* 137 */               ds0.m3198o(j23Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
                    }
                }
            }
