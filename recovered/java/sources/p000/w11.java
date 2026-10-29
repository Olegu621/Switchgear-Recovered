            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorSet;
            import android.animation.ValueAnimator;
            import android.app.Activity;
            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.opengl.Matrix;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Environment;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.support.v4.media.session.PlaybackStateCompat;
            import android.util.Xml;
            import android.view.View;
            import com.google.android.material.internal.CheckableImageButton;
            import com.google.android.material.textfield.TextInputLayout;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.WeakHashMap;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            import kotlin.Unit;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1843d;
            import kotlin.jvm.functions.Function2;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Utf8;
            import org.xmlpull.v1.XmlPullParser;
            import org.xmlpull.v1.XmlPullParserException;
            import org.xmlpull.v1.XmlSerializer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class w11 implements ud0 {

                /* JADX INFO: renamed from: a */
                public static final xt0 f18416a = new xt0(28);

                /* JADX INFO: renamed from: b */
                public static final Object f18417b = new Object();

                /* JADX INFO: renamed from: c */
                public static final f11 f18418c = new f11(2);

                /* JADX INFO: renamed from: d */
                public static final qi3 f18419d;

                /* JADX INFO: renamed from: e */
                public static final si3 f18420e;

                static {
/* 27 */            int i = 1;
/* 31 */            f18419d = new qi3(i);
/* 38 */            f18420e = new si3(i);
                }

                /* JADX INFO: renamed from: A */
                public static void m9391A(float[] fArr) {
/* 5 */             Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
/* 12 */            Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
/* 19 */            Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
                }

                /* JADX INFO: renamed from: B */
                public static void m9392B(boolean z, s81 s81Var, C2260um c2260um, o80 o80Var) {
/* 1 */             s81Var.getClass();
/* 4 */             c2260um.getClass();
/* 7 */             o80Var.getClass();
/* 23 */            s81Var.mo3676a(new dp0(0, s81Var, new qc3(c2260um, 29)), o80Var);
/* 26 */            if (z) {
/* 32 */                RunnableC2495ye runnableC2495ye = new RunnableC2495ye(s81Var, 10);
/* 35 */                o80 o80VarM7428g = pg3.m7428g();
/* 39 */                u32 u32Var = c2260um.f17592c;
/* 41 */                if (u32Var != null) {
/* 43 */                    u32Var.mo3676a(runnableC2495ye, o80VarM7428g);
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
                /* JADX INFO: renamed from: C */
                public static String m9393C(Context context) {
                    String attributeValue;
                    synchronized (f18417b) {
/* 4 */                 attributeValue = HttpUrl.FRAGMENT_ENCODE_SET;
                        try {
/* 8 */                     FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                            try {
                                try {
/* 12 */                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
/* 18 */                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
/* 21 */                            int depth = xmlPullParserNewPullParser.getDepth();
                                    while (true) {
/* 25 */                                int next = xmlPullParserNewPullParser.next();
/* 30 */                                if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
/* 44 */                                    if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
/* 65 */                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
/* 69 */                            if (fileInputStreamOpenFileInput != null) {
                                        try {
/* 71 */                                    fileInputStreamOpenFileInput.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (IOException | XmlPullParserException unused2) {
/* 81 */                            AbstractC1245n0.m4889q("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
/* 84 */                            if (fileInputStreamOpenFileInput != null) {
/* 71 */                                fileInputStreamOpenFileInput.close();
                                    }
                                }
/* 91 */                        if (attributeValue.isEmpty()) {
/* 96 */                            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                                }
                            } catch (Throwable th) {
/* 101 */                       if (fileInputStreamOpenFileInput != null) {
                                    try {
/* 103 */                               fileInputStreamOpenFileInput.close();
                                    } catch (IOException unused3) {
                                    }
                                }
/* 106 */                       throw th;
                            }
                        } catch (FileNotFoundException unused4) {
/* 4 */                     return HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                    }
/* 100 */           return attributeValue;
                }

                /* JADX INFO: renamed from: D */
                public static void m9394D(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
/* 1 */             Drawable drawable = checkableImageButton.getDrawable();
/* 9 */             if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
/* 63 */                return;
                    }
/* 20 */            int[] drawableState = textInputLayout.getDrawableState();
/* 24 */            int[] drawableState2 = checkableImageButton.getDrawableState();
/* 28 */            int length = drawableState.length;
/* 32 */            int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
/* 38 */            System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
/* 45 */            int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
/* 49 */            Drawable drawableMutate = drawable.mutate();
/* 57 */            s90.m8448h(drawableMutate, ColorStateList.valueOf(colorForState));
/* 60 */            checkableImageButton.setImageDrawable(drawableMutate);
                }

                /* JADX INFO: renamed from: E */
                public static void m9395E(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 3 */             boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
/* 13 */            boolean z = onLongClickListener != null;
/* 14 */            boolean z2 = zHasOnClickListeners || z;
/* 19 */            checkableImageButton.setFocusable(z2);
/* 22 */            checkableImageButton.setClickable(zHasOnClickListeners);
/* 25 */            checkableImageButton.setPressable(zHasOnClickListeners);
/* 28 */            checkableImageButton.setLongClickable(z);
/* 35 */            checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
                }

                /* JADX INFO: renamed from: F */
                public static void m9396F(Function2 function2, AbstractC1010i abstractC1010i, AbstractC1010i abstractC1010i2) {
                    try {
/* 5 */                 c10 c10VarM6834b = mz0.m6834b(mz0.m6833a(abstractC1010i, abstractC1010i2, function2));
/* 9 */                 m42 m42Var = o42.f14612b;
/* 13 */                xe2.m9759C(c10VarM6834b, Unit.f12910a);
                    } catch (Throwable th) {
/* 18 */                m42 m42Var2 = o42.f14612b;
/* 25 */                abstractC1010i2.resumeWith(new n42(th));
/* 28 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: G */
                public static Integer m9397G(HashSet hashSet) {
/* 25 */            if (hashSet.contains(4)) {
/* 17 */                return 4;
                    }
/* 32 */            if (hashSet.contains(2)) {
/* 12 */                return 2;
                    }
/* 39 */            if (hashSet.contains(0)) {
/* 7 */                 return 0;
                    }
                    return hashSet.contains(3) ? 3 : 1;
                }

                /* JADX INFO: renamed from: H */
                public static int m9398H(Activity activity, String str, int i) {
/* 2 */             if (i == -1) {
/* 4 */                 return m9437k(activity, str);
                    }
/* 9 */             return 1;
                }

                /* JADX INFO: renamed from: I */
                public static RunnableC1901ls m9399I(s81 s81Var, InterfaceC2251ud interfaceC2251ud, Executor executor) {
/* 3 */             RunnableC1901ls runnableC1901ls = new RunnableC1901ls(interfaceC2251ud, s81Var);
/* 6 */             s81Var.mo3676a(runnableC1901ls, executor);
/* 9 */             return runnableC1901ls;
                }

                /* JADX INFO: renamed from: J */
                public static void m9400J(Parcel parcel, int i, boolean[] zArr, boolean z) {
/* 1 */             if (zArr == null) {
/* 3 */                 if (z) {
/* 6 */                     m9420b0(parcel, i, 0);
                        }
                    } else {
/* 10 */                int iM9422c0 = m9422c0(i, parcel);
/* 14 */                parcel.writeBooleanArray(zArr);
/* 17 */                m9428f0(iM9422c0, parcel);
                    }
                }

                /* JADX INFO: renamed from: K */
                public static void m9401K(Parcel parcel, int i, Boolean bool) {
/* 1 */             if (bool == null) {
/* 3 */                 return;
                    }
/* 5 */             m9420b0(parcel, i, 4);
/* 12 */            parcel.writeInt(bool.booleanValue() ? 1 : 0);
                }

                /* JADX INFO: renamed from: L */
                public static void m9402L(Parcel parcel, int i, Bundle bundle, boolean z) {
/* 1 */             if (bundle == null) {
/* 3 */                 if (z) {
/* 6 */                     m9420b0(parcel, i, 0);
                        }
                    } else {
/* 10 */                int iM9422c0 = m9422c0(i, parcel);
/* 14 */                parcel.writeBundle(bundle);
/* 17 */                m9428f0(iM9422c0, parcel);
                    }
                }

                /* JADX INFO: renamed from: M */
                public static void m9403M(Parcel parcel, int i, byte[] bArr, boolean z) {
/* 1 */             if (bArr == null) {
/* 3 */                 if (z) {
/* 6 */                     m9420b0(parcel, i, 0);
                        }
                    } else {
/* 10 */                int iM9422c0 = m9422c0(i, parcel);
/* 14 */                parcel.writeByteArray(bArr);
/* 17 */                m9428f0(iM9422c0, parcel);
                    }
                }

                /* JADX INFO: renamed from: N */
                public static void m9404N(Parcel parcel, int i, Double d) {
/* 1 */             if (d == null) {
/* 3 */                 return;
                    }
/* 6 */             m9420b0(parcel, i, 8);
/* 13 */            parcel.writeDouble(d.doubleValue());
                }

                /* JADX INFO: renamed from: O */
                public static void m9405O(Parcel parcel, int i, IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return;
                    }
/* 4 */             int iM9422c0 = m9422c0(i, parcel);
/* 8 */             parcel.writeStrongBinder(iBinder);
/* 11 */            m9428f0(iM9422c0, parcel);
                }

                /* JADX INFO: renamed from: P */
                public static void m9406P(Parcel parcel, int i, int[] iArr, boolean z) {
/* 1 */             if (iArr == null) {
/* 3 */                 if (z) {
/* 6 */                     m9420b0(parcel, i, 0);
                        }
                    } else {
/* 10 */                int iM9422c0 = m9422c0(i, parcel);
/* 14 */                parcel.writeIntArray(iArr);
/* 17 */                m9428f0(iM9422c0, parcel);
                    }
                }

                /* JADX INFO: renamed from: Q */
                public static void m9407Q(Parcel parcel, int i, Integer num) {
/* 1 */             if (num == null) {
/* 3 */                 return;
                    }
/* 5 */             m9420b0(parcel, i, 4);
/* 12 */            parcel.writeInt(num.intValue());
                }

                /* JADX INFO: renamed from: R */
                public static void m9408R(Parcel parcel, int i, Long l) {
/* 1 */             if (l == null) {
/* 3 */                 return;
                    }
/* 6 */             m9420b0(parcel, i, 8);
/* 13 */            parcel.writeLong(l.longValue());
                }

                /* JADX INFO: renamed from: S */
                public static void m9409S(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
/* 1 */             if (parcelable == null) {
/* 3 */                 if (z) {
/* 6 */                     m9420b0(parcel, i, 0);
                        }
                    } else {
/* 10 */                int iM9422c0 = m9422c0(i, parcel);
/* 14 */                parcelable.writeToParcel(parcel, i2);
/* 17 */                m9428f0(iM9422c0, parcel);
                    }
                }

                /* JADX INFO: renamed from: T */
                public static void m9410T(Parcel parcel, int i, String str, boolean z) {
/* 1 */             if (str == null) {
/* 3 */                 if (z) {
/* 6 */                     m9420b0(parcel, i, 0);
                        }
                    } else {
/* 10 */                int iM9422c0 = m9422c0(i, parcel);
/* 14 */                parcel.writeString(str);
/* 17 */                m9428f0(iM9422c0, parcel);
                    }
                }

                /* JADX INFO: renamed from: U */
                public static void m9411U(Parcel parcel, int i, String[] strArr, boolean z) {
/* 1 */             if (strArr == null) {
/* 3 */                 if (z) {
/* 6 */                     m9420b0(parcel, i, 0);
                        }
                    } else {
/* 10 */                int iM9422c0 = m9422c0(i, parcel);
/* 14 */                parcel.writeStringArray(strArr);
/* 17 */                m9428f0(iM9422c0, parcel);
                    }
                }

                /* JADX INFO: renamed from: V */
                public static void m9412V(Parcel parcel, List list, int i) {
/* 1 */             if (list == null) {
/* 3 */                 return;
                    }
/* 4 */             int iM9422c0 = m9422c0(i, parcel);
/* 8 */             parcel.writeStringList(list);
/* 11 */            m9428f0(iM9422c0, parcel);
                }

                /* JADX INFO: renamed from: W */
                public static void m9413W(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
/* 1 */             if (parcelableArr == null) {
/* 3 */                 return;
                    }
/* 4 */             int iM9422c0 = m9422c0(i, parcel);
/* 9 */             parcel.writeInt(parcelableArr.length);
/* 14 */            for (Parcelable parcelable : parcelableArr) {
/* 18 */                if (parcelable == null) {
/* 20 */                    parcel.writeInt(0);
                        } else {
/* 24 */                    int iDataPosition = parcel.dataPosition();
/* 29 */                    parcel.writeInt(1);
/* 32 */                    int iDataPosition2 = parcel.dataPosition();
/* 36 */                    parcelable.writeToParcel(parcel, i2);
/* 39 */                    int iDataPosition3 = parcel.dataPosition();
/* 43 */                    parcel.setDataPosition(iDataPosition);
/* 48 */                    parcel.writeInt(iDataPosition3 - iDataPosition2);
/* 51 */                    parcel.setDataPosition(iDataPosition3);
                        }
                    }
/* 57 */            m9428f0(iM9422c0, parcel);
                }

                /* JADX INFO: renamed from: X */
                public static void m9414X(Parcel parcel, int i, List list, boolean z) {
/* 2 */             if (list == null) {
/* 4 */                 if (z) {
/* 6 */                     m9420b0(parcel, i, 0);
/* 9 */                     return;
                        }
/* 9 */                 return;
                    }
/* 10 */            int iM9422c0 = m9422c0(i, parcel);
/* 14 */            int size = list.size();
/* 18 */            parcel.writeInt(size);
/* 22 */            for (int i2 = 0; i2 < size; i2++) {
/* 28 */                Parcelable parcelable = (Parcelable) list.get(i2);
/* 30 */                if (parcelable == null) {
/* 32 */                    parcel.writeInt(0);
                        } else {
/* 36 */                    int iDataPosition = parcel.dataPosition();
/* 41 */                    parcel.writeInt(1);
/* 44 */                    int iDataPosition2 = parcel.dataPosition();
/* 48 */                    parcelable.writeToParcel(parcel, 0);
/* 51 */                    int iDataPosition3 = parcel.dataPosition();
/* 55 */                    parcel.setDataPosition(iDataPosition);
/* 60 */                    parcel.writeInt(iDataPosition3 - iDataPosition2);
/* 63 */                    parcel.setDataPosition(iDataPosition3);
                        }
                    }
/* 69 */            m9428f0(iM9422c0, parcel);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX INFO: renamed from: Y */
                public static final Object m9415Y(d10 d10Var) {
                    Object obj;
/* 1 */             CoroutineContext context = d10Var.getContext();
/* 5 */             hu0.m4328W(context);
/* 8 */             c10 c10VarM6834b = mz0.m6834b(d10Var);
/* 20 */            p80 p80Var = c10VarM6834b instanceof p80 ? (p80) c10VarM6834b : null;
/* 21 */            if (p80Var == null) {
/* 23 */                obj = Unit.f12910a;
                    } else {
/* 27 */                s10 s10Var = p80Var.f15019d;
/* 34 */                if (s10Var.mo6281i()) {
/* 38 */                    p80Var.f15021f = Unit.f12910a;
/* 40 */                    p80Var.f15912c = 1;
/* 42 */                    s10Var.mo1540h(context, p80Var);
                        } else {
/* 50 */                    r93 r93Var = new r93(r93.f15934c);
/* 53 */                    CoroutineContext coroutineContextPlus = context.plus(r93Var);
/* 57 */                    Unit unit = Unit.f12910a;
/* 59 */                    p80Var.f15021f = unit;
/* 61 */                    p80Var.f15912c = 1;
/* 63 */                    s10Var.mo1540h(coroutineContextPlus, p80Var);
/* 68 */                    if (r93Var.f15935b) {
/* 70 */                        ze0 ze0VarM3167a = do2.m3167a();
/* 74 */                        C0840dd c0840dd = ze0VarM3167a.f20124e;
/* 84 */                        if (c0840dd != null ? c0840dd.isEmpty() : true) {
/* 129 */                           obj = Unit.f12910a;
                                } else if (ze0VarM3167a.f20122c >= 4294967296L) {
/* 98 */                            p80Var.f15021f = unit;
/* 100 */                           p80Var.f15912c = 1;
/* 102 */                           ze0VarM3167a.m10346m(p80Var);
/* 105 */                           obj = z10.f19902a;
                                } else {
/* 108 */                           ze0VarM3167a.m10347n(true);
                                    try {
/* 111 */                               p80Var.run();
/* 118 */                               do {
/* 118 */                               } while (ze0VarM3167a.m10348p());
                                    } catch (Throwable th) {
                                        try {
/* 125 */                                   p80Var.m8080i(th, null);
                                        } catch (Throwable th2) {
/* 133 */                                   ze0VarM3167a.m10345l(true);
/* 136 */                                   throw th2;
                                        }
                                    }
/* 120 */                           ze0VarM3167a.m10345l(true);
/* 129 */                           obj = Unit.f12910a;
                                }
                            }
                        }
/* 137 */               obj = z10.f19902a;
                    }
                    return obj == z10.f19902a ? obj : Unit.f12910a;
                }

                /* JADX INFO: renamed from: Z */
                public static int m9416Z(byte[] bArr, int i, ym3 ym3Var) {
/* 1 */             int i2 = i + 1;
/* 3 */             byte b = bArr[i];
/* 5 */             if (b < 0) {
/* 10 */                return m9424d0(b, bArr, i2, ym3Var);
                    }
/* 7 */             ym3Var.f19707a = b;
/* 9 */             return i2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public static final Object m9417a(go2 go2Var, o40 o40Var, Throwable th, d10 d10Var) {
                    jk0 jk0Var;
/* 3 */             if (d10Var instanceof jk0) {
/* 6 */                 jk0Var = (jk0) d10Var;
/* 8 */                 int i = jk0Var.f12336c;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    jk0Var.f12336c = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    jk0Var = new jk0(d10Var);
                        }
                    } else {
/* 22 */                jk0Var = new jk0(d10Var);
                    }
/* 25 */            Object obj = jk0Var.f12335b;
/* 27 */            Object obj2 = z10.f19902a;
/* 29 */            int i2 = jk0Var.f12336c;
                    try {
/* 32 */                if (i2 == 0) {
/* 51 */                    pg3.m7417A(obj);
/* 54 */                    jk0Var.f12334a = th;
/* 56 */                    jk0Var.f12336c = 1;
/* 62 */                    if (o40Var.mo4450a(go2Var, th, jk0Var) == obj2) {
/* 64 */                        return obj2;
                            }
                        } else {
/* 34 */                    if (i2 != 1) {
/* 46 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 49 */                        return null;
                            }
/* 36 */                    th = jk0Var.f12334a;
/* 38 */                    pg3.m7417A(obj);
                        }
/* 65 */                return Unit.f12910a;
                    } catch (Throwable th2) {
/* 68 */                if (th != null && th != th2) {
/* 72 */                    jf0.m5798a(th2, th);
                        }
/* 75 */                throw th2;
                    }
                }

                /* JADX INFO: renamed from: a0 */
                public static ti3 m9418a0(Set set) {
/* 3 */             ti3 ti3Var = new ti3();
/* 8 */             ti3Var.f17120c = f18420e;
/* 10 */            Iterator it = set.iterator();
/* 18 */            while (it.hasNext()) {
/* 24 */                ph3 ph3Var = (ph3) it.next();
/* 28 */                pg3.m7422F(ph3Var, "key");
/* 31 */                boolean z = ph3Var.f15133c;
/* 33 */                HashMap map = ti3Var.f17119b;
/* 35 */                HashMap map2 = ti3Var.f17118a;
/* 37 */                if (!z) {
/* 57 */                    map.remove(ph3Var);
/* 62 */                    map2.put(ph3Var, ti3.f17116d);
                        } else {
/* 39 */                    if (!z) {
/* 52 */                        C1951n4.m6859j("key must be repeating");
/* 55 */                        return null;
                            }
/* 41 */                    map2.remove(ph3Var);
/* 46 */                    map.put(ph3Var, ti3.f17117e);
                        }
                    }
/* 66 */            return ti3Var;
                }

                /* JADX INFO: renamed from: b */
                public static void m9419b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
/* 1 */             Drawable drawable = checkableImageButton.getDrawable();
/* 5 */             if (drawable != null) {
/* 7 */                 drawable = drawable.mutate();
/* 11 */                if (colorStateList == null || !colorStateList.isStateful()) {
/* 56 */                    s90.m8448h(drawable, colorStateList);
                        } else {
/* 19 */                    int[] drawableState = textInputLayout.getDrawableState();
/* 23 */                    int[] drawableState2 = checkableImageButton.getDrawableState();
/* 27 */                    int length = drawableState.length;
/* 31 */                    int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
/* 37 */                    System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
/* 52 */                    s90.m8448h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
                        }
/* 59 */                if (mode != null) {
/* 61 */                    s90.m8449i(drawable, mode);
                        }
                    }
/* 68 */            if (checkableImageButton.getDrawable() != drawable) {
/* 70 */                checkableImageButton.setImageDrawable(drawable);
                    }
                }

                /* JADX INFO: renamed from: b0 */
                public static void m9420b0(Parcel parcel, int i, int i2) {
/* 4 */             parcel.writeInt(i | (i2 << 16));
                }

                /* JADX INFO: renamed from: c */
                public static final void m9421c(q33 q33Var, x62 x62Var, v61 v61Var) {
                    Object obj;
/* 1 */             x62Var.getClass();
/* 4 */             v61Var.getClass();
/* 9 */             HashMap map = q33Var.f15382a;
/* 11 */            if (map == null) {
/* 13 */                obj = null;
                    } else {
                        synchronized (map) {
/* 18 */                    obj = q33Var.f15382a.get("androidx.lifecycle.savedstate.vm.tag");
                        }
                    }
/* 23 */            o62 o62Var = (o62) obj;
/* 25 */            if (o62Var == null || o62Var.f14650c) {
/* 64 */                return;
                    }
/* 31 */            o62Var.m7106a(v61Var, x62Var);
/* 37 */            u61 u61Var = ((i71) v61Var).f9483c;
/* 41 */            if (u61Var == u61.f17375b || u61Var.compareTo(u61.f17377d) >= 0) {
/* 61 */                x62Var.m9725d();
                    } else {
/* 57 */                v61Var.mo4483a(new l60(v61Var, x62Var));
                    }
                }

                /* JADX INFO: renamed from: c0 */
                public static int m9422c0(int i, Parcel parcel) {
/* 4 */             parcel.writeInt(i | (-65536));
/* 8 */             parcel.writeInt(0);
/* 11 */            return parcel.dataPosition();
                }

                /* JADX INFO: renamed from: d */
                public static final Map m9423d(SerialDescriptor serialDescriptor) {
                    String[] strArrNames;
/* 1 */             serialDescriptor.getClass();
/* 4 */             int iMo135f = serialDescriptor.mo135f();
/* 10 */            ConcurrentHashMap concurrentHashMap = null;
/* 12 */            for (int i = 0; i < iMo135f; i++) {
/* 14 */                List listMo137h = serialDescriptor.mo137h(i);
/* 20 */                ArrayList arrayList = new ArrayList();
/* 31 */                for (Object obj : listMo137h) {
/* 39 */                    if (obj instanceof u11) {
/* 41 */                        arrayList.add(obj);
                            }
                        }
/* 58 */                u11 u11Var = (u11) (arrayList.size() == 1 ? arrayList.get(0) : null);
/* 60 */                if (u11Var != null && (strArrNames = u11Var.names()) != null) {
/* 70 */                    for (String str : strArrNames) {
/* 74 */                        if (concurrentHashMap == null) {
/* 82 */                            concurrentHashMap = new ConcurrentHashMap(serialDescriptor.mo135f());
                                }
/* 90 */                        if (concurrentHashMap.containsKey(str)) {
/* 108 */                           StringBuilder sbM3513q = AbstractC0886en.m3513q("The suggested name '", str, "' for property ");
/* 116 */                           sbM3513q.append(serialDescriptor.mo136g(i));
/* 121 */                           sbM3513q.append(" is already one of the names for property ");
/* 138 */                           sbM3513q.append(serialDescriptor.mo136g(((Number) mc1.m6638a(concurrentHashMap, str)).intValue()));
/* 143 */                           sbM3513q.append(" in ");
/* 146 */                           sbM3513q.append(serialDescriptor);
/* 156 */                           throw new q11(sbM3513q.toString());
                                }
/* 96 */                        concurrentHashMap.put(str, Integer.valueOf(i));
                            }
                        }
                    }
/* 161 */           if (concurrentHashMap != null) {
/* 169 */               return concurrentHashMap;
                    }
/* 163 */           od0 od0Var = od0.f14715a;
/* 165 */           od0Var.getClass();
/* 168 */           return od0Var;
                }

                /* JADX INFO: renamed from: d0 */
                public static int m9424d0(int i, byte[] bArr, int i2, ym3 ym3Var) {
/* 1 */             byte b = bArr[i2];
/* 3 */             int i3 = i2 + 1;
/* 5 */             int i4 = i & 127;
/* 7 */             if (b >= 0) {
/* 12 */                ym3Var.f19707a = i4 | (b << 7);
/* 14 */                return i3;
                    }
/* 19 */            int i5 = i4 | ((b & 127) << 7);
/* 20 */            int i6 = i2 + 2;
/* 22 */            byte b2 = bArr[i3];
/* 24 */            if (b2 >= 0) {
/* 29 */                ym3Var.f19707a = i5 | (b2 << 14);
/* 31 */                return i6;
                    }
/* 36 */            int i7 = i5 | ((b2 & 127) << 14);
/* 37 */            int i8 = i2 + 3;
/* 39 */            byte b3 = bArr[i6];
/* 41 */            if (b3 >= 0) {
/* 46 */                ym3Var.f19707a = i7 | (b3 << 21);
/* 48 */                return i8;
                    }
/* 53 */            int i9 = i7 | ((b3 & 127) << 21);
/* 54 */            int i10 = i2 + 4;
/* 56 */            byte b4 = bArr[i8];
/* 58 */            if (b4 >= 0) {
/* 63 */                ym3Var.f19707a = i9 | (b4 << 28);
/* 65 */                return i10;
                    }
/* 70 */            int i11 = i9 | ((b4 & 127) << 28);
                    while (true) {
/* 71 */                int i12 = i10 + 1;
/* 75 */                if (bArr[i10] >= 0) {
/* 79 */                    ym3Var.f19707a = i11;
/* 81 */                    return i12;
                        }
/* 77 */                i10 = i12;
                    }
                }

                /* JADX INFO: renamed from: e */
                public static C1890lh m9425e(C2257uj c2257uj) {
/* 1 */             long jM9030i = 0;
/* 3 */             String strM9028g = HttpUrl.FRAGMENT_ENCODE_SET;
/* 5 */             String strM9028g2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    while (true) {
/* 6 */                 int iM9029h = c2257uj.m9029h();
/* 10 */                if (iM9029h == 0) {
/* 86 */                    return new C1890lh(strM9028g, jM9030i, strM9028g2);
                        }
/* 12 */                int i = iM9029h >>> 3;
/* 14 */                int i2 = iM9029h & 7;
                        switch (i) {
                            case 1:
/* 77 */                        C2257uj.m9022b(i, 0, i2);
/* 80 */                        c2257uj.m9030i();
                                break;
                            case 2:
/* 69 */                        C2257uj.m9022b(i, 0, i2);
/* 72 */                        jM9030i = c2257uj.m9030i();
                                break;
                            case 3:
/* 62 */                        C2257uj.m9022b(i, 0, i2);
/* 65 */                        c2257uj.m9030i();
                                break;
                            case 4:
/* 54 */                        C2257uj.m9022b(i, 2, i2);
/* 57 */                        strM9028g = c2257uj.m9028g();
                                break;
                            case 5:
/* 47 */                        C2257uj.m9022b(i, 0, i2);
/* 50 */                        c2257uj.m9030i();
                                break;
                            case 6:
/* 39 */                        C2257uj.m9022b(i, 2, i2);
/* 42 */                        strM9028g2 = c2257uj.m9028g();
                                break;
                            case 7:
/* 32 */                        C2257uj.m9022b(i, 0, i2);
/* 35 */                        c2257uj.m9030i();
                                break;
                            case 8:
/* 25 */                        C2257uj.m9022b(i, 2, i2);
/* 28 */                        c2257uj.m9028g();
                                break;
                            default:
/* 21 */                        c2257uj.m9031j(i2);
                                break;
                        }
                    }
                }

                /* JADX INFO: renamed from: e0 */
                public static int m9426e0(byte[] bArr, int i, ym3 ym3Var) {
/* 1 */             long j = bArr[i];
/* 8 */             int i2 = i + 1;
/* 10 */            if (j >= 0) {
/* 12 */                ym3Var.f19708b = j;
/* 14 */                return i2;
                    }
/* 15 */            int i3 = i + 2;
/* 17 */            byte b = bArr[i2];
/* 27 */            long j2 = (j & 127) | (((long) (b & 127)) << 7);
/* 28 */            int i4 = 7;
/* 29 */            while (b < 0) {
/* 31 */                int i5 = i3 + 1;
/* 33 */                byte b2 = bArr[i3];
/* 35 */                i4 += 7;
/* 40 */                j2 |= ((long) (b2 & 127)) << i4;
/* 42 */                b = b2;
/* 43 */                i3 = i5;
                    }
/* 45 */            ym3Var.f19708b = j2;
/* 47 */            return i3;
                }

                /* JADX INFO: renamed from: f */
                public static zb0 m9427f(C2257uj c2257uj) {
                    while (true) {
/* 1 */                 int iM9029h = c2257uj.m9029h();
/* 5 */                 if (iM9029h == 0) {
/* 93 */                    return new zb0(20);
                        }
/* 7 */                 int i = iM9029h >>> 3;
/* 9 */                 int i2 = iM9029h & 7;
/* 13 */                if (i == 1) {
/* 82 */                    C2257uj.m9022b(i, 2, i2);
/* 85 */                    c2257uj.m9028g();
                        } else if (i == 2) {
/* 75 */                    C2257uj.m9022b(i, 2, i2);
/* 78 */                    c2257uj.m9028g();
                        } else if (i == 3) {
/* 68 */                    C2257uj.m9022b(i, 0, i2);
/* 71 */                    c2257uj.m9030i();
                        } else if (i == 4) {
/* 60 */                    C2257uj.m9022b(i, 2, i2);
/* 63 */                    c2257uj.m9026e();
                        } else if (i != 6) {
/* 26 */                    c2257uj.m9031j(i2);
                        } else {
/* 30 */                    C2257uj.m9022b(i, 2, i2);
/* 33 */                    C2257uj c2257ujM9027f = c2257uj.m9027f();
                            while (true) {
/* 37 */                        int iM9029h2 = c2257ujM9027f.m9029h();
/* 41 */                        if (iM9029h2 != 0) {
/* 43 */                            int i3 = iM9029h2 >>> 3;
/* 45 */                            int i4 = iM9029h2 & 7;
/* 47 */                            if (i3 != 1) {
/* 49 */                                c2257ujM9027f.m9031j(i4);
                                    } else {
/* 53 */                                C2257uj.m9022b(i3, 2, i4);
/* 56 */                                c2257ujM9027f.m9026e();
                                    }
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: f0 */
                public static void m9428f0(int i, Parcel parcel) {
/* 1 */             int iDataPosition = parcel.dataPosition();
/* 9 */             parcel.setDataPosition(i - 4);
/* 12 */            parcel.writeInt(iDataPosition - i);
/* 15 */            parcel.setDataPosition(iDataPosition);
                }

                /* JADX INFO: renamed from: g */
                public static void m9429g(C2257uj c2257uj, HashMap map) {
                    int i;
                    int i2;
                    C2257uj c2257uj2;
/* 1 */             int i3 = 0;
/* 2 */             tp2 tp2Var = null;
/* 3 */             int iM9030i = 0;
                    while (true) {
/* 4 */                 int iM9029h = c2257uj.m9029h();
/* 8 */                 if (iM9029h == 0) {
/* 274 */                   if (tp2Var != null) {
/* 282 */                       map.put(Integer.valueOf(iM9030i), tp2Var);
/* 285 */                       return;
                            }
/* 285 */                   return;
                        }
/* 10 */                int i4 = iM9029h >>> 3;
/* 12 */                int i5 = iM9029h & 7;
/* 14 */                int i6 = 1;
/* 15 */                if (i4 == 1) {
/* 262 */                   i = i3;
/* 263 */                   C2257uj.m9022b(i4, i, i5);
/* 270 */                   iM9030i = (int) c2257uj.m9030i();
                        } else if (i4 != 2) {
/* 22 */                    c2257uj.m9031j(i5);
/* 25 */                    i = i3;
                        } else {
/* 30 */                    C2257uj.m9022b(i4, 2, i5);
/* 33 */                    C2257uj c2257ujM9027f = c2257uj.m9027f();
/* 39 */                    ArrayList arrayList = new ArrayList();
/* 44 */                    ArrayList arrayList2 = new ArrayList();
/* 49 */                    ArrayList arrayList3 = new ArrayList();
/* 54 */                    ArrayList arrayList4 = new ArrayList();
/* 59 */                    ArrayList arrayList5 = new ArrayList();
/* 64 */                    int iM9030i2 = i3;
/* 65 */                    String strM9028g = HttpUrl.FRAGMENT_ENCODE_SET;
                            while (true) {
/* 66 */                        int iM9029h2 = c2257ujM9027f.m9029h();
/* 70 */                        if (iM9029h2 != 0) {
/* 72 */                            int i7 = iM9029h2 >>> 3;
/* 74 */                            int i8 = iM9029h2 & 7;
                                    switch (i7) {
                                        case 1:
/* 235 */                                   i2 = i3;
/* 236 */                                   c2257uj2 = c2257ujM9027f;
/* 238 */                                   C2257uj.m9022b(i7, i2, i8);
/* 245 */                                   iM9030i2 = (int) c2257uj2.m9030i();
                                            break;
                                        case 2:
/* 225 */                                   c2257uj2 = c2257ujM9027f;
/* 227 */                                   C2257uj.m9022b(i7, 2, i8);
/* 230 */                                   strM9028g = c2257uj2.m9028g();
/* 223 */                                   i2 = 0;
                                            break;
                                        case 3:
/* 156 */                                   C2257uj.m9022b(i7, 2, i8);
/* 159 */                                   C2257uj c2257ujM9027f2 = c2257ujM9027f.m9027f();
/* 165 */                                   String strM9028g2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 166 */                                   long jM9030i = 0;
                                            while (true) {
/* 168 */                                       int iM9029h3 = c2257ujM9027f2.m9029h();
/* 172 */                                       if (iM9029h3 == 0) {
/* 211 */                                           c2257uj2 = c2257ujM9027f;
/* 220 */                                           arrayList.add(new o22(strM9028g2, jM9030i));
/* 223 */                                           i2 = 0;
                                                } else {
/* 174 */                                           int i9 = iM9029h3 >>> 3;
/* 176 */                                           C2257uj c2257uj3 = c2257ujM9027f;
/* 178 */                                           int i10 = iM9029h3 & 7;
/* 180 */                                           if (i9 == i6) {
/* 199 */                                               C2257uj.m9022b(i9, 2, i10);
/* 202 */                                               strM9028g2 = c2257ujM9027f2.m9028g();
                                                    } else if (i9 != 2) {
/* 184 */                                               c2257ujM9027f2.m9031j(i10);
                                                    } else {
/* 189 */                                               C2257uj.m9022b(i9, 0, i10);
/* 192 */                                               jM9030i = c2257ujM9027f2.m9030i();
                                                    }
/* 206 */                                           c2257ujM9027f = c2257uj3;
/* 209 */                                           i6 = 1;
                                                }
                                                break;
                                            }
                                            break;
                                        case 4:
/* 141 */                                   C2257uj.m9022b(i7, 2, i8);
/* 152 */                                   arrayList4.add(m9425e(c2257ujM9027f.m9027f()));
/* 82 */                                    c2257uj2 = c2257ujM9027f;
/* 223 */                                   i2 = 0;
                                            break;
                                        case 5:
/* 126 */                                   C2257uj.m9022b(i7, 2, i8);
/* 137 */                                   arrayList5.add(m9427f(c2257ujM9027f.m9027f()));
/* 82 */                                    c2257uj2 = c2257ujM9027f;
/* 223 */                                   i2 = 0;
                                            break;
                                        case 6:
/* 119 */                                   C2257uj.m9022b(i7, i3, i8);
/* 122 */                                   c2257ujM9027f.m9030i();
/* 103 */                                   i2 = i3;
/* 104 */                                   c2257uj2 = c2257ujM9027f;
                                            break;
                                        case 7:
/* 108 */                                   C2257uj.m9022b(i7, 2, i8);
/* 115 */                                   arrayList2.add(c2257ujM9027f.m9028g());
/* 82 */                                    c2257uj2 = c2257ujM9027f;
/* 223 */                                   i2 = 0;
                                            break;
                                        case 8:
/* 97 */                                    C2257uj.m9022b(i7, i3, i8);
/* 100 */                                   c2257ujM9027f.m9030i();
/* 103 */                                   i2 = i3;
/* 104 */                                   c2257uj2 = c2257ujM9027f;
                                            break;
                                        case 9:
/* 86 */                                    C2257uj.m9022b(i7, 2, i8);
/* 93 */                                    arrayList3.add(c2257ujM9027f.m9028g());
/* 82 */                                    c2257uj2 = c2257ujM9027f;
/* 223 */                                   i2 = 0;
                                            break;
                                        default:
/* 79 */                                    c2257ujM9027f.m9031j(i8);
/* 82 */                                    c2257uj2 = c2257ujM9027f;
/* 223 */                                   i2 = 0;
                                            break;
                                    }
/* 246 */                           i3 = i2;
/* 247 */                           c2257ujM9027f = c2257uj2;
/* 249 */                           i6 = 1;
                                } else {
/* 252 */                           i = i3;
/* 255 */                           tp2Var = new tp2(iM9030i2, strM9028g, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
                                }
                            }
                        }
/* 271 */               i3 = i;
                    }
                }

                /* JADX INFO: renamed from: g0 */
                public static int m9430g0(byte[] bArr, int i) {
/* 3 */             int i2 = bArr[i] & 255;
/* 9 */             int i3 = bArr[i + 1] & 255;
/* 15 */            int i4 = bArr[i + 2] & 255;
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
                }

                /* JADX INFO: renamed from: h */
                public static final Object m9431h(long j, d10 d10Var) {
/* 5 */             if (j <= 0) {
/* 7 */                 return Unit.f12910a;
                    }
/* 17 */            C0890er c0890er = new C0890er(1, mz0.m6834b(d10Var));
/* 20 */            c0890er.m3571u();
/* 30 */            if (j < Long.MAX_VALUE) {
/* 38 */                m9440m(c0890er.f7845e).mo3418f(j, c0890er);
                    }
/* 41 */            Object objM3569s = c0890er.m3569s();
                    return objM3569s == z10.f19902a ? objM3569s : Unit.f12910a;
                }

                /* JADX INFO: renamed from: h0 */
                public static long m9432h0(byte[] bArr, int i) {
/* 91 */            return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
                }

                /* JADX INFO: renamed from: i */
                public static boolean m9433i(File file) {
/* 6 */             if (!file.isDirectory()) {
/* 38 */                file.delete();
/* 5 */                 return true;
                    }
/* 8 */             File[] fileArrListFiles = file.listFiles();
/* 13 */            if (fileArrListFiles == null) {
/* 12 */                return false;
                    }
/* 18 */            boolean z = true;
/* 19 */            for (File file2 : fileArrListFiles) {
/* 33 */                z = m9433i(file2) && z;
                    }
/* 37 */            return z;
                }

                /* JADX INFO: renamed from: i0 */
                public static int m9434i0(byte[] bArr, int i, ym3 ym3Var) throws uo3 {
/* 1 */             int iM9416Z = m9416Z(bArr, i, ym3Var);
/* 5 */             int i2 = ym3Var.f19707a;
/* 7 */             if (i2 < 0) {
/* 31 */                throw uo3.m9057b();
                    }
/* 9 */             if (i2 == 0) {
/* 13 */                ym3Var.f19709c = HttpUrl.FRAGMENT_ENCODE_SET;
/* 15 */                return iM9416Z;
                    }
/* 23 */            ym3Var.f19709c = new String(bArr, iM9416Z, i2, so3.f16726a);
/* 25 */            return iM9416Z + i2;
                }

                /* JADX WARN: Code duplicated, block: B:18:0x002b A[RETURN] */
                /* JADX INFO: renamed from: j */
                public static String m9435j(Context context, String str) {
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 6 */             if (i >= 31 && m9449s(context, null, str)) {
/* 14 */                return str;
                    }
/* 19 */            if (i >= 29) {
/* 41 */                if (m9449s(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
/* 17 */                    return "android.permission.ACCESS_FINE_LOCATION";
                        }
/* 5 */                 return null;
                    }
/* 25 */            if (!m9449s(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
/* 34 */                if (m9449s(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
/* 28 */                    return "android.permission.ACCESS_COARSE_LOCATION";
                        }
/* 5 */                 return null;
                    }
/* 17 */            return "android.permission.ACCESS_FINE_LOCATION";
                }

                /* JADX WARN: Code duplicated, block: B:46:0x009c A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:47:0x009e  */
                /* JADX WARN: Code duplicated, block: B:48:0x009f A[PHI: r5
  0x009f: PHI (r5v6 byte) = (r5v5 byte), (r5v9 byte) binds: [B:45:0x009a, B:47:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
                /* JADX WARN: Code duplicated, block: B:89:0x00b7 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:90:0x00b7 A[SYNTHETIC] */
                /* JADX INFO: renamed from: j0 */
                public static int m9436j0(byte[] bArr, int i, ym3 ym3Var) throws uo3 {
/* 1 */             int iM9416Z = m9416Z(bArr, i, ym3Var);
/* 5 */             int i2 = ym3Var.f19707a;
/* 7 */             if (i2 < 0) {
/* 322 */               throw uo3.m9057b();
                    }
/* 9 */             if (i2 == 0) {
/* 13 */                ym3Var.f19709c = HttpUrl.FRAGMENT_ENCODE_SET;
/* 15 */                return iM9416Z;
                    }
/* 16 */            cg3 cg3Var = zq3.f20295a;
/* 18 */            int length = bArr.length;
/* 26 */            if ((((length - iM9416Z) - i2) | iM9416Z | i2) < 0) {
/* 314 */               C1697u2.m5440p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iM9416Z), Integer.valueOf(i2)});
/* 25 */                return 0;
                    }
/* 28 */            int i3 = iM9416Z + i2;
/* 30 */            char[] cArr = new char[i2];
/* 32 */            int i4 = 0;
/* 33 */            while (iM9416Z < i3) {
/* 35 */                byte b = bArr[iM9416Z];
/* 37 */                if (b < 0) {
                            break;
                        }
/* 39 */                iM9416Z++;
/* 44 */                cArr[i4] = (char) b;
/* 41 */                i4++;
                    }
/* 48 */            while (iM9416Z < i3) {
/* 50 */                int i5 = iM9416Z + 1;
/* 52 */                byte b2 = bArr[iM9416Z];
/* 54 */                if (b2 >= 0) {
/* 59 */                    cArr[i4] = (char) b2;
/* 56 */                    i4++;
/* 62 */                    iM9416Z = i5;
/* 63 */                    while (iM9416Z < i3) {
/* 65 */                        byte b3 = bArr[iM9416Z];
/* 67 */                        if (b3 < 0) {
                                    break;
                                }
/* 69 */                        iM9416Z++;
/* 74 */                        cArr[i4] = (char) b3;
/* 71 */                        i4++;
                            }
                        } else {
/* 80 */                    if (b2 >= -32) {
/* 124 */                       if (b2 >= -16) {
/* 196 */                           if (i5 >= i3 - 2) {
/* 287 */                               throw uo3.m9059d();
                                    }
/* 200 */                           byte b4 = bArr[i5];
/* 202 */                           int i6 = iM9416Z + 3;
/* 204 */                           byte b5 = bArr[iM9416Z + 2];
/* 206 */                           iM9416Z += 4;
/* 208 */                           byte b6 = bArr[i6];
/* 214 */                           if (!j13.m5640E(b4)) {
/* 223 */                               if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !j13.m5640E(b5) && !j13.m5640E(b6)) {
/* 253 */                                   int i7 = ((b4 & Utf8.REPLACEMENT_BYTE) << 12) | ((b2 & 7) << 18) | ((b5 & Utf8.REPLACEMENT_BYTE) << 6) | (b6 & Utf8.REPLACEMENT_BYTE);
/* 261 */                                   cArr[i4] = (char) ((i7 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
/* 272 */                                   cArr[i4 + 1] = (char) ((i7 & 1023) + Utf8.LOG_SURROGATE_HEADER);
/* 274 */                                   i4 += 2;
                                        }
                                    }
/* 282 */                           throw uo3.m9059d();
                                }
/* 128 */                       if (i5 >= i3 - 1) {
/* 193 */                           throw uo3.m9059d();
                                }
/* 130 */                       int i8 = iM9416Z + 2;
/* 132 */                       byte b7 = bArr[i5];
/* 134 */                       iM9416Z += 3;
/* 136 */                       byte b8 = bArr[i8];
/* 138 */                       int i9 = i4 + 1;
/* 144 */                       if (!j13.m5640E(b7)) {
/* 148 */                           if (b2 != -32) {
/* 155 */                               if (b2 != -19) {
/* 164 */                                   if (!j13.m5640E(b8)) {
/* 179 */                                       cArr[i4] = (char) (((b7 & Utf8.REPLACEMENT_BYTE) << 6) | ((b2 & 15) << 12) | (b8 & Utf8.REPLACEMENT_BYTE));
/* 181 */                                       i4 = i9;
                                            }
                                        } else if (b7 < -96) {
/* 159 */                                   b2 = -19;
/* 164 */                                   if (!j13.m5640E(b8)) {
/* 179 */                                       cArr[i4] = (char) (((b7 & Utf8.REPLACEMENT_BYTE) << 6) | ((b2 & 15) << 12) | (b8 & Utf8.REPLACEMENT_BYTE));
/* 181 */                                       i4 = i9;
                                            }
                                        }
                                    } else if (b7 >= -96) {
/* 152 */                               b2 = -32;
/* 155 */                               if (b2 != -19) {
/* 164 */                                   if (!j13.m5640E(b8)) {
/* 179 */                                       cArr[i4] = (char) (((b7 & Utf8.REPLACEMENT_BYTE) << 6) | ((b2 & 15) << 12) | (b8 & Utf8.REPLACEMENT_BYTE));
/* 181 */                                       i4 = i9;
                                            }
                                        } else if (b7 < -96) {
/* 159 */                                   b2 = -19;
/* 164 */                                   if (!j13.m5640E(b8)) {
/* 179 */                                       cArr[i4] = (char) (((b7 & Utf8.REPLACEMENT_BYTE) << 6) | ((b2 & 15) << 12) | (b8 & Utf8.REPLACEMENT_BYTE));
/* 181 */                                       i4 = i9;
                                            }
                                        }
                                    }
                                }
/* 188 */                       throw uo3.m9059d();
                            }
/* 82 */                    if (i5 >= i3) {
/* 121 */                       throw uo3.m9059d();
                            }
/* 84 */                    iM9416Z += 2;
/* 86 */                    byte b9 = bArr[i5];
/* 88 */                    int i10 = i4 + 1;
/* 92 */                    if (b2 < -62 || j13.m5640E(b9)) {
/* 116 */                       throw uo3.m9059d();
                            }
/* 108 */                   cArr[i4] = (char) ((b9 & Utf8.REPLACEMENT_BYTE) | ((b2 & 31) << 6));
/* 110 */                   i4 = i10;
                        }
                    }
/* 293 */           ym3Var.f19709c = new String(cArr, 0, i4);
/* 295 */           return i3;
                }

                /* JADX INFO: renamed from: k */
                public static int m9437k(Activity activity, String str) {
/* 2 */             if (activity == null) {
/* 1 */                 return 0;
                    }
/* 11 */            boolean z = activity.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
/* 15 */            boolean zM9684b = AbstractC2353x2.m9684b(activity, str);
/* 20 */            if (z) {
/* 26 */                zM9684b = !zM9684b;
                    }
/* 27 */            if (!z && zM9684b) {
/* 43 */                activity.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
                    }
                    return (z && zM9684b) ? 4 : 0;
                }

                /* JADX INFO: renamed from: k0 */
                public static int m9438k0(byte[] bArr, int i, ym3 ym3Var) throws uo3 {
/* 1 */             int iM9416Z = m9416Z(bArr, i, ym3Var);
/* 5 */             int i2 = ym3Var.f19707a;
/* 7 */             if (i2 < 0) {
/* 37 */                throw uo3.m9057b();
                    }
/* 11 */            if (i2 > bArr.length - iM9416Z) {
/* 32 */                throw uo3.m9056a();
                    }
/* 13 */            if (i2 == 0) {
/* 17 */                ym3Var.f19709c = cn3.f3019b;
/* 19 */                return iM9416Z;
                    }
/* 24 */            ym3Var.f19709c = cn3.m1731d(bArr, iM9416Z, i2);
/* 26 */            return iM9416Z + i2;
                }

                /* JADX INFO: renamed from: l0 */
                public static int m9439l0(Object obj, bq3 bq3Var, byte[] bArr, int i, int i2, ym3 ym3Var) throws uo3 {
/* 1 */             int iM9424d0 = i + 1;
/* 3 */             int i3 = bArr[i];
/* 5 */             if (i3 < 0) {
/* 7 */                 iM9424d0 = m9424d0(i3, bArr, iM9424d0, ym3Var);
/* 11 */                i3 = ym3Var.f19707a;
                    }
/* 13 */            int i4 = iM9424d0;
/* 14 */            if (i3 < 0 || i3 > i2 - i4) {
/* 35 */                throw uo3.m9056a();
                    }
/* 19 */            int i5 = i4 + i3;
/* 25 */            bq3Var.mo1407b(obj, bArr, i4, i5, ym3Var);
/* 28 */            ym3Var.f19709c = obj;
/* 30 */            return i5;
                }

                /* JADX INFO: renamed from: m */
                public static final g70 m9440m(CoroutineContext coroutineContext) {
/* 3 */             CoroutineContext.Element element = coroutineContext.get(InterfaceC1843d.f12918S);
/* 14 */            g70 g70Var = element instanceof g70 ? (g70) element : null;
                    return g70Var == null ? x50.f18955a : g70Var;
                }

                /* JADX INFO: renamed from: m0 */
                public static int m9441m0(bq3 bq3Var, int i, byte[] bArr, int i2, int i3, ro3 ro3Var, ym3 ym3Var) throws uo3 {
/* 1 */             Object objZza = bq3Var.zza();
/* 5 */             bq3 bq3Var2 = bq3Var;
/* 6 */             byte[] bArr2 = bArr;
/* 8 */             int i4 = i3;
/* 9 */             ym3 ym3Var2 = ym3Var;
/* 10 */            int iM9439l0 = m9439l0(objZza, bq3Var2, bArr2, i2, i4, ym3Var2);
/* 14 */            bq3Var2.zzj(objZza);
/* 17 */            ym3Var2.f19709c = objZza;
/* 19 */            ro3Var.add(objZza);
/* 22 */            while (iM9439l0 < i4) {
/* 24 */                ym3 ym3Var3 = ym3Var2;
/* 25 */                int i5 = i4;
/* 26 */                int iM9416Z = m9416Z(bArr2, iM9439l0, ym3Var3);
/* 32 */                if (i != ym3Var3.f19707a) {
                            break;
                        }
/* 35 */                byte[] bArr3 = bArr2;
/* 36 */                bq3 bq3Var3 = bq3Var2;
/* 37 */                Object objZza2 = bq3Var3.zza();
/* 41 */                iM9439l0 = m9439l0(objZza2, bq3Var3, bArr3, iM9416Z, i5, ym3Var3);
/* 46 */                bq3Var2 = bq3Var3;
/* 47 */                bArr2 = bArr3;
/* 48 */                i4 = i5;
/* 49 */                ym3Var2 = ym3Var3;
/* 50 */                bq3Var2.zzj(objZza2);
/* 53 */                ym3Var2.f19709c = objZza2;
/* 55 */                ro3Var.add(objZza2);
                    }
/* 59 */            return iM9439l0;
                }

                /* JADX INFO: renamed from: n */
                public static Object m9442n(Future future) {
/* 19 */            de3.m3028j("Future was expected to be done, " + future, future.isDone());
/* 22 */            return m9448r(future);
                }

                /* JADX INFO: renamed from: n0 */
                public static int m9443n0(int i, byte[] bArr, int i2, int i3, mq3 mq3Var, ym3 ym3Var) throws uo3 {
/* 5 */             if ((i >>> 3) == 0) {
/* 162 */               throw new uo3("Protocol message contained an invalid tag (zero).");
                    }
/* 7 */             int i4 = i & 7;
/* 9 */             if (i4 == 0) {
/* 143 */               int iM9426e0 = m9426e0(bArr, i2, ym3Var);
/* 153 */               mq3Var.m6792d(i, Long.valueOf(ym3Var.f19708b));
/* 156 */               return iM9426e0;
                    }
/* 12 */            if (i4 == 1) {
/* 135 */               mq3Var.m6792d(i, Long.valueOf(m9432h0(bArr, i2)));
/* 138 */               return i2 + 8;
                    }
/* 15 */            if (i4 == 2) {
/* 87 */                int iM9416Z = m9416Z(bArr, i2, ym3Var);
/* 91 */                int i5 = ym3Var.f19707a;
/* 93 */                if (i5 < 0) {
/* 125 */                   throw uo3.m9057b();
                        }
/* 97 */                if (i5 > bArr.length - iM9416Z) {
/* 120 */                   throw uo3.m9056a();
                        }
/* 99 */                if (i5 == 0) {
/* 103 */                   mq3Var.m6792d(i, cn3.f3019b);
                        } else {
/* 111 */                   mq3Var.m6792d(i, cn3.m1731d(bArr, iM9416Z, i5));
                        }
/* 114 */               return iM9416Z + i5;
                    }
/* 18 */            if (i4 != 3) {
/* 21 */                if (i4 != 5) {
/* 42 */                    throw new uo3("Protocol message contained an invalid tag (zero).");
                        }
/* 31 */                mq3Var.m6792d(i, Integer.valueOf(m9430g0(bArr, i2)));
/* 34 */                return i2 + 4;
                    }
/* 45 */            int i6 = (i & (-8)) | 4;
/* 47 */            mq3 mq3VarM6789a = mq3.m6789a();
/* 51 */            int i7 = 0;
/* 52 */            while (i2 < i3) {
/* 54 */                int iM9416Z2 = m9416Z(bArr, i2, ym3Var);
/* 58 */                i7 = ym3Var.f19707a;
/* 60 */                if (i7 == i6) {
/* 70 */                    i2 = iM9416Z2;
                            break;
                        }
/* 65 */                i2 = m9443n0(i7, bArr, iM9416Z2, i3, mq3VarM6789a, ym3Var);
                    }
/* 72 */            if (i2 > i3 || i7 != i6) {
/* 84 */                throw uo3.m9058c();
                    }
/* 76 */            mq3Var.m6792d(i, mq3VarM6789a);
/* 79 */            return i2;
                }

                /* JADX INFO: renamed from: o */
                public static final int m9444o(SerialDescriptor serialDescriptor, b11 b11Var, String str) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             b11Var.getClass();
/* 7 */             str.getClass();
/* 10 */            int iMo133d = serialDescriptor.mo133d(str);
/* 15 */            if (iMo133d != -3) {
/* 17 */                return iMo133d;
                    }
/* 45 */            Integer num = (Integer) ((Map) b11Var.f2164c.m10192c(serialDescriptor, new v11(0, serialDescriptor, w11.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1, 0))).get(str);
/* 47 */            if (num != null) {
/* 49 */                return num.intValue();
                    }
/* 14 */            return -3;
                }

                /* JADX INFO: renamed from: o0 */
                public static int m9445o0(int i, byte[] bArr, int i2, int i3, ym3 ym3Var) throws uo3 {
/* 5 */             if ((i >>> 3) == 0) {
/* 83 */                throw new uo3("Protocol message contained an invalid tag (zero).");
                    }
/* 7 */             int i4 = i & 7;
/* 9 */             if (i4 == 0) {
/* 73 */                return m9426e0(bArr, i2, ym3Var);
                    }
/* 12 */            if (i4 == 1) {
/* 70 */                return i2 + 8;
                    }
/* 15 */            if (i4 == 2) {
/* 68 */                return m9416Z(bArr, i2, ym3Var) + ym3Var.f19707a;
                    }
/* 18 */            if (i4 != 3) {
/* 21 */                if (i4 == 5) {
/* 23 */                    return i2 + 4;
                        }
/* 31 */                throw new uo3("Protocol message contained an invalid tag (zero).");
                    }
/* 34 */            int i5 = (i & (-8)) | 4;
/* 36 */            int i6 = 0;
/* 37 */            while (i2 < i3) {
/* 39 */                i2 = m9416Z(bArr, i2, ym3Var);
/* 43 */                i6 = ym3Var.f19707a;
/* 45 */                if (i6 == i5) {
                            break;
                        }
/* 47 */                i2 = m9445o0(i6, bArr, i2, i3, ym3Var);
                    }
/* 52 */            if (i2 > i3 || i6 != i5) {
/* 61 */                throw uo3.m9058c();
                    }
/* 56 */            return i2;
                }

                /* JADX INFO: renamed from: p */
                public static final int m9446p(SerialDescriptor serialDescriptor, b11 b11Var, String str, String str2) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             b11Var.getClass();
/* 7 */             str.getClass();
/* 10 */            int iM9444o = m9444o(serialDescriptor, b11Var, str);
/* 15 */            if (iM9444o != -3) {
/* 17 */                return iM9444o;
                    }
/* 55 */            throw new ea2(serialDescriptor.mo130a() + " does not contain element with name '" + str + '\'' + str2);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX INFO: renamed from: q */
                public static ArrayList m9447q(Context context, int i) {
                    String strM9435j;
                    String strM9435j2;
                    String strM9435j3;
/* 3 */             ArrayList arrayList = new ArrayList();
                    switch (i) {
                        case 0:
                        case 37:
/* 605 */                   if (m9449s(context, arrayList, "android.permission.WRITE_CALENDAR")) {
/* 607 */                       arrayList.add("android.permission.WRITE_CALENDAR");
                            }
/* 616 */                   if (m9449s(context, arrayList, "android.permission.READ_CALENDAR")) {
/* 618 */                       arrayList.add("android.permission.READ_CALENDAR");
                            }
/* 621 */                   return arrayList;
                        case 1:
/* 595 */                   if (m9449s(context, arrayList, "android.permission.CAMERA")) {
/* 597 */                       arrayList.add("android.permission.CAMERA");
/* 600 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case 2:
/* 561 */                   if (m9449s(context, arrayList, "android.permission.READ_CONTACTS")) {
/* 563 */                       arrayList.add("android.permission.READ_CONTACTS");
                            }
/* 572 */                   if (m9449s(context, arrayList, "android.permission.WRITE_CONTACTS")) {
/* 574 */                       arrayList.add("android.permission.WRITE_CONTACTS");
                            }
/* 583 */                   if (m9449s(context, arrayList, "android.permission.GET_ACCOUNTS")) {
/* 585 */                       arrayList.add("android.permission.GET_ACCOUNTS");
/* 588 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case 3:
                        case 4:
                        case 5:
/* 514 */                   if (i != 4 || Build.VERSION.SDK_INT < 29) {
/* 538 */                       if (m9449s(context, arrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
/* 540 */                           arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                                }
/* 549 */                       if (m9449s(context, arrayList, "android.permission.ACCESS_FINE_LOCATION")) {
/* 551 */                           arrayList.add("android.permission.ACCESS_FINE_LOCATION");
/* 554 */                           return arrayList;
                                }
                            } else if (m9449s(context, arrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
/* 528 */                       arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
/* 531 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case 6:
                        case 11:
                        case 20:
/* 511 */                   return null;
                        case 7:
                        case 14:
/* 505 */                   if (m9449s(context, arrayList, "android.permission.RECORD_AUDIO")) {
/* 507 */                       arrayList.add("android.permission.RECORD_AUDIO");
/* 510 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case 8:
/* 408 */                   if (m9449s(context, arrayList, "android.permission.READ_PHONE_STATE")) {
/* 410 */                       arrayList.add("android.permission.READ_PHONE_STATE");
                            }
/* 413 */                   int i2 = Build.VERSION.SDK_INT;
/* 415 */                   if (i2 > 29 && m9449s(context, arrayList, "android.permission.READ_PHONE_NUMBERS")) {
/* 425 */                       arrayList.add("android.permission.READ_PHONE_NUMBERS");
                            }
/* 434 */                   if (m9449s(context, arrayList, "android.permission.CALL_PHONE")) {
/* 436 */                       arrayList.add("android.permission.CALL_PHONE");
                            }
/* 445 */                   if (m9449s(context, arrayList, "android.permission.READ_CALL_LOG")) {
/* 447 */                       arrayList.add("android.permission.READ_CALL_LOG");
                            }
/* 456 */                   if (m9449s(context, arrayList, "android.permission.WRITE_CALL_LOG")) {
/* 458 */                       arrayList.add("android.permission.WRITE_CALL_LOG");
                            }
/* 467 */                   if (m9449s(context, arrayList, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
/* 469 */                       arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                            }
/* 478 */                   if (m9449s(context, arrayList, "android.permission.USE_SIP")) {
/* 480 */                       arrayList.add("android.permission.USE_SIP");
                            }
/* 485 */                   if (i2 >= 26 && m9449s(context, arrayList, "android.permission.ANSWER_PHONE_CALLS")) {
/* 495 */                       arrayList.add("android.permission.ANSWER_PHONE_CALLS");
/* 498 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case 9:
/* 388 */                   if (Build.VERSION.SDK_INT >= 33 && m9449s(context, arrayList, "android.permission.READ_MEDIA_IMAGES")) {
/* 398 */                       arrayList.add("android.permission.READ_MEDIA_IMAGES");
/* 401 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case 10:
                        case io.flutter.Build.API_LEVELS.API_25 /* 25 */:
                        case io.flutter.Build.API_LEVELS.API_26 /* 26 */:
                        default:
/* 621 */                   return arrayList;
                        case 12:
/* 380 */                   if (m9449s(context, arrayList, "android.permission.BODY_SENSORS")) {
/* 382 */                       arrayList.add("android.permission.BODY_SENSORS");
/* 385 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 324 */                   if (m9449s(context, arrayList, "android.permission.SEND_SMS")) {
/* 326 */                       arrayList.add("android.permission.SEND_SMS");
                            }
/* 335 */                   if (m9449s(context, arrayList, "android.permission.RECEIVE_SMS")) {
/* 337 */                       arrayList.add("android.permission.RECEIVE_SMS");
                            }
/* 346 */                   if (m9449s(context, arrayList, "android.permission.READ_SMS")) {
/* 348 */                       arrayList.add("android.permission.READ_SMS");
                            }
/* 357 */                   if (m9449s(context, arrayList, "android.permission.RECEIVE_WAP_PUSH")) {
/* 359 */                       arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                            }
/* 368 */                   if (m9449s(context, arrayList, "android.permission.RECEIVE_MMS")) {
/* 370 */                       arrayList.add("android.permission.RECEIVE_MMS");
/* 373 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 289 */                   if (m9449s(context, arrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
/* 291 */                       arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                            }
/* 294 */                   int i3 = Build.VERSION.SDK_INT;
/* 296 */                   if ((i3 < 29 || (i3 == 29 && Environment.isExternalStorageLegacy())) && m9449s(context, arrayList, "android.permission.WRITE_EXTERNAL_STORAGE")) {
/* 314 */                       arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
/* 317 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case 16:
/* 277 */                   if (m9449s(context, arrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
/* 279 */                       arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
/* 282 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case 17:
/* 257 */                   if (Build.VERSION.SDK_INT >= 33 && m9449s(context, arrayList, "android.permission.POST_NOTIFICATIONS")) {
/* 267 */                       arrayList.add("android.permission.POST_NOTIFICATIONS");
/* 270 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case 18:
/* 239 */                   if (Build.VERSION.SDK_INT < 29) {
/* 511 */                       return null;
                            }
/* 249 */                   if (m9449s(context, arrayList, "android.permission.ACCESS_MEDIA_LOCATION")) {
/* 251 */                       arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
/* 254 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case 19:
/* 221 */                   if (Build.VERSION.SDK_INT < 29) {
/* 511 */                       return null;
                            }
/* 231 */                   if (m9449s(context, arrayList, "android.permission.ACTIVITY_RECOGNITION")) {
/* 233 */                       arrayList.add("android.permission.ACTIVITY_RECOGNITION");
/* 236 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case io.flutter.Build.API_LEVELS.API_21 /* 21 */:
/* 213 */                   if (m9449s(context, arrayList, "android.permission.BLUETOOTH")) {
/* 215 */                       arrayList.add("android.permission.BLUETOOTH");
/* 218 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case io.flutter.Build.API_LEVELS.API_22 /* 22 */:
/* 193 */                   if (Build.VERSION.SDK_INT >= 30 && m9449s(context, arrayList, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
/* 203 */                       arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
/* 206 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case io.flutter.Build.API_LEVELS.API_23 /* 23 */:
/* 183 */                   if (m9449s(context, arrayList, "android.permission.SYSTEM_ALERT_WINDOW")) {
/* 185 */                       arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
/* 188 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case 24:
/* 171 */                   if (m9449s(context, arrayList, "android.permission.REQUEST_INSTALL_PACKAGES")) {
/* 173 */                       arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
/* 176 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case io.flutter.Build.API_LEVELS.API_27 /* 27 */:
/* 159 */                   if (m9449s(context, arrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
/* 161 */                       arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
/* 164 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case io.flutter.Build.API_LEVELS.API_28 /* 28 */:
/* 139 */                   if (Build.VERSION.SDK_INT >= 31 && (strM9435j = m9435j(context, "android.permission.BLUETOOTH_SCAN")) != null) {
/* 149 */                       arrayList.add(strM9435j);
/* 152 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case io.flutter.Build.API_LEVELS.API_29 /* 29 */:
/* 123 */                   if (Build.VERSION.SDK_INT >= 31 && (strM9435j2 = m9435j(context, "android.permission.BLUETOOTH_ADVERTISE")) != null) {
/* 133 */                       arrayList.add(strM9435j2);
/* 136 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case io.flutter.Build.API_LEVELS.API_30 /* 30 */:
/* 107 */                   if (Build.VERSION.SDK_INT >= 31 && (strM9435j3 = m9435j(context, "android.permission.BLUETOOTH_CONNECT")) != null) {
/* 117 */                       arrayList.add(strM9435j3);
/* 120 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case io.flutter.Build.API_LEVELS.API_31 /* 31 */:
/* 91 */                    if (Build.VERSION.SDK_INT >= 33 && m9449s(context, arrayList, "android.permission.NEARBY_WIFI_DEVICES")) {
/* 101 */                       arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
/* 104 */                       return arrayList;
                            }
/* 621 */                   return arrayList;
                        case 32:
/* 75 */                    if (Build.VERSION.SDK_INT >= 33 && m9449s(context, arrayList, "android.permission.READ_MEDIA_VIDEO")) {
/* 85 */                        arrayList.add("android.permission.READ_MEDIA_VIDEO");
/* 88 */                        return arrayList;
                            }
/* 621 */                   return arrayList;
                        case io.flutter.Build.API_LEVELS.API_33 /* 33 */:
/* 59 */                    if (Build.VERSION.SDK_INT >= 33 && m9449s(context, arrayList, "android.permission.READ_MEDIA_AUDIO")) {
/* 69 */                        arrayList.add("android.permission.READ_MEDIA_AUDIO");
/* 72 */                        return arrayList;
                            }
/* 621 */                   return arrayList;
                        case io.flutter.Build.API_LEVELS.API_34 /* 34 */:
/* 51 */                    if (m9449s(context, arrayList, "android.permission.SCHEDULE_EXACT_ALARM")) {
/* 53 */                        arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
/* 56 */                        return arrayList;
                            }
/* 621 */                   return arrayList;
                        case io.flutter.Build.API_LEVELS.API_35 /* 35 */:
/* 31 */                    if (Build.VERSION.SDK_INT >= 33 && m9449s(context, arrayList, "android.permission.BODY_SENSORS_BACKGROUND")) {
/* 41 */                        arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
/* 44 */                        return arrayList;
                            }
/* 621 */                   return arrayList;
                        case io.flutter.Build.API_LEVELS.API_36 /* 36 */:
/* 23 */                    if (m9449s(context, arrayList, "android.permission.WRITE_CALENDAR")) {
/* 25 */                        arrayList.add("android.permission.WRITE_CALENDAR");
/* 28 */                        return arrayList;
                            }
/* 621 */                   return arrayList;
                    }
                }

                /* JADX INFO: renamed from: r */
                public static Object m9448r(Future future) {
                    Object obj;
/* 1 */             boolean z = false;
                    while (true) {
                        try {
/* 2 */                     obj = future.get();
                            break;
                        } catch (InterruptedException unused) {
/* 27 */                    z = true;
                        } catch (Throwable th) {
/* 17 */                    if (z) {
/* 23 */                        Thread.currentThread().interrupt();
                            }
/* 26 */                    throw th;
                        }
                    }
/* 6 */             if (z) {
/* 12 */                Thread.currentThread().interrupt();
                    }
/* 15 */            return obj;
                }

                /* JADX INFO: renamed from: s */
                public static boolean m9449s(Context context, ArrayList arrayList, String str) {
/* 1 */             if (arrayList != null) {
                        try {
/* 3 */                     Iterator it = arrayList.iterator();
/* 11 */                    while (it.hasNext()) {
/* 23 */                        if (((String) it.next()).equals(str)) {
/* 98 */                            return true;
                                }
                            }
                        } catch (Exception unused) {
/* 100 */                   return false;
                        }
                    }
/* 26 */            if (context == null) {
/* 100 */               return false;
                    }
/* 29 */            PackageManager packageManager = context.getPackageManager();
/* 58 */            PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) : packageManager.getPackageInfo(context.getPackageName(), 4096);
/* 62 */            if (packageInfo == null) {
/* 100 */               return false;
                    }
/* 76 */            Iterator it2 = new ArrayList(Arrays.asList(packageInfo.requestedPermissions)).iterator();
/* 84 */            while (it2.hasNext()) {
/* 96 */                if (((String) it2.next()).equals(str)) {
/* 98 */                    return true;
                        }
                    }
/* 100 */           return false;
                }

                /* JADX INFO: renamed from: t */
                public static tw0 m9450t(Object obj) {
                    return obj == null ? tw0.f17292c : new tw0(obj, 0);
                }

                /* JADX INFO: renamed from: u */
                public static boolean m9451u(byte b) {
                    return b > -65;
                }

                /* JADX INFO: renamed from: v */
                public static String m9452v(String str, String str2) {
/* 9 */             int length = str.length() - str2.length();
/* 10 */            if (length < 0 || length > 1) {
/* 66 */                C1951n4.m6859j("Invalid input received");
/* 69 */                return null;
                    }
/* 26 */            StringBuilder sb = new StringBuilder(str2.length() + str.length());
/* 34 */            for (int i = 0; i < str.length(); i++) {
/* 40 */                sb.append(str.charAt(i));
/* 47 */                if (str2.length() > i) {
/* 53 */                    sb.append(str2.charAt(i));
                        }
                    }
/* 59 */            return sb.toString();
                }

                /* JADX INFO: renamed from: w */
                public static s81 m9453w(s81 s81Var) {
/* 1 */             s81Var.getClass();
                    return s81Var.isDone() ? s81Var : py0.m7599Y(new ap0(s81Var, 1));
                }

                /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX INFO: renamed from: x */
                public static void m9454x(Context context, String str) {
                    synchronized (f18417b) {
/* 10 */                if (str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 14 */                    context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
/* 18 */                    return;
                        }
                        try {
/* 24 */                    FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
/* 28 */                    XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                            try {
                                try {
/* 33 */                            xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
/* 40 */                            xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
/* 45 */                            xmlSerializerNewSerializer.startTag(null, "locales");
/* 50 */                            xmlSerializerNewSerializer.attribute(null, "application_locales", str);
/* 55 */                            xmlSerializerNewSerializer.endTag(null, "locales");
/* 58 */                            xmlSerializerNewSerializer.endDocument();
/* 61 */                            if (fileOutputStreamOpenFileOutput != null) {
                                        try {
/* 63 */                                    fileOutputStreamOpenFileOutput.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (Throwable th) {
/* 82 */                            if (fileOutputStreamOpenFileOutput != null) {
                                        try {
/* 84 */                                    fileOutputStreamOpenFileOutput.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
/* 87 */                            throw th;
                                }
                            } catch (Exception e) {
/* 74 */                        AbstractC1245n0.m4891s("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
/* 77 */                        if (fileOutputStreamOpenFileOutput != null) {
/* 63 */                            fileOutputStreamOpenFileOutput.close();
                                }
                            }
                        } catch (FileNotFoundException unused3) {
/* 92 */                    AbstractC1245n0.m4889q("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
                        }
                    }
                }

                /* JADX INFO: renamed from: y */
                public static void m9455y(AnimatorSet animatorSet, ArrayList arrayList) {
/* 1 */             int size = arrayList.size();
/* 5 */             long jMax = 0;
/* 9 */             for (int i = 0; i < size; i++) {
/* 15 */                Animator animator = (Animator) arrayList.get(i);
/* 26 */                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
                    }
/* 37 */            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
/* 41 */            valueAnimatorOfInt.setDuration(jMax);
/* 44 */            arrayList.add(0, valueAnimatorOfInt);
/* 47 */            animatorSet.playTogether(arrayList);
                }

                /* JADX INFO: renamed from: z */
                public static void m9456z(float f, float[] fArr) {
/* 5 */             Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
/* 15 */            Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
/* 20 */            Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
                }

                /* JADX INFO: renamed from: l */
                public abstract void mo3875l(dd2 dd2Var, float f, float f2);
            }
