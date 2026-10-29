            package p000;

            import android.R;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.content.SharedPreferences;
            import android.content.res.TypedArray;
            import android.graphics.Bitmap;
            import android.graphics.BitmapShader;
            import android.graphics.Rect;
            import android.graphics.Shader;
            import android.graphics.drawable.AnimationDrawable;
            import android.graphics.drawable.BitmapDrawable;
            import android.graphics.drawable.ClipDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.LayerDrawable;
            import android.graphics.drawable.ShapeDrawable;
            import android.graphics.drawable.shapes.RoundRectShape;
            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CameraManager;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.CaptureResult;
            import android.hardware.camera2.params.InputConfiguration;
            import android.hardware.camera2.params.OutputConfiguration;
            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.os.Environment;
            import android.os.Handler;
            import android.os.LocaleList;
            import android.os.StatFs;
            import android.text.method.KeyListener;
            import android.text.method.NumberKeyListener;
            import android.util.AttributeSet;
            import android.util.Base64;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.ViewGroup;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.widget.AbsSeekBar;
            import android.widget.EditText;
            import androidx.appcompat.R$styleable;
            import androidx.cardview.widget.CardView;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.Tasks;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.Build;
            import java.lang.reflect.Array;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.UUID;
            import java.util.WeakHashMap;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.locks.ReentrantLock;
            import java.util.concurrent.locks.ReentrantReadWriteLock;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            import okhttp3.Cookie;
            import okhttp3.CookieJar;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: renamed from: cb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 157 */   public class C0210cb implements InterfaceC1013i2, InterfaceC2188so, CookieJar, xo0 {

                /* JADX INFO: renamed from: d */
                public static final int[] f2800d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

                /* JADX INFO: renamed from: e */
                public static final Object f2801e = new Object();

                /* JADX INFO: renamed from: f */
                public static c93 f2802f;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2803a;

                /* JADX INFO: renamed from: b */
                public Object f2804b;

                /* JADX INFO: renamed from: c */
                public Object f2805c;

                public C0210cb(Context context, int i) {
/* 1 */             this.f2803a = i;
                    switch (i) {
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 19 */                    context.getClass();
/* 30 */                    Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
/* 34 */                    setNewSetFromMap.getClass();
/* 37 */                    this.f2804b = setNewSetFromMap;
/* 42 */                    SharedPreferences sharedPreferences = context.getSharedPreferences("cookie_persistance", 0);
/* 46 */                    sharedPreferences.getClass();
/* 49 */                    this.f2805c = sharedPreferences;
/* 53 */                    ArrayList arrayList = new ArrayList();
/* 56 */                    Map<String, ?> all = sharedPreferences.getAll();
/* 60 */                    all.getClass();
/* 75 */                    for (Map.Entry<String, ?> entry : all.entrySet()) {
/* 83 */                        String key = entry.getKey();
/* 89 */                        Object value = entry.getValue();
/* 100 */                       String str = value instanceof String ? (String) value : null;
/* 101 */                       if (str != null) {
                                    try {
/* 113 */                               ((Set) this.f2804b).add(new C2476xw(str));
                                    } catch (JSONException unused) {
/* 117 */                               key.getClass();
/* 120 */                               arrayList.add(key);
                                    }
                                }
                            }
/* 128 */                   if (!arrayList.isEmpty()) {
/* 130 */                       SharedPreferences.Editor editorEdit = sharedPreferences.edit();
/* 134 */                       Iterator it = arrayList.iterator();
/* 142 */                       while (it.hasNext()) {
/* 150 */                           editorEdit.remove((String) it.next());
                                }
/* 154 */                       editorEdit.apply();
                            }
                            break;
                        default:
/* 9 */                     this.f2804b = context;
/* 16 */                    this.f2805c = new qd1();
                            break;
                    }
                }

                /* JADX INFO: renamed from: k */
                public static Task m1565k(Context context, Intent intent, boolean z) {
                    c93 c93Var;
                    synchronized (f2801e) {
                        try {
/* 6 */                     if (f2802f == null) {
/* 13 */                        f2802f = new c93(context);
                            }
/* 18 */                    c93Var = f2802f;
                        } catch (Throwable th) {
/* 115 */                   throw th;
                        }
                    }
/* 21 */            if (!z) {
/* 109 */               return c93Var.m1554b(intent).continueWith(new qd1(), new s80(8));
                    }
/* 31 */            if (ra2.m8100l().m8112q(context)) {
                        synchronized (yy1.f19860c) {
                            try {
/* 36 */                        yy1.m10213h(context);
/* 42 */                        boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
/* 49 */                        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
/* 52 */                        if (!booleanExtra) {
/* 56 */                            yy1.f19861d.m3878a();
                                }
/* 73 */                        c93Var.m1554b(intent).addOnCompleteListener(new C2357x6(intent, 19));
                            } catch (Throwable th2) {
/* 79 */                        throw th2;
                            }
                        }
                    } else {
/* 80 */                c93Var.m1554b(intent);
                    }
/* 88 */            return Tasks.forResult(-1);
                }

                /* JADX INFO: renamed from: w */
                public static we2 m1566w() {
/* 11 */            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
/* 36 */            double dRound = Math.round(((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1.073741824E9d) * 100.0d) / 100.0d;
/* 93 */            return new we2((Math.round(((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1.073741824E9d) * 100.0d) / 100.0d) + " GB", dRound + " GB", 9, false);
                }

                /* JADX INFO: renamed from: A */
                public boolean m1567A() {
                    try {
/* 14 */                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) this.f2804b).getSystemService("connectivity")).getActiveNetworkInfo();
                        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
                    } catch (Exception e) {
/* 35 */                xe2.m9777o("Device", "Exception while getting system connectivity service", e);
/* 1 */                 return false;
                    }
                }

                /* JADX INFO: renamed from: B */
                public void mo1568B(AttributeSet attributeSet, int i) {
/* 3 */             boolean z = true;
                    switch (this.f2803a) {
                        case 0:
/* 52 */                    AbsSeekBar absSeekBar = (AbsSeekBar) this.f2804b;
/* 60 */                    ac1 ac1VarM156H = ac1.m156H(absSeekBar.getContext(), attributeSet, f2800d, i);
/* 64 */                    Drawable drawableM185o = ac1VarM156H.m185o(0);
/* 68 */                    if (drawableM185o != null) {
/* 72 */                        if (drawableM185o instanceof AnimationDrawable) {
/* 74 */                            AnimationDrawable animationDrawable = (AnimationDrawable) drawableM185o;
/* 76 */                            int numberOfFrames = animationDrawable.getNumberOfFrames();
/* 82 */                            AnimationDrawable animationDrawable2 = new AnimationDrawable();
/* 89 */                            animationDrawable2.setOneShot(animationDrawable.isOneShot());
/* 95 */                            for (int i2 = 0; i2 < numberOfFrames; i2++) {
/* 101 */                               Drawable drawableM1578M = m1578M(animationDrawable.getFrame(i2), true);
/* 105 */                               drawableM1578M.setLevel(10000);
/* 112 */                               animationDrawable2.addFrame(drawableM1578M, animationDrawable.getDuration(i2));
                                    }
/* 118 */                           animationDrawable2.setLevel(10000);
/* 121 */                           drawableM185o = animationDrawable2;
                                }
/* 122 */                       absSeekBar.setIndeterminateDrawable(drawableM185o);
                            }
/* 125 */                   Drawable drawableM185o2 = ac1VarM156H.m185o(1);
/* 129 */                   if (drawableM185o2 != null) {
/* 135 */                       absSeekBar.setProgressDrawable(m1578M(drawableM185o2, false));
                            }
/* 138 */                   ac1VarM156H.m168J();
/* 141 */                   return;
                        default:
/* 18 */                    TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f2804b).getContext().obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i, 0);
                            try {
/* 28 */                        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTextView_emojiCompatEnabled)) {
/* 32 */                            z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTextView_emojiCompatEnabled, true);
                                    break;
                                }
