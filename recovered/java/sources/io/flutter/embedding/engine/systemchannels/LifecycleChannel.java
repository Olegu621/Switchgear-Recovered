            package io.flutter.embedding.engine.systemchannels;

            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.BasicMessageChannel;
            import io.flutter.plugin.common.StringCodec;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public class LifecycleChannel {
                private static final String CHANNEL_NAME = "flutter/lifecycle";
                private static final String TAG = "LifecycleChannel";
                private final BasicMessageChannel<String> channel;
                private AppLifecycleState lastAndroidState;
                private AppLifecycleState lastFlutterState;
                private boolean lastFocus;

                /* JADX INFO: renamed from: io.flutter.embedding.engine.systemchannels.LifecycleChannel$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C10741 {

                    /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$LifecycleChannel$AppLifecycleState */
                    static final /* synthetic */ int[] f9757xddedd993;

                    static {
/* 6 */                 int[] iArr = new int[AppLifecycleState.values().length];
/* 8 */                 f9757xddedd993 = iArr;
                        try {
/* 17 */                    iArr[AppLifecycleState.RESUMED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    f9757xddedd993[AppLifecycleState.INACTIVE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    f9757xddedd993[AppLifecycleState.HIDDEN.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
/* 50 */                    f9757xddedd993[AppLifecycleState.PAUSED.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
/* 61 */                    f9757xddedd993[AppLifecycleState.DETACHED.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum AppLifecycleState {
                    DETACHED,
                    RESUMED,
                    INACTIVE,
                    HIDDEN,
                    PAUSED
                }

                public LifecycleChannel(BasicMessageChannel<String> basicMessageChannel) {
/* 5 */             this.lastAndroidState = null;
/* 7 */             this.lastFlutterState = null;
/* 10 */            this.lastFocus = true;
/* 12 */            this.channel = basicMessageChannel;
                }

                private void sendState(AppLifecycleState appLifecycleState, boolean z) {
                    AppLifecycleState appLifecycleState2;
/* 1 */             AppLifecycleState appLifecycleState3 = this.lastAndroidState;
/* 3 */             if (appLifecycleState3 == appLifecycleState && z == this.lastFocus) {
/* 59 */                return;
                    }
/* 10 */            if (appLifecycleState == null && appLifecycleState3 == null) {
/* 14 */                this.lastFocus = z;
/* 16 */                return;
                    }
/* 23 */            int i = C10741.f9757xddedd993[appLifecycleState.ordinal()];
/* 26 */            if (i != 1) {
/* 42 */                appLifecycleState2 = (i == 2 || i == 3 || i == 4 || i == 5) ? appLifecycleState : null;
                    } else {
/* 49 */                appLifecycleState2 = z ? AppLifecycleState.RESUMED : AppLifecycleState.INACTIVE;
                    }
/* 51 */            this.lastAndroidState = appLifecycleState;
/* 53 */            this.lastFocus = z;
/* 57 */            if (appLifecycleState2 == this.lastFlutterState) {
/* 59 */                return;
                    }
/* 80 */            String str = "AppLifecycleState." + appLifecycleState2.name().toLowerCase(Locale.ROOT);
/* 105 */           Log.m4589v(TAG, "Sending " + str + " message.");
/* 110 */           this.channel.send(str);
/* 113 */           this.lastFlutterState = appLifecycleState2;
                }

                public void aWindowIsFocused() {
/* 4 */             sendState(this.lastAndroidState, true);
                }

                public void appIsDetached() {
/* 5 */             sendState(AppLifecycleState.DETACHED, this.lastFocus);
                }

                public void appIsInactive() {
/* 5 */             sendState(AppLifecycleState.INACTIVE, this.lastFocus);
                }

                public void appIsPaused() {
/* 5 */             sendState(AppLifecycleState.PAUSED, this.lastFocus);
                }

                public void appIsResumed() {
/* 5 */             sendState(AppLifecycleState.RESUMED, this.lastFocus);
                }

                public void noWindowsAreFocused() {
/* 4 */             sendState(this.lastAndroidState, false);
                }

/* 14 */        public LifecycleChannel(DartExecutor dartExecutor) {
/* 15 */            this((BasicMessageChannel<String>) new BasicMessageChannel(dartExecutor, CHANNEL_NAME, StringCodec.INSTANCE));
                }
            }
