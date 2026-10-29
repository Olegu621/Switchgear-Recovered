.class public final Liu0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Liu0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Liu0;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Liu0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const-string v3, "HelpshiftTitan"

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, "Helpshift"

    .line 9
    .line 10
    iget-object p0, p0, Liu0;->b:Ljava/lang/String;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lcom/supercell/titan/VirtualKeyboardHandler;->inputTextChanged(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    sget-object v0, Lcom/supercell/titan/KeyboardDialog;->U:Lcom/supercell/titan/KeyboardDialog;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Lcom/supercell/titan/KeyboardDialog;->d:Lbp2;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iput-boolean v2, v0, Lbp2;->a:Z

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-interface {v2, v1, v3, p0}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 38
    .line 39
    .line 40
    iput-boolean v1, v0, Lbp2;->a:Z

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    sput-object p0, Lcom/supercell/titan/KeyboardDialog;->i:Ljava/lang/String;

    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    :pswitch_1
    :try_start_0
    invoke-static {}, Lrs0;->b()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v1, "setLanguage() is called for language - "

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v5, v0, v4}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Lrs0;->y:Lrs0;

    .line 71
    .line 72
    iget-object v1, v0, Lrs0;->p:Lra2;

    .line 73
    .line 74
    new-instance v4, Ldu0;

    .line 75
    .line 76
    invoke-direct {v4, v0, p0, v2}, Ldu0;-><init>(Lrs0;Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v4}, Lra2;->u(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catch_0
    move-exception p0

    .line 84
    const-string v0, "HelpshiftTitan.setSDKLanguage"

    .line 85
    .line 86
    invoke-static {v3, v0, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 87
    .line 88
    .line 89
    :goto_1
    return-void

    .line 90
    :pswitch_2
    :try_start_1
    invoke-static {}, Lrs0;->b()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_2

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v2, "leaveBreadCrumb() is called with action "

    .line 100
    .line 101
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v5, v0, v4}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p0}, Lb40;->p(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_3

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    sget-object v0, Lrs0;->y:Lrs0;

    .line 122
    .line 123
    iget-object v2, v0, Lrs0;->p:Lra2;

    .line 124
    .line 125
    new-instance v4, Ldu0;

    .line 126
    .line 127
    invoke-direct {v4, v0, p0, v1}, Ldu0;-><init>(Lrs0;Ljava/lang/String;I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v4}, Lra2;->u(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :catch_1
    move-exception p0

    .line 135
    const-string v0, "HelpshiftTitan.leaveBreadcrumb"

    .line 136
    .line 137
    invoke-static {v3, v0, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 138
    .line 139
    .line 140
    :goto_2
    return-void

    .line 141
    :pswitch_3
    :try_start_2
    invoke-static {}, Lrs0;->b()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_4

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v1, "Registering push token, token is empty?- "

    .line 151
    .line 152
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-static {p0}, Lb40;->p(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v5, v0, v4}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 167
    .line 168
    .line 169
    sget-object v0, Lrs0;->y:Lrs0;

    .line 170
    .line 171
    iget-object v1, v0, Lrs0;->p:Lra2;

    .line 172
    .line 173
    new-instance v2, Lcp0;

    .line 174
    .line 175
    const/16 v4, 0xd

    .line 176
    .line 177
    invoke-direct {v2, v4, v0, p0}, Lcp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v2}, Lra2;->u(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :catch_2
    move-exception p0

    .line 185
    const-string v0, "HelpshiftTitan.setPushNotificationToken"

    .line 186
    .line 187
    invoke-static {v3, v0, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 188
    .line 189
    .line 190
    :goto_3
    return-void

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