/* 39 */                        typedArrayObtainStyledAttributes.recycle();
/* 42 */                        m1574H(z);
/* 45 */                        return;
                            } catch (Throwable th) {
/* 46 */                        typedArrayObtainStyledAttributes.recycle();
/* 49 */                        throw th;
                            }
                    }
                }

                /* JADX INFO: renamed from: C */
                public zc0 m1569C(InputConnection inputConnection, EditorInfo editorInfo) {
                    InputConnection inputConnection2;
/* 3 */             gr0 gr0Var = (gr0) this.f2805c;
/* 5 */             if (inputConnection == null) {
/* 7 */                 gr0Var.getClass();
/* 10 */                inputConnection2 = null;
                    } else {
/* 14 */                wc0 wc0Var = (wc0) gr0Var.f8789a;
/* 16 */                wc0Var.getClass();
/* 21 */                if (!(inputConnection instanceof zc0)) {
/* 30 */                    inputConnection = new zc0(editorInfo, inputConnection, (EditText) wc0Var.f18577b);
                        }
/* 34 */                inputConnection2 = inputConnection;
                    }
/* 35 */            return (zc0) inputConnection2;
                }

                /* JADX INFO: renamed from: D */
                public void m1570D(ol0 ol0Var) {
/* 3 */             Handler handler = (Handler) this.f2805c;
/* 7 */             ts0 ts0Var = (ts0) this.f2804b;
/* 9 */             int i = ol0Var.f14799b;
/* 11 */            if (i != 0) {
/* 31 */                handler.post(new RunnableC2503ym(ts0Var, i, 0));
                    } else {
/* 21 */                handler.post(new cp0(4, ts0Var, ol0Var.f14798a));
                    }
                }

                /* JADX INFO: renamed from: E */
                public void mo1571E(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
/* 1 */             executor.getClass();
/* 4 */             stateCallback.getClass();
                    try {
/* 22 */                ((CameraManager) this.f2804b).openCamera(str, new C2113qn(executor, stateCallback), ((C0963gq) this.f2805c).f8776b);
                    } catch (CameraAccessException e) {
/* 32 */                throw new C1897lo(e);
                    }
                }

                /* JADX INFO: renamed from: F */
                public Task m1572F(Intent intent) {
/* 3 */             String stringExtra = intent.getStringExtra("gcm.rawData64");
/* 7 */             int i = 0;
/* 8 */             if (stringExtra != null) {
/* 16 */                intent.putExtra("rawData", Base64.decode(stringExtra, 0));
/* 19 */                intent.removeExtra("gcm.rawData64");
                    }
/* 24 */            Context context = (Context) this.f2804b;
/* 28 */            qd1 qd1Var = (qd1) this.f2805c;
/* 49 */            boolean z = j13.m5650l() && context.getApplicationInfo().targetSdkVersion >= 26;
/* 57 */            boolean z2 = (intent.getFlags() & 268435456) != 0;
                    return (!z || z2) ? Tasks.call(qd1Var, new bh0(i, context, intent)).continueWithTask(qd1Var, new ch0(context, intent, z2)) : m1565k(context, intent, z2);
                }

                /* JADX INFO: renamed from: G */
                public void mo1573G(y92 y92Var, C2187sn c2187sn) {
                    C0189bq c0189bq;
/* 3 */             C0963gq c0963gq = (C0963gq) this.f2805c;
                    synchronized (c0963gq.f8775a) {
                        try {
/* 14 */                    c0189bq = (C0189bq) c0963gq.f8775a.get(c2187sn);
/* 16 */                    if (c0189bq == null) {
/* 20 */                        c0189bq = new C0189bq(y92Var, c2187sn);
/* 25 */                        c0963gq.f8775a.put(c2187sn, c0189bq);
                            }
                        } catch (Throwable th) {
/* 43 */                    throw th;
                        }
                    }
/* 38 */            ((CameraManager) this.f2804b).registerAvailabilityCallback(c0189bq, c0963gq.f8776b);
                }

                /* JADX INFO: renamed from: H */
                public void m1574H(boolean z) {
/* 11 */            id0 id0Var = (id0) ((wc0) ((gr0) this.f2805c).f8789a).f18578c;
/* 15 */            if (id0Var.f9553c != z) {
/* 19 */                if (id0Var.f9552b != null) {
/* 21 */                    sc0 sc0VarM8471a = sc0.m8471a();
/* 25 */                    hd0 hd0Var = id0Var.f9552b;
/* 27 */                    sc0VarM8471a.getClass();
/* 32 */                    de3.m3027i(hd0Var, "initCallback cannot be null");
/* 35 */                    ReentrantReadWriteLock reentrantReadWriteLock = sc0VarM8471a.f16513a;
/* 41 */                    reentrantReadWriteLock.writeLock().lock();
                            try {
/* 46 */                        sc0VarM8471a.f16514b.remove(hd0Var);
/* 53 */                        reentrantReadWriteLock.writeLock().unlock();
                            } catch (Throwable th) {
/* 62 */                        reentrantReadWriteLock.writeLock().unlock();
/* 65 */                        throw th;
                            }
                        }
/* 66 */                id0Var.f9553c = z;
/* 68 */                if (z) {
/* 80 */                    id0.m4518a(id0Var.f9551a, sc0.m8471a().m8472b());
                        }
                    }
                }

                /* JADX INFO: renamed from: I */
                public void m1575I(int i, int i2, int i3, int i4) {
/* 3 */             CardView cardView = (CardView) this.f2805c;
/* 7 */             cardView.f817d.set(i, i2, i3, i4);
/* 10 */            Rect rect = cardView.f816c;
/* 1 */             super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
                }

                /* JADX INFO: renamed from: J */
                public int mo1403J(CaptureRequest captureRequest, y92 y92Var, CameraCaptureSession.CaptureCallback captureCallback) {
/* 16 */            return ((CameraCaptureSession) this.f2804b).setRepeatingRequest(captureRequest, new C0997hn(y92Var, captureCallback), ((C0815cp) this.f2805c).f6866a);
                }

                /* JADX INFO: renamed from: K */
                public synchronized void m1576K() {
/* 8 */             boolean zM7013p = ((C1969nm) this.f2805c).m7013p();
/* 16 */            boolean zM7010m = ((C1969nm) this.f2805c).m7010m();
/* 21 */            if (zM7013p && !zM7010m) {
/* 30 */                xe2.m9775m("ConvPolr", "Starting poller.", null);
/* 35 */                jt1 jt1Var = (jt1) this.f2804b;
/* 38 */                jt1Var.f12483f = false;
/* 42 */                if (!jt1Var.f12482e) {
/* 44 */                    jt1Var.m5897a(0);
/* 48 */                    jt1Var.f12482e = true;
                        }
/* 51 */                return;
                    }
/* 76 */            xe2.m9775m("ConvPolr", "Not starting poller, shouldPoll: " + zM7013p + ",  push synced: " + zM7010m, null);
                }

                /* JADX INFO: renamed from: L */
                public synchronized void m1577L() {
/* 7 */             xe2.m9775m("ConvPolr", "Stopping poller.", null);
/* 12 */            jt1 jt1Var = (jt1) this.f2804b;
/* 15 */            jt1Var.f12483f = true;
/* 18 */            jt1Var.f12482e = false;
/* 20 */            ub0 ub0Var = jt1Var.f12480c;
/* 24 */            ub0Var.f17437c = ub0Var.f17435a;
                    try {
/* 32 */                jt1Var.f12479b.getQueue().clear();
                    } catch (Exception e) {
/* 41 */                xe2.m9777o("PolerCntlr", "Error in clearing the polling queue.", e);
                    }
                }

                /* JADX INFO: renamed from: M */
                public Drawable m1578M(Drawable drawable, boolean z) {
/* 4 */             if (!(drawable instanceof LayerDrawable)) {
/* 132 */               if (!(drawable instanceof BitmapDrawable)) {
/* 207 */                   return drawable;
                        }
/* 134 */               BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
/* 136 */               Bitmap bitmap = bitmapDrawable.getBitmap();
/* 144 */               if (((Bitmap) this.f2805c) == null) {
/* 146 */                   this.f2805c = bitmap;
                        }
/* 163 */               ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
/* 179 */               shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
/* 194 */               shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                        return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
                    }
/* 6 */             LayerDrawable layerDrawable = (LayerDrawable) drawable;
/* 8 */             int numberOfLayers = layerDrawable.getNumberOfLayers();
/* 12 */            Drawable[] drawableArr = new Drawable[numberOfLayers];
/* 16 */            for (int i = 0; i < numberOfLayers; i++) {
/* 18 */                int id = layerDrawable.getId(i);
/* 44 */                drawableArr[i] = m1578M(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                    }
/* 51 */            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
/* 54 */            for (int i2 = 0; i2 < numberOfLayers; i2++) {
/* 60 */                layerDrawable2.setId(i2, layerDrawable.getId(i2));
/* 67 */                layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
/* 74 */                layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
/* 81 */                layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
/* 88 */                layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
/* 95 */                layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
/* 102 */               layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
/* 109 */               layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
/* 116 */               layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
/* 123 */               layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                    }
/* 129 */           return layerDrawable2;
                }

                /* JADX INFO: renamed from: N */
                public void mo1579N(CameraManager.AvailabilityCallback availabilityCallback) {
                    C0189bq c0189bq;
/* 1 */             if (availabilityCallback != null) {
/* 5 */                 C0963gq c0963gq = (C0963gq) this.f2805c;
                        synchronized (c0963gq.f8775a) {
/* 16 */                    c0189bq = (C0189bq) c0963gq.f8775a.remove(availabilityCallback);
                        }
                    } else {
/* 23 */                c0189bq = null;
                    }
/* 24 */            if (c0189bq != null) {
                        synchronized (c0189bq.f2569c) {
/* 30 */                    c0189bq.f2570d = true;
                        }
                    }
/* 41 */            ((CameraManager) this.f2804b).unregisterAvailabilityCallback(c0189bq);
                }

                @Override // p000.InterfaceC2188so
                /* JADX INFO: renamed from: a */
                public nm2 mo1580a() {
/* 3 */             return (nm2) this.f2804b;
                }

                @Override // p000.InterfaceC2188so
                /* JADX INFO: renamed from: b */
                public long mo1581b() {
/* 11 */            Long l = (Long) ((CaptureResult) this.f2805c).get(CaptureResult.SENSOR_TIMESTAMP);
/* 13 */            if (l == null) {
/* 15 */                return -1L;
                    }
/* 18 */            return l.longValue();
                }

                @Override // p000.InterfaceC1013i2
                /* JADX INFO: renamed from: c */
                public boolean mo1582c(AbstractC1778j2 abstractC1778j2, MenuItem menuItem) {
/* 5 */             return ((InterfaceC1013i2) this.f2804b).mo1582c(abstractC1778j2, menuItem);
                }

                @Override // p000.InterfaceC1013i2
                /* JADX INFO: renamed from: d */
                public void mo1583d(AbstractC1778j2 abstractC1778j2) {
/* 5 */             ((InterfaceC1013i2) this.f2804b).mo1583d(abstractC1778j2);
/* 10 */            LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) this.f2805c;
/* 14 */            if (layoutInflaterFactory2C2324wa.f18522h0 != null) {
/* 24 */                layoutInflaterFactory2C2324wa.f18511W.getDecorView().removeCallbacks(layoutInflaterFactory2C2324wa.f18523i0);
                    }
/* 29 */            if (layoutInflaterFactory2C2324wa.f18521g0 != null) {
/* 31 */                p43 p43Var = layoutInflaterFactory2C2324wa.f18524j0;
/* 33 */                if (p43Var != null) {
/* 35 */                    p43Var.m7336b();
                        }
/* 40 */                p43 p43VarM3305a = e33.m3305a(layoutInflaterFactory2C2324wa.f18521g0);
/* 45 */                p43VarM3305a.m7335a(0.0f);
/* 48 */                layoutInflaterFactory2C2324wa.f18524j0 = p43VarM3305a;
/* 56 */                p43VarM3305a.m7338d(new C1883la(this, 2));
                    }
/* 63 */            layoutInflaterFactory2C2324wa.f18513Y.onSupportActionModeFinished(layoutInflaterFactory2C2324wa.f18520f0);
/* 67 */            layoutInflaterFactory2C2324wa.f18520f0 = null;
/* 69 */            ViewGroup viewGroup = layoutInflaterFactory2C2324wa.f18526l0;
/* 71 */            WeakHashMap weakHashMap = e33.f7494a;
/* 73 */            q23.m7679c(viewGroup);
/* 76 */            layoutInflaterFactory2C2324wa.m9499I();
                }

                @Override // p000.InterfaceC2188so
                /* JADX INFO: renamed from: e */
                public EnumC2151ro mo1584e() {
/* 11 */            Integer num = (Integer) ((CaptureResult) this.f2805c).get(CaptureResult.CONTROL_AWB_STATE);
/* 13 */            EnumC2151ro enumC2151ro = EnumC2151ro.f16204a;
/* 15 */            if (num == null) {
/* 17 */                return enumC2151ro;
                    }
/* 18 */            int iIntValue = num.intValue();
/* 22 */            if (iIntValue == 0) {
/* 62 */                return EnumC2151ro.f16205b;
                    }
/* 25 */            if (iIntValue == 1) {
/* 59 */                return EnumC2151ro.f16206c;
                    }
/* 28 */            if (iIntValue == 2) {
/* 56 */                return EnumC2151ro.f16207d;
                    }
/* 31 */            if (iIntValue == 3) {
/* 53 */                return EnumC2151ro.f16208e;
                    }
/* 49 */            hu0.m4325T("C2CameraCaptureResult", "Undefined awb state: " + num);
/* 52 */            return enumC2151ro;
                }

                @Override // p000.InterfaceC1013i2
                /* JADX INFO: renamed from: f */
                public boolean mo1585f(AbstractC1778j2 abstractC1778j2, Menu menu) {
/* 5 */             return ((InterfaceC1013i2) this.f2804b).mo1585f(abstractC1778j2, menu);
                }

                @Override // p000.InterfaceC2188so
                /* JADX INFO: renamed from: g */
                public EnumC2077po mo1586g() {
/* 11 */            Integer num = (Integer) ((CaptureResult) this.f2805c).get(CaptureResult.CONTROL_AE_STATE);
/* 13 */            EnumC2077po enumC2077po = EnumC2077po.f15194a;
/* 15 */            if (num == null) {
/* 17 */                return enumC2077po;
                    }
/* 18 */            int iIntValue = num.intValue();
/* 22 */            if (iIntValue == 0) {
/* 71 */                return EnumC2077po.f15195b;
                    }
/* 25 */            if (iIntValue != 1) {
/* 28 */                if (iIntValue == 2) {
/* 65 */                    return EnumC2077po.f15198e;
                        }
/* 31 */                if (iIntValue == 3) {
/* 62 */                    return EnumC2077po.f15199f;
                        }
/* 34 */                if (iIntValue == 4) {
/* 59 */                    return EnumC2077po.f15197d;
                        }
/* 37 */                if (iIntValue != 5) {
/* 55 */                    hu0.m4325T("C2CameraCaptureResult", "Undefined ae state: " + num);
/* 58 */                    return enumC2077po;
                        }
                    }
/* 68 */            return EnumC2077po.f15196c;
                }

                @Override // p000.InterfaceC1013i2
                /* JADX INFO: renamed from: h */
                public boolean mo1587h(AbstractC1778j2 abstractC1778j2, Menu menu) {
/* 5 */             ViewGroup viewGroup = ((LayoutInflaterFactory2C2324wa) this.f2805c).f18526l0;
/* 7 */             WeakHashMap weakHashMap = e33.f7494a;
/* 9 */             q23.m7679c(viewGroup);
/* 16 */            return ((InterfaceC1013i2) this.f2804b).mo1587h(abstractC1778j2, menu);
                }

                @Override // p000.InterfaceC2188so
                /* JADX INFO: renamed from: i */
                public CaptureResult mo1588i() {
/* 3 */             return (CaptureResult) this.f2805c;
                }

                @Override // p000.InterfaceC2188so
                /* JADX INFO: renamed from: j */
                public EnumC2114qo mo1589j() {
/* 11 */            Integer num = (Integer) ((CaptureResult) this.f2805c).get(CaptureResult.CONTROL_AF_STATE);
/* 13 */            EnumC2114qo enumC2114qo = EnumC2114qo.f15667a;
/* 15 */            if (num == null) {
/* 17 */                return enumC2114qo;
                    }
                    switch (num.intValue()) {
                        case 0:
/* 60 */                    return EnumC2114qo.f15668b;
                        case 1:
                        case 3:
/* 57 */                    return EnumC2114qo.f15669c;
                        case 2:
/* 54 */                    return EnumC2114qo.f15670d;
                        case 4:
/* 51 */                    return EnumC2114qo.f15672f;
                        case 5:
/* 48 */                    return EnumC2114qo.f15673i;
                        case 6:
/* 45 */                    return EnumC2114qo.f15671e;
                        default:
/* 41 */                    hu0.m4325T("C2CameraCaptureResult", "Undefined af state: " + num);
/* 44 */                    return enumC2114qo;
                    }
                }

                /* JADX INFO: renamed from: l */
                public void m1590l() {
/* 3 */             C0875ec c0875ec = (C0875ec) this.f2804b;
/* 5 */             if (c0875ec != null) {
/* 12 */                ((AtomicBoolean) c0875ec.f7614c).set(true);
/* 19 */                ((ScheduledFuture) c0875ec.f7613b).cancel(true);
                    }
/* 23 */            this.f2804b = null;
                }

                @Override // okhttp3.CookieJar
                public List loadForRequest(HttpUrl httpUrl) {
/* 1 */             httpUrl.getClass();
/* 6 */             ArrayList<C2476xw> arrayList = new ArrayList();
/* 11 */            ArrayList arrayList2 = new ArrayList();
/* 16 */            Set<C2476xw> set = (Set) this.f2804b;
/* 26 */            for (C2476xw c2476xw : set) {
/* 34 */                Cookie cookie = c2476xw.f19385a;
/* 36 */                Cookie cookie2 = c2476xw.f19385a;
/* 48 */                if (cookie.expiresAt() < System.currentTimeMillis()) {
/* 50 */                    arrayList.add(c2476xw);
                        } else if (cookie2.matches(httpUrl)) {
/* 60 */                    arrayList2.add(cookie2);
                        }
                    }
/* 68 */            if (!arrayList.isEmpty()) {
/* 74 */                SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f2805c).edit();
/* 86 */                for (C2476xw c2476xw2 : arrayList) {
/* 94 */                    set.remove(c2476xw2);
/* 101 */                   editorEdit.remove(c2476xw2.m10033a());
                        }
/* 105 */               editorEdit.apply();
                    }
