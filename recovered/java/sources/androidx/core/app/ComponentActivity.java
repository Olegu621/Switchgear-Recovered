            package androidx.core.app;

            import android.app.Activity;
            import android.os.Build;
            import android.os.Bundle;
            import android.view.KeyEvent;
            import android.view.View;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.AbstractC2514yx;
            import p000.g71;
            import p000.he3;
            import p000.i32;
            import p000.i71;
            import p000.k32;
            import p000.l31;
            import p000.le2;
            import p000.u61;
            import p000.v61;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00102\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R.\u0010\u001b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\n\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u001e¨\u0006#"}, m6176d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Lg71;", "Ll31;", "Lyx;", "extraData", HttpUrl.FRAGMENT_ENCODE_SET, "putExtraData", "(Lyx;)V", "T", "Ljava/lang/Class;", "extraDataClass", "getExtraData", "(Ljava/lang/Class;)Lyx;", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, HttpUrl.FRAGMENT_ENCODE_SET, "superDispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "args", "shouldDumpInternalState", "([Ljava/lang/String;)Z", "Lle2;", "extraDataMap", "Lle2;", "getExtraDataMap$annotations", "()V", "Li71;", "lifecycleRegistry", "Li71;", "getLifecycleRegistry$annotations", "core_release"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public class ComponentActivity extends Activity implements g71, l31 {
                private final le2 extraDataMap = new le2();
                private final i71 lifecycleRegistry = new i71(this);

                @Override // android.app.Activity, android.view.Window.Callback
                public boolean dispatchKeyEvent(KeyEvent event) {
/* 1 */             event.getClass();
/* 8 */             View decorView = getWindow().getDecorView();
/* 12 */            decorView.getClass();
/* 19 */            if (he3.m4184e(decorView, event)) {
/* 21 */                return true;
                    }
/* 23 */            return he3.m4185f(this, decorView, this, event);
                }

                @Override // android.app.Activity, android.view.Window.Callback
                public boolean dispatchKeyShortcutEvent(KeyEvent event) {
/* 1 */             event.getClass();
/* 8 */             View decorView = getWindow().getDecorView();
/* 12 */            decorView.getClass();
/* 19 */            if (he3.m4184e(decorView, event)) {
/* 21 */                return true;
                    }
/* 23 */            return super.dispatchKeyShortcutEvent(event);
                }

                public <T extends AbstractC2514yx> T getExtraData(Class<T> extraDataClass) {
/* 1 */             extraDataClass.getClass();
/* 11 */            return (T) this.extraDataMap.getOrDefault(extraDataClass, null);
                }

                public v61 getLifecycle() {
/* 1 */             return this.lifecycleRegistry;
                }

                @Override // android.app.Activity
                public void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 4 */             int i = k32.f12578b;
/* 6 */             i32.m4462b(this);
                }

                @Override // android.app.Activity
                public void onSaveInstanceState(Bundle bundle) {
/* 1 */             bundle.getClass();
/* 8 */             this.lifecycleRegistry.m4489g(u61.f17376c);
/* 11 */            super.onSaveInstanceState(bundle);
                }

                public void putExtraData(AbstractC2514yx extraData) {
/* 1 */             extraData.getClass();
/* 10 */            this.extraDataMap.put(extraData.getClass(), extraData);
                }

                /* JADX WARN: Code duplicated, block: B:15:0x0021  */
                /* JADX WARN: Code duplicated, block: B:28:0x0045  */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                public final boolean shouldDumpInternalState(String[] args) {
/* 2 */             boolean z = false;
/* 3 */             if (args != null && args.length != 0) {
/* 9 */                 String str = args[0];
                        switch (str.hashCode()) {
                            case -645125871:
/* 83 */                        if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
/* 34 */                            z = true;
                                }
                                break;
                            case 100470631:
/* 67 */                        if (str.equals("--dump-dumpable")) {
/* 74 */                            if (Build.VERSION.SDK_INT >= 33) {
/* 34 */                                z = true;
                                    }
                                }
                                break;
                            case 472614934:
/* 58 */                        if (str.equals("--list-dumpables")) {
/* 74 */                            if (Build.VERSION.SDK_INT >= 33) {
/* 34 */                                z = true;
                                    }
                                }
                                break;
                            case 1159329357:
/* 42 */                        if (str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
/* 34 */                            z = true;
                                }
                                break;
                            case 1455016274:
/* 25 */                        if (str.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
/* 34 */                            z = true;
                                }
                                break;
                        }
                    }
/* 93 */            return true ^ z;
                }

                @Override // p000.l31
                public boolean superDispatchKeyEvent(KeyEvent event) {
/* 1 */             event.getClass();
/* 4 */             return super.dispatchKeyEvent(event);
                }
            }
