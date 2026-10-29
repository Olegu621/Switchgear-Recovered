.class public final Lg5;
.super Ljava/lang/ThreadLocal;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg5;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Lg5;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p0, Lxk3;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lxk3;->a:I

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_2
    new-instance p0, Lio/sentry/util/l;

    .line 27
    .line 28
    invoke-direct {p0}, Lio/sentry/util/l;-><init>()V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_3
    new-instance p0, Ljava/text/DecimalFormat;

    .line 33
    .line 34
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 35
    .line 36
    invoke-static {v0}, Ljava/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Ljava/text/DecimalFormatSymbols;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "#.################"

    .line 41
    .line 42
    invoke-direct {p0, v1, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_4
    new-instance p0, Ljava/security/SecureRandom;

    .line 47
    .line 48
    invoke-direct {p0}, Ljava/security/SecureRandom;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/util/Random;->nextLong()J

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_5
    :try_start_0
    sget-object p0, Lhe0;->b:Lhe0;

    .line 56
    .line 57
    const-string v1, "AES/GCM/NoPadding"

    .line 58
    .line 59
    iget-object p0, p0, Lhe0;->a:Lge0;

    .line 60
    .line 61
    invoke-interface {p0, v1}, Lge0;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    move-object v0, p0

    .line 68
    goto :goto_0

    .line 69
    :catch_0
    move-exception p0

    .line 70
    invoke-static {p0}, Lio/sentry/u2;->o(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    return-object v0

    .line 74
    :pswitch_6
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-ne p0, v1, :cond_0

    .line 83
    .line 84
    invoke-static {}, Lpg3;->o()Lnt0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    goto :goto_1

    .line 89
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-eqz p0, :cond_1

    .line 94
    .line 95
    new-instance p0, Landroid/os/Handler;

    .line 96
    .line 97
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 102
    .line 103
    .line 104
    new-instance v0, Lnt0;

    .line 105
    .line 106
    invoke-direct {v0, p0}, Lnt0;-><init>(Landroid/os/Handler;)V

    .line 107
    .line 108
    .line 109
    :cond_1
    :goto_1
    return-object v0

    .line 110
    :pswitch_7
    :try_start_1
    sget-object p0, Lhe0;->b:Lhe0;

    .line 111
    .line 112
    const-string v1, "AES/GCM-SIV/NoPadding"

    .line 113
    .line 114
    iget-object p0, p0, Lhe0;->a:Lge0;

    .line 115
    .line 116
    invoke-interface {p0, v1}, Lge0;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, Ljavax/crypto/Cipher;
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 121
    .line 122
    move-object v0, p0

    .line 123
    goto :goto_2

    .line 124
    :catch_1
    move-exception p0

    .line 125
    invoke-static {p0}, Lio/sentry/u2;->o(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    :goto_2
    return-object v0

    .line 129
    :pswitch_8
    :try_start_2
    sget-object p0, Lhe0;->b:Lhe0;

    .line 130
    .line 131
    const-string v1, "AES/CTR/NOPADDING"

    .line 132
    .line 133
    iget-object p0, p0, Lhe0;->a:Lge0;

    .line 134
    .line 135
    invoke-interface {p0, v1}, Lge0;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    check-cast p0, Ljavax/crypto/Cipher;
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_2

    .line 140
    .line 141
    move-object v0, p0

    .line 142
    goto :goto_3

    .line 143
    :catch_2
    move-exception p0

    .line 144
    invoke-static {p0}, Lio/sentry/u2;->o(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    :goto_3
    return-object v0

    .line 148
    :pswitch_9
    :try_start_3
    sget-object p0, Lhe0;->b:Lhe0;

    .line 149
    .line 150
    const-string v1, "AES/ECB/NOPADDING"

    .line 151
    .line 152
    iget-object p0, p0, Lhe0;->a:Lge0;

    .line 153
    .line 154
    invoke-interface {p0, v1}, Lge0;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    check-cast p0, Ljavax/crypto/Cipher;
    :try_end_3
    .catch Ljava/security/GeneralSecurityException; {:try_start_3 .. :try_end_3} :catch_3

    .line 159
    .line 160
    move-object v0, p0

    .line 161
    goto :goto_4

    .line 162
    :catch_3
    move-exception p0

    .line 163
    invoke-static {p0}, Lio/sentry/u2;->o(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :goto_4
    return-object v0

    .line 167
    :pswitch_a
    :try_start_4
    sget-object p0, Lhe0;->b:Lhe0;

    .line 168
    .line 169
    const-string v1, "AES/CTR/NoPadding"

    .line 170
    .line 171
    iget-object p0, p0, Lhe0;->a:Lge0;

    .line 172
    .line 173
    invoke-interface {p0, v1}, Lge0;->x(Ljava/lang/String;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    check-cast p0, Ljavax/crypto/Cipher;
    :try_end_4
    .catch Ljava/security/GeneralSecurityException; {:try_start_4 .. :try_end_4} :catch_4

    .line 178
    .line 179
    move-object v0, p0

    .line 180
    goto :goto_5

    .line 181
    :catch_4
    move-exception p0

    .line 182
    invoke-static {p0}, Lio/sentry/u2;->o(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    :goto_5
    return-object v0

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
