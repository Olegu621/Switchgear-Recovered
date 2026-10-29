            package com.supercell.p007id;

            import android.app.Activity;
            import android.app.Application;
            import android.content.ComponentCallbacks2;
            import android.content.Intent;
            import android.content.res.Configuration;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import com.supercell.p007id.FlutterSupport;
            import io.flutter.FlutterInjector;
            import io.flutter.embedding.engine.FlutterEngine;
            import io.flutter.embedding.engine.FlutterEngineCache;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.embedding.engine.loader.FlutterLoader;
            import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.StandardMethodCodec;
            import io.sentry.android.core.AbstractC1245n0;
            import java.nio.ByteBuffer;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Queue;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import p000.RunnableC1784j8;
            import p000.al0;
            import p000.bl0;
            import p000.cl0;
            import p000.d71;
            import p000.f42;
            import p000.g71;
            import p000.i71;
            import p000.qc3;
            import p000.t61;
            import p000.v61;
            import p000.xk0;
            import p000.yk0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlutterSupport implements g71, d71, Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
                private static final String DEFAULT_FLUTTER_ENGINE_ID = "scidEngine";
                private static final String[] ENGINE_ARGS = {"--no-enable-merged-platform-ui-thread"};
                private static final String FLUTTER_PLATFORM_CHANNEL_NAME = "supercell/platform";
                private static final String TAG = "FlutterSupport";
                private Activity activity;
                private final Class<? extends Activity> activityClass;
                private final Application application;
                FlutterEngine engine;
                private i71 lifecycle;
                private FlutterPanel panel;
                private Boolean pendingWindowVisible;
                private long userData;
                private boolean windowOpen;
                private boolean engineInitialized = false;
                private float[] hitTestRects = new float[0];
                private boolean panelResumed = false;
                private boolean activityResumed = false;
                private boolean destroyed = false;
                private boolean changingConfigurations = false;
                private final Queue<cl0> messageQueue = new ConcurrentLinkedQueue();
                private final Map<String, Long> pendingHandlers = new HashMap();

                static {
/* 11 */            System.loadLibrary("scid_sdk");
                }

                public FlutterSupport(long j, Activity activity) {
/* 33 */            this.userData = j;
/* 39 */            this.activityClass = activity.getClass();
/* 41 */            Application application = activity.getApplication();
/* 45 */            this.application = application;
/* 47 */            application.registerActivityLifecycleCallbacks(this);
/* 50 */            application.registerComponentCallbacks(this);
/* 53 */            this.activity = activity;
/* 60 */            activity.runOnUiThread(new yk0(this, 0));
                }

                private void applyPendingHandlers() {
/* 9 */             if (Looper.getMainLooper() != Looper.myLooper()) {
/* 85 */                f42.m3656l("applyPendingHandlers must be called on the main thread");
/* 88 */                return;
                    }
/* 11 */            BinaryMessenger binaryMessenger = getBinaryMessenger();
/* 15 */            if (binaryMessenger == null) {
/* 17 */                return;
                    }
                    synchronized (this.pendingHandlers) {
                        try {
/* 35 */                    for (Map.Entry<String, Long> entry : this.pendingHandlers.entrySet()) {
/* 43 */                        String key = entry.getKey();
/* 49 */                        Long value = entry.getValue();
/* 55 */                        if (value != null && value.longValue() != 0) {
/* 73 */                            binaryMessenger.setMessageHandler(key, new xk0(value, 0));
                                }
                            }
                        } catch (Throwable th) {
/* 82 */                    throw th;
                        }
                    }
                }

                private void applyPendingWindowState() {
/* 1 */             Boolean bool = this.pendingWindowVisible;
/* 3 */             if (bool == null || this.engine == null || this.activity == null) {
/* 23 */                return;
                    }
/* 13 */            boolean zBooleanValue = bool.booleanValue();
/* 18 */            this.pendingWindowVisible = null;
/* 20 */            applyWindowState(zBooleanValue);
                }

                private void applyWindowState(boolean z) {
/* 3 */             if (!this.engineInitialized) {
/* 6 */                 this.engineInitialized = true;
/* 10 */                if (this.lifecycle == null) {
/* 15 */                    onActivityCreated(this.activity, null);
/* 20 */                    onActivityStarted(this.activity);
/* 25 */                    onActivityResumed(this.activity);
                        }
                    }
/* 30 */            if (this.windowOpen != z) {
/* 32 */                this.windowOpen = z;
/* 34 */                if (z) {
/* 36 */                    createPanel();
                        } else {
/* 40 */                    destroyPanel();
                        }
                    }
/* 43 */            FlutterPanel flutterPanel = this.panel;
/* 45 */            if (flutterPanel != null) {
/* 49 */                flutterPanel.setHitTestRects(this.hitTestRects);
                    }
                }

                public static native void binaryChannelReply(ByteBuffer byteBuffer, long j);

                public static native void binaryMessageHandler(long j, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply);

                private void createPanel() {
/* 3 */             if (this.activity == null || this.panel != null || this.engine == null) {
/* 33 */                return;
                    }
                    try {
/* 22 */                this.panel = new FlutterPanel(this.activity, this.engine, this);
                    } catch (Exception e) {
/* 30 */                AbstractC1245n0.m4877e(TAG, "showDialog failed", e);
                    }
                }

                private void destroyPanel() {
/* 1 */             FlutterPanel flutterPanel = this.panel;
/* 3 */             if (flutterPanel != null) {
/* 6 */                 this.panel = null;
                        try {
/* 8 */                     flutterPanel.destroy();
                        } catch (Exception e) {
/* 17 */                    AbstractC1245n0.m4877e(TAG, "dismissDialog failed", e);
                        }
                    }
                }

                private BinaryMessenger getBinaryMessenger() {
/* 1 */             FlutterEngine flutterEngine = this.engine;
/* 3 */             if (flutterEngine == null) {
/* 5 */                 return null;
                    }
/* 11 */            return flutterEngine.getDartExecutor().getBinaryMessenger();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ void lambda$applyPendingHandlers$1(Long l, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
/* 5 */             binaryMessageHandler(l.longValue(), byteBuffer, binaryReply);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$new$0() {
/* 5 */             FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
/* 11 */            flutterLoader.startInitialization(this.application);
/* 33 */            flutterLoader.ensureInitializationCompleteAsync(this.application, ENGINE_ARGS, new Handler(Looper.getMainLooper()), new yk0(this, 2));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$onActivityCreated$6() {
/* 3 */             if (this.windowOpen) {
/* 5 */                 createPanel();
/* 8 */                 FlutterPanel flutterPanel = this.panel;
/* 10 */                if (flutterPanel != null) {
/* 14 */                    flutterPanel.setHitTestRects(this.hitTestRects);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ void lambda$setMessageHandler$4(Long l, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
/* 5 */             binaryMessageHandler(l.longValue(), byteBuffer, binaryReply);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$setMessageHandler$5(String str) {
/* 1 */             BinaryMessenger binaryMessenger = getBinaryMessenger();
/* 5 */             if (binaryMessenger != null) {
                        synchronized (this.pendingHandlers) {
                            try {
/* 12 */                        Long l = this.pendingHandlers.get(str);
/* 18 */                        if (l == null || l.longValue() == 0) {
/* 43 */                            binaryMessenger.setMessageHandler(str, null);
                                } else {
/* 36 */                            binaryMessenger.setMessageHandler(str, new xk0(l, 1));
                                }
                            } catch (Throwable th) {
/* 49 */                        throw th;
                            }
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$setWindowVisibility$2(float[] fArr, boolean z) {
/* 13 */            this.hitTestRects = fArr != null ? (float[]) fArr.clone() : new float[0];
/* 17 */            if (this.engine == null) {
/* 23 */                this.pendingWindowVisible = Boolean.valueOf(z);
                    } else {
/* 27 */                this.pendingWindowVisible = null;
/* 29 */                applyWindowState(z);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void onFlutterInitialized() {
/* 3 */             if (this.destroyed) {
/* 5 */                 return;
                    }
/* 15 */            this.engine = new FlutterEngine(this.application, ENGINE_ARGS);
/* 25 */            FlutterEngineCache.getInstance().put(DEFAULT_FLUTTER_ENGINE_ID, this.engine);
/* 30 */            if (this.activity != null && this.lifecycle != null) {
/* 38 */                ActivityControlSurface activityControlSurface = this.engine.getActivityControlSurface();
/* 44 */                Activity activity = this.activity;
/* 53 */                activityControlSurface.attachToActivity(new qc3(activity, 27), this.lifecycle);
                    }
/* 56 */            applyPendingHandlers();
/* 69 */            this.engine.getDartExecutor().executeDartEntrypoint(DartExecutor.DartEntrypoint.createDefault());
/* 72 */            processMessageQueue();
/* 75 */            applyPendingWindowState();
                }

                private void postMessage(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
/* 3 */             if (this.activity != null) {
/* 5 */                 Queue<cl0> queue = this.messageQueue;
/* 9 */                 cl0 cl0Var = new cl0();
/* 12 */                cl0Var.f2980a = str;
/* 14 */                cl0Var.f2981b = byteBuffer;
/* 16 */                cl0Var.f2982c = binaryReply;
/* 18 */                queue.add(cl0Var);
/* 29 */                this.activity.runOnUiThread(new yk0(this, 1));
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void processMessageQueue() {
/* 9 */             if (Looper.getMainLooper() != Looper.myLooper()) {
/* 49 */                f42.m3656l("processMessageQueue must be called on the main thread");
/* 52 */                return;
                    }
/* 11 */            BinaryMessenger binaryMessenger = getBinaryMessenger();
/* 15 */            if (binaryMessenger == null) {
/* 46 */                return;
                    }
/* 24 */            while (!this.messageQueue.isEmpty()) {
/* 28 */                cl0 cl0VarPoll = this.messageQueue.poll();
/* 34 */                if (cl0VarPoll != null) {
/* 42 */                    binaryMessenger.send(cl0VarPoll.f2980a, cl0VarPoll.f2981b, cl0VarPoll.f2982c);
                        }
                    }
                }

                private void sendAppLifecycleEvent(int i) {
/* 21 */            postMessage(FLUTTER_PLATFORM_CHANNEL_NAME, StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall("appLifecycleEvent", Integer.valueOf(i))), null);
                }

                private void updatePaused() {
                    i71 i71Var;
/* 3 */             if ((this.activityResumed && this.panelResumed) || (i71Var = this.lifecycle) == null) {
/* 18 */                return;
                    }
/* 15 */            i71Var.m4487e(t61.ON_PAUSE);
                }

                private void updateResumed() {
                    i71 i71Var;
/* 3 */             if (this.activityResumed && this.panelResumed && (i71Var = this.lifecycle) != null) {
/* 15 */                i71Var.m4487e(t61.ON_RESUME);
                    }
                }

                @Override // p000.g71
                public v61 getLifecycle() {
/* 1 */             return this.lifecycle;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
/* 11 */            if (activity.getClass().equals(this.activityClass)) {
/* 13 */                this.activity = activity;
/* 16 */                this.changingConfigurations = false;
/* 20 */                if (this.lifecycle == null) {
/* 24 */                    i71 i71Var = new i71(this);
/* 27 */                    this.lifecycle = i71Var;
/* 29 */                    i71Var.mo4483a(this);
                        }
/* 32 */                FlutterEngine flutterEngine = this.engine;
/* 34 */                if (flutterEngine != null) {
/* 49 */                    flutterEngine.getActivityControlSurface().attachToActivity(new qc3(activity, 27), this.lifecycle);
                        }
/* 56 */                this.lifecycle.m4487e(t61.ON_CREATE);
/* 73 */                activity.getWindow().getDecorView().post(new yk0(this, 3));
/* 76 */                applyPendingWindowState();
/* 80 */                sendAppLifecycleEvent(1);
/* 84 */                sendAppLifecycleEvent(2);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
/* 3 */             if (activity == this.activity) {
/* 9 */                 this.changingConfigurations = activity.isChangingConfigurations();
/* 11 */                i71 i71Var = this.lifecycle;
/* 14 */                if (i71Var != null) {
/* 18 */                    i71Var.m4487e(t61.ON_DESTROY);
/* 23 */                    this.lifecycle.mo4484b(this);
/* 26 */                    this.lifecycle = null;
                        }
/* 28 */                destroyPanel();
/* 33 */                if (this.changingConfigurations) {
/* 35 */                    FlutterEngine flutterEngine = this.engine;
/* 37 */                    if (flutterEngine != null) {
/* 43 */                        flutterEngine.getActivityControlSurface().detachFromActivityForConfigChanges();
                            }
                        } else {
/* 48 */                    this.destroyed = true;
/* 52 */                    this.application.unregisterActivityLifecycleCallbacks(this);
/* 57 */                    this.application.unregisterComponentCallbacks(this);
/* 60 */                    FlutterEngine flutterEngine2 = this.engine;
/* 62 */                    if (flutterEngine2 != null) {
/* 68 */                        flutterEngine2.getActivityControlSurface().detachFromActivity();
/* 73 */                        this.engine.destroy();
                            }
                            synchronized (this.pendingHandlers) {
/* 81 */                        this.pendingHandlers.clear();
                            }
                        }
/* 85 */                this.activity = null;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
/* 3 */             if (activity == this.activity) {
/* 6 */                 this.activityResumed = false;
/* 8 */                 updatePaused();
                    }
                }

                public void onActivityResult(int i, int i2, Intent intent) {
                    FlutterEngine flutterEngine;
/* 3 */             if (this.panel == null || (flutterEngine = this.engine) == null) {
/* 16 */                return;
                    }
/* 13 */            flutterEngine.getActivityControlSurface().onActivityResult(i, i2, intent);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
/* 3 */             if (activity == this.activity) {
/* 6 */                 this.activityResumed = true;
/* 8 */                 updateResumed();
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
/* 3 */             if (activity == this.activity) {
/* 5 */                 i71 i71Var = this.lifecycle;
/* 7 */                 if (i71Var != null) {
/* 11 */                    i71Var.m4487e(t61.ON_START);
                        }
/* 15 */                sendAppLifecycleEvent(2);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
/* 3 */             if (activity == this.activity) {
/* 5 */                 i71 i71Var = this.lifecycle;
/* 7 */                 if (i71Var != null) {
/* 11 */                    i71Var.m4487e(t61.ON_STOP);
                        }
/* 15 */                sendAppLifecycleEvent(3);
                    }
                }

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }

                public void onPanelPaused(Activity activity) {
/* 3 */             if (activity == this.activity) {
/* 6 */                 this.panelResumed = false;
/* 8 */                 updatePaused();
                    }
                }

                public void onPanelResumed(Activity activity) {
/* 3 */             if (activity == this.activity) {
/* 6 */                 this.panelResumed = true;
/* 8 */                 updateResumed();
                    }
                }

                public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                    FlutterEngine flutterEngine;
/* 3 */             if (this.panel == null || (flutterEngine = this.engine) == null) {
/* 16 */                return;
                    }
/* 13 */            flutterEngine.getActivityControlSurface().onRequestPermissionsResult(i, strArr, iArr);
                }

                @Override // p000.d71
                public void onStateChanged(g71 g71Var, t61 t61Var) {
/* 1 */             FlutterEngine flutterEngine = this.engine;
/* 3 */             if (flutterEngine == null) {
/* 29 */                return;
                    }
/* 12 */            int i = bl0.f2515a[t61Var.ordinal()];
/* 15 */            if (i == 1 || i == 2) {
/* 68 */                t61Var.toString();
/* 75 */                flutterEngine.getLifecycleChannel().appIsInactive();
/* 78 */                return;
                    }
/* 21 */            if (i == 3) {
/* 57 */                t61Var.toString();
/* 64 */                flutterEngine.getLifecycleChannel().appIsResumed();
                    } else if (i == 4) {
/* 46 */                t61Var.toString();
/* 53 */                flutterEngine.getLifecycleChannel().appIsPaused();
                    } else if (i == 5 && !this.changingConfigurations) {
/* 35 */                t61Var.toString();
/* 42 */                flutterEngine.getLifecycleChannel().appIsDetached();
                    }
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i) {
/* 1 */             FlutterEngine flutterEngine = this.engine;
/* 3 */             if (flutterEngine == null) {
/* 5 */                 return;
                    }
/* 8 */             if (i >= 10) {
/* 14 */                flutterEngine.getDartExecutor().notifyLowMemoryWarning();
/* 23 */                this.engine.getSystemChannel().sendMemoryPressureWarning();
                    }
/* 32 */            this.engine.getRenderer().onTrimMemory(i);
                }

                public void onUserLeaveHint() {
                    FlutterEngine flutterEngine;
/* 3 */             if (this.panel == null || (flutterEngine = this.engine) == null) {
/* 16 */                return;
                    }
/* 13 */            flutterEngine.getActivityControlSurface().onUserLeaveHint();
                }

                public void resetUserData() {
/* 3 */             this.userData = 0L;
                }

                public void sendMessage(String str, ByteBuffer byteBuffer, final long j) {
/* 6 */             postMessage(str, byteBuffer, new BinaryMessenger.BinaryReply() { // from class: zk0
                        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
                        public final void reply(ByteBuffer byteBuffer2) {
/* 1 */                     FlutterSupport.binaryChannelReply(byteBuffer2, j);
                        }
                    });
                }

                public void setMessageHandler(String str, long j) {
                    synchronized (this.pendingHandlers) {
/* 8 */                 Map<String, Long> map = this.pendingHandlers;
                        try {
/* 10 */                    if (j != 0) {
/* 16 */                        map.put(str, Long.valueOf(j));
                            } else {
/* 22 */                        map.remove(str);
                            }
                        } catch (Throwable th) {
/* 43 */                    throw th;
                        }
                    }
/* 26 */            Activity activity = this.activity;
/* 28 */            if (activity == null) {
/* 30 */                return;
                    }
/* 38 */            activity.runOnUiThread(new RunnableC1784j8(25, this, str));
                }

                public void setWindowVisibility(boolean z, float[] fArr) {
/* 1 */             Activity activity = this.activity;
/* 3 */             if (activity != null) {
/* 10 */                activity.runOnUiThread(new al0(this, fArr, z));
                    }
                }
            }
