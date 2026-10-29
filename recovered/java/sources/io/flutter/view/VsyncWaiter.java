            package io.flutter.view;

            import android.hardware.display.DisplayManager;
            import android.view.Choreographer;
            import io.flutter.embedding.engine.FlutterJNI;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 66 */    public class VsyncWaiter {
                private static VsyncWaiter instance;
                private static DisplayListener listener;
                private FlutterJNI flutterJNI;
                private long refreshPeriodNanos = -1;
                private FrameCallback frameCallback = new FrameCallback(0);
                private final FlutterJNI.AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = new FlutterJNI.AsyncWaitForVsyncDelegate() { // from class: io.flutter.view.VsyncWaiter.1
                    private Choreographer.FrameCallback obtainFrameCallback(long j) {
/* 1 */                 FrameCallback frameCallback = VsyncWaiter.this.frameCallback;
/* 7 */                 VsyncWaiter vsyncWaiter = VsyncWaiter.this;
/* 9 */                 if (frameCallback == null) {
/* 33 */                    return vsyncWaiter.new FrameCallback(j);
                        }
/* 1 */                 vsyncWaiter.frameCallback.cookie = j;
/* 1 */                 FrameCallback frameCallback2 = VsyncWaiter.this.frameCallback;
/* 1 */                 VsyncWaiter.this.frameCallback = null;
/* 30 */                return frameCallback2;
                    }

                    @Override // io.flutter.embedding.engine.FlutterJNI.AsyncWaitForVsyncDelegate
                    public void asyncWaitForVsync(long j) {
/* 9 */                 Choreographer.getInstance().postFrameCallback(obtainFrameCallback(j));
                    }
                };

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class DisplayListener implements DisplayManager.DisplayListener {
                    private DisplayManager displayManager;

                    public DisplayListener(DisplayManager displayManager) {
/* 6 */                 this.displayManager = displayManager;
                    }

                    @Override // android.hardware.display.DisplayManager.DisplayListener
                    public void onDisplayAdded(int i) {
                    }

                    @Override // android.hardware.display.DisplayManager.DisplayListener
                    public void onDisplayChanged(int i) {
/* 1 */                 if (i == 0) {
/* 10 */                    float refreshRate = this.displayManager.getDisplay(0).getRefreshRate();
/* 1 */                     VsyncWaiter.this.refreshPeriodNanos = (long) (1.0E9d / ((double) refreshRate));
/* 33 */                    VsyncWaiter.this.flutterJNI.setRefreshRateFPS(refreshRate);
                        }
                    }

                    @Override // android.hardware.display.DisplayManager.DisplayListener
                    public void onDisplayRemoved(int i) {
                    }

                    public void register() {
/* 4 */                 this.displayManager.registerDisplayListener(this, null);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class FrameCallback implements Choreographer.FrameCallback {
                    private long cookie;

                    public FrameCallback(long j) {
/* 6 */                 this.cookie = j;
                    }

                    @Override // android.view.Choreographer.FrameCallback
                    public void doFrame(long j) {
/* 5 */                 long jNanoTime = System.nanoTime() - j;
/* 29 */                VsyncWaiter.this.flutterJNI.onVsync(jNanoTime < 0 ? 0L : jNanoTime, VsyncWaiter.this.refreshPeriodNanos, this.cookie);
/* 1 */                 VsyncWaiter.this.frameCallback = this;
                    }
                }

                private VsyncWaiter(FlutterJNI flutterJNI) {
/* 24 */            this.flutterJNI = flutterJNI;
                }

                public static VsyncWaiter getInstance(DisplayManager displayManager, FlutterJNI flutterJNI) {
/* 3 */             if (instance == null) {
/* 10 */                instance = new VsyncWaiter(flutterJNI);
                    }
/* 14 */            if (listener == null) {
/* 18 */                VsyncWaiter vsyncWaiter = instance;
/* 20 */                Objects.requireNonNull(vsyncWaiter);
/* 23 */                DisplayListener displayListener = vsyncWaiter.new DisplayListener(displayManager);
/* 26 */                listener = displayListener;
/* 28 */                displayListener.register();
                    }
/* 39 */            if (instance.refreshPeriodNanos == -1) {
/* 46 */                float refreshRate = displayManager.getDisplay(0).getRefreshRate();
/* 60 */                instance.refreshPeriodNanos = (long) (1.0E9d / ((double) refreshRate));
/* 62 */                flutterJNI.setRefreshRateFPS(refreshRate);
                    }
/* 65 */            return instance;
                }

                public static void reset() {
/* 2 */             instance = null;
/* 4 */             listener = null;
                }

                public void init() {
/* 5 */             this.flutterJNI.setAsyncWaitForVsyncDelegate(this.asyncWaitForVsyncDelegate);
                }

/* 67 */        public static VsyncWaiter getInstance(float f, FlutterJNI flutterJNI) {
/* 68 */            if (instance == null) {
/* 69 */                instance = new VsyncWaiter(flutterJNI);
                    }
/* 70 */            flutterJNI.setRefreshRateFPS(f);
/* 71 */            VsyncWaiter vsyncWaiter = instance;
                    vsyncWaiter.refreshPeriodNanos = (long) (1.0E9d / ((double) f));
                    return vsyncWaiter;
                }
            }
