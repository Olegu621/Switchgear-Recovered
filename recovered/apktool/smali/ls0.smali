.class public Lls0;
.super Landroidx/fragment/app/Fragment;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lct0;


# instance fields
.field public U:Ljava/lang/String;

.field public V:Z

.field public W:Ljava/lang/String;

.field public X:Z

.field public final Y:Lo2;

.field public a:Landroid/webkit/ValueCallback;

.field public b:Z

.field public c:Lcom/helpshift/views/HSWebView;

.field public d:Lns0;

.field public e:Landroid/widget/LinearLayout;

.field public f:Landroid/view/View;

.field public i:Landroid/view/View;

.field public v:Leq2;

.field public w:Lcom/helpshift/activities/HSMainActivity;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lls0;->b:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lls0;->V:Z

    .line 9
    .line 10
    new-instance v0, Lo2;

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    invoke-direct {v0, p0, v1}, Lo2;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lls0;->Y:Lo2;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const-string v0, "online"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lls0;->i(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    const-string v0, "offline"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lls0;->i(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(Ljava/lang/String;Lks0;)V
    .locals 3

    .line 1
    sget-object v0, Lrs0;->y:Lrs0;

    .line 2
    .line 3
    iget-object v0, v0, Lrs0;->p:Lra2;

    .line 4
    .line 5
    new-instance v1, Ljs0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v2, p0, p1, p2}, Ljs0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lra2;->t(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final h(Z)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, "close"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p1, "open"

    .line 7
    .line 8
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Helpshift(\'onKeyboardToggle\',\'"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p1, "\');"

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p0, p1, v0}, Lls0;->g(Ljava/lang/String;Lks0;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Helpshift(\'onNetworkStatusChange\',\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p1, "\');"

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, p1, v0}, Lls0;->g(Ljava/lang/String;Lks0;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final j(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    const-string p1, "portrait"

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string p1, "landscape"

    .line 8
    .line 9
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v1, "Helpshift(\'onOrientationChange\',\'"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, "\');"

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, p1, v0}, Lls0;->g(Ljava/lang/String;Lks0;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final k()V
    .locals 9

    .line 1
    sget-object v0, Lrs0;->y:Lrs0;

    .line 2
    .line 3
    iget-object v0, v0, Lrs0;->t:Lec;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v0, Lec;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Liy;

    .line 12
    .line 13
    iget-object v3, v0, Lec;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v3}, Lb40;->p(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    const-string v3, "helpshift/Webchat.js"

    .line 24
    .line 25
    invoke-static {v1, v3}, Lyy1;->A(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Lb40;->p(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    const-string v0, ""

    .line 36
    .line 37
    :goto_0
    move-object v3, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const-string v3, "%cdn"

    .line 40
    .line 41
    const-string v4, "https://webchat.helpshift.com/latest/android/webChat.js"

    .line 42
    .line 43
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, v0, Lec;->b:Ljava/lang/Object;

    .line 48
    .line 49
    :cond_1
    iget-object v0, v0, Lec;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ljava/lang/String;

    .line 52
    .line 53
    sget-object v1, Lrs0;->y:Lrs0;

    .line 54
    .line 55
    iget-boolean v1, v1, Lrs0;->c:Z

    .line 56
    .line 57
    invoke-virtual {v2, v1}, Liy;->m(Z)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v3, "%config"

    .line 66
    .line 67
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v1, v2, Liy;->a:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ler0;

    .line 74
    .line 75
    iget-object v1, v1, Ler0;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Ler0;

    .line 78
    .line 79
    const-string v2, "custom_issue_fields"

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v1}, Lb40;->p(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_2

    .line 90
    .line 91
    const-string v1, "{}"

    .line 92
    .line 93
    :cond_2
    const-string v2, "%cifs"

    .line 94
    .line 95
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto :goto_0

    .line 100
    :goto_1
    invoke-static {v3}, Lb40;->p(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    const/16 v1, 0x8

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    const/4 v4, 0x0

    .line 108
    const-string v5, "HSChatFragment"

    .line 109
    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    const-string v0, "Error in reading the source code from assets folder"

    .line 113
    .line 114
    invoke-static {v5, v0, v4}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    const-string v0, "Received onWebchatError event"

    .line 118
    .line 119
    invoke-static {v5, v0, v4}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lls0;->i:Landroid/view/View;

    .line 123
    .line 124
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    iget-object p0, p0, Lls0;->f:Landroid/view/View;

    .line 128
    .line 129
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_3
    iget-object v0, p0, Lls0;->f:Landroid/view/View;

    .line 134
    .line 135
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lls0;->i:Landroid/view/View;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 141
    .line 142
    .line 143
    const-string v0, "Webview is launched"

    .line 144
    .line 145
    invoke-static {v5, v0, v4}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 146
    .line 147
    .line 148
    sget-object v0, Lrs0;->y:Lrs0;

    .line 149
    .line 150
    new-instance v1, Leq2;

    .line 151
    .line 152
    iget-object v2, v0, Lrs0;->f:Lnm;

    .line 153
    .line 154
    iget-object v4, v0, Lrs0;->p:Lra2;

    .line 155
    .line 156
    iget-object v5, v0, Lrs0;->e:Liy;

    .line 157
    .line 158
    invoke-virtual {v0}, Lrs0;->a()Lnm;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    iget-object v7, v0, Lrs0;->o:Lts0;

    .line 163
    .line 164
    iget-object v8, v0, Lrs0;->w:Lll1;

    .line 165
    .line 166
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 167
    .line 168
    .line 169
    iput-object v4, v1, Leq2;->a:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v2, v1, Leq2;->c:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v5, v1, Leq2;->b:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v6, v1, Leq2;->d:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v7, v1, Leq2;->e:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v8, v1, Leq2;->f:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v1, p0, Lls0;->v:Leq2;

    .line 182
    .line 183
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 184
    .line 185
    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    iput-object v2, v1, Leq2;->i:Ljava/lang/Object;

    .line 189
    .line 190
    new-instance v1, Lns0;

    .line 191
    .line 192
    iget-object v2, p0, Lls0;->v:Leq2;

    .line 193
    .line 194
    invoke-direct {v1, v2}, Lns0;-><init>(Leq2;)V

    .line 195
    .line 196
    .line 197
    iput-object v1, p0, Lls0;->d:Lns0;

    .line 198
    .line 199
    iget-object v2, p0, Lls0;->a:Landroid/webkit/ValueCallback;

    .line 200
    .line 201
    iput-object v2, v1, Lns0;->b:Landroid/webkit/ValueCallback;

    .line 202
    .line 203
    iget-object v2, p0, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 204
    .line 205
    invoke-virtual {v2, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 206
    .line 207
    .line 208
    iget-object v1, p0, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 209
    .line 210
    new-instance v2, Los0;

    .line 211
    .line 212
    iget-object v4, p0, Lls0;->v:Leq2;

    .line 213
    .line 214
    invoke-virtual {v0}, Lrs0;->a()Lnm;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-direct {v2, v4, v5}, Los0;-><init>(Leq2;Lnm;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 222
    .line 223
    .line 224
    iget-object v1, p0, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 225
    .line 226
    new-instance v2, Lms0;

    .line 227
    .line 228
    iget-object v0, v0, Lrs0;->q:Lwc0;

    .line 229
    .line 230
    iget-object v4, p0, Lls0;->v:Leq2;

    .line 231
    .line 232
    invoke-direct {v2, v0, v4}, Lms0;-><init>(Lwc0;Leq2;)V

    .line 233
    .line 234
    .line 235
    const-string v0, "HSInterface"

    .line 236
    .line 237
    invoke-virtual {v1, v2, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    iget-object v1, p0, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 241
    .line 242
    const-string v5, "utf-8"

    .line 243
    .line 244
    const/4 v6, 0x0

    .line 245
    const-string v2, "https://localhost/"

    .line 246
    .line 247
    const-string v4, "text/html"

    .line 248
    .line 249
    invoke-virtual/range {v1 .. v6}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lls0;->b:Z

    .line 3
    .line 4
    const-string v0, "onActivityResult, request code: "

    .line 5
    .line 6
    const-string v1, " , resultCode: "

    .line 7
    .line 8
    invoke-static {v0, p1, p2, v1}, Len;->j(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "HSChatFragment"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {v1, v0, v2}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    const/16 v0, 0x3e9

    .line 21
    .line 22
    if-eq p1, v0, :cond_0

    .line 23
    .line 24
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object p1, p0, Lls0;->a:Landroid/webkit/ValueCallback;

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    const-string p0, "filePathCallback is null, return"

    .line 33
    .line 34
    invoke-static {v1, p0, v2}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-static {p2, p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->parseResult(ILandroid/content/Intent;)[Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-interface {p1, p2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Lls0;->a:Landroid/webkit/ValueCallback;

    .line 46
    .line 47
    iget-object p0, p0, Lls0;->d:Lns0;

    .line 48
    .line 49
    iput-object v2, p0, Lns0;->b:Landroid/webkit/ValueCallback;

    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    iget-object p0, p0, Lls0;->a:Landroid/webkit/ValueCallback;

    .line 53
    .line 54
    invoke-interface {p0, v2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget v0, Lcom/helpshift/R$id;->hs__loading_view_close_btn:I

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    sget v0, Lcom/helpshift/R$id;->hs__retry_view_close_btn:I

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget v0, Lcom/helpshift/R$id;->hs__retry_button:I

    .line 15
    .line 16
    if-ne p1, v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Lls0;->k()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    :goto_0
    const-string p1, "onWebchatClosed"

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    const-string v1, "HSChatFragment"

    .line 26
    .line 27
    invoke-static {v1, p1, v0}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lls0;->w:Lcom/helpshift/activities/HSMainActivity;

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/helpshift/activities/HSMainActivity;->onBackPressed()V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lls0;->j(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 1
    new-instance p3, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v0, "onCreateView() - "

    .line 4
    .line 5
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    const/4 v0, 0x0

    .line 20
    const-string v1, "HSChatFragment"

    .line 21
    .line 22
    invoke-static {v1, p3, v0}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 23
    .line 24
    .line 25
    sget p3, Lcom/helpshift/R$layout;->hs__webchat_fragment_layout:I

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    const-string p3, "source"

    .line 43
    .line 44
    invoke-virtual {p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iput-object p2, p0, Lls0;->W:Ljava/lang/String;

    .line 49
    .line 50
    :cond_0
    return-object p1
.end method

.method public final onDestroy()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "onDestroy() -"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "HSChatFragment"

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v1, v0, v2}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lrs0;->y:Lrs0;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    iput-boolean v1, v0, Lrs0;->a:Z

    .line 32
    .line 33
    iget-object v3, v0, Lrs0;->f:Lnm;

    .line 34
    .line 35
    iget-object v3, v3, Lnm;->h:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->clear()V

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, Lls0;->v:Leq2;

    .line 43
    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 47
    .line 48
    invoke-direct {v4, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput-object v4, v3, Leq2;->i:Ljava/lang/Object;

    .line 52
    .line 53
    :cond_0
    iget-object v3, p0, Lls0;->e:Landroid/widget/LinearLayout;

    .line 54
    .line 55
    iget-object v4, p0, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 56
    .line 57
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 58
    .line 59
    .line 60
    iget-object v3, p0, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 61
    .line 62
    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Landroid/webkit/WebView;->destroy()V

    .line 66
    .line 67
    .line 68
    iput-object v2, p0, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 69
    .line 70
    iget-object p0, v0, Lrs0;->n:Ler0;

    .line 71
    .line 72
    iget-object p0, p0, Ler0;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Ler0;

    .line 75
    .line 76
    iget-object p0, p0, Ler0;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, Landroid/content/SharedPreferences;

    .line 79
    .line 80
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-string v2, "last_unread_count_api_access"

    .line 85
    .line 86
    const-wide/16 v3, 0x0

    .line 87
    .line 88
    invoke-interface {p0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 89
    .line 90
    .line 91
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_1

    .line 96
    .line 97
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 98
    .line 99
    .line 100
    :cond_1
    iget-object p0, v0, Lrs0;->f:Lnm;

    .line 101
    .line 102
    const-string v0, "push_unread_count"

    .line 103
    .line 104
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {p0, v1, v0}, Lnm;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final onPause()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 2
    .line 3
    .line 4
    const-string v0, "HSChatFragment"

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "onPause() -"

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v0, v1, v2}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    sget-object v0, Lrs0;->y:Lrs0;

    .line 41
    .line 42
    iget-object v0, v0, Lrs0;->s:Lcb;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcb;->K()V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lps0;->b(Landroid/content/Context;)Lps0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    monitor-enter v0

    .line 56
    :try_start_0
    iget-object v1, v0, Lps0;->c:Ljava/util/Set;

    .line 57
    .line 58
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    iget-object p0, v0, Lps0;->c:Ljava/util/Set;

    .line 62
    .line 63
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_3

    .line 68
    .line 69
    iget-object p0, v0, Lps0;->d:Let0;

    .line 70
    .line 71
    if-nez p0, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {p0}, Let0;->a()Landroid/net/ConnectivityManager;

    .line 75
    .line 76
    .line 77
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    :try_start_1
    invoke-virtual {v1, p0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catch_0
    move-exception v1

    .line 85
    :try_start_2
    const-string v3, "AboveNConnectvtManager"

    .line 86
    .line 87
    const-string v4, "Exception while unregistering network callback"

    .line 88
    .line 89
    invoke-static {v3, v4, v1}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    :goto_0
    iput-object v2, p0, Let0;->b:Lps0;

    .line 93
    .line 94
    iput-object v2, v0, Lps0;->d:Let0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    .line 96
    :cond_3
    :goto_1
    monitor-exit v0

    .line 97
    return-void

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 100
    throw p0
.end method

.method public final onResume()V
    .locals 6

    .line 1
    const-string v0, "window.helpshiftConfig = JSON.parse(JSON.stringify("

    .line 2
    .line 3
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 4
    .line 5
    .line 6
    const-string v1, "HSChatFragment"

    .line 7
    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v3, "onResume() -"

    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {v1, v2, v3}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    sget-object v1, Lrs0;->y:Lrs0;

    .line 43
    .line 44
    iget-object v1, v1, Lrs0;->s:Lcb;

    .line 45
    .line 46
    invoke-virtual {v1}, Lcb;->L()V

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1}, Lps0;->b(Landroid/content/Context;)Lps0;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    monitor-enter v1

    .line 58
    :try_start_0
    iget-object v2, v1, Lps0;->c:Ljava/util/Set;

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    iget-object v4, v1, Lps0;->c:Ljava/util/Set;

    .line 65
    .line 66
    invoke-interface {v4, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    invoke-virtual {v1}, Lps0;->c()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    iget-object v2, v1, Lps0;->d:Let0;

    .line 78
    .line 79
    invoke-virtual {v2}, Let0;->a()Landroid/net/ConnectivityManager;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const/4 v4, 0x2

    .line 84
    const/4 v5, 0x1

    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-eqz v2, :cond_2

    .line 92
    .line 93
    move v2, v4

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    const/4 v2, 0x3

    .line 96
    goto :goto_0

    .line 97
    :cond_3
    move v2, v5

    .line 98
    :goto_0
    invoke-static {v2}, Len;->y(I)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eq v2, v5, :cond_5

    .line 103
    .line 104
    if-eq v2, v4, :cond_4

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    invoke-virtual {p0}, Lls0;->e()V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_5
    invoke-virtual {p0}, Lls0;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    :goto_1
    monitor-exit v1

    .line 115
    sget-object v1, Lrs0;->y:Lrs0;

    .line 116
    .line 117
    iget-boolean v2, v1, Lrs0;->a:Z

    .line 118
    .line 119
    if-eqz v2, :cond_6

    .line 120
    .line 121
    iget-boolean v2, p0, Lls0;->X:Z

    .line 122
    .line 123
    if-eqz v2, :cond_6

    .line 124
    .line 125
    const-string v2, "HSChatFragment"

    .line 126
    .line 127
    const-string v4, "Updating config with latest config in same webchat session"

    .line 128
    .line 129
    invoke-static {v2, v4, v3}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 130
    .line 131
    .line 132
    :try_start_1
    iget-object v2, v1, Lrs0;->e:Liy;

    .line 133
    .line 134
    iget-boolean v1, v1, Lrs0;->c:Z

    .line 135
    .line 136
    invoke-virtual {v2, v1}, Liy;->m(Z)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    new-instance v2, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v0, "));Helpshift(\'updateClientConfigWithoutReload\');"

    .line 153
    .line 154
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {p0, v0, v3}, Lls0;->g(Ljava/lang/String;Lks0;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :catch_0
    move-exception p0

    .line 166
    const-string v0, "HSChatFragment"

    .line 167
    .line 168
    const-string v1, "Failed to update webchat config with latest config "

    .line 169
    .line 170
    invoke-static {v0, v1, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    :cond_6
    return-void

    .line 174
    :goto_2
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 175
    throw p0
.end method

.method public final onStart()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStart()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "onStart() -"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "HSChatFragment"

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v1, v0, v2}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "Helpshift(\'sdkxIsInForeground\',true);"

    .line 29
    .line 30
    invoke-virtual {p0, v0, v2}, Lls0;->g(Ljava/lang/String;Lks0;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object p0, p0, Lls0;->Y:Lo2;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final onStop()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStop()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "onStop() - "

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "HSChatFragment"

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v1, v0, v2}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    iget-boolean v0, p0, Lls0;->b:Z

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const-string v0, "Helpshift(\'sdkxIsInForeground\',false);"

    .line 33
    .line 34
    invoke-virtual {p0, v0, v2}, Lls0;->g(Ljava/lang/String;Lks0;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object p0, p0, Lls0;->Y:Lo2;

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v0, "onViewCreated() - "

    .line 7
    .line 8
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v0, 0x0

    .line 23
    const-string v1, "HSChatFragment"

    .line 24
    .line 25
    invoke-static {v1, p2, v0}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    sget-object p2, Lrs0;->y:Lrs0;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p2, Lrs0;->a:Z

    .line 32
    .line 33
    iget-object p2, p2, Lrs0;->f:Lnm;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p2, Lnm;->h:Ljava/lang/Object;

    .line 44
    .line 45
    sget p2, Lcom/helpshift/R$id;->hs__loading_view:I

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iput-object p2, p0, Lls0;->f:Landroid/view/View;

    .line 52
    .line 53
    sget p2, Lcom/helpshift/R$id;->hs__retry_view:I

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iput-object p2, p0, Lls0;->i:Landroid/view/View;

    .line 60
    .line 61
    sget p2, Lcom/helpshift/R$id;->hs__webview_layout:I

    .line 62
    .line 63
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    check-cast p2, Landroid/widget/LinearLayout;

    .line 68
    .line 69
    iput-object p2, p0, Lls0;->e:Landroid/widget/LinearLayout;

    .line 70
    .line 71
    sget p2, Lcom/helpshift/R$id;->hs__webchat_webview:I

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, Lcom/helpshift/views/HSWebView;

    .line 78
    .line 79
    iput-object p2, p0, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 80
    .line 81
    sget p2, Lcom/helpshift/R$id;->hs__retry_view_close_btn:I

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    sget p2, Lcom/helpshift/R$id;->hs__loading_view_close_btn:I

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    .line 98
    .line 99
    sget p2, Lcom/helpshift/R$id;->hs__retry_button:I

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lls0;->k()V

    .line 109
    .line 110
    .line 111
    return-void
.end method