/* 108 */           return arrayList2;
                }

                /* JADX INFO: renamed from: m */
                public int mo1404m(ArrayList arrayList, y92 y92Var, CameraCaptureSession.CaptureCallback captureCallback) {
/* 16 */            return ((CameraCaptureSession) this.f2804b).captureBurst(arrayList, new C0997hn(y92Var, captureCallback), ((C0815cp) this.f2805c).f6866a);
                }

                /* JADX INFO: renamed from: n */
                public void mo1591n(kb2 kb2Var) throws C1897lo {
/* 3 */             CameraDevice cameraDevice = (CameraDevice) this.f2804b;
/* 5 */             cameraDevice.getClass();
/* 8 */             jb2 jb2Var = kb2Var.f12673a;
/* 14 */            jb2Var.mo4154e().getClass();
/* 17 */            List listMo4155f = jb2Var.mo4155f();
/* 21 */            if (listMo4155f == null) {
/* 201 */               C1951n4.m6859j("Invalid output configurations");
/* 204 */               return;
                    }
/* 27 */            if (jb2Var.mo4152c() == null) {
/* 195 */               C1951n4.m6859j("Invalid executor");
/* 198 */               return;
                    }
/* 29 */            String id = cameraDevice.getId();
/* 33 */            Iterator it = listMo4155f.iterator();
/* 41 */            while (it.hasNext()) {
/* 51 */                String strMo7989d = ((oq1) it.next()).f14865a.mo7989d();
/* 55 */                if (strMo7989d != null && !strMo7989d.isEmpty()) {
/* 75 */                    hu0.m4315H0("CameraDeviceCompat", fm0.m3785k("Camera ", id, ": Camera doesn't support physicalCameraId ", strMo7989d, ". Ignoring."));
                        }
                    }
/* 89 */            C0151ap c0151ap = new C0151ap(jb2Var.mo4152c(), jb2Var.mo4154e());
/* 92 */            List listMo4155f2 = jb2Var.mo4155f();
/* 98 */            C2115qp c2115qp = (C2115qp) this.f2805c;
/* 100 */           c2115qp.getClass();
/* 103 */           Handler handler = c2115qp.f15677a;
/* 105 */           by0 by0VarMo4151b = jb2Var.mo4151b();
                    try {
/* 109 */               if (by0VarMo4151b != null) {
/* 113 */                   InputConfiguration inputConfiguration = by0VarMo4151b.f2634a.f20364a;
/* 115 */                   inputConfiguration.getClass();
/* 122 */                   cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, kb2.m6075a(listMo4155f2), c0151ap, handler);
                        } else {
/* 131 */                   if (jb2Var.mo4153d() != 1) {
/* 182 */                       cameraDevice.createCaptureSessionByOutputConfigurations(kb2.m6075a(listMo4155f2), c0151ap, handler);
/* 185 */                       return;
                            }
/* 139 */                   ArrayList arrayList = new ArrayList(listMo4155f2.size());
/* 142 */                   Iterator it2 = listMo4155f2.iterator();
/* 150 */                   while (it2.hasNext()) {
/* 170 */                       arrayList.add(((OutputConfiguration) ((oq1) it2.next()).f14865a.mo7988c()).getSurface());
                            }
/* 174 */                   cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, c0151ap, handler);
                        }
                    } catch (CameraAccessException e) {
/* 192 */               throw new C1897lo(e);
                    }
                }

                /* JADX INFO: renamed from: o */
                public String m1592o() {
                    String string;
/* 3 */             Context context = (Context) this.f2804b;
                    try {
/* 17 */                string = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
                    } catch (Exception e) {
/* 27 */                xe2.m9775m("Device", "Error getting application name", e);
/* 30 */                string = null;
                    }
                    return string == null ? "Support" : string;
                }

                @Override // p000.xo0
                public void onFailure(Throwable th) {
/* 5 */             int i = ((lj2) this.f2804b).f13323f;
/* 10 */            if (i == 2 && (th instanceof CancellationException)) {
/* 16 */                hu0.m4312F0("DualSurfaceProcessorNode");
                    } else {
/* 30 */                hu0.m4317I0("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(hu0.m4334c0(i)), th);
                    }
                }

                @Override // p000.xo0
                public void onSuccess(Object obj) {
/* 1 */             mj2 mj2Var = (mj2) obj;
/* 3 */             mj2Var.getClass();
/* 12 */            cb0 cb0Var = (cb0) ((C0168b5) this.f2805c).f2211b;
/* 20 */            if (cb0Var.f2812g.get()) {
/* 22 */                mj2Var.close();
/* 46 */                return;
                    }
/* 30 */            RunnableC1784j8 runnableC1784j8 = new RunnableC1784j8(20, cb0Var, mj2Var);
/* 33 */            Objects.requireNonNull(mj2Var);
/* 43 */            cb0Var.m1604b(runnableC1784j8, new RunnableC2166s2(mj2Var, 14));
                }

                /* JADX INFO: renamed from: p */
                public String m1593p() {
/* 3 */             Context context = (Context) this.f2804b;
                    try {
/* 18 */                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    } catch (Exception e) {
/* 26 */                xe2.m9775m("Device", "Error getting app version", e);
/* 29 */                return null;
                    }
                }

                /* JADX INFO: renamed from: q */
                public String m1594q() {
/* 13 */            Intent intentRegisterReceiver = ((Context) this.f2804b).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
/* 17 */            if (intentRegisterReceiver == null) {
/* 19 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 55 */            return ((int) ((intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / intentRegisterReceiver.getIntExtra("scale", -1)) * 100.0f)) + "%";
                }

                /* JADX INFO: renamed from: r */
                public C2183sj m1595r() throws un1 {
                    int[] iArr;
/* 7 */             if (((C2183sj) this.f2805c) == null) {
/* 11 */                ra2 ra2Var = (ra2) this.f2804b;
/* 15 */                C2183sj c2183sj = (C2183sj) ra2Var.f15958d;
/* 17 */                if (c2183sj == null) {
/* 23 */                    va1 va1Var = (va1) ra2Var.f15955a;
/* 25 */                    int i = va1Var.f17947a;
/* 27 */                    int i2 = va1Var.f17948b;
/* 31 */                    int i3 = 0;
/* 32 */                    boolean z = true;
/* 33 */                    if (i < 40 || i2 < 40) {
/* 456 */                       C2183sj c2183sj2 = new C2183sj(i, i2);
/* 464 */                       if (((byte[]) ra2Var.f15956b).length < i) {
/* 468 */                           ra2Var.f15956b = new byte[i];
                                }
/* 470 */                       int i4 = 0;
                                while (true) {
/* 474 */                           iArr = (int[]) ra2Var.f15957c;
/* 478 */                           if (i4 >= 32) {
                                        break;
                                    }
/* 480 */                           iArr[i4] = 0;
/* 482 */                           i4++;
                                }
/* 488 */                       for (int i5 = 1; i5 < 5; i5++) {
/* 497 */                           byte[] bArrMo2885b = va1Var.mo2885b((byte[]) ra2Var.f15956b, (i2 * i5) / 5);
/* 503 */                           int i6 = (i << 2) / 5;
/* 506 */                           for (int i7 = i / 5; i7 < i6; i7++) {
/* 513 */                               int i8 = (bArrMo2885b[i7] & 255) >> 3;
/* 519 */                               iArr[i8] = iArr[i8] + 1;
                                    }
                                }
/* 527 */                       int length = iArr.length;
/* 530 */                       int i9 = 0;
/* 531 */                       int i10 = 0;
/* 532 */                       int i11 = 0;
/* 533 */                       for (int i12 = 0; i12 < length; i12++) {
/* 535 */                           int i13 = iArr[i12];
/* 537 */                           if (i13 > i9) {
/* 539 */                               i11 = i12;
/* 540 */                               i9 = i13;
                                    }
/* 541 */                           if (i13 > i10) {
/* 543 */                               i10 = i13;
                                    }
                                }
/* 549 */                       int i14 = 0;
/* 550 */                       int i15 = 0;
/* 551 */                       for (int i16 = 0; i16 < length; i16++) {
/* 553 */                           int i17 = i16 - i11;
/* 558 */                           int i18 = iArr[i16] * i17 * i17;
/* 559 */                           if (i18 > i15) {
/* 561 */                               i14 = i16;
/* 562 */                               i15 = i18;
                                    }
                                }
/* 566 */                       if (i11 <= i14) {
/* 569 */                           int i19 = i11;
/* 571 */                           i11 = i14;
/* 572 */                           i14 = i19;
                                }
/* 578 */                       if (i11 - i14 <= length / 16) {
/* 653 */                           throw un1.f17603c;
                                }
/* 580 */                       int i20 = i11 - 1;
/* 583 */                       int i21 = -1;
/* 584 */                       int i22 = i20;
/* 585 */                       while (i20 > i14) {
/* 587 */                           int i23 = i20 - i14;
/* 597 */                           int i24 = (i10 - iArr[i20]) * (i11 - i20) * i23 * i23;
/* 598 */                           if (i24 > i21) {
/* 600 */                               i22 = i20;
/* 601 */                               i21 = i24;
                                    }
/* 602 */                           i20--;
                                }
/* 605 */                       int i25 = i22 << 3;
/* 607 */                       byte[] bArrMo2884a = va1Var.mo2884a();
/* 613 */                       for (int i26 = 0; i26 < i2; i26++) {
/* 615 */                           int i27 = i26 * i;
/* 619 */                           for (int i28 = 0; i28 < i; i28++) {
/* 628 */                               if ((bArrMo2884a[i27 + i28] & 255) < i25) {
/* 630 */                                   c2183sj2.m8517c(i28, i26);
                                        }
                                    }
                                }
/* 641 */                       ra2Var.f15958d = c2183sj2;
                            } else {
/* 37 */                        byte[] bArrMo2884a2 = va1Var.mo2884a();
/* 41 */                        int i29 = i >> 3;
/* 45 */                        if ((i & 7) != 0) {
/* 47 */                            i29++;
                                }
/* 49 */                        int i30 = i2 >> 3;
/* 53 */                        if ((i2 & 7) != 0) {
/* 55 */                            i30++;
                                }
/* 57 */                        int i31 = i2 - 8;
/* 59 */                        int i32 = i - 8;
/* 61 */                        int i33 = 2;
/* 74 */                        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i30, i29);
/* 76 */                        int i34 = 0;
                                while (true) {
/* 77 */                            int i35 = 8;
/* 79 */                            if (i34 >= i30) {
                                        break;
                                    }
/* 81 */                            int i36 = i3;
/* 83 */                            int i37 = i34 << 3;
/* 85 */                            if (i37 > i31) {
/* 87 */                                i37 = i31;
                                    }
/* 88 */                            boolean z2 = z;
/* 90 */                            int i38 = i36;
/* 92 */                            while (i38 < i29) {
/* 94 */                                int i39 = i33;
/* 96 */                                int i40 = i38 << 3;
/* 98 */                                if (i40 > i32) {
/* 100 */                                   i40 = i32;
                                        }
/* 103 */                               int i41 = (i37 * i) + i40;
/* 105 */                               int i42 = i36;
/* 107 */                               int i43 = i42;
/* 109 */                               int i44 = i43;
/* 111 */                               int i45 = 255;
/* 113 */                               while (i42 < i35) {
/* 115 */                                   byte[] bArr = bArrMo2884a2;
/* 117 */                                   int i46 = i37;
/* 119 */                                   int i47 = i36;
/* 121 */                                   int i48 = i44;
/* 123 */                                   int i49 = i45;
/* 125 */                                   while (i47 < i35) {
/* 131 */                                       int i50 = i47;
/* 135 */                                       int i51 = bArr[i41 + i47] & 255;
/* 136 */                                       i43 += i51;
/* 138 */                                       if (i51 < i49) {
/* 140 */                                           i49 = i51;
                                                }
/* 141 */                                       if (i51 > i48) {
/* 143 */                                           i48 = i51;
                                                }
/* 144 */                                       i47 = i50 + 1;
/* 146 */                                       i35 = 8;
                                            }
/* 153 */                                   if (i48 - i49 > 24) {
                                                while (true) {
/* 155 */                                           i42++;
/* 157 */                                           i41 += i;
/* 161 */                                           if (i42 < 8) {
/* 163 */                                               int i52 = i36;
/* 165 */                                               for (int i53 = 8; i52 < i53; i53 = 8) {
/* 176 */                                                   i43 += bArr[i41 + i52] & 255;
/* 178 */                                                   i52++;
/* 180 */                                                   i49 = i49;
                                                        }
                                                    }
                                                }
                                            }
/* 190 */                                   i42++;
/* 192 */                                   i41 += i;
/* 194 */                                   i45 = i49;
/* 196 */                                   bArrMo2884a2 = bArr;
/* 198 */                                   i37 = i46;
/* 200 */                                   i35 = 8;
/* 202 */                                   i44 = i48;
                                        }
/* 205 */                               byte[] bArr2 = bArrMo2884a2;
/* 207 */                               int i54 = i37;
/* 209 */                               int i55 = i43 >> 6;
/* 211 */                               int i56 = i45;
/* 217 */                               if (i44 - i56 <= 24) {
/* 219 */                                   i55 = i56 / 2;
/* 221 */                                   if (i34 > 0 && i38 > 0) {
/* 227 */                                       int[] iArr3 = iArr2[i34 - 1];
/* 233 */                                       int i57 = i38 - 1;
/* 243 */                                       int i58 = (((iArr2[i34][i57] * 2) + iArr3[i38]) + iArr3[i57]) / 4;
/* 245 */                                       if (i56 < i58) {
/* 247 */                                           i55 = i58;
                                                }
                                            }
                                        }
/* 250 */                               iArr2[i34][i38] = i55;
/* 252 */                               i38++;
/* 254 */                               i33 = i39;
/* 256 */                               bArrMo2884a2 = bArr2;
/* 258 */                               i37 = i54;
/* 260 */                               i35 = 8;
                                    }
/* 268 */                           i34++;
/* 270 */                           i3 = i36;
/* 272 */                           z = z2;
                                }
/* 276 */                       byte[] bArr3 = bArrMo2884a2;
/* 278 */                       int i59 = i3;
/* 280 */                       int i60 = i33;
/* 284 */                       C2183sj c2183sj3 = new C2183sj(i, i2);
/* 287 */                       int i61 = i59;
/* 289 */                       while (i61 < i30) {
/* 291 */                           int i62 = i61 << 3;
/* 293 */                           if (i62 > i31) {
/* 295 */                               i62 = i31;
                                    }
/* 296 */                           int i63 = i30 - 3;
/* 300 */                           if (i61 < i60) {
/* 302 */                               i63 = 2;
                                    } else if (i61 <= i63) {
/* 307 */                               i63 = i61;
                                    }
/* 308 */                           int i64 = i59;
/* 310 */                           while (i64 < i29) {
/* 312 */                               int i65 = i64 << 3;
/* 314 */                               if (i65 > i32) {
/* 316 */                                   i65 = i32;
                                        }
/* 317 */                               int i66 = i29 - 3;
/* 320 */                               if (i64 < 2) {
/* 322 */                                   i66 = 2;
                                        } else if (i64 <= i66) {
/* 327 */                                   i66 = i64;
                                        }
/* 330 */                               int i67 = i61;
/* 332 */                               int i68 = -2;
/* 334 */                               int i69 = i59;
/* 336 */                               for (int i70 = 2; i68 <= i70; i70 = 2) {
/* 340 */                                   int[] iArr4 = iArr2[i63 + i68];
/* 370 */                                   i69 = iArr4[i66 - 2] + iArr4[i66 - 1] + iArr4[i66] + iArr4[i66 + 1] + iArr4[i66 + 2] + i69;
/* 372 */                                   i68++;
                                        }
/* 379 */                               int i71 = i69 / 25;
/* 383 */                               int i72 = (i62 * i) + i65;
/* 384 */                               int i73 = i29;
/* 386 */                               int i74 = i59;
                                        while (true) {
/* 390 */                                   if (i74 < 8) {
/* 392 */                                       int i75 = i62;
/* 394 */                                       int i76 = i59;
/* 396 */                                       for (int i77 = 8; i76 < i77; i77 = 8) {
/* 402 */                                           int i78 = i76;
/* 407 */                                           if ((bArr3[i72 + i76] & 255) <= i71) {
/* 413 */                                               c2183sj3.m8517c(i65 + i78, i75 + i74);
                                                    }
/* 416 */                                           i76 = i78 + 1;
                                                }
/* 421 */                                       i74++;
/* 423 */                                       i72 += i;
/* 424 */                                       i62 = i75;
                                            }
                                        }
/* 429 */                               i64++;
/* 431 */                               i61 = i67;
/* 433 */                               i29 = i73;
                                    }
/* 440 */                           i60 = 2;
/* 442 */                           i61++;
                                }
/* 446 */                       ra2Var.f15958d = c2183sj3;
                            }
/* 646 */                   c2183sj = (C2183sj) ra2Var.f15958d;
                        }
/* 648 */               this.f2805c = c2183sj;
                    }
/* 656 */           return (C2183sj) this.f2805c;
                }

                /* JADX INFO: renamed from: s */
                public CameraCharacteristics mo1596s(String str) throws C1897lo {
                    try {
/* 5 */                 return ((CameraManager) this.f2804b).getCameraCharacteristics(str);
                    } catch (CameraAccessException e) {
/* 16 */                throw new C1897lo(e);
                    }
                }

                @Override // okhttp3.CookieJar
                public void saveFromResponse(HttpUrl httpUrl, List list) {
/* 1 */             httpUrl.getClass();
/* 4 */             list.getClass();
/* 9 */             Set set = (Set) this.f2804b;
/* 15 */            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f2805c).edit();
/* 25 */            ArrayList<C2476xw> arrayList = new ArrayList(list.size());
/* 28 */            Iterator it = list.iterator();
/* 36 */            while (it.hasNext()) {
/* 49 */                arrayList.add(new C2476xw((Cookie) it.next()));
                    }
/* 61 */            for (C2476xw c2476xw : arrayList) {
/* 69 */                set.remove(c2476xw);
/* 72 */                set.add(c2476xw);
/* 75 */                String strM10033a = c2476xw.m10033a();
/* 81 */                HashMap map = new HashMap();
/* 84 */                Cookie cookie = c2476xw.f19385a;
/* 92 */                map.put("name", cookie.name());
/* 101 */               map.put(FirebaseAnalytics.Param.VALUE, cookie.value());
/* 114 */               map.put("expiresAt", Long.valueOf(cookie.expiresAt()));
/* 123 */               map.put("domain", cookie.domain());
/* 132 */               map.put("path", cookie.path());
/* 140 */               String string = new JSONObject(map).toString();
/* 144 */               string.getClass();
/* 147 */               editorEdit.putString(strM10033a, string);
                    }
/* 151 */           editorEdit.apply();
                }

                /* JADX INFO: renamed from: t */
                public LinkedHashSet m1597t() {
                    LinkedHashSet linkedHashSet;
                    synchronized (this.f2804b) {
/* 14 */                linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.f2805c).values());
                    }
