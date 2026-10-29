            package p000;

            import com.supercell.p007id.FlutterPanelPlatformPlugin;
            import io.flutter.embedding.engine.systemchannels.PlatformChannel;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vk0 implements PlatformChannel.PlatformMessageHandler {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ FlutterPanelPlatformPlugin f18230a;

                public vk0(FlutterPanelPlatformPlugin flutterPanelPlatformPlugin) {
/* 4 */             this.f18230a = flutterPanelPlatformPlugin;
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final boolean clipboardHasStrings() {
/* 1 */             return this.f18230a.clipboardHasStrings();
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
/* 1 */             return this.f18230a.getClipboardData(clipboardContentFormat);
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final void playSystemSound(PlatformChannel.SoundType soundType) {
/* 1 */             this.f18230a.playSystemSound(soundType);
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final void popSystemNavigator() {
/* 1 */             this.f18230a.popSystemNavigator();
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final void restoreSystemUiOverlays() {
/* 1 */             this.f18230a.restoreSystemChromeSystemUIOverlays();
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final void setApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
/* 1 */             this.f18230a.setSystemChromeApplicationSwitcherDescription(appSwitcherDescription);
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final void setClipboardData(String str) {
/* 1 */             this.f18230a.setClipboardData(str);
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final void setPreferredOrientations(int i) {
/* 1 */             this.f18230a.setSystemChromePreferredOrientations(i);
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final void setSystemUiChangeListener() {
/* 1 */             this.f18230a.setSystemChromeChangeListener();
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final void setSystemUiOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
/* 1 */             this.f18230a.setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final void share(String str) {
/* 1 */             this.f18230a.share(str);
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final void showSystemOverlays(List list) {
/* 1 */             this.f18230a.setSystemChromeEnabledSystemUIOverlays(list);
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final void showSystemUiMode(PlatformChannel.SystemUiMode systemUiMode) {
/* 1 */             this.f18230a.setSystemChromeEnabledSystemUIMode(systemUiMode);
                }

                @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
                public final void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
/* 3 */             this.f18230a.vibrateHapticFeedback(hapticFeedbackType);
                }
            }
