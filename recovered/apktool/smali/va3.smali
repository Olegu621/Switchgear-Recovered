.class public final Lva3;
.super Lw8;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lva3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public buildClient(Landroid/content/Context;Landroid/os/Looper;Lwv;Ljava/lang/Object;Lrr0;Lsr0;)Ld9;
    .locals 9

    .line 1
    iget v0, p0, Lva3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :pswitch_0
    invoke-super/range {p0 .. p6}, Lw8;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lwv;Ljava/lang/Object;Lrr0;Lsr0;)Ld9;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :pswitch_1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p0, Ljava/lang/ClassCastException;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 18
    .line 19
    .line 20
    throw p0

    .line 21
    :pswitch_2
    check-cast p4, La9;

    .line 22
    .line 23
    new-instance v0, Lcom/google/android/gms/internal/auth/zzam;

    .line 24
    .line 25
    move-object v1, p1

    .line 26
    move-object v2, p2

    .line 27
    move-object v3, p3

    .line 28
    move-object v4, p5

    .line 29
    move-object v5, p6

    .line 30
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/zzam;-><init>(Landroid/content/Context;Landroid/os/Looper;Lwv;Lrr0;Lsr0;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_3
    if-nez p4, :cond_0

    .line 35
    .line 36
    new-instance v1, Lcom/google/android/gms/internal/drive/zzaw;

    .line 37
    .line 38
    new-instance v7, Landroid/os/Bundle;

    .line 39
    .line 40
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 41
    .line 42
    .line 43
    move-object v2, p1

    .line 44
    move-object v3, p2

    .line 45
    move-object v4, p3

    .line 46
    move-object v5, p5

    .line 47
    move-object v6, p6

    .line 48
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/drive/zzaw;-><init>(Landroid/content/Context;Landroid/os/Looper;Lwv;Lrr0;Lsr0;Landroid/os/Bundle;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-object v1

    .line 56
    :pswitch_4
    new-instance v1, Lcom/google/android/gms/internal/drive/zzaw;

    .line 57
    .line 58
    new-instance v7, Landroid/os/Bundle;

    .line 59
    .line 60
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 61
    .line 62
    .line 63
    move-object v2, p1

    .line 64
    move-object v3, p2

    .line 65
    move-object v4, p3

    .line 66
    move-object v5, p5

    .line 67
    move-object v6, p6

    .line 68
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/drive/zzaw;-><init>(Landroid/content/Context;Landroid/os/Looper;Lwv;Lrr0;Lsr0;Landroid/os/Bundle;)V

    .line 69
    .line 70
    .line 71
    return-object v1

    .line 72
    :pswitch_5
    check-cast p4, La9;

    .line 73
    .line 74
    new-instance v1, Lcom/google/android/gms/internal/location/zzaz;

    .line 75
    .line 76
    const-string v6, "locationServices"

    .line 77
    .line 78
    move-object v2, p1

    .line 79
    move-object v3, p2

    .line 80
    move-object v7, p3

    .line 81
    move-object v4, p5

    .line 82
    move-object v5, p6

    .line 83
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/location/zzaz;-><init>(Landroid/content/Context;Landroid/os/Looper;Lrr0;Lsr0;Ljava/lang/String;Lwv;)V

    .line 84
    .line 85
    .line 86
    return-object v1

    .line 87
    :pswitch_6
    check-cast p4, La9;

    .line 88
    .line 89
    new-instance p0, Lcom/google/android/gms/internal/location/zzaz;

    .line 90
    .line 91
    new-instance v4, Ljava/util/HashSet;

    .line 92
    .line 93
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 94
    .line 95
    .line 96
    new-instance p3, Ljava/util/HashSet;

    .line 97
    .line 98
    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    .line 99
    .line 100
    .line 101
    new-instance v5, Lid;

    .line 102
    .line 103
    invoke-direct {v5}, Lle2;-><init>()V

    .line 104
    .line 105
    .line 106
    new-instance p3, Lid;

    .line 107
    .line 108
    invoke-direct {p3}, Lle2;-><init>()V

    .line 109
    .line 110
    .line 111
    sget-object p4, Lpr0;->c:Ljava/lang/Object;

    .line 112
    .line 113
    sget-object p4, Lpb3;->a:Lva3;

    .line 114
    .line 115
    new-instance p4, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    new-instance p4, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object p4

    .line 136
    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    sget-object p4, Lpb3;->b:Lh9;

    .line 141
    .line 142
    invoke-virtual {p3, p4}, Lle2;->containsKey(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_1

    .line 147
    .line 148
    invoke-virtual {p3, p4, v1}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    check-cast p3, Lje2;

    .line 153
    .line 154
    :goto_1
    move-object v8, p3

    .line 155
    goto :goto_2

    .line 156
    :cond_1
    sget-object p3, Lje2;->a:Lje2;

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :goto_2
    new-instance v2, Lwv;

    .line 160
    .line 161
    const/4 v3, 0x0

    .line 162
    invoke-direct/range {v2 .. v8}, Lwv;-><init>(Landroid/accounts/Account;Ljava/util/Set;Lid;Ljava/lang/String;Ljava/lang/String;Lje2;)V

    .line 163
    .line 164
    .line 165
    const-string v6, "activity_recognition"

    .line 166
    .line 167
    move-object v1, p0

    .line 168
    move-object v3, p2

    .line 169
    move-object v4, p5

    .line 170
    move-object v5, p6

    .line 171
    move-object v7, v2

    .line 172
    move-object v2, p1

    .line 173
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/location/zzaz;-><init>(Landroid/content/Context;Landroid/os/Looper;Lrr0;Lsr0;Ljava/lang/String;Lwv;)V

    .line 174
    .line 175
    .line 176
    return-object v1

    .line 177
    :pswitch_7
    move-object v5, p4

    .line 178
    check-cast v5, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 179
    .line 180
    new-instance v1, Lmc3;

    .line 181
    .line 182
    move-object v2, p1

    .line 183
    move-object v3, p2

    .line 184
    move-object v4, p3

    .line 185
    move-object v6, p5

    .line 186
    move-object v7, p6

    .line 187
    invoke-direct/range {v1 .. v7}, Lmc3;-><init>(Landroid/content/Context;Landroid/os/Looper;Lwv;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lrr0;Lsr0;)V

    .line 188
    .line 189
    .line 190
    return-object v1

    .line 191
    :pswitch_8
    move-object v5, p4

    .line 192
    check-cast v5, Lbe;

    .line 193
    .line 194
    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbo;

    .line 195
    .line 196
    move-object v2, p1

    .line 197
    move-object v3, p2

    .line 198
    move-object v4, p3

    .line 199
    move-object v6, p5

    .line 200
    move-object v7, p6

    .line 201
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/auth-api/zbo;-><init>(Landroid/content/Context;Landroid/os/Looper;Lwv;Lbe;Lrr0;Lsr0;)V

    .line 202
    .line 203
    .line 204
    return-object v1

    .line 205
    :pswitch_9
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    new-instance p0, Ljava/lang/ClassCastException;

    .line 209
    .line 210
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 211
    .line 212
    .line 213
    throw p0

    .line 214
    :pswitch_a
    check-cast p4, Lje2;

    .line 215
    .line 216
    new-instance v1, Lie2;

    .line 217
    .line 218
    invoke-static {p3}, Lie2;->b(Lwv;)Landroid/os/Bundle;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    move-object v2, p1

    .line 223
    move-object v3, p2

    .line 224
    move-object v4, p3

    .line 225
    move-object v5, p5

    .line 226
    move-object v6, p6

    .line 227
    invoke-direct/range {v1 .. v7}, Lie2;-><init>(Landroid/content/Context;Landroid/os/Looper;Lwv;Lrr0;Lsr0;Landroid/os/Bundle;)V

    .line 228
    .line 229
    .line 230
    return-object v1

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic buildClient(Landroid/content/Context;Landroid/os/Looper;Lwv;Ljava/lang/Object;Lxy;Lwp1;)Ld9;
    .locals 7

    iget v0, p0, Lva3;->a:I

    sparse-switch v0, :sswitch_data_0

    invoke-super/range {p0 .. p6}, Lw8;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lwv;Ljava/lang/Object;Lxy;Lwp1;)Ld9;

    move-result-object p0

    return-object p0

    :sswitch_0
    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 231
    check-cast p4, La9;

    .line 232
    new-instance p1, Lcom/google/android/gms/internal/auth-api-phone/zzw;

    move-object p2, v1

    move-object p3, v2

    move-object p4, v3

    invoke-direct/range {p1 .. p6}, Lcom/google/android/gms/internal/auth-api-phone/zzw;-><init>(Landroid/content/Context;Landroid/os/Looper;Lwv;Lxy;Lwp1;)V

    return-object p1

    :sswitch_1
    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 233
    move-object v4, p4

    check-cast v4, Lee;

    .line 234
    new-instance v0, Lcom/google/android/gms/internal/auth/zzbe;

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/auth/zzbe;-><init>(Landroid/content/Context;Landroid/os/Looper;Lwv;Lee;Lxy;Lwp1;)V

    return-object v0

    :sswitch_2
    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 235
    move-object v4, p4

    check-cast v4, Lzm2;

    .line 236
    new-instance v0, Lgc3;

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lgc3;-><init>(Landroid/content/Context;Landroid/os/Looper;Lwv;Lzm2;Lxy;Lwp1;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_2
        0x5 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method

.method public getImpliedScopes(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    iget v0, p0, Lva3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lc9;->getImpliedScopes(Ljava/lang/Object;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-object p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method
