            package io.flutter.plugin.mouse;

            import android.view.PointerIcon;
            import io.flutter.embedding.engine.systemchannels.MouseCursorChannel;
            import java.util.HashMap;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class MouseCursorPlugin {
                private static HashMap<String, Integer> systemCursorConstants;
                private final MouseCursorViewDelegate mView;
                private final MouseCursorChannel mouseCursorChannel;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface MouseCursorViewDelegate {
                    PointerIcon getSystemPointerIcon(int i);

                    void setPointerIcon(PointerIcon pointerIcon);
                }

                public MouseCursorPlugin(MouseCursorViewDelegate mouseCursorViewDelegate, MouseCursorChannel mouseCursorChannel) {
/* 4 */             this.mView = mouseCursorViewDelegate;
/* 6 */             this.mouseCursorChannel = mouseCursorChannel;
/* 13 */            mouseCursorChannel.setMethodHandler(new MouseCursorChannel.MouseCursorMethodHandler() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.1
                        @Override // io.flutter.embedding.engine.systemchannels.MouseCursorChannel.MouseCursorMethodHandler
                        public void activateSystemCursor(String str) {
/* 13 */                    MouseCursorPlugin.this.mView.setPointerIcon(MouseCursorPlugin.this.resolveSystemCursor(str));
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public PointerIcon resolveSystemCursor(String str) {
/* 3 */             if (systemCursorConstants == null) {
/* 10 */                systemCursorConstants = new HashMap<String, Integer>() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.2
                            private static final long serialVersionUID = 1;

                            {
/* 14 */                        put("alias", 1010);
/* 25 */                        put("allScroll", 1013);
/* 36 */                        put("basic", 1000);
/* 47 */                        put("cell", 1006);
/* 58 */                        put("click", 1002);
/* 69 */                        put("contextMenu", Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY));
/* 80 */                        put("copy", 1011);
/* 91 */                        put("forbidden", 1012);
/* 102 */                       put("grab", 1020);
/* 113 */                       put("grabbing", 1021);
/* 124 */                       put("help", 1003);
/* 129 */                       put("move", 1013);
/* 139 */                       put("none", 0);
/* 144 */                       put("noDrop", 1012);
/* 155 */                       put("precise", 1007);
/* 166 */                       put("text", 1008);
/* 177 */                       put("resizeColumn", 1014);
/* 188 */                       put("resizeDown", 1015);
/* 199 */                       put("resizeUpLeft", 1016);
/* 210 */                       put("resizeDownRight", 1017);
/* 215 */                       put("resizeLeft", 1014);
/* 220 */                       put("resizeLeftRight", 1014);
/* 225 */                       put("resizeRight", 1014);
/* 230 */                       put("resizeRow", 1015);
/* 235 */                       put("resizeUp", 1015);
/* 240 */                       put("resizeUpDown", 1015);
/* 243 */                       put("resizeUpLeft", 1017);
/* 248 */                       put("resizeUpRight", 1016);
/* 253 */                       put("resizeUpLeftDownRight", 1017);
/* 258 */                       put("resizeUpRightDownLeft", 1016);
/* 269 */                       put("verticalText", 1009);
/* 280 */                       put("wait", 1004);
/* 291 */                       put("zoomIn", 1018);
/* 302 */                       put("zoomOut", 1019);
                            }
                        };
                    }
/* 32 */            return this.mView.getSystemPointerIcon(systemCursorConstants.getOrDefault(str, 1000).intValue());
                }

                public void destroy() {
/* 4 */             this.mouseCursorChannel.setMethodHandler(null);
                }
            }
