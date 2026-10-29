            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.text.TextUtils;
            import android.webkit.WebView;
            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PluginScriptsUtil;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import okhttp3.HttpUrl;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            import p000.xe2;
            import p000.y63;
            import p000.y72;
            import p000.z72;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class UserContentController implements Disposable {
                private static final String CONTENT_WORLDS_GENERATOR_JS_SOURCE = "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var contentWorldNames = [$IN_APP_WEBVIEW_CONTENT_WORLD_NAME_ARRAY];    for (var contentWorldName of contentWorldNames) {      var iframeId = 'flutter_inappwebview_' + contentWorldName;      var iframe = document.getElementById(iframeId);      if (iframe == null) {        iframe = document.createElement('iframe');        iframe.id = iframeId;        iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';        document.body.append(iframe);      }      if (iframe.contentWindow.document.getElementById('flutter_inappwebview_plugin_scripts') == null) {        var script = iframe.contentWindow.document.createElement('script');        script.id = 'flutter_inappwebview_plugin_scripts';        script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;        iframe.contentWindow.document.body.append(script);      }    }    clearInterval(interval);  });})();";
                private static final String CONTENT_WORLD_WRAPPER_JS_SOURCE = "(function() {  var interval = setInterval(function() {    if (document.body == null) {return;}    var iframeId = 'flutter_inappwebview_$IN_APP_WEBVIEW_CONTENT_WORLD_NAME';    var iframe = document.getElementById(iframeId);    if (iframe == null) {      iframe = document.createElement('iframe');      iframe.id = iframeId;      iframe.style = 'display: none; z-index: 0; position: absolute; width: 0px; height: 0px';      document.body.append(iframe);    }    if (iframe.contentWindow.document.querySelector('#flutter_inappwebview_plugin_scripts') == null) {      return;    }    var script = iframe.contentWindow.document.createElement('script');    script.innerHTML = $IN_APP_WEBVIEW_JSON_SOURCE_ENCODED;    iframe.contentWindow.document.body.append(script);    clearInterval(interval);  });})();";
                private static final String DOCUMENT_READY_WRAPPER_JS_SOURCE = "if (document.readyState === 'interactive' || document.readyState === 'complete') {   $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
                protected static final String LOG_TAG = "UserContentController";
                private static final String USER_SCRIPTS_AT_DOCUMENT_END_WRAPPER_JS_SOURCE = "if (window.flutter_inappwebview != null && (window.flutter_inappwebview._userScriptsAtDocumentEndLoaded == null || !window.flutter_inappwebview._userScriptsAtDocumentEndLoaded)) {  window.flutter_inappwebview._userScriptsAtDocumentEndLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
                private static final String USER_SCRIPTS_AT_DOCUMENT_START_WRAPPER_JS_SOURCE = "if (window.flutter_inappwebview != null && (window.flutter_inappwebview._userScriptsAtDocumentStartLoaded == null || !window.flutter_inappwebview._userScriptsAtDocumentStartLoaded)) {  window.flutter_inappwebview._userScriptsAtDocumentStartLoaded = true;  $IN_APP_WEBVIEW_PLACEHOLDER_VALUE}";
                private y72 contentWorldsCreatorScript;
                public WebView webView;
                private final Set<ContentWorld> contentWorlds = new HashSet<ContentWorld>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController.1
                    {
/* 8 */                 add(ContentWorld.PAGE);
                    }
                };
                private final Map<UserScript, y72> scriptHandlerMap = new HashMap();
                private final Map<UserScriptInjectionTime, LinkedHashSet<UserScript>> userOnlyScripts = new HashMap<UserScriptInjectionTime, LinkedHashSet<UserScript>>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController.2
                    {
/* 13 */                put(UserScriptInjectionTime.AT_DOCUMENT_START, new LinkedHashSet());
/* 23 */                put(UserScriptInjectionTime.AT_DOCUMENT_END, new LinkedHashSet());
                    }
                };
                private final Map<UserScriptInjectionTime, LinkedHashSet<PluginScript>> pluginScripts = new HashMap<UserScriptInjectionTime, LinkedHashSet<PluginScript>>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController.3
                    {
/* 13 */                put(UserScriptInjectionTime.AT_DOCUMENT_START, new LinkedHashSet());
/* 23 */                put(UserScriptInjectionTime.AT_DOCUMENT_END, new LinkedHashSet());
                    }
                };

                public UserContentController(WebView webView) {
/* 32 */            this.webView = webView;
                }

                public static String escapeCode(String str) {
/* 1 */             return JSONObject.quote(str);
                }

                public static String escapeContentWorldName(String str) {
/* 5 */             return str.replaceAll("'", "\\\\'");
                }

                private void updateContentWorldsCreatorScript() {
                    WebView webView;
/* 1 */             String strGenerateContentWorldsCreatorCode = generateContentWorldsCreatorCode();
/* 11 */            if (xe2.m9786x("DOCUMENT_START_SCRIPT")) {
/* 13 */                y72 y72Var = this.contentWorldsCreatorScript;
/* 15 */                if (y72Var != null) {
/* 19 */                    ((z72) y72Var).m10285a();
                        }
/* 26 */                if (strGenerateContentWorldsCreatorCode.isEmpty() || (webView = this.webView) == null) {
/* 43 */                    return;
                        }
/* 41 */                this.contentWorldsCreatorScript = y63.m10116a(webView, strGenerateContentWorldsCreatorCode, new HashSet<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController.4
                            {
/* 8 */                         add("*");
                            }
                        });
                    }
                }

                public boolean addPluginScript(PluginScript pluginScript) {
/* 1 */             ContentWorld contentWorld = pluginScript.getContentWorld();
/* 5 */             if (contentWorld != null) {
/* 9 */                 this.contentWorlds.add(contentWorld);
                    }
/* 12 */            updateContentWorldsCreatorScript();
/* 17 */            if (this.webView != null && pluginScript.getInjectionTime() == UserScriptInjectionTime.AT_DOCUMENT_START && xe2.m9786x("DOCUMENT_START_SCRIPT")) {
/* 59 */                this.scriptHandlerMap.put(pluginScript, y63.m10116a(this.webView, wrapSourceCodeInContentWorld(pluginScript.getContentWorld(), pluginScript.getSource()), pluginScript.getAllowedOriginRules()));
                    }
/* 74 */            return this.pluginScripts.get(pluginScript.getInjectionTime()).add(pluginScript);
                }

                public void addPluginScripts(List<PluginScript> list) {
/* 1 */             Iterator<PluginScript> it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 17 */                addPluginScript(it.next());
                    }
                }

                public boolean addUserOnlyScript(UserScript userScript) {
/* 1 */             ContentWorld contentWorld = userScript.getContentWorld();
/* 5 */             if (contentWorld != null) {
/* 9 */                 this.contentWorlds.add(contentWorld);
                    }
/* 12 */            updateContentWorldsCreatorScript();
/* 17 */            if (this.webView != null && userScript.getInjectionTime() == UserScriptInjectionTime.AT_DOCUMENT_START && xe2.m9786x("DOCUMENT_START_SCRIPT")) {
/* 59 */                this.scriptHandlerMap.put(userScript, y63.m10116a(this.webView, wrapSourceCodeInContentWorld(userScript.getContentWorld(), userScript.getSource()), userScript.getAllowedOriginRules()));
                    }
/* 74 */            return this.userOnlyScripts.get(userScript.getInjectionTime()).add(userScript);
                }

                public void addUserOnlyScripts(List<UserScript> list) {
/* 1 */             Iterator<UserScript> it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 17 */                addUserOnlyScript(it.next());
                    }
                }

                public boolean containsPluginScript(PluginScript pluginScript) {
/* 5 */             return getPluginScriptAsList().contains(pluginScript);
                }

                public boolean containsPluginScriptByGroupName(String str) {
/* 5 */             Iterator<PluginScript> it = getPluginScriptAsList().iterator();
/* 13 */            while (it.hasNext()) {
/* 29 */                if (Util.objEquals(str, it.next().getGroupName())) {
/* 31 */                    return true;
                        }
                    }
/* 33 */            return false;
                }

                public boolean containsUserOnlyScript(UserScript userScript) {
/* 5 */             return getUserOnlyScriptAsList().contains(userScript);
                }

                public boolean containsUserOnlyScriptByGroupName(String str) {
/* 5 */             Iterator<UserScript> it = getUserOnlyScriptAsList().iterator();
/* 13 */            while (it.hasNext()) {
/* 29 */                if (Util.objEquals(str, it.next().getGroupName())) {
/* 31 */                    return true;
                        }
                    }
/* 33 */            return false;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
                    y72 y72Var;
/* 7 */             if (xe2.m9786x("DOCUMENT_START_SCRIPT") && (y72Var = this.contentWorldsCreatorScript) != null) {
/* 15 */                ((z72) y72Var).m10285a();
                    }
/* 18 */            removeAllUserOnlyScripts();
/* 21 */            removeAllPluginScripts();
/* 25 */            this.webView = null;
                }

                public String generateCodeForDocumentStart() {
/* 1 */             UserScriptInjectionTime userScriptInjectionTime = UserScriptInjectionTime.AT_DOCUMENT_START;
/* 21 */            StringBuilder sbM3512p = AbstractC0886en.m3512p(HttpUrl.FRAGMENT_ENCODE_SET + generatePluginScriptsCodeAt(userScriptInjectionTime));
/* 29 */            sbM3512p.append(generateContentWorldsCreatorCode());
/* 36 */            StringBuilder sbM3512p2 = AbstractC0886en.m3512p(sbM3512p.toString());
/* 44 */            sbM3512p2.append(generateUserOnlyScriptsCodeAt(userScriptInjectionTime));
/* 55 */            return USER_SCRIPTS_AT_DOCUMENT_START_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, sbM3512p2.toString());
                }

                public String generateCodeForScriptEvaluation(String str, ContentWorld contentWorld) {
/* 1 */             if (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) {
/* 129 */               return str;
                    }
/* 13 */            StringBuilder sb = new StringBuilder();
/* 22 */            if (!this.contentWorlds.contains(contentWorld)) {
/* 26 */                this.contentWorlds.add(contentWorld);
/* 31 */                StringBuilder sb2 = new StringBuilder();
/* 38 */                Iterator<PluginScript> it = getPluginScriptsRequiredInAllContentWorlds().iterator();
/* 46 */                while (it.hasNext()) {
/* 58 */                    sb2.append(it.next().getSource());
                        }
/* 109 */               sb.append(CONTENT_WORLDS_GENERATOR_JS_SOURCE.replace(PluginScriptsUtil.VAR_CONTENT_WORLD_NAME_ARRAY, "'" + escapeContentWorldName(contentWorld.getName()) + "'").replace(PluginScriptsUtil.VAR_JSON_SOURCE_ENCODED, escapeCode(sb2.toString())));
/* 114 */               sb.append(";");
                    }
/* 121 */           sb.append(wrapSourceCodeInContentWorld(contentWorld, str));
/* 124 */           return sb.toString();
                }

                public String generateContentWorldsCreatorCode() {
/* 8 */             if (this.contentWorlds.size() == 1) {
/* 10 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 15 */            StringBuilder sb = new StringBuilder();
/* 22 */            Iterator<PluginScript> it = getPluginScriptsRequiredInAllContentWorlds().iterator();
/* 30 */            while (it.hasNext()) {
/* 42 */                sb.append(it.next().getSource());
                    }
/* 48 */            ArrayList arrayList = new ArrayList();
/* 61 */            for (ContentWorld contentWorld : this.contentWorlds) {
/* 75 */                if (!contentWorld.equals(ContentWorld.PAGE)) {
/* 103 */                   arrayList.add("'" + escapeContentWorldName(contentWorld.getName()) + "'");
                        }
                    }
/* 131 */           return CONTENT_WORLDS_GENERATOR_JS_SOURCE.replace(PluginScriptsUtil.VAR_CONTENT_WORLD_NAME_ARRAY, TextUtils.join(", ", arrayList)).replace(PluginScriptsUtil.VAR_JSON_SOURCE_ENCODED, escapeCode(sb.toString()));
                }

                public String generatePluginScriptsCodeAt(UserScriptInjectionTime userScriptInjectionTime) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 18 */            for (PluginScript pluginScript : getPluginScriptsAt(userScriptInjectionTime)) {
/* 52 */                sb.append(wrapSourceCodeInContentWorld(pluginScript.getContentWorld(), ";" + pluginScript.getSource()));
                    }
/* 56 */            return sb.toString();
                }

                public String generateUserOnlyScriptsCodeAt(UserScriptInjectionTime userScriptInjectionTime) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 18 */            for (UserScript userScript : getUserOnlyScriptsAt(userScriptInjectionTime)) {
/* 52 */                sb.append(wrapSourceCodeInContentWorld(userScript.getContentWorld(), ";" + userScript.getSource()));
                    }
