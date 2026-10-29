            package io.flutter.plugin.platform;

            import android.app.Activity;
            import android.app.ActivityManager;
            import android.content.ClipData;
            import android.content.ClipDescription;
            import android.content.ClipboardManager;
            import android.content.Intent;
            import android.content.res.AssetFileDescriptor;
            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.os.Build;
            import android.view.View;
            import android.view.Window;
            import io.flutter.Log;
            import io.flutter.embedding.engine.systemchannels.PlatformChannel;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.util.List;
            import p000.n83;
            import p000.o83;
            import p000.p83;
            import p000.pg3;
            import p000.sk0;
            import p000.tp1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public class PlatformPlugin {
                public static final int DEFAULT_SYSTEM_UI = 1280;
                private static final String TAG = "PlatformPlugin";
                private final Activity activity;
                private PlatformChannel.SystemChromeStyle currentTheme;
                private int mEnabledOverlays;
                final PlatformChannel.PlatformMessageHandler mPlatformMessageHandler;
                private final PlatformChannel platformChannel;
                private final PlatformPluginDelegate platformPluginDelegate;

                /* JADX INFO: renamed from: io.flutter.plugin.platform.PlatformPlugin$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class ViewOnSystemUiVisibilityChangeListenerC11062 implements View.OnSystemUiVisibilityChangeListener {
                    final /* synthetic */ View val$decorView;

                    public ViewOnSystemUiVisibilityChangeListenerC11062(View view) {
/* 3 */                 this.val$decorView = view;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public /* synthetic */ void lambda$onSystemUiVisibilityChange$0(int i) {
/* 1 */                 int i2 = i & 4;
/* 3 */                 PlatformPlugin platformPlugin = PlatformPlugin.this;
/* 5 */                 if (i2 == 0) {
/* 12 */                    platformPlugin.platformChannel.systemChromeChanged(true);
                        } else {
/* 21 */                    platformPlugin.platformChannel.systemChromeChanged(false);
                        }
                    }

                    @Override // android.view.View.OnSystemUiVisibilityChangeListener
                    public void onSystemUiVisibilityChange(final int i) {
/* 8 */                 this.val$decorView.post(new Runnable() { // from class: io.flutter.plugin.platform.a
                            @Override // java.lang.Runnable
                            public final void run() {
/* 1 */                         this.f9767a.lambda$onSystemUiVisibilityChange$0(i);
                            }
                        });
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugin.platform.PlatformPlugin$3 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C11073 {

                    /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness */
                    static final /* synthetic */ int[] f9764xfa6fb21b;

                    /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType */
                    static final /* synthetic */ int[] f9765x98e77c60;

                    /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay */
                    static final /* synthetic */ int[] f9766x4c113a23;

                    static {
/* 6 */                 int[] iArr = new int[PlatformChannel.Brightness.values().length];
/* 8 */                 f9764xfa6fb21b = iArr;
                        try {
/* 17 */                    iArr[PlatformChannel.Brightness.DARK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    f9764xfa6fb21b[PlatformChannel.Brightness.LIGHT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
/* 35 */                int[] iArr2 = new int[PlatformChannel.SystemUiOverlay.values().length];
/* 37 */                f9766x4c113a23 = iArr2;
                        try {
/* 45 */                    iArr2[PlatformChannel.SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
/* 55 */                    f9766x4c113a23[PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
                        } catch (NoSuchFieldError unused4) {
                        }
/* 62 */                int[] iArr3 = new int[PlatformChannel.HapticFeedbackType.values().length];
/* 64 */                f9765x98e77c60 = iArr3;
                        try {
/* 72 */                    iArr3[PlatformChannel.HapticFeedbackType.STANDARD.ordinal()] = 1;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
/* 82 */                    f9765x98e77c60[PlatformChannel.HapticFeedbackType.LIGHT_IMPACT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
/* 93 */                    f9765x98e77c60[PlatformChannel.HapticFeedbackType.MEDIUM_IMPACT.ordinal()] = 3;
                        } catch (NoSuchFieldError unused7) {
                        }
                        try {
/* 104 */                   f9765x98e77c60[PlatformChannel.HapticFeedbackType.HEAVY_IMPACT.ordinal()] = 4;
                        } catch (NoSuchFieldError unused8) {
                        }
                        try {
/* 115 */                   f9765x98e77c60[PlatformChannel.HapticFeedbackType.SELECTION_CLICK.ordinal()] = 5;
                        } catch (NoSuchFieldError unused9) {
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface PlatformPluginDelegate {
                    boolean popSystemNavigator();

                    default void setFrameworkHandlesBack(boolean z) {
                    }
                }

                public PlatformPlugin(Activity activity, PlatformChannel platformChannel, PlatformPluginDelegate platformPluginDelegate) {
/* 6 */             PlatformChannel.PlatformMessageHandler platformMessageHandler = new PlatformChannel.PlatformMessageHandler() { // from class: io.flutter.plugin.platform.PlatformPlugin.1
                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public boolean clipboardHasStrings() {
/* 1 */                     return PlatformPlugin.this.clipboardHasStrings();
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
/* 1 */                     return PlatformPlugin.this.getClipboardData(clipboardContentFormat);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public void playSystemSound(PlatformChannel.SoundType soundType) {
/* 1 */                     PlatformPlugin.this.playSystemSound(soundType);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public void popSystemNavigator() {
/* 1 */                     PlatformPlugin.this.popSystemNavigator();
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public void restoreSystemUiOverlays() {
/* 1 */                     PlatformPlugin.this.restoreSystemChromeSystemUIOverlays();
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public void setApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
/* 1 */                     PlatformPlugin.this.setSystemChromeApplicationSwitcherDescription(appSwitcherDescription);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public void setClipboardData(String str) {
/* 1 */                     PlatformPlugin.this.setClipboardData(str);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public void setFrameworkHandlesBack(boolean z) {
/* 1 */                     PlatformPlugin.this.setFrameworkHandlesBack(z);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public void setPreferredOrientations(int i) {
/* 1 */                     PlatformPlugin.this.setSystemChromePreferredOrientations(i);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public void setSystemUiChangeListener() {
/* 1 */                     PlatformPlugin.this.setSystemChromeChangeListener();
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public void setSystemUiOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
/* 1 */                     PlatformPlugin.this.setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public void share(String str) {
/* 1 */                     PlatformPlugin.this.share(str);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public void showSystemOverlays(List<PlatformChannel.SystemUiOverlay> list) {
/* 1 */                     PlatformPlugin.this.setSystemChromeEnabledSystemUIOverlays(list);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public void showSystemUiMode(PlatformChannel.SystemUiMode systemUiMode) {
/* 1 */                     PlatformPlugin.this.setSystemChromeEnabledSystemUIMode(systemUiMode);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                        public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
/* 3 */                     PlatformPlugin.this.vibrateHapticFeedback(hapticFeedbackType);
                        }
                    };
/* 9 */             this.mPlatformMessageHandler = platformMessageHandler;
/* 11 */            this.activity = activity;
/* 13 */            this.platformChannel = platformChannel;
/* 15 */            platformChannel.setPlatformMessageHandler(platformMessageHandler);
/* 18 */            this.platformPluginDelegate = platformPluginDelegate;
/* 22 */            this.mEnabledOverlays = DEFAULT_SYSTEM_UI;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public boolean clipboardHasStrings() {
                    ClipDescription primaryClipDescription;
/* 9 */             ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService("clipboard");
/* 16 */            if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
/* 28 */                return primaryClipDescription.hasMimeType("text/*");
                    }
/* 15 */            return false;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
/* 13 */            ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService("clipboard");
/* 19 */            CharSequence charSequence = null;
/* 20 */            if (!clipboardManager.hasPrimaryClip()) {
/* 19 */                return null;
                    }
                    try {
                        try {
/* 23 */                    ClipData primaryClip = clipboardManager.getPrimaryClip();
/* 27 */                    if (primaryClip == null) {
/* 19 */                        return null;
                            }
/* 30 */                    if (clipboardContentFormat != null && clipboardContentFormat != PlatformChannel.ClipboardContentFormat.PLAIN_TEXT) {
/* 19 */                        return null;
                            }
/* 43 */                    ClipData.Item itemAt = primaryClip.getItemAt(0);
/* 47 */                    CharSequence text = itemAt.getText();
/* 51 */                    if (text != null) {
/* 130 */                       return text;
                            }
                            try {
/* 53 */                        Uri uri = itemAt.getUri();
/* 57 */                        if (uri == null) {
/* 61 */                            Log.m4591w(TAG, "Clipboard item contained no textual content nor a URI to retrieve it from.");
/* 19 */                            return null;
                                }
/* 68 */                        String scheme = uri.getScheme();
/* 78 */                        if (!scheme.equals("content")) {
/* 97 */                            Log.m4591w(TAG, "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
/* 19 */                            return null;
                                }
/* 109 */                       AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = this.activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
/* 115 */                       CharSequence charSequenceCoerceToText = itemAt.coerceToText(this.activity);
/* 119 */                       if (assetFileDescriptorOpenTypedAssetFileDescriptor == null) {
/* 129 */                           return charSequenceCoerceToText;
                                }
                                try {
/* 121 */                           assetFileDescriptorOpenTypedAssetFileDescriptor.close();
/* 124 */                           return charSequenceCoerceToText;
                                } catch (IOException e) {
/* 126 */                           charSequence = charSequenceCoerceToText;
/* 127 */                           e = e;
                                }
                            } catch (IOException e2) {
/* 65 */                        e = e2;
/* 66 */                        charSequence = text;
                            }
                        } catch (IOException e3) {
/* 38 */                    e = e3;
                        }
                    } catch (FileNotFoundException unused) {
/* 139 */               Log.m4591w(TAG, "Clipboard text was unable to be received from content URI.");
/* 19 */                return null;
                    } catch (SecurityException e4) {
/* 145 */               Log.m4592w(TAG, "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e4);
/* 19 */                return null;
                    }
/* 133 */           Log.m4592w(TAG, "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
/* 136 */           return charSequence;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void playSystemSound(PlatformChannel.SoundType soundType) {
/* 3 */             if (soundType == PlatformChannel.SoundType.CLICK) {
/* 16 */                this.activity.getWindow().getDecorView().playSoundEffect(0);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Multi-variable type inference failed */
                public void popSystemNavigator() {
/* 1 */             PlatformPluginDelegate platformPluginDelegate = this.platformPluginDelegate;
/* 3 */             if (platformPluginDelegate == null || !platformPluginDelegate.popSystemNavigator()) {
/* 12 */                Activity activity = this.activity;
/* 16 */                if (activity instanceof tp1) {
/* 24 */                    ((tp1) activity).getOnBackPressedDispatcher().m8602b();
                        } else {
/* 28 */                    activity.finish();
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void restoreSystemChromeSystemUIOverlays() {
/* 1 */             updateSystemUiOverlays();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setClipboardData(String str) {
/* 17 */            ((ClipboardManager) this.activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setFrameworkHandlesBack(boolean z) {
/* 1 */             PlatformPluginDelegate platformPluginDelegate = this.platformPluginDelegate;
/* 3 */             if (platformPluginDelegate != null) {
/* 5 */                 platformPluginDelegate.setFrameworkHandlesBack(z);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setSystemChromeApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
/* 5 */             if (Build.VERSION.SDK_INT < 28) {
/* 19 */                this.activity.setTaskDescription(new ActivityManager.TaskDescription(appSwitcherDescription.label, (Bitmap) null, appSwitcherDescription.color));
/* 22 */                return;
                    }
/* 35 */            this.activity.setTaskDescription(sk0.m8525c(appSwitcherDescription.color, appSwitcherDescription.label));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setSystemChromeChangeListener() {
/* 7 */             View decorView = this.activity.getWindow().getDecorView();
/* 16 */            decorView.setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC11062(decorView));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setSystemChromeEnabledSystemUIMode(PlatformChannel.SystemUiMode systemUiMode) {
                    int i;
/* 3 */             if (systemUiMode == PlatformChannel.SystemUiMode.LEAN_BACK) {
/* 5 */                 i = 1798;
                    } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE) {
/* 12 */                i = 3846;
                    } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE_STICKY) {
/* 19 */                i = 5894;
                    } else if (systemUiMode != PlatformChannel.SystemUiMode.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
/* 39 */                return;
                    } else {
/* 32 */                i = 1792;
                    }
/* 34 */            this.mEnabledOverlays = i;
/* 36 */            updateSystemUiOverlays();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setSystemChromeEnabledSystemUIOverlays(List<PlatformChannel.SystemUiOverlay> list) {
/* 10 */            int i = list.size() == 0 ? 5894 : 1798;
/* 17 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 31 */                int i3 = C11073.f9766x4c113a23[list.get(i2).ordinal()];
/* 34 */                if (i3 == 1) {
/* 43 */                    i &= -5;
                        } else if (i3 == 2) {
/* 40 */                    i &= -515;
                        }
                    }
/* 48 */            this.mEnabledOverlays = i;
/* 50 */            updateSystemUiOverlays();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setSystemChromePreferredOrientations(int i) {
/* 3 */             this.activity.setRequestedOrientation(i);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Deprecated
                public void setSystemChromeSystemUIOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
                    pg3 o83Var;
/* 3 */             Window window = this.activity.getWindow();
/* 7 */             window.getDecorView();
/* 10 */            int i = Build.VERSION.SDK_INT;
/* 16 */            if (i >= 30) {
/* 20 */                o83Var = new p83(window);
                    } else {
/* 34 */                o83Var = i >= 26 ? new o83(window) : new n83(window);
                    }
/* 37 */            int i2 = Build.VERSION.SDK_INT;
/* 39 */            if (i2 < 30) {
/* 43 */                window.addFlags(Integer.MIN_VALUE);
/* 48 */                window.clearFlags(201326592);
                    }
/* 51 */            PlatformChannel.Brightness brightness = systemChromeStyle.statusBarIconBrightness;
/* 56 */            if (brightness != null) {
/* 64 */                int i3 = C11073.f9764xfa6fb21b[brightness.ordinal()];
/* 66 */                if (i3 == 1) {
/* 75 */                    o83Var.mo6948y(true);
                        } else if (i3 == 2) {
/* 71 */                    o83Var.mo6948y(false);
                        }
                    }
/* 78 */            Integer num = systemChromeStyle.statusBarColor;
/* 80 */            if (num != null) {
/* 86 */                window.setStatusBarColor(num.intValue());
                    }
/* 89 */            Boolean bool = systemChromeStyle.systemStatusBarContrastEnforced;
/* 93 */            if (bool != null && i2 >= 29) {
/* 1 */                 window.setStatusBarContrastEnforced(bool.booleanValue());
                    }
/* 104 */           if (i2 >= 26) {
/* 106 */               PlatformChannel.Brightness brightness2 = systemChromeStyle.systemNavigationBarIconBrightness;
/* 108 */               if (brightness2 != null) {
/* 116 */                   int i4 = C11073.f9764xfa6fb21b[brightness2.ordinal()];
/* 118 */                   if (i4 == 1) {
/* 127 */                       o83Var.mo7113x(true);
                            } else if (i4 == 2) {
/* 123 */                       o83Var.mo7113x(false);
                            }
                        }
/* 130 */               Integer num2 = systemChromeStyle.systemNavigationBarColor;
/* 132 */               if (num2 != null) {
/* 138 */                   window.setNavigationBarColor(num2.intValue());
                        }
                    }
/* 141 */           Integer num3 = systemChromeStyle.systemNavigationBarDividerColor;
/* 143 */           if (num3 != null && i2 >= 28) {
/* 1 */                 window.setNavigationBarDividerColor(num3.intValue());
                    }
/* 156 */           Boolean bool2 = systemChromeStyle.systemNavigationBarContrastEnforced;
/* 158 */           if (bool2 != null && i2 >= 29) {
/* 1 */                 window.setNavigationBarContrastEnforced(bool2.booleanValue());
                    }
/* 169 */           this.currentTheme = systemChromeStyle;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void share(String str) {
/* 3 */             Intent intent = new Intent();
/* 8 */             intent.setAction("android.intent.action.SEND");
/* 13 */            intent.setType("text/plain");
/* 18 */            intent.putExtra("android.intent.extra.TEXT", str);
/* 28 */            this.activity.startActivity(Intent.createChooser(intent, null));
                }

                public void destroy() {
/* 4 */             this.platformChannel.setPlatformMessageHandler(null);
                }

                public void updateSystemUiOverlays() {
/* 13 */            this.activity.getWindow().getDecorView().setSystemUiVisibility(this.mEnabledOverlays);
/* 16 */            PlatformChannel.SystemChromeStyle systemChromeStyle = this.currentTheme;
/* 18 */            if (systemChromeStyle != null) {
/* 20 */                setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
                    }
                }

                public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
/* 7 */             View decorView = this.activity.getWindow().getDecorView();
/* 17 */            int i = C11073.f9765x98e77c60[hapticFeedbackType.ordinal()];
/* 20 */            if (i == 1) {
/* 53 */                decorView.performHapticFeedback(0);
/* 56 */                return;
                    }
/* 23 */            if (i == 2) {
/* 48 */                decorView.performHapticFeedback(1);
/* 51 */                return;
                    }
/* 26 */            if (i == 3) {
/* 44 */                decorView.performHapticFeedback(3);
                    } else if (i == 4) {
/* 40 */                decorView.performHapticFeedback(6);
                    } else {
/* 32 */                if (i != 5) {
/* 34 */                    return;
                        }
/* 35 */                decorView.performHapticFeedback(4);
                    }
                }

/* 24 */        public PlatformPlugin(Activity activity, PlatformChannel platformChannel) {
/* 25 */            this(activity, platformChannel, null);
                }
            }