/* 18 */            return linkedHashSet;
                }

                public String toString() {
                    switch (this.f2803a) {
                        case 10:
                            try {
/* 15 */                        return m1595r().toString();
                            } catch (un1 unused) {
/* 20 */                        return HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                        default:
/* 6 */                     return super.toString();
                    }
                }

                /* JADX INFO: renamed from: u */
                public Set mo1598u() {
/* 1 */             return Collections.EMPTY_SET;
                }

                /* JADX INFO: renamed from: v */
                public String m1599v() {
/* 3 */             er0 er0Var = (er0) this.f2805c;
/* 11 */            String strM3589r = ((er0) er0Var.f7853b).m3589r("hs_did");
/* 19 */            if (!b40.m1232p(strM3589r)) {
/* 32 */                return strM3589r;
                    }
/* 25 */            String string = UUID.randomUUID().toString();
/* 29 */            er0Var.m3595y("hs_did", string);
/* 32 */            return string;
                }

                /* JADX INFO: renamed from: x */
                public KeyListener m1600x(KeyListener keyListener) {
/* 3 */             if (keyListener instanceof NumberKeyListener) {
/* 36 */                return keyListener;
                    }
/* 13 */            ((wc0) ((gr0) this.f2805c).f8789a).getClass();
/* 18 */            if (keyListener instanceof cd0) {
/* 20 */                return keyListener;
                    }
/* 21 */            if (keyListener == null) {
/* 23 */                return null;
                    }
                    return keyListener instanceof NumberKeyListener ? keyListener : new cd0(keyListener);
                }

                /* JADX INFO: renamed from: y */
                public String m1601y() {
                    try {
/* 5 */                 if (android.os.Build.VERSION.SDK_INT < 33) {
/* 58 */                    return Locale.getDefault().toLanguageTag();
                        }
/* 1 */                 LocaleList applicationLocales = AbstractC2481y0.m10055a(((Context) this.f2804b).getSystemService(AbstractC2481y0.m10071q())).getApplicationLocales();
                        return (applicationLocales == null || applicationLocales.isEmpty()) ? Locale.getDefault().toLanguageTag() : applicationLocales.get(0).toLanguageTag();
                    } catch (Exception e) {
/* 68 */                xe2.m9777o("Device", "Error getting app language", e);
/* 71 */                return "unknown";
                    }
                }

                /* JADX INFO: renamed from: z */
                public void m1602z(C1896ln c1896ln) {
                    synchronized (this.f2804b) {
                        try {
/* 4 */                     c1896ln.getClass();
/* 22 */                    for (String str : new LinkedHashSet(c1896ln.f13426f)) {
/* 32 */                        hu0.m4312F0("CameraRepository");
/* 43 */                        ((LinkedHashMap) this.f2805c).put(str, c1896ln.m6508a(str));
                            }
                        } catch (C1936mq e) {
/* 58 */                    throw new ux0(e);
                        }
                    }
                }

/* 158 */       public /* synthetic */ C0210cb(int i, boolean z) {
/* 159 */           this.f2803a = i;
                }

/* 159 */       public /* synthetic */ C0210cb(Object obj, int i) {
/* 160 */           this.f2803a = i;
                    this.f2804b = obj;
                }

/* 160 */       public /* synthetic */ C0210cb(Object obj, Object obj2, int i, boolean z) {
/* 161 */           this.f2803a = i;
                    this.f2805c = obj;
                    this.f2804b = obj2;
                }

/* 161 */       public /* synthetic */ C0210cb(boolean z) {
/* 162 */           this.f2803a = 8;
                }

/* 162 */       public C0210cb(CameraCaptureSession cameraCaptureSession, C0815cp c0815cp) {
                    this.f2803a = 16;
/* 164 */           cameraCaptureSession.getClass();
/* 165 */           this.f2804b = cameraCaptureSession;
/* 166 */           this.f2805c = c0815cp;
                }

/* 166 */       public C0210cb(C1899lq c1899lq) {
                    this.f2803a = 20;
/* 168 */           this.f2804b = c1899lq;
/* 170 */           rk1 rk1Var = new rk1();
/* 171 */           this.f2805c = rk1Var;
/* 173 */           rk1Var.m8193k(new C0878ef(5, null));
                }

/* 173 */       public C0210cb(CameraDevice cameraDevice, C2115qp c2115qp) {
                    this.f2803a = 17;
/* 175 */           cameraDevice.getClass();
/* 176 */           this.f2804b = cameraDevice;
/* 177 */           this.f2805c = c2115qp;
                }

/* 177 */       public C0210cb(Function1 function1, int i) {
                    this.f2803a = i;
                    switch (i) {
                        case Build.API_LEVELS.API_26 /* 26 */:
                            this.f2804b = function1;
/* 183 */                   this.f2805c = new ConcurrentHashMap();
                            break;
                        default:
/* 179 */                   this.f2804b = function1;
/* 181 */                   this.f2805c = new C0931fv(this);
                            break;
                    }
                }

/* 183 */       public C0210cb(Context context, C0963gq c0963gq) {
                    this.f2803a = 18;
/* 185 */           this.f2804b = (CameraManager) context.getSystemService("camera");
/* 186 */           this.f2805c = c0963gq;
                }

/* 186 */       public C0210cb(EditText editText) {
                    this.f2803a = 6;
/* 188 */           this.f2804b = editText;
/* 190 */           gr0 gr0Var = new gr0();
/* 191 */           gr0Var.f8789a = new wc0(editText);
/* 192 */           this.f2805c = gr0Var;
                }

/* 192 */       public /* synthetic */ C0210cb(int i, Object obj, Object obj2) {
/* 193 */           this.f2803a = i;
                    this.f2804b = obj;
                    this.f2805c = obj2;
                }

/* 193 */       public C0210cb(Function2 function2, int i) {
                    this.f2803a = i;
                    switch (i) {
                        case Build.API_LEVELS.API_27 /* 27 */:
                            this.f2804b = function2;
/* 199 */                   this.f2805c = new ConcurrentHashMap();
                            break;
                        default:
/* 195 */                   this.f2804b = function2;
/* 197 */                   this.f2805c = new C0968gv();
                            break;
                    }
                }

/* 199 */       public C0210cb(Context context, Object obj, LinkedHashSet linkedHashSet) {
                    C0816cq c0816cqM2830a;
                    this.f2803a = 15;
/* 201 */           dc0 dc0Var = new dc0(24);
/* 203 */           this.f2804b = new HashMap();
/* 204 */           this.f2805c = dc0Var;
/* 205 */           if (obj instanceof C0816cq) {
/* 206 */               c0816cqM2830a = (C0816cq) obj;
                    } else {
/* 207 */               c0816cqM2830a = C0816cq.m2830a(context, jb1.m5757q());
                    }
/* 208 */           Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
/* 209 */               ((HashMap) this.f2804b).put(str, new cj2(context, str, c0816cqM2830a, (dc0) this.f2805c));
                    }
                }

/* 209 */       public C0210cb(CardView cardView) {
                    this.f2803a = 22;
                    this.f2805c = cardView;
                }

/* 210 */       public C0210cb(C2467xn c2467xn) {
                    this.f2803a = 14;
                    this.f2805c = c2467xn;
/* 212 */           this.f2804b = null;
                }

/* 212 */       public C0210cb(int i) {
                    this.f2803a = i;
                    switch (i) {
                        case 8:
                            this.f2804b = Boolean.FALSE;
                            break;
                        case 11:
/* 221 */                   this.f2804b = new ReentrantLock();
/* 222 */                   this.f2805c = new LinkedHashMap();
                            break;
                        case 19:
/* 217 */                   this.f2804b = new Object();
/* 218 */                   this.f2805c = new LinkedHashMap();
/* 219 */                   new HashSet();
                            break;
                        default:
/* 214 */                   this.f2804b = new Rect();
/* 215 */                   this.f2805c = new Rect();
                            break;
                    }
                }
            }
