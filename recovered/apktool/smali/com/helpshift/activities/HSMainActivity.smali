.class public Lcom/helpshift/activities/HSMainActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final synthetic i:I


# instance fields
.field public b:Landroid/view/View;

.field public c:Landroid/widget/ImageView;

.field public d:Landroidx/fragment/app/w;

.field public e:Liy;

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static d(Lcom/helpshift/activities/HSMainActivity;ZZ)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-boolean p2, p0, Lcom/helpshift/activities/HSMainActivity;->f:Z

    .line 4
    .line 5
    if-nez p2, :cond_1

    .line 6
    .line 7
    :cond_0
    if-eqz p1, :cond_2

    .line 8
    .line 9
    :cond_1
    iget-object p1, p0, Lcom/helpshift/activities/HSMainActivity;->e:Liy;

    .line 10
    .line 11
    const-string p2, "helpcenter"

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Liy;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object p1, p0, Lcom/helpshift/activities/HSMainActivity;->e:Liy;

    .line 19
    .line 20
    const-string p2, "webchat"

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Liy;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_0
    invoke-virtual {p0, p1}, Lcom/helpshift/activities/HSMainActivity;->e(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lb40;->r(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "#453FB9"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lb40;->t(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string p1, "primaryColor"

    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0, p1}, Landroid/view/Window;->setStatusBarColor(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    move-exception p0

    .line 39
    const-string p1, "ViewUtil"

    .line 40
    .line 41
    const-string v0, "Error setting status bar color"

    .line 42
    .line 43
    invoke-static {p1, v0, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-virtual {p0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final f()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/helpshift/activities/HSMainActivity;->d:Landroidx/fragment/app/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/w;->G()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-object p0, p0, Lcom/helpshift/activities/HSMainActivity;->d:Landroidx/fragment/app/w;

    .line 12
    .line 13
    sget v0, Lcom/helpshift/R$id;->hs__container:I

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroidx/fragment/app/w;->C(I)Landroidx/fragment/app/Fragment;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final g(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/helpshift/activities/HSMainActivity;->f()Landroidx/fragment/app/Fragment;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    iget-object p1, p0, Lcom/helpshift/activities/HSMainActivity;->d:Landroidx/fragment/app/w;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/fragment/app/w;->G()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-lez p1, :cond_2

    .line 21
    .line 22
    iget-object p0, p0, Lcom/helpshift/activities/HSMainActivity;->d:Landroidx/fragment/app/w;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance p1, Lum0;

    .line 28
    .line 29
    const/4 v0, -0x1

    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {p1, p0, v0, v1}, Lum0;-><init>(Landroidx/fragment/app/w;II)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/w;->x(Ltm0;Z)V

    .line 35
    .line 36
    .line 37
    :cond_2
    :goto_0
    return-void
.end method

.method public final h(Landroid/content/Intent;Z)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lrs0;->y:Lrs0;

    .line 9
    .line 10
    iget-object v0, v0, Lrs0;->r:Lcb;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcb;->A()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lcom/helpshift/activities/HSMainActivity;->c:Landroid/widget/ImageView;

    .line 19
    .line 20
    sget p2, Lcom/helpshift/R$drawable;->hs__no_internet_icon:I

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, p0, Lcom/helpshift/activities/HSMainActivity;->b:Landroid/view/View;

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p0, Lcom/helpshift/activities/HSMainActivity;->e:Liy;

    .line 37
    .line 38
    const-string v2, "source"

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iput-object v3, v1, Liy;->f:Ljava/lang/Object;

    .line 45
    .line 46
    const-string v1, "SERVICE_MODE"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v3, "WEBCHAT_SERVICE_FLAG"

    .line 53
    .line 54
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0, p1, p2}, Lcom/helpshift/activities/HSMainActivity;->i(Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance v0, Lxs0;

    .line 73
    .line 74
    invoke-direct {v0}, Lxs0;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 78
    .line 79
    .line 80
    iput-object p0, v0, Lxs0;->e:Lcom/helpshift/activities/HSMainActivity;

    .line 81
    .line 82
    iget-object p1, p0, Lcom/helpshift/activities/HSMainActivity;->d:Landroidx/fragment/app/w;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v1, Landroidx/fragment/app/a;

    .line 88
    .line 89
    invoke-direct {v1, p1}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/w;)V

    .line 90
    .line 91
    .line 92
    sget p1, Lcom/helpshift/R$id;->hs__container:I

    .line 93
    .line 94
    const-string v2, "HelpCenter"

    .line 95
    .line 96
    const/4 v3, 0x1

    .line 97
    invoke-virtual {v1, p1, v0, v2, v3}, Landroidx/fragment/app/a;->e(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 98
    .line 99
    .line 100
    if-eqz p2, :cond_4

    .line 101
    .line 102
    iget-boolean p1, v1, Landroidx/fragment/app/a;->h:Z

    .line 103
    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    iput-boolean v3, v1, Landroidx/fragment/app/a;->g:Z

    .line 107
    .line 108
    const/4 p1, 0x0

    .line 109
    iput-object p1, v1, Landroidx/fragment/app/a;->i:Ljava/lang/String;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    const-string p0, "This FragmentTransaction is not allowed to be added to the back stack."

    .line 113
    .line 114
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_4
    :goto_1
    invoke-virtual {v1, v3}, Landroidx/fragment/app/a;->d(Z)I

    .line 119
    .line 120
    .line 121
    :goto_2
    iget-object p0, p0, Lcom/helpshift/activities/HSMainActivity;->b:Landroid/view/View;

    .line 122
    .line 123
    const/16 p1, 0x8

    .line 124
    .line 125
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public final i(Ljava/lang/String;Z)V
    .locals 9

    .line 1
    sget-object v0, Lrs0;->y:Lrs0;

    .line 2
    .line 3
    iget-boolean v0, v0, Lrs0;->a:Z

    .line 4
    .line 5
    const-string v1, "HSChatFragment"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const-string p2, "proactive"

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const-string p1, "chatActvty"

    .line 20
    .line 21
    const-string v0, "Update config with proactive outbound config in same webchat session"

    .line 22
    .line 23
    invoke-static {p1, v0, v2}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/w;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/z;->f()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    sub-int/2addr p1, v3

    .line 49
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Landroidx/fragment/app/Fragment;

    .line 54
    .line 55
    instance-of p1, p0, Lls0;

    .line 56
    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    check-cast p0, Lls0;

    .line 60
    .line 61
    iput-boolean v3, p0, Lls0;->X:Z

    .line 62
    .line 63
    new-instance p1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v0, "Webchat source changed to proactive from "

    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lls0;->W:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {v1, p1, v2}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 80
    .line 81
    .line 82
    iput-object p2, p0, Lls0;->W:Ljava/lang/String;

    .line 83
    .line 84
    :cond_0
    return-void

    .line 85
    :cond_1
    new-instance v0, Landroid/os/Bundle;

    .line 86
    .line 87
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v4, "api"

    .line 91
    .line 92
    invoke-virtual {v4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    const-string v6, "source"

    .line 97
    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    invoke-virtual {v0, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    sget-object v4, Lrs0;->y:Lrs0;

    .line 105
    .line 106
    iget-boolean v4, v4, Lrs0;->c:Z

    .line 107
    .line 108
    if-eqz v4, :cond_3

    .line 109
    .line 110
    sget-object p1, Lht0;->a:Ljava/util/HashMap;

    .line 111
    .line 112
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 113
    .line 114
    .line 115
    move-result-wide v4

    .line 116
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    const-string v5, "helpcenter"

    .line 121
    .line 122
    invoke-virtual {p1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_3
    const-string v4, "notification"

    .line 130
    .line 131
    invoke-virtual {v4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-eqz p1, :cond_4

    .line 136
    .line 137
    sget-object p1, Lht0;->a:Ljava/util/HashMap;

    .line 138
    .line 139
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 140
    .line 141
    .line 142
    move-result-wide v7

    .line 143
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {p1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :cond_4
    :goto_0
    new-instance p1, Lls0;

    .line 154
    .line 155
    invoke-direct {p1}, Lls0;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 159
    .line 160
    .line 161
    iput-object p0, p1, Lls0;->w:Lcom/helpshift/activities/HSMainActivity;

    .line 162
    .line 163
    iget-object v0, p0, Lcom/helpshift/activities/HSMainActivity;->d:Landroidx/fragment/app/w;

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v4, Landroidx/fragment/app/a;

    .line 169
    .line 170
    invoke-direct {v4, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/w;)V

    .line 171
    .line 172
    .line 173
    if-eqz p2, :cond_5

    .line 174
    .line 175
    iput-boolean v3, p0, Lcom/helpshift/activities/HSMainActivity;->f:Z

    .line 176
    .line 177
    sget p0, Lcom/helpshift/R$anim;->hs__slide_up:I

    .line 178
    .line 179
    sget v0, Lcom/helpshift/R$anim;->hs__slide_down:I

    .line 180
    .line 181
    iput p0, v4, Landroidx/fragment/app/a;->b:I

    .line 182
    .line 183
    iput v0, v4, Landroidx/fragment/app/a;->c:I

    .line 184
    .line 185
    iput p0, v4, Landroidx/fragment/app/a;->d:I

    .line 186
    .line 187
    iput v0, v4, Landroidx/fragment/app/a;->e:I

    .line 188
    .line 189
    :cond_5
    sget p0, Lcom/helpshift/R$id;->hs__container:I

    .line 190
    .line 191
    invoke-virtual {v4, p0, p1, v1, v3}, Landroidx/fragment/app/a;->e(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 192
    .line 193
    .line 194
    if-eqz p2, :cond_7

    .line 195
    .line 196
    iget-boolean p0, v4, Landroidx/fragment/app/a;->h:Z

    .line 197
    .line 198
    if-eqz p0, :cond_6

    .line 199
    .line 200
    iput-boolean v3, v4, Landroidx/fragment/app/a;->g:Z

    .line 201
    .line 202
    iput-object v2, v4, Landroidx/fragment/app/a;->i:Ljava/lang/String;

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_6
    const-string p0, "This FragmentTransaction is not allowed to be added to the back stack."

    .line 206
    .line 207
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_7
    :goto_1
    invoke-virtual {v4, v3}, Landroidx/fragment/app/a;->d(Z)I

    .line 212
    .line 213
    .line 214
    return-void
.end method

.method public final onBackPressed()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/helpshift/activities/HSMainActivity;->f()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Helpshift(\'backBtnPress\');"

    .line 6
    .line 7
    const-string v2, "Helpcenter( JSON.stringify({ \"eventType\": \"backBtnClick\", \"config\": {} }));"

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lcom/helpshift/activities/HSMainActivity;->d:Landroidx/fragment/app/w;

    .line 12
    .line 13
    const-string v3, "HelpCenter"

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Landroidx/fragment/app/w;->D(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lxs0;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v3, v0, Lxs0;->a:Lcom/helpshift/views/HSWebView;

    .line 24
    .line 25
    invoke-virtual {v3}, Landroid/webkit/WebView;->canGoBack()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lxs0;->g(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, v0, Lxs0;->a:Lcom/helpshift/views/HSWebView;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/webkit/WebView;->goBack()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/helpshift/activities/HSMainActivity;->d:Landroidx/fragment/app/w;

    .line 41
    .line 42
    const-string v2, "HSChatFragment"

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Landroidx/fragment/app/w;->D(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lls0;

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    new-instance p0, Lks0;

    .line 53
    .line 54
    invoke-direct {p0, v0}, Lks0;-><init>(Lls0;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1, p0}, Lls0;->g(Ljava/lang/String;Lks0;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    instance-of v3, v0, Lxs0;

    .line 66
    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    check-cast v0, Lxs0;

    .line 70
    .line 71
    iget-object v1, v0, Lxs0;->a:Lcom/helpshift/views/HSWebView;

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/webkit/WebView;->canGoBack()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_5

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Lxs0;->g(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object p0, v0, Lxs0;->a:Lcom/helpshift/views/HSWebView;

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/webkit/WebView;->goBack()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    instance-of v2, v0, Lls0;

    .line 89
    .line 90
    if-eqz v2, :cond_4

    .line 91
    .line 92
    check-cast v0, Lls0;

    .line 93
    .line 94
    new-instance p0, Lks0;

    .line 95
    .line 96
    invoke-direct {p0, v0}, Lks0;-><init>(Lls0;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1, p0}, Lls0;->g(Ljava/lang/String;Lks0;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_4
    iget-object v0, p0, Lcom/helpshift/activities/HSMainActivity;->d:Landroidx/fragment/app/w;

    .line 104
    .line 105
    invoke-virtual {v0}, Landroidx/fragment/app/w;->G()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-lez v0, :cond_5

    .line 110
    .line 111
    iget-object p0, p0, Lcom/helpshift/activities/HSMainActivity;->d:Landroidx/fragment/app/w;

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v0, Lum0;

    .line 117
    .line 118
    const/4 v1, -0x1

    .line 119
    const/4 v2, 0x0

    .line 120
    invoke-direct {v0, p0, v1, v2}, Lum0;-><init>(Landroidx/fragment/app/w;II)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/w;->x(Ltm0;Z)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_5
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget v0, Lcom/helpshift/R$id;->hs__retry_view_close_btn:I

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget v0, Lcom/helpshift/R$id;->hs__retry_button:I

    .line 14
    .line 15
    if-ne p1, v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, p1, v0}, Lcom/helpshift/activities/HSMainActivity;->h(Landroid/content/Intent;Z)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    :try_start_0
    sget-object v0, Lrs0;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    const-string p1, "chatActvty"

    .line 21
    .line 22
    const-string v0, "Install call not successful, falling back to launcher activity"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Lhe3;->t(Lcom/helpshift/activities/HSMainActivity;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    sget p1, Lcom/helpshift/R$layout;->hs__chat_activity_layout:I

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 34
    .line 35
    .line 36
    :try_start_1
    sget-object p1, Lrs0;->y:Lrs0;

    .line 37
    .line 38
    iget-object p1, p1, Lrs0;->n:Ler0;

    .line 39
    .line 40
    const-string v0, "screenOrientation"

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ler0;->o(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catch_0
    move-exception p1

    .line 51
    const-string v0, "chatActvty"

    .line 52
    .line 53
    const-string v1, "Error setting orientation."

    .line 54
    .line 55
    invoke-static {v0, v1, p1}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_1
    sget p1, Lcom/helpshift/R$id;->hs__retry_view:I

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, Lcom/helpshift/activities/HSMainActivity;->b:Landroid/view/View;

    .line 65
    .line 66
    sget p1, Lcom/helpshift/R$id;->hs__error_image:I

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Landroid/widget/ImageView;

    .line 73
    .line 74
    iput-object p1, p0, Lcom/helpshift/activities/HSMainActivity;->c:Landroid/widget/ImageView;

    .line 75
    .line 76
    sget p1, Lcom/helpshift/R$id;->hs__retry_button:I

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    .line 84
    .line 85
    sget p1, Lcom/helpshift/R$id;->hs__retry_view_close_btn:I

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    .line 93
    .line 94
    sget-object p1, Lrs0;->y:Lrs0;

    .line 95
    .line 96
    iget-object v0, p1, Lrs0;->j:Lxy1;

    .line 97
    .line 98
    monitor-enter v0

    .line 99
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 100
    .line 101
    .line 102
    move-result-wide v1

    .line 103
    invoke-virtual {v0}, Lxy1;->f()Lorg/json/JSONArray;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-nez v4, :cond_2

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_2
    iget-object v4, v0, Lxy1;->e:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v4, Lra2;

    .line 117
    .line 118
    iget-object v4, v4, Lra2;->a:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v4, Lfs0;

    .line 121
    .line 122
    new-instance v5, Les0;

    .line 123
    .line 124
    invoke-direct {v5, v0, v3, v1, v2}, Les0;-><init>(Lxy1;Lorg/json/JSONArray;J)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v5}, Lfs0;->w(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    .line 129
    .line 130
    :goto_2
    monitor-exit v0

    .line 131
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/w;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iput-object v0, p0, Lcom/helpshift/activities/HSMainActivity;->d:Landroidx/fragment/app/w;

    .line 136
    .line 137
    iget-object p1, p1, Lrs0;->e:Liy;

    .line 138
    .line 139
    iput-object p1, p0, Lcom/helpshift/activities/HSMainActivity;->e:Liy;

    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    const/4 v0, 0x0

    .line 146
    invoke-virtual {p0, p1, v0}, Lcom/helpshift/activities/HSMainActivity;->h(Landroid/content/Intent;Z)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p0, Lcom/helpshift/activities/HSMainActivity;->d:Landroidx/fragment/app/w;

    .line 150
    .line 151
    if-nez p1, :cond_3

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_3
    new-instance v0, Lbt0;

    .line 155
    .line 156
    invoke-direct {v0, p0}, Lbt0;-><init>(Lcom/helpshift/activities/HSMainActivity;)V

    .line 157
    .line 158
    .line 159
    iget-object p0, p1, Landroidx/fragment/app/w;->m:Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :catchall_0
    move-exception p0

    .line 166
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 167
    throw p0

    .line 168
    :catch_1
    move-exception p1

    .line 169
    const-string v0, "chatActvty"

    .line 170
    .line 171
    const-string v1, "Caught exception in HSMainActivity.onCreate()"

    .line 172
    .line 173
    invoke-static {v0, v1, p1}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 174
    .line 175
    .line 176
    sget-object p1, Lrs0;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-nez p1, :cond_4

    .line 183
    .line 184
    invoke-static {p0}, Lhe3;->t(Lcom/helpshift/activities/HSMainActivity;)V

    .line 185
    .line 186
    .line 187
    :cond_4
    :goto_3
    return-void
.end method

.method public final onDestroy()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lrs0;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lrs0;->y:Lrs0;

    .line 13
    .line 14
    iget-object p0, p0, Lrs0;->j:Lxy1;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v0, Lorg/json/JSONArray;

    .line 20
    .line 21
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 22
    .line 23
    .line 24
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 25
    .line 26
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v2, "ts"

    .line 30
    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    const-string v2, "t"

    .line 39
    .line 40
    const-string v3, "q"

    .line 41
    .line 42
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lxy1;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lra2;

    .line 51
    .line 52
    iget-object v1, v1, Lra2;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lfs0;

    .line 55
    .line 56
    new-instance v2, Lcp0;

    .line 57
    .line 58
    const/4 v3, 0x7

    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-direct {v2, p0, v0, v3, v4}, Lcp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2}, Lfs0;->w(Ljava/lang/Runnable;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catch_0
    move-exception p0

    .line 68
    const-string v0, "analyticsMngr"

    .line 69
    .line 70
    const-string v1, "Error in creating quit event"

    .line 71
    .line 72
    invoke-static {v0, v1, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    :cond_0
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object v0, Lrs0;->y:Lrs0;

    .line 12
    .line 13
    iget-object v0, v0, Lrs0;->r:Lcb;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcb;->A()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Lcom/helpshift/activities/HSMainActivity;->c:Landroid/widget/ImageView;

    .line 22
    .line 23
    sget p1, Lcom/helpshift/R$drawable;->hs__no_internet_icon:I

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "source"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, p0, Lcom/helpshift/activities/HSMainActivity;->e:Liy;

    .line 40
    .line 41
    iput-object v1, v2, Liy;->f:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/helpshift/activities/HSMainActivity;->f()Landroidx/fragment/app/Fragment;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    iget-object v1, p0, Lcom/helpshift/activities/HSMainActivity;->d:Landroidx/fragment/app/w;

    .line 50
    .line 51
    const-string v2, "HelpCenter"

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Landroidx/fragment/app/w;->D(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lxs0;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    instance-of v2, v1, Lxs0;

    .line 61
    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    check-cast v1, Lxs0;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    const/4 v1, 0x0

    .line 68
    :goto_0
    if-eqz v1, :cond_4

    .line 69
    .line 70
    const-string v2, "SERVICE_MODE"

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const-string v3, "HELP_CENTER_SERVICE_FLAG"

    .line 77
    .line 78
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_4

    .line 83
    .line 84
    invoke-static {v0}, Lxs0;->h(Landroid/os/Bundle;)Lwe2;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    sget-object p1, Lrs0;->y:Lrs0;

    .line 89
    .line 90
    iget-object v0, p1, Lrs0;->e:Liy;

    .line 91
    .line 92
    iget-object v2, p0, Lwe2;->c:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v2, Ljava/lang/String;

    .line 95
    .line 96
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Ljava/lang/String;

    .line 99
    .line 100
    iget-boolean p1, p1, Lrs0;->a:Z

    .line 101
    .line 102
    invoke-virtual {v0, v2, p0, p1}, Liy;->l(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    const-string p1, "Helpcenter( JSON.stringify({ \"eventType\": \"reloadHelpcenter\", \"config\": %helpshiftConfig }));"

    .line 107
    .line 108
    const-string v0, "%helpshiftConfig"

    .line 109
    .line 110
    invoke-virtual {p1, v0, p0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v1, p0}, Lxs0;->g(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_4
    const/4 v0, 0x1

    .line 119
    invoke-virtual {p0, p1, v0}, Lcom/helpshift/activities/HSMainActivity;->h(Landroid/content/Intent;Z)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lrs0;->y:Lrs0;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lrs0;->b:Z

    .line 8
    .line 9
    iget-object p0, p0, Lrs0;->q:Lwc0;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "helpshiftSessionStarted"

    .line 17
    .line 18
    invoke-virtual {p0, v1, v0}, Lwc0;->D(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lrs0;->y:Lrs0;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lrs0;->b:Z

    .line 8
    .line 9
    iget-object p0, p0, Lrs0;->q:Lwc0;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "helpshiftSessionEnded"

    .line 17
    .line 18
    invoke-virtual {p0, v1, v0}, Lwc0;->D(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
