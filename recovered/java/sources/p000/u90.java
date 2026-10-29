            package p000;

            import android.graphics.drawable.Drawable;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class u90 {

                /* JADX INFO: renamed from: a */
                public static final boolean f17421a;

                /* JADX INFO: renamed from: b */
                public static final Method f17422b;

                /* JADX INFO: renamed from: c */
                public static final Field f17423c;

                /* JADX INFO: renamed from: d */
                public static final Field f17424d;

                /* JADX INFO: renamed from: e */
                public static final Field f17425e;

                /* JADX INFO: renamed from: f */
                public static final Field f17426f;

                /* JADX WARN: Code duplicated, block: B:25:0x004a  */
                /* JADX WARN: Code duplicated, block: B:26:0x0057  */
                static {
                    Method method;
                    Field field;
                    Field field2;
                    Field field3;
                    Field field4;
                    boolean z;
                    try {
/* 6 */                 Class<?> cls = Class.forName("android.graphics.Insets");
/* 14 */                method = Drawable.class.getMethod("getOpticalInsets", null);
                        try {
/* 20 */                    field = cls.getField("left");
                            try {
/* 26 */                        field2 = cls.getField("top");
                                try {
/* 32 */                            field3 = cls.getField("right");
                                    try {
/* 38 */                                field4 = cls.getField("bottom");
/* 42 */                                z = true;
                                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
/* 71 */                                field4 = null;
/* 72 */                                z = false;
                                    }
                                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
/* 44 */                            field3 = null;
                                }
                            } catch (ClassNotFoundException unused3) {
/* 49 */                        field2 = null;
/* 47 */                        field3 = field2;
/* 71 */                        field4 = null;
/* 72 */                        z = false;
/* 73 */                        if (z) {
/* 75 */                            f17422b = method;
/* 77 */                            f17423c = field;
/* 79 */                            f17424d = field2;
/* 81 */                            f17425e = field3;
/* 83 */                            f17426f = field4;
/* 85 */                            f17421a = true;
/* 100 */                           return;
                                }
/* 88 */                        f17422b = null;
/* 90 */                        f17423c = null;
/* 92 */                        f17424d = null;
/* 94 */                        f17425e = null;
/* 96 */                        f17426f = null;
/* 98 */                        f17421a = false;
                            } catch (NoSuchFieldException unused4) {
/* 46 */                        field2 = null;
/* 47 */                        field3 = field2;
/* 71 */                        field4 = null;
/* 72 */                        z = false;
/* 73 */                        if (z) {
/* 75 */                            f17422b = method;
/* 77 */                            f17423c = field;
/* 79 */                            f17424d = field2;
/* 81 */                            f17425e = field3;
/* 83 */                            f17426f = field4;
/* 85 */                            f17421a = true;
/* 100 */                           return;
                                }
/* 88 */                        f17422b = null;
/* 90 */                        f17423c = null;
/* 92 */                        f17424d = null;
/* 94 */                        f17425e = null;
/* 96 */                        f17426f = null;
/* 98 */                        f17421a = false;
                            } catch (NoSuchMethodException unused5) {
/* 51 */                        field2 = null;
/* 47 */                        field3 = field2;
/* 71 */                        field4 = null;
/* 72 */                        z = false;
/* 73 */                        if (z) {
/* 75 */                            f17422b = method;
/* 77 */                            f17423c = field;
/* 79 */                            f17424d = field2;
/* 81 */                            f17425e = field3;
/* 83 */                            f17426f = field4;
/* 85 */                            f17421a = true;
/* 100 */                           return;
                                }
/* 88 */                        f17422b = null;
/* 90 */                        f17423c = null;
/* 92 */                        f17424d = null;
/* 94 */                        f17425e = null;
/* 96 */                        f17426f = null;
/* 98 */                        f17421a = false;
                            }
                        } catch (ClassNotFoundException unused6) {
/* 56 */                    field = null;
/* 57 */                    field2 = field;
/* 47 */                    field3 = field2;
/* 71 */                    field4 = null;
/* 72 */                    z = false;
/* 73 */                    if (z) {
/* 75 */                        f17422b = method;
/* 77 */                        f17423c = field;
/* 79 */                        f17424d = field2;
/* 81 */                        f17425e = field3;
/* 83 */                        f17426f = field4;
/* 85 */                        f17421a = true;
/* 100 */                       return;
                            }
/* 88 */                    f17422b = null;
/* 90 */                    f17423c = null;
/* 92 */                    f17424d = null;
/* 94 */                    f17425e = null;
/* 96 */                    f17426f = null;
/* 98 */                    f17421a = false;
                        } catch (NoSuchFieldException unused7) {
/* 53 */                    field = null;
/* 54 */                    field2 = field;
/* 47 */                    field3 = field2;
/* 71 */                    field4 = null;
/* 72 */                    z = false;
/* 73 */                    if (z) {
/* 75 */                        f17422b = method;
/* 77 */                        f17423c = field;
/* 79 */                        f17424d = field2;
/* 81 */                        f17425e = field3;
/* 83 */                        f17426f = field4;
/* 85 */                        f17421a = true;
/* 100 */                       return;
                            }
/* 88 */                    f17422b = null;
/* 90 */                    f17423c = null;
/* 92 */                    f17424d = null;
/* 94 */                    f17425e = null;
/* 96 */                    f17426f = null;
/* 98 */                    f17421a = false;
                        } catch (NoSuchMethodException unused8) {
/* 59 */                    field = null;
/* 60 */                    field2 = field;
/* 47 */                    field3 = field2;
/* 71 */                    field4 = null;
/* 72 */                    z = false;
/* 73 */                    if (z) {
/* 75 */                        f17422b = method;
/* 77 */                        f17423c = field;
/* 79 */                        f17424d = field2;
/* 81 */                        f17425e = field3;
/* 83 */                        f17426f = field4;
/* 85 */                        f17421a = true;
/* 100 */                       return;
                            }
/* 88 */                    f17422b = null;
/* 90 */                    f17423c = null;
/* 92 */                    f17424d = null;
/* 94 */                    f17425e = null;
/* 96 */                    f17426f = null;
/* 98 */                    f17421a = false;
                        }
                    } catch (ClassNotFoundException unused9) {
/* 65 */                method = null;
/* 66 */                field = null;
                    } catch (NoSuchFieldException unused10) {
/* 62 */                method = null;
/* 63 */                field = null;
                    } catch (NoSuchMethodException unused11) {
/* 68 */                method = null;
/* 69 */                field = null;
                    }
/* 73 */            if (z) {
/* 75 */                f17422b = method;
/* 77 */                f17423c = field;
/* 79 */                f17424d = field2;
/* 81 */                f17425e = field3;
/* 83 */                f17426f = field4;
/* 85 */                f17421a = true;
/* 100 */               return;
                    }
/* 88 */            f17422b = null;
/* 90 */            f17423c = null;
/* 92 */            f17424d = null;
/* 94 */            f17425e = null;
/* 96 */            f17426f = null;
/* 98 */            f17421a = false;
                }
            }