/* 56 */            return sb.toString();
                }

                public String generateWrappedCodeForDocumentEnd() {
/* 1 */             UserScriptInjectionTime userScriptInjectionTime = UserScriptInjectionTime.AT_DOCUMENT_END;
/* 5 */             boolean zM9786x = xe2.m9786x("DOCUMENT_START_SCRIPT");
/* 9 */             String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 11 */            if (!zM9786x) {
/* 25 */                str = HttpUrl.FRAGMENT_ENCODE_SET + generateCodeForDocumentStart();
                    }
/* 29 */            StringBuilder sbM3512p = AbstractC0886en.m3512p(str);
/* 37 */            sbM3512p.append(generatePluginScriptsCodeAt(userScriptInjectionTime));
/* 44 */            StringBuilder sbM3512p2 = AbstractC0886en.m3512p(sbM3512p.toString());
/* 52 */            sbM3512p2.append(generateUserOnlyScriptsCodeAt(userScriptInjectionTime));
/* 63 */            return USER_SCRIPTS_AT_DOCUMENT_END_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, sbM3512p2.toString());
                }

                public String generateWrappedCodeForDocumentStart() {
/* 9 */             return Util.replaceAll(DOCUMENT_READY_WRAPPER_JS_SOURCE, PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, generateCodeForDocumentStart());
                }

                public LinkedHashSet<ContentWorld> getContentWorlds() {
/* 5 */             return new LinkedHashSet<>(this.contentWorlds);
                }

                public LinkedHashSet<PluginScript> getPluginScriptAsList() {
/* 3 */             LinkedHashSet<PluginScript> linkedHashSet = new LinkedHashSet<>();
/* 12 */            Iterator<LinkedHashSet<PluginScript>> it = this.pluginScripts.values().iterator();
/* 20 */            while (it.hasNext()) {
/* 28 */                linkedHashSet.addAll(it.next());
                    }
/* 32 */            return linkedHashSet;
                }

                public LinkedHashSet<PluginScript> getPluginScriptsAt(UserScriptInjectionTime userScriptInjectionTime) {
/* 11 */            return new LinkedHashSet<>(this.pluginScripts.get(userScriptInjectionTime));
                }

                public LinkedHashSet<PluginScript> getPluginScriptsRequiredInAllContentWorlds() {
/* 3 */             LinkedHashSet<PluginScript> linkedHashSet = new LinkedHashSet<>();
/* 20 */            for (PluginScript pluginScript : getPluginScriptsAt(UserScriptInjectionTime.AT_DOCUMENT_START)) {
/* 32 */                if (pluginScript.isRequiredInAllContentWorlds()) {
/* 34 */                    linkedHashSet.add(pluginScript);
                        }
                    }
/* 38 */            return linkedHashSet;
                }

                public LinkedHashSet<UserScript> getUserOnlyScriptAsList() {
/* 3 */             LinkedHashSet<UserScript> linkedHashSet = new LinkedHashSet<>();
/* 12 */            Iterator<LinkedHashSet<UserScript>> it = this.userOnlyScripts.values().iterator();
/* 20 */            while (it.hasNext()) {
/* 28 */                linkedHashSet.addAll(it.next());
                    }
/* 32 */            return linkedHashSet;
                }

                public LinkedHashSet<UserScript> getUserOnlyScriptsAt(UserScriptInjectionTime userScriptInjectionTime) {
/* 11 */            return new LinkedHashSet<>(this.userOnlyScripts.get(userScriptInjectionTime));
                }

                public void removeAllPluginScripts() {
/* 7 */             if (xe2.m9786x("DOCUMENT_START_SCRIPT")) {
/* 27 */                for (PluginScript pluginScript : this.pluginScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START)) {
/* 37 */                    y72 y72Var = this.scriptHandlerMap.get(pluginScript);
/* 43 */                    if (y72Var != null) {
/* 47 */                        ((z72) y72Var).m10285a();
/* 52 */                        this.scriptHandlerMap.remove(pluginScript);
                            }
                        }
                    }
