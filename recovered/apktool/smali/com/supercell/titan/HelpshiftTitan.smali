.class public Lcom/supercell/titan/HelpshiftTitan;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final ORIENTATION_LANDSCAPE:I

.field public static final ORIENTATION_PORTRAIT:I

.field public static final ORIENTATION_UNSPECIFIED:I

.field public static volatile a:I

.field public static b:Z

.field public static final c:Ljava/util/HashMap;

.field public static final d:Ljava/util/HashMap;

.field public static final e:Ljava/util/HashMap;

.field public static final f:Ljava/util/HashMap;

.field public static final g:Ljava/util/HashMap;

.field public static h:[Ljava/lang/String;

.field public static i:[Ljava/lang/String;

.field public static j:Z

.field public static k:I

.field public static l:Ljava/lang/String;

.field public static m:Z

.field public static n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lcom/supercell/titan/HelpshiftTitan;

    const v1, 0x2

    const v0, 0x2

    sput v0, Lcom/supercell/titan/HelpshiftTitan;->ORIENTATION_LANDSCAPE:I

    const v0, 0x1

    sput v0, Lcom/supercell/titan/HelpshiftTitan;->ORIENTATION_PORTRAIT:I

    const v0, 0x0

    sput v0, Lcom/supercell/titan/HelpshiftTitan;->ORIENTATION_UNSPECIFIED:I

    const v0, 0x0

    sput v0, Lcom/supercell/titan/HelpshiftTitan;->a:I

    const/4 v0, 0x0

    sput-boolean v0, Lcom/supercell/titan/HelpshiftTitan;->b:Z

    const/4 v0, 0x0

    sput-boolean v0, Lcom/supercell/titan/HelpshiftTitan;->j:Z

    const/4 v0, 0x0

    sput-object v0, Lcom/supercell/titan/HelpshiftTitan;->l:Ljava/lang/String;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/supercell/titan/HelpshiftTitan;->m:Z

    const/4 v0, 0x0

    sput-boolean v0, Lcom/supercell/titan/HelpshiftTitan;->n:Z

    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/supercell/titan/HelpshiftTitan;->c:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/supercell/titan/HelpshiftTitan;->d:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/supercell/titan/HelpshiftTitan;->e:Ljava/util/HashMap;

    .line 21
    .line 22
    new-instance v0, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/supercell/titan/HelpshiftTitan;->f:Ljava/util/HashMap;

    .line 28
    .line 29
    new-instance v0, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/supercell/titan/HelpshiftTitan;->g:Ljava/util/HashMap;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    new-array v1, v0, [Ljava/lang/String;

    .line 38
    .line 39
    sput-object v1, Lcom/supercell/titan/HelpshiftTitan;->h:[Ljava/lang/String;

    .line 40
    .line 41
    new-array v0, v0, [Ljava/lang/String;

    .line 42
    .line 43
    sput-object v0, Lcom/supercell/titan/HelpshiftTitan;->i:[Ljava/lang/String;

    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    sput v0, Lcom/supercell/titan/HelpshiftTitan;->k:I

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    sget-object v1, Lcom/supercell/titan/HelpshiftTitan;->d:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    sget-boolean v1, Lcom/supercell/titan/HelpshiftTitan;->n:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const v1, 0x1f6

    const-string v1, "fullPrivacy"

    .line 13
    .line 14
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object v1, Lcom/supercell/titan/HelpshiftTitan;->e:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    new-instance v2, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 30
    .line 31
    .line 32
    sget-boolean v1, Lcom/supercell/titan/HelpshiftTitan;->n:Z

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const v1, 0x1f7

    const-string v1, "country_code"

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_1
    const v1, 0x1f8

    const-string v1, "customMetadata"

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_2
    sget-object v1, Lcom/supercell/titan/HelpshiftTitan;->h:[Ljava/lang/String;

    .line 47
    .line 48
    array-length v2, v1

    .line 49
    if-lez v2, :cond_3

    .line 50
    .line 51
    const v2, 0x1f9

    const-string v2, "tags"

    .line 52
    .line 53
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_3
    new-instance v1, Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    sget-object v2, Lcom/supercell/titan/HelpshiftTitan;->f:Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 64
    .line 65
    .line 66
    sget-object v2, Lcom/supercell/titan/HelpshiftTitan;->g:Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-lez v2, :cond_4

    .line 76
    .line 77
    const v2, 0x1fa

    const-string v2, "customIssueFields"

    .line 78
    .line 79
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_4
    sget-object v1, Lcom/supercell/titan/HelpshiftTitan;->l:Ljava/lang/String;

    .line 83
    .line 84
    if-eqz v1, :cond_5

    .line 85
    .line 86
    const v2, 0x1fb

    const-string v2, "initialUserMessage"

    .line 87
    .line 88
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    :cond_5
    sget v1, Lcom/supercell/titan/HelpshiftTitan;->k:I

    .line 92
    .line 93
    const v2, 0x1fc

    const-string v2, "enableContactUs"

    .line 94
    .line 95
    if-eqz v1, :cond_9

    .line 96
    .line 97
    const/4 v3, 0x1

    .line 98
    if-eq v1, v3, :cond_8

    .line 99
    .line 100
    const/4 v3, 0x2

    .line 101
    if-eq v1, v3, :cond_7

    .line 102
    .line 103
    const/4 v3, 0x3

    .line 104
    if-eq v1, v3, :cond_6

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_6
    const v1, 0x1fd

    const-string v1, "AFTER_MARKING_ANSWER_UNHELPFUL"

    .line 108
    .line 109
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_7
    const v1, 0x1fe

    const-string v1, "AFTER_VIEWING_FAQS"

    .line 114
    .line 115
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_8
    const v1, 0x1ff

    const-string v1, "NEVER"

    .line 120
    .line 121
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_9
    const v1, 0x200

    const-string v1, "ALWAYS"

    .line 126
    .line 127
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    :goto_0
    sget-object v1, Lcom/supercell/titan/HelpshiftTitan;->i:[Ljava/lang/String;

    .line 131
    .line 132
    array-length v1, v1

    .line 133
    return-object v0
.end method

.method public static clearMetadata()V
    .locals 2

    .line 1
    sget-object v0, Lcom/supercell/titan/HelpshiftTitan;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/supercell/titan/HelpshiftTitan;->e:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    new-array v1, v0, [Ljava/lang/String;

    .line 13
    .line 14
    sput-object v1, Lcom/supercell/titan/HelpshiftTitan;->h:[Ljava/lang/String;

    .line 15
    .line 16
    new-array v0, v0, [Ljava/lang/String;

    .line 17
    .line 18
    sput-object v0, Lcom/supercell/titan/HelpshiftTitan;->i:[Ljava/lang/String;

    .line 19
    .line 20
    sget-object v0, Lcom/supercell/titan/HelpshiftTitan;->f:Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    sput-object v0, Lcom/supercell/titan/HelpshiftTitan;->l:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method

.method public static enableChat()V
    .locals 0

    .line 1
    return-void
.end method

.method public static getNotificationCount()I
    .locals 1

    .line 1
    sget v0, Lcom/supercell/titan/HelpshiftTitan;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public static handlePushInternal(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    const v0, 0x201

    const-string p0, "alert"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v1, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lhu0;->k0(Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lcom/supercell/titan/HelpshiftTitan;->requestNotificationCount()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    :catch_0
    return-void
.end method

.method public static handlePushNotification(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static isVisible()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/supercell/titan/HelpshiftTitan;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public static leaveBreadcrumb(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Liu0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, p0, v2}, Liu0;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static login(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lur;

    .line 6
    .line 7
    const/4 v6, 0x1

    .line 8
    const/4 v7, 0x0

    .line 9
    move-object v3, p0

    .line 10
    move-object v2, p1

    .line 11
    move-object v4, p2

    .line 12
    move-object v5, p3

    .line 13
    invoke-direct/range {v1 .. v7}, Lur;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static onResume()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/supercell/titan/HelpshiftTitan;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    sput-boolean v0, Lcom/supercell/titan/HelpshiftTitan;->j:Z

    .line 7
    .line 8
    invoke-static {}, Lcom/supercell/titan/HelpshiftTitan;->requestNotificationCount()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static requestNotificationCount()V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/supercell/titan/HelpshiftTitan;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lvc0;

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-direct {v1, v2}, Lvc0;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static setContactUsMode(I)V
    .locals 0

    .line 1
    sput p0, Lcom/supercell/titan/HelpshiftTitan;->k:I

    .line 2
    .line 3
    return-void
.end method

.method public static setCustomIssueField(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/supercell/titan/HelpshiftTitan;->c:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    const v1, 0x202

    const-string v1, "type"

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    const p1, 0x203

    const-string p1, "value"

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    sget-object p1, Lcom/supercell/titan/HelpshiftTitan;->f:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {p1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static setEnableFullPrivacy(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/supercell/titan/HelpshiftTitan;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method public static setInitialUserMessage(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/supercell/titan/HelpshiftTitan;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static setInternalCustomIssueField(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/supercell/titan/HelpshiftTitan;->c:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    const v1, 0x204

    const-string v1, "type"

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    const p1, 0x205

    const-string p1, "value"

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    sget-object p1, Lcom/supercell/titan/HelpshiftTitan;->g:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {p1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static setMetadata(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/supercell/titan/HelpshiftTitan;->e:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static setMetadataCallback()V
    .locals 0

    .line 1
    return-void
.end method

.method public static setMetadataTags(Ljava/lang/String;)V
    .locals 1

    .line 1
    const v0, 0x206

    const-string v0, ","

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sput-object p0, Lcom/supercell/titan/HelpshiftTitan;->h:[Ljava/lang/String;

    .line 8
    .line 9
    array-length v0, p0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    aget-object p0, p0, v0

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public static setPushNotificationToken(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Liu0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Liu0;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static setSDKLanguage(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Liu0;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v1, p0, v2}, Liu0;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static setWithTagsMatching(Ljava/lang/String;)V
    .locals 1

    .line 1
    const v0, 0x207

    const-string v0, ","

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sput-object p0, Lcom/supercell/titan/HelpshiftTitan;->i:[Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public static showConversation()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/supercell/titan/HelpshiftTitan;->a()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lju0;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, v3, v0}, Lju0;-><init>(ILjava/util/HashMap;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static showFAQ()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/supercell/titan/HelpshiftTitan;->a()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lju0;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-direct {v2, v3, v0}, Lju0;-><init>(ILjava/util/HashMap;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static showFAQSection(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/supercell/titan/HelpshiftTitan;->a()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ldp0;

    .line 10
    .line 11
    const/16 v3, 0xf

    .line 12
    .line 13
    invoke-direct {v2, v3, p0, v0}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static showSingleFAQ(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/supercell/titan/HelpshiftTitan;->a()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lcp0;

    .line 10
    .line 11
    const/16 v3, 0xe

    .line 12
    .line 13
    invoke-direct {v2, v3, p0, v0}, Lcp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static start(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .line 1
    sget-object p0, Lcom/supercell/titan/HelpshiftTitan;->c:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashMap;->clear()V

    .line 4
    .line 5
    .line 6
    const v0, 0x208

    const-string v0, "sl"

    .line 7
    .line 8
    const v1, 0x209

    const-string v1, "singleline"

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const v0, 0x20a

    const-string v0, "ml"

    .line 14
    .line 15
    const v1, 0x20b

    const-string v1, "multiline"

    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const v0, 0x20c

    const-string v0, "n"

    .line 21
    .line 22
    const v1, 0x20d

    const-string v1, "number"

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const v0, 0x20e

    const-string v0, "dd"

    .line 28
    .line 29
    const v1, 0x20f

    const-string v1, "dropdown"

    .line 30
    .line 31
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    const v0, 0x210

    const-string v0, "dt"

    .line 35
    .line 36
    const v1, 0x211

    const-string v1, "date"

    .line 37
    .line 38
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    const v0, 0x212

    const-string v0, "b"

    .line 42
    .line 43
    const v1, 0x213

    const-string v1, "checkbox"

    .line 44
    .line 45
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-nez p0, :cond_0

    .line 53
    .line 54
    const p0, 0x214

    const-string p0, "HelpshiftTitan"

    .line 55
    .line 56
    const p1, 0x215

    const-string p1, "Cannot start Helpshift, GameApp instance is null"

    .line 57
    .line 58
    invoke-static {p0, p1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    sget-boolean p0, Lcom/supercell/titan/HelpshiftTitan;->b:Z

    .line 63
    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    const/4 p0, 0x1

    .line 68
    sput-boolean p0, Lcom/supercell/titan/HelpshiftTitan;->b:Z

    .line 69
    .line 70
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v1, Ldq0;

    .line 75
    .line 76
    invoke-direct {v1, p2, p3, p0, p1}, Ldq0;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method
