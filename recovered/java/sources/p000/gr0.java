            package p000;

            import android.animation.AnimatorSet;
            import android.content.ClipData;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.TotalCaptureResult;
            import android.media.Image;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.view.ContentInfo;
            import android.view.MenuItem;
            import android.view.View;
            import androidx.appcompat.widget.ActionMenuView;
            import androidx.appcompat.widget.Toolbar;
            import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.internal.AbstractC0322a;
            import com.google.android.gms.common.internal.zam;
            import com.google.android.gms.common.internal.zax;
            import com.google.android.gms.dynamic.IObjectWrapper;
            import com.google.android.gms.dynamic.ObjectWrapper;
            import com.google.android.gms.internal.base.zac;
            import com.google.android.material.appbar.CollapsingToolbarLayout;
            import com.google.android.material.bottomappbar.BottomAppBar;
            import io.flutter.Build;
            import java.nio.ByteBuffer;
            import java.security.Provider;
            import java.security.Security;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.WeakHashMap;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public class gr0 implements hg1, lw0, g00, InterfaceC2249ub, InterfaceC0881ei, j53, xo0, jp1, i00, t93, fp1, ge0, so0, InterfaceC2251ud {

                /* JADX INFO: renamed from: b */
                public static volatile gr0 f8786b;

                /* JADX INFO: renamed from: c */
                public static final gr0 f8787c = new gr0();

                /* JADX INFO: renamed from: d */
                public static final gr0 f8788d = new gr0();

                /* JADX INFO: renamed from: a */
                public Object f8789a;

                public gr0(int i) {
                    switch (i) {
                        case 19:
/* 41 */                    this.f8789a = new rg2(hx2.f9356b);
                            break;
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 28 */                    this.f8789a = (ExtraSupportedSurfaceCombinationsQuirk) f80.f8038a.m3582h(ExtraSupportedSurfaceCombinationsQuirk.class);
                            break;
                        default:
/* 12 */                    this.f8789a = new HashSet();
                            break;
                    }
                }

                /* JADX INFO: renamed from: s */
                public static zam m3988s(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
                    return iInterfaceQueryLocalInterface instanceof zam ? (zam) iInterfaceQueryLocalInterface : new zam(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
                }

                /* JADX INFO: renamed from: w */
                public static View m3989w(Context context, int i, int i2) throws d32 {
/* 1 */             gr0 gr0Var = f8788d;
                    try {
/* 7 */                 zax zaxVar = new zax(1, i, i2, null);
/* 12 */                ObjectWrapper objectWrapper = new ObjectWrapper(context);
/* 19 */                zam zamVar = (zam) gr0Var.m4002t(context);
/* 21 */                Parcel parcelZaa = zamVar.zaa();
/* 25 */                zac.zad(parcelZaa, objectWrapper);
/* 28 */                zac.zac(parcelZaa, zaxVar);
/* 32 */                Parcel parcelZab = zamVar.zab(2, parcelZaa);
/* 40 */                IObjectWrapper iObjectWrapperM2044a = IObjectWrapper.Stub.m2044a(parcelZab.readStrongBinder());
/* 44 */                parcelZab.recycle();
/* 51 */                return (View) ObjectWrapper.m2045b(iObjectWrapperM2044a);
                    } catch (Exception e) {
/* 68 */                throw new d32(AbstractC0886en.m3506j("Could not get button with size ", i, i2, " and color "), e);
                    }
                }

                @Override // p000.t93
                /* JADX INFO: renamed from: a */
                public void mo3990a(TotalCaptureResult totalCaptureResult) {
                }

                @Override // p000.so0
                public s81 apply(Object obj) {
/* 9 */             return w11.m9450t(((so0) this.f8789a).apply(obj));
                }

                @Override // p000.lw0
                /* JADX INFO: renamed from: b */
                public int mo3991b() {
/* 5 */             return ((Image.Plane) this.f8789a).getRowStride();
                }

                @Override // p000.i00
                public l00 build() {
/* 16 */            return new l00(new qc3(((ContentInfo.Builder) this.f8789a).build()));
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: c */
                public boolean mo3404c(jg1 jg1Var, MenuItem menuItem) {
                    boolean zOnMenuItemSelected;
/* 5 */             InterfaceC0976h2 interfaceC0976h2 = ((ActionMenuView) this.f8789a).f468o0;
/* 8 */             if (interfaceC0976h2 != null) {
/* 14 */                Toolbar toolbar = (Toolbar) ((ts0) interfaceC0976h2).f17248a;
/* 23 */                if (toolbar.f723u0.m7415a(menuItem)) {
/* 25 */                    zOnMenuItemSelected = true;
                        } else {
/* 27 */                    wp2 wp2Var = toolbar.f727w0;
/* 44 */                    zOnMenuItemSelected = wp2Var != null ? ((xp2) ((fs0) wp2Var).f8339b).f19303b.onMenuItemSelected(0, menuItem) : false;
                        }
/* 45 */                if (zOnMenuItemSelected) {
/* 22 */                    return true;
                        }
                    }
/* 7 */             return false;
                }

                @Override // p000.i00
                /* JADX INFO: renamed from: d */
                public void mo3992d(Uri uri) {
/* 1 */             ((ContentInfo.Builder) this.f8789a).setLinkUri(uri);
                }

                @Override // p000.t93
                /* JADX INFO: renamed from: e */
                public float mo3993e() {
/* 11 */            Float f = (Float) ((C0962gp) this.f8789a).m3981a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
/* 15 */            if (f != null && f.floatValue() >= 1.0f) {
/* 27 */                return f.floatValue();
                    }
/* 13 */            return 1.0f;
                }

                @Override // p000.InterfaceC0881ei
                /* JADX INFO: renamed from: f */
                public void mo3444f(ConnectionResult connectionResult) {
/* 7 */             boolean z = connectionResult.f3416b == 0;
/* 10 */            AbstractC0322a abstractC0322a = (AbstractC0322a) this.f8789a;
/* 12 */            if (z) {
/* 19 */                abstractC0322a.getRemoteService(null, abstractC0322a.getScopes());
                    } else if (abstractC0322a.zzl() != null) {
/* 33 */                abstractC0322a.zzl().mo3086b(connectionResult);
                    }
                }

                @Override // p000.t93
                /* JADX INFO: renamed from: g */
                public void mo3994g(d52 d52Var) {
                }

                @Override // p000.lw0
                public ByteBuffer getBuffer() {
/* 5 */             return ((Image.Plane) this.f8789a).getBuffer();
                }

                @Override // p000.t93
                /* JADX INFO: renamed from: h */
                public float mo3995h() {
/* 1 */             return 1.0f;
                }

                @Override // p000.InterfaceC2249ub
                /* JADX INFO: renamed from: i */
                public void mo3996i(int i) {
                }

                @Override // p000.lw0
                /* JADX INFO: renamed from: j */
                public int mo3997j() {
/* 5 */             return ((Image.Plane) this.f8789a).getPixelStride();
                }

                @Override // p000.jp1
                /* JADX INFO: renamed from: k */
                public m83 mo1634k(View view, m83 m83Var) {
/* 3 */             CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.f8789a;
/* 5 */             WeakHashMap weakHashMap = e33.f7494a;
/* 15 */            m83 m83Var2 = collapsingToolbarLayout.getFitsSystemWindows() ? m83Var : null;
/* 22 */            if (!Objects.equals(collapsingToolbarLayout.f4375m0, m83Var2)) {
/* 24 */                collapsingToolbarLayout.f4375m0 = m83Var2;
/* 26 */                collapsingToolbarLayout.requestLayout();
                    }
/* 31 */            return m83Var.f13660a.mo3340c();
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: l */
                public void mo3407l(jg1 jg1Var) {
/* 5 */             hg1 hg1Var = ((ActionMenuView) this.f8789a).f463j0;
/* 7 */             if (hg1Var != null) {
/* 9 */                 hg1Var.mo3407l(jg1Var);
                    }
                }

                @Override // p000.InterfaceC2249ub
                /* JADX INFO: renamed from: m */
                public void mo3998m(int i) {
                }

                @Override // p000.InterfaceC2249ub
                /* JADX INFO: renamed from: n */
                public void mo3999n(int i, float f) {
                }

                @Override // p000.t93
                /* JADX INFO: renamed from: o */
                public void mo4000o() {
                }

                @Override // p000.xo0
                public void onFailure(Throwable th) {
                    synchronized (((C2154rr) this.f8789a).f16232a) {
                        try {
/* 16 */                    ((C2154rr) this.f8789a).f16235d.m3963q();
/* 25 */                    int iM3520y = AbstractC0886en.m3520y(((C2154rr) this.f8789a).f16240i);
/* 30 */                    if ((iM3520y == 3 || iM3520y == 5 || iM3520y == 6) && !(th instanceof CancellationException)) {
/* 59 */                        hu0.m4317I0("CaptureSession", "Opening session with fail ".concat(AbstractC0886en.m3494C(((C2154rr) this.f8789a).f16240i)), th);
/* 66 */                        ((C2154rr) this.f8789a).m8230c();
                            }
                        } catch (Throwable th2) {
/* 75 */                    throw th2;
                        }
                    }
                }

                @Override // p000.xo0
                public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                }

                @Override // p000.j53
                /* JADX INFO: renamed from: p */
                public m83 mo3876p(View view, m83 m83Var, k53 k53Var) {
                    boolean z;
/* 3 */             BottomAppBar bottomAppBar = (BottomAppBar) this.f8789a;
/* 7 */             if (bottomAppBar.f4458Q0) {
/* 13 */                bottomAppBar.f4464W0 = m83Var.m6621a();
                    }
/* 18 */            boolean z2 = false;
/* 19 */            if (bottomAppBar.f4459R0) {
/* 31 */                z = bottomAppBar.f4466Y0 != m83Var.m6622b();
/* 36 */                bottomAppBar.f4466Y0 = m83Var.m6622b();
                    } else {
/* 39 */                z = false;
                    }
/* 42 */            if (bottomAppBar.f4460S0) {
/* 50 */                boolean z3 = bottomAppBar.f4465X0 != m83Var.m6623c();
/* 58 */                bottomAppBar.f4465X0 = m83Var.m6623c();
/* 60 */                z2 = z3;
                    }
/* 61 */            if (!z && !z2) {
/* 66 */                return m83Var;
                    }
/* 67 */            AnimatorSet animatorSet = bottomAppBar.f4454M0;
/* 69 */            if (animatorSet != null) {
/* 71 */                animatorSet.cancel();
                    }
/* 74 */            AnimatorSet animatorSet2 = bottomAppBar.f4453L0;
/* 76 */            if (animatorSet2 != null) {
/* 78 */                animatorSet2.cancel();
                    }
/* 81 */            bottomAppBar.m2248G();
/* 84 */            bottomAppBar.m2247F();
/* 87 */            return m83Var;
                }

                @Override // p000.fp1
                /* JADX INFO: renamed from: q */
                public void mo3429q(Object obj) {
/* 1 */             g71 g71Var = (g71) obj;
/* 5 */             DialogInterfaceOnCancelListenerC0097i dialogInterfaceOnCancelListenerC0097i = (DialogInterfaceOnCancelListenerC0097i) this.f8789a;
/* 7 */             if (g71Var == null || !dialogInterfaceOnCancelListenerC0097i.f1459v) {
/* 50 */                return;
                    }
/* 13 */            View viewRequireView = dialogInterfaceOnCancelListenerC0097i.requireView();
/* 21 */            if (viewRequireView.getParent() != null) {
/* 47 */                f42.m3656l("DialogFragment can not be attached to a container view");
                    } else if (dialogInterfaceOnCancelListenerC0097i.f1447W != null) {
/* 32 */                if (AbstractC0111w.m674K(3)) {
/* 36 */                    Objects.toString(dialogInterfaceOnCancelListenerC0097i.f1447W);
                        }
/* 41 */                dialogInterfaceOnCancelListenerC0097i.f1447W.setContentView(viewRequireView);
                    }
                }

                /* JADX INFO: renamed from: r */
                public og2 m4001r() {
/* 9 */             return (og2) ((rg2) this.f8789a).m8157a();
                }

                @Override // p000.i00
                public void setExtras(Bundle bundle) {
/* 1 */             ((ContentInfo.Builder) this.f8789a).setExtras(bundle);
                }

                @Override // p000.i00
                public void setFlags(int i) {
/* 1 */             ((ContentInfo.Builder) this.f8789a).setFlags(i);
                }

                /* JADX INFO: renamed from: t */
                public Object m4002t(Context context) throws d32 {
                    Context contextCreatePackageContext;
/* 5 */             if (((zam) this.f8789a) == null) {
/* 7 */                 kb1.m6061n(context);
/* 10 */                int i = wr0.f18787e;
                        try {
/* 15 */                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                        } catch (PackageManager.NameNotFoundException unused) {
/* 20 */                    contextCreatePackageContext = null;
                        }
/* 21 */                if (contextCreatePackageContext == null) {
/* 80 */                    throw new d32("Could not get remote context.");
                        }
                        try {
/* 43 */                    this.f8789a = m3988s((IBinder) contextCreatePackageContext.getClassLoader().loadClass("com.google.android.gms.common.ui.SignInButtonCreatorImpl").newInstance());
                        } catch (ClassNotFoundException e) {
/* 72 */                    throw new d32("Could not load creator class.", e);
                        } catch (IllegalAccessException e2) {
/* 54 */                    throw new d32("Could not access creator.", e2);
                        } catch (InstantiationException e3) {
/* 63 */                    throw new d32("Could not instantiate creator.", e3);
                        }
                    }
/* 83 */            return (zam) this.f8789a;
                }

                /* JADX WARN: Code duplicated, block: B:13:0x0027  */
                /* JADX INFO: renamed from: u */
                public void m4003u(og2 og2Var) {
                    Object objM8157a;
                    Object obj;
/* 1 */             og2Var.getClass();
/* 6 */             rg2 rg2Var = (rg2) this.f8789a;
/* 58 */            do {
/* 8 */                 objM8157a = rg2Var.m8157a();
/* 13 */                og2 og2Var2 = (og2) objM8157a;
/* 27 */                if (og2Var2 instanceof v02 ? true : Intrinsics.m6216a(og2Var2, hx2.f9356b)) {
                            obj = og2Var2;
/* 40 */                    obj = og2Var;
                        } else if (og2Var2 instanceof x30) {
/* 38 */                    if (og2Var.f14743a > og2Var2.f14743a) {
                                obj = og2Var2;
/* 40 */                        obj = og2Var;
                            }
                        } else if (!(og2Var2 instanceof mi0)) {
                            obj = og2Var2;
/* 61 */                    ds0.m3187b();
/* 64 */                    return;
                        }
                        obj = og2Var2;
                        obj = og2Var2;
/* 46 */                C2131r4 c2131r4 = jb1.f12171c;
/* 48 */                if (objM8157a == null) {
/* 50 */                    objM8157a = c2131r4;
                        }
/* 51 */                if (obj == null) {
/* 53 */                    obj = c2131r4;
                        }
/* 58 */            } while (!rg2Var.m8158b(objM8157a, obj));
                }

                /* JADX INFO: renamed from: v */
                public void m4004v(int i, Object obj, i72 i72Var) {
/* 3 */             C1905lw c1905lw = (C1905lw) this.f8789a;
/* 8 */             c1905lw.m6545B(i, 3);
/* 13 */            i72Var.mo4498h((AbstractC2350x) obj, c1905lw.f13506a);
/* 17 */            c1905lw.m6545B(i, 4);
                }

                @Override // p000.ge0
                /* JADX INFO: renamed from: x */
                public Object mo2941x(String str) {
/* 3 */             ie0 ie0Var = (ie0) this.f8789a;
/* 9 */             String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
/* 15 */            ArrayList arrayList = new ArrayList();
/* 20 */            for (int i = 0; i < 2; i++) {
/* 24 */                Provider provider = Security.getProvider(strArr[i]);
/* 28 */                if (provider != null) {
/* 30 */                    arrayList.add(provider);
                        }
                    }
/* 36 */            Iterator it = arrayList.iterator();
/* 41 */            Exception exc = null;
/* 46 */            while (it.hasNext()) {
                        try {
/* 54 */                    return ie0Var.mo3402a(str, (Provider) it.next());
                        } catch (Exception e) {
/* 60 */                    if (exc == null) {
/* 62 */                        exc = e;
                            }
                        }
                    }
/* 64 */            return ie0Var.mo3402a(str, null);
                }

                @Override // p000.so0
/* 13 */        public Object apply(Object obj) {
/* 15 */            return (AbstractC1816k3) this.f8789a;
                }

/* 44 */        public gr0(AbstractC0322a abstractC0322a) {
                    Objects.requireNonNull(abstractC0322a);
                    this.f8789a = abstractC0322a;
                }

/* 45 */        public /* synthetic */ gr0(Object obj) {
/* 46 */            this.f8789a = obj;
                }

/* 46 */        public gr0(ClipData clipData, int i) {
/* 48 */            this.f8789a = h00.m4061g(clipData, i);
                }
            }