/* 66 */            this.pluginScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START).clear();
/* 79 */            this.pluginScripts.get(UserScriptInjectionTime.AT_DOCUMENT_END).clear();
                }

                public void removeAllUserOnlyScripts() {
/* 7 */             if (xe2.m9786x("DOCUMENT_START_SCRIPT")) {
/* 27 */                for (UserScript userScript : this.userOnlyScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START)) {
/* 37 */                    y72 y72Var = this.scriptHandlerMap.get(userScript);
/* 43 */                    if (y72Var != null) {
/* 47 */                        ((z72) y72Var).m10285a();
/* 52 */                        this.scriptHandlerMap.remove(userScript);
                            }
                        }
                    }
/* 66 */            this.userOnlyScripts.get(UserScriptInjectionTime.AT_DOCUMENT_START).clear();
/* 79 */            this.userOnlyScripts.get(UserScriptInjectionTime.AT_DOCUMENT_END).clear();
                }

                public boolean removePluginScript(PluginScript pluginScript) {
/* 7 */             if (xe2.m9786x("DOCUMENT_START_SCRIPT")) {
/* 11 */                y72 y72Var = this.scriptHandlerMap.get(pluginScript);
/* 17 */                if (y72Var != null) {
/* 21 */                    ((z72) y72Var).m10285a();
/* 26 */                    this.scriptHandlerMap.remove(pluginScript);
                        }
/* 29 */                updateContentWorldsCreatorScript();
                    }
/* 44 */            return this.pluginScripts.get(pluginScript.getInjectionTime()).remove(pluginScript);
                }

                public void removePluginScriptsByGroupName(String str) {
/* 13 */            for (PluginScript pluginScript : getPluginScriptAsList()) {
/* 29 */                if (Util.objEquals(str, pluginScript.getGroupName())) {
/* 31 */                    removePluginScript(pluginScript);
                        }
                    }
                }

                public boolean removeUserOnlyScript(UserScript userScript) {
/* 7 */             if (xe2.m9786x("DOCUMENT_START_SCRIPT")) {
/* 11 */                y72 y72Var = this.scriptHandlerMap.get(userScript);
/* 17 */                if (y72Var != null) {
/* 21 */                    ((z72) y72Var).m10285a();
/* 26 */                    this.scriptHandlerMap.remove(userScript);
                        }
/* 29 */                updateContentWorldsCreatorScript();
                    }
/* 44 */            return this.userOnlyScripts.get(userScript.getInjectionTime()).remove(userScript);
                }

                public boolean removeUserOnlyScriptAt(int i, UserScriptInjectionTime userScriptInjectionTime) {
/* 20 */            return removeUserOnlyScript((UserScript) new ArrayList(this.userOnlyScripts.get(userScriptInjectionTime)).get(i));
                }

                public void removeUserOnlyScriptsByGroupName(String str) {
/* 13 */            for (UserScript userScript : getUserOnlyScriptAsList()) {
/* 29 */                if (Util.objEquals(str, userScript.getGroupName())) {
/* 31 */                    removeUserOnlyScript(userScript);
                        }
                    }
                }

                public void resetContentWorlds() {
/* 3 */             this.contentWorlds.clear();
/* 10 */            this.contentWorlds.add(ContentWorld.PAGE);
/* 17 */            Iterator<PluginScript> it = getPluginScriptAsList().iterator();
/* 25 */            while (it.hasNext()) {
/* 39 */                this.contentWorlds.add(it.next().getContentWorld());
                    }
/* 47 */            Iterator<UserScript> it2 = getUserOnlyScriptAsList().iterator();
/* 55 */            while (it2.hasNext()) {
/* 69 */                this.contentWorlds.add(it2.next().getContentWorld());
                    }
                }

                public String wrapSourceCodeInContentWorld(ContentWorld contentWorld, String str) {
                    return (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) ? str : CONTENT_WORLD_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_CONTENT_WORLD_NAME, escapeContentWorldName(contentWorld.getName())).replace(PluginScriptsUtil.VAR_JSON_SOURCE_ENCODED, escapeCode(str));
                }
            }
