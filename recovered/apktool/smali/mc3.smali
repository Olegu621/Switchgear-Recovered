.class public final Lmc3;
.super Lkr0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lwv;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lrr0;Lsr0;)V
    .locals 14

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    const/16 v4, 0x5b

    .line 4
    .line 5
    move-object v1, p0

    .line 6
    move-object v2, p1

    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    move-object/from16 v5, p3

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move-object/from16 v7, p6

    .line 14
    .line 15
    invoke-direct/range {v1 .. v7}, Lkr0;-><init>(Landroid/content/Context;Landroid/os/Looper;ILwv;Lxy;Lwp1;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, v5, Lwv;->c:Ljava/util/Set;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance v2, Lzr0;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v3, Ljava/util/HashSet;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v3, v2, Lzr0;->d:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance v3, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v3, v2, Lzr0;->i:Ljava/lang/Object;

    .line 40
    .line 41
    new-instance v3, Ljava/util/HashSet;

    .line 42
    .line 43
    iget-object v4, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    iput-object v3, v2, Lzr0;->d:Ljava/lang/Object;

    .line 49
    .line 50
    iget-boolean v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->e:Z

    .line 51
    .line 52
    iput-boolean v3, v2, Lzr0;->a:Z

    .line 53
    .line 54
    iget-boolean v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->f:Z

    .line 55
    .line 56
    iput-boolean v3, v2, Lzr0;->b:Z

    .line 57
    .line 58
    iget-boolean v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d:Z

    .line 59
    .line 60
    iput-boolean v3, v2, Lzr0;->c:Z

    .line 61
    .line 62
    iget-object v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->i:Ljava/lang/String;

    .line 63
    .line 64
    iput-object v3, v2, Lzr0;->e:Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c:Landroid/accounts/Account;

    .line 67
    .line 68
    iput-object v3, v2, Lzr0;->h:Ljava/lang/Object;

    .line 69
    .line 70
    iget-object v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->v:Ljava/lang/String;

    .line 71
    .line 72
    iput-object v3, v2, Lzr0;->f:Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->w:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-static {v3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->E1(Ljava/util/ArrayList;)Ljava/util/HashMap;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    iput-object v3, v2, Lzr0;->i:Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v0, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->U:Ljava/lang/String;

    .line 83
    .line 84
    iput-object v0, v2, Lzr0;->g:Ljava/lang/Object;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    new-instance v2, Lzr0;

    .line 88
    .line 89
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    new-instance v0, Ljava/util/HashSet;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v0, v2, Lzr0;->d:Ljava/lang/Object;

    .line 98
    .line 99
    new-instance v0, Ljava/util/HashMap;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v0, v2, Lzr0;->i:Ljava/lang/Object;

    .line 105
    .line 106
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbbb;->zba()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, v2, Lzr0;->g:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_1

    .line 117
    .line 118
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_1

    .line 127
    .line 128
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Lcom/google/android/gms/common/api/Scope;

    .line 133
    .line 134
    const/4 v3, 0x0

    .line 135
    new-array v3, v3, [Lcom/google/android/gms/common/api/Scope;

    .line 136
    .line 137
    iget-object v4, v2, Lzr0;->d:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v4, Ljava/util/HashSet;

    .line 140
    .line 141
    invoke-virtual {v4, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-interface {v4, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_1
    iget-object p1, v2, Lzr0;->d:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p1, Ljava/util/HashSet;

    .line 155
    .line 156
    sget-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->Z:Lcom/google/android/gms/common/api/Scope;

    .line 157
    .line 158
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_2

    .line 163
    .line 164
    sget-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->Y:Lcom/google/android/gms/common/api/Scope;

    .line 165
    .line 166
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_2

    .line 171
    .line 172
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    :cond_2
    iget-boolean v0, v2, Lzr0;->c:Z

    .line 176
    .line 177
    if-eqz v0, :cond_4

    .line 178
    .line 179
    iget-object v0, v2, Lzr0;->h:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Landroid/accounts/Account;

    .line 182
    .line 183
    if-eqz v0, :cond_3

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-nez v0, :cond_4

    .line 190
    .line 191
    :cond_3
    sget-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->X:Lcom/google/android/gms/common/api/Scope;

    .line 192
    .line 193
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    :cond_4
    new-instance v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 197
    .line 198
    new-instance v5, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-direct {v5, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 201
    .line 202
    .line 203
    iget-object p1, v2, Lzr0;->h:Ljava/lang/Object;

    .line 204
    .line 205
    move-object v6, p1

    .line 206
    check-cast v6, Landroid/accounts/Account;

    .line 207
    .line 208
    iget-boolean v7, v2, Lzr0;->c:Z

    .line 209
    .line 210
    iget-boolean v8, v2, Lzr0;->a:Z

    .line 211
    .line 212
    iget-boolean v9, v2, Lzr0;->b:Z

    .line 213
    .line 214
    iget-object p1, v2, Lzr0;->e:Ljava/lang/Object;

    .line 215
    .line 216
    move-object v10, p1

    .line 217
    check-cast v10, Ljava/lang/String;

    .line 218
    .line 219
    iget-object p1, v2, Lzr0;->f:Ljava/lang/Object;

    .line 220
    .line 221
    move-object v11, p1

    .line 222
    check-cast v11, Ljava/lang/String;

    .line 223
    .line 224
    iget-object p1, v2, Lzr0;->i:Ljava/lang/Object;

    .line 225
    .line 226
    move-object v12, p1

    .line 227
    check-cast v12, Ljava/util/HashMap;

    .line 228
    .line 229
    iget-object p1, v2, Lzr0;->g:Ljava/lang/Object;

    .line 230
    .line 231
    move-object v13, p1

    .line 232
    check-cast v13, Ljava/lang/String;

    .line 233
    .line 234
    const/4 v4, 0x3

    .line 235
    invoke-direct/range {v3 .. v13}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;-><init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    iput-object v3, p0, Lmc3;->a:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 239
    .line 240
    return-void
.end method


# virtual methods
.method public final createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string p0, "com.google.android.gms.auth.api.signin.internal.ISignInService"

    .line 6
    .line 7
    invoke-interface {p1, p0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Lcom/google/android/gms/auth/api/signin/internal/zbs;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast v0, Lcom/google/android/gms/auth/api/signin/internal/zbs;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    new-instance v0, Lcom/google/android/gms/auth/api/signin/internal/zbs;

    .line 19
    .line 20
    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/internal/auth-api/zba;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final getMinApkVersion()I
    .locals 0

    .line 1
    const p0, 0xbdfcb8

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final getServiceDescriptor()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "com.google.android.gms.auth.api.signin.internal.ISignInService"

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSignInIntent()Landroid/content/Intent;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lpc3;->a:Lha1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    new-array v2, v2, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v3, 0x3

    .line 11
    iget v4, v1, Lha1;->c:I

    .line 12
    .line 13
    if-gt v4, v3, :cond_0

    .line 14
    .line 15
    const-string v3, "getSignInIntent()"

    .line 16
    .line 17
    invoke-virtual {v1, v3, v2}, Lha1;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    :cond_0
    new-instance v1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object p0, p0, Lmc3;->a:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 27
    .line 28
    invoke-direct {v1, v2, p0}, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;-><init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 29
    .line 30
    .line 31
    new-instance p0, Landroid/content/Intent;

    .line 32
    .line 33
    const-string v2, "com.google.android.gms.auth.GOOGLE_SIGN_IN"

    .line 34
    .line 35
    invoke-direct {p0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p0, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    const-class v2, Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 46
    .line 47
    invoke-virtual {p0, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    new-instance v0, Landroid/os/Bundle;

    .line 51
    .line 52
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v2, "config"

    .line 56
    .line 57
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 61
    .line 62
    .line 63
    return-object p0
.end method

.method public final getStartServiceAction()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "com.google.android.gms.auth.api.signin.service.START"

    .line 2
    .line 3
    return-object p0
.end method

.method public final providesSignIn()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
