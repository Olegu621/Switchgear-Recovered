.class public abstract Lcom/supercell/titan/PurchaseManager;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/titan/PurchaseManager$ProductType;,
        Lcom/supercell/titan/PurchaseManager$Product;,
        Lcom/supercell/titan/PurchaseManager$ProductInfo;,
        Lcom/supercell/titan/PurchaseManager$PurchaseInfo;,
        Lcom/supercell/titan/PurchaseManager$BillingProductFailed;
    }
.end annotation


# static fields
.field public static n:Lcom/supercell/titan/PurchaseManagerGoogle;


# instance fields
.field public final a:Ljava/util/Vector;

.field public final b:Ljava/util/Vector;

.field public final c:Ljava/util/Vector;

.field public final d:Ljava/util/ArrayList;

.field public e:Ljava/lang/String;

.field public f:I

.field public final g:Ljava/util/LinkedHashMap;

.field public h:I

.field public final i:Ljava/util/Vector;

.field public final j:Ljava/util/Set;

.field public k:Ljava/lang/String;

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/Vector;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/supercell/titan/PurchaseManager;->a:Ljava/util/Vector;

    .line 10
    .line 11
    new-instance v0, Ljava/util/Vector;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/supercell/titan/PurchaseManager;->b:Ljava/util/Vector;

    .line 17
    .line 18
    new-instance v0, Ljava/util/Vector;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/supercell/titan/PurchaseManager;->c:Ljava/util/Vector;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/supercell/titan/PurchaseManager;->d:Ljava/util/ArrayList;

    .line 31
    .line 32
    const-string v0, ""

    .line 33
    .line 34
    iput-object v0, p0, Lcom/supercell/titan/PurchaseManager;->e:Ljava/lang/String;

    .line 35
    .line 36
    const/4 v0, -0x1

    .line 37
    iput v0, p0, Lcom/supercell/titan/PurchaseManager;->f:I

    .line 38
    .line 39
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/supercell/titan/PurchaseManager;->g:Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    new-instance v0, Ljava/util/Vector;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lcom/supercell/titan/PurchaseManager;->i:Ljava/util/Vector;

    .line 52
    .line 53
    new-instance v0, Ljava/util/HashSet;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Lcom/supercell/titan/PurchaseManager;->j:Ljava/util/Set;

    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    iput-boolean v0, p0, Lcom/supercell/titan/PurchaseManager;->l:Z

    .line 66
    .line 67
    check-cast p0, Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 68
    .line 69
    sput-object p0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 70
    .line 71
    return-void
.end method

.method public static addProduct(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/supercell/titan/PurchaseManager;->g:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Lcom/supercell/titan/PurchaseManager$ProductType;->SUBSCRIPTION:Lcom/supercell/titan/PurchaseManager$ProductType;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p1, Lcom/supercell/titan/PurchaseManager$ProductType;->IN_APP:Lcom/supercell/titan/PurchaseManager$ProductType;

    .line 17
    .line 18
    :goto_0
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/supercell/titan/PurchaseManager;->g:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    new-instance v1, Lcom/supercell/titan/PurchaseManager$Product;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p0, v1, Lcom/supercell/titan/PurchaseManager$Product;->id:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p1, v1, Lcom/supercell/titan/PurchaseManager$Product;->type:Lcom/supercell/titan/PurchaseManager$ProductType;

    .line 30
    .line 31
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public static arePaymentsAvailable()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, v0, Lcom/supercell/titan/PurchaseManagerGoogle;->u:Lkj;

    .line 8
    .line 9
    iget v0, v0, Lkj;->a:I

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_1
    return v1
.end method

.method public static native billingProductBought(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native billingProductCanceled(Ljava/lang/String;)V
.end method

.method public static native billingProductFailed(Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public static native billingSetMarketplace(Ljava/lang/String;)V
.end method

.method public static buyProduct(Ljava/lang/String;)V
    .locals 6

    .line 1
    sget-object v1, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    iget-object v2, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->u:Lkj;

    .line 4
    .line 5
    iget v2, v2, Lkj;->a:I

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    const v0, 0x77

    const-string p0, "PurchaseManagerGoogle"

    .line 10
    .line 11
    const v0, 0x78

    const-string v1, "buyProductImplementation when billingInitResult != OK"

    .line 12
    .line 13
    invoke-static {p0, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v2, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->r:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v2, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lzx1;

    .line 24
    .line 25
    const/16 v3, 0x13

    .line 26
    .line 27
    if-nez v2, :cond_3

    .line 28
    .line 29
    iget-object v2, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->s:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v2, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Lve2;

    .line 36
    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    const v0, 0x79

    const-string p0, "PurchaseManagerGoogle"

    .line 40
    .line 41
    const v0, 0x7a

    const-string v1, "buyProductImplementation: cannot find ProductDetails"

    .line 42
    .line 43
    invoke-static {p0, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    invoke-virtual {p0}, Lve2;->a()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iput-object v2, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->t:Ljava/lang/String;

    .line 52
    .line 53
    monitor-enter v1

    .line 54
    :try_start_0
    iget v2, v1, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 55
    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    iput v2, v1, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 59
    .line 60
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    new-instance v2, Lra2;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance v4, Ldc0;

    .line 67
    .line 68
    invoke-direct {v4, v3}, Ldc0;-><init>(I)V

    .line 69
    .line 70
    .line 71
    iput-object v4, v2, Lra2;->d:Ljava/lang/Object;

    .line 72
    .line 73
    new-instance v3, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    iput-object v3, v2, Lra2;->c:Ljava/lang/Object;

    .line 82
    .line 83
    iget-object v3, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->x:Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v3, :cond_2

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_2

    .line 92
    .line 93
    iget-object v3, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->x:Ljava/lang/String;

    .line 94
    .line 95
    iput-object v3, v2, Lra2;->a:Ljava/lang/Object;

    .line 96
    .line 97
    :cond_2
    iget-object v1, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->p:Lej;

    .line 98
    .line 99
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v2}, Lra2;->b()Lij;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v1, v3, v2}, Lej;->d(Landroid/app/Activity;Lij;)Lkj;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget v2, v1, Lkj;->a:I

    .line 112
    .line 113
    if-eqz v2, :cond_7

    .line 114
    .line 115
    new-instance v2, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;

    .line 116
    .line 117
    invoke-direct {v2}, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lve2;->a()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    iput-object p0, v2, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->productID:Ljava/lang/String;

    .line 125
    .line 126
    iget p0, v1, Lkj;->a:I

    .line 127
    .line 128
    iput p0, v2, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->errorCode:I

    .line 129
    .line 130
    return-void

    .line 131
    :catchall_0
    move-exception p0

    .line 132
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    throw p0

    .line 134
    :cond_3
    iget-object p0, v2, Lzx1;->c:Ljava/lang/String;

    .line 135
    .line 136
    iput-object p0, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->t:Ljava/lang/String;

    .line 137
    .line 138
    monitor-enter v1

    .line 139
    :try_start_2
    iget p0, v1, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 140
    .line 141
    add-int/lit8 p0, p0, 0x1

    .line 142
    .line 143
    iput p0, v1, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 144
    .line 145
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 146
    new-instance p0, Lra2;

    .line 147
    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 149
    .line 150
    .line 151
    new-instance v4, Ldc0;

    .line 152
    .line 153
    invoke-direct {v4, v3}, Ldc0;-><init>(I)V

    .line 154
    .line 155
    .line 156
    iput-object v4, p0, Lra2;->d:Ljava/lang/Object;

    .line 157
    .line 158
    new-instance v3, Lcb;

    .line 159
    .line 160
    const/16 v4, 0x9

    .line 161
    .line 162
    const/4 v5, 0x0

    .line 163
    invoke-direct {v3, v4, v5}, Lcb;-><init>(IZ)V

    .line 164
    .line 165
    .line 166
    iput-object v2, v3, Lcb;->b:Ljava/lang/Object;

    .line 167
    .line 168
    invoke-virtual {v2}, Lzx1;->a()Lyx1;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    if-eqz v4, :cond_4

    .line 173
    .line 174
    invoke-virtual {v2}, Lzx1;->a()Lyx1;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Lzx1;->a()Lyx1;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    iget-object v4, v4, Lyx1;->c:Ljava/lang/String;

    .line 186
    .line 187
    if-eqz v4, :cond_4

    .line 188
    .line 189
    iput-object v4, v3, Lcb;->c:Ljava/lang/Object;

    .line 190
    .line 191
    :cond_4
    iget-object v4, v3, Lcb;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v4, Lzx1;

    .line 194
    .line 195
    const v0, 0x7b

    const-string v5, "ProductDetails is required for constructing ProductDetailsParams."

    .line 196
    .line 197
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/play_billing/zzbe;->zzc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    iget-object v4, v3, Lcb;->b:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v4, Lzx1;

    .line 203
    .line 204
    iget-object v4, v4, Lzx1;->j:Ljava/util/ArrayList;

    .line 205
    .line 206
    if-eqz v4, :cond_5

    .line 207
    .line 208
    iget-object v4, v3, Lcb;->c:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v4, Ljava/lang/String;

    .line 211
    .line 212
    const v0, 0x7c

    const-string v5, "offerToken is required for constructing ProductDetailsParams for subscriptions."

    .line 213
    .line 214
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/play_billing/zzbe;->zzc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    :cond_5
    new-instance v4, Lhj;

    .line 218
    .line 219
    invoke-direct {v4, v3}, Lhj;-><init>(Lcb;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    new-instance v4, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 229
    .line 230
    .line 231
    iput-object v4, p0, Lra2;->b:Ljava/lang/Object;

    .line 232
    .line 233
    iget-object v3, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->x:Ljava/lang/String;

    .line 234
    .line 235
    if-eqz v3, :cond_6

    .line 236
    .line 237
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-nez v3, :cond_6

    .line 242
    .line 243
    iget-object v3, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->x:Ljava/lang/String;

    .line 244
    .line 245
    iput-object v3, p0, Lra2;->a:Ljava/lang/Object;

    .line 246
    .line 247
    :cond_6
    iget-object v1, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->p:Lej;

    .line 248
    .line 249
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {p0}, Lra2;->b()Lij;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-virtual {v1, v3, p0}, Lej;->d(Landroid/app/Activity;Lij;)Lkj;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    iget v1, p0, Lkj;->a:I

    .line 262
    .line 263
    if-eqz v1, :cond_7

    .line 264
    .line 265
    new-instance v1, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;

    .line 266
    .line 267
    invoke-direct {v1}, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;-><init>()V

    .line 268
    .line 269
    .line 270
    iget-object v2, v2, Lzx1;->c:Ljava/lang/String;

    .line 271
    .line 272
    iput-object v2, v1, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->productID:Ljava/lang/String;

    .line 273
    .line 274
    iget p0, p0, Lkj;->a:I

    .line 275
    .line 276
    iput p0, v1, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->errorCode:I

    .line 277
    .line 278
    :cond_7
    return-void

    .line 279
    :catchall_1
    move-exception p0

    .line 280
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 281
    throw p0
.end method

.method public static buyProduct(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 282
    return-void
.end method

.method public static cppBillingCreated()V
    .locals 2

    .line 1
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lcom/supercell/titan/PurchaseManager;->m:Z

    .line 5
    .line 6
    return-void
.end method

.method public static cppBillingDestroyed()V
    .locals 2

    .line 1
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lcom/supercell/titan/PurchaseManager;->m:Z

    .line 5
    .line 6
    return-void
.end method

.method public static dismissTransaction(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/supercell/titan/PurchaseManager;->a:Ljava/util/Vector;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/supercell/titan/PurchaseManager;->i:Ljava/util/Vector;

    .line 6
    .line 7
    if-eqz p0, :cond_4

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    iget-object v0, v0, Lcom/supercell/titan/PurchaseManager;->j:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/lit8 v0, v0, -0x1

    .line 26
    .line 27
    :goto_0
    if-ltz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;

    .line 34
    .line 35
    iget-object v3, v3, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->transactionId:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    add-int/lit8 v0, v0, -0x1

    .line 54
    .line 55
    :goto_1
    if-ltz v0, :cond_4

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;

    .line 62
    .line 63
    iget-object v2, v2, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->transactionId:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    invoke-virtual {v1, v0}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    :goto_2
    return-void
.end method

.method public static finishTransaction(Ljava/lang/String;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/supercell/titan/PurchaseManager;->i:Ljava/util/Vector;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-ge v2, v3, :cond_3

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;

    .line 17
    .line 18
    iget-object v4, v3, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->transactionId:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-object p0, v0, Lcom/supercell/titan/PurchaseManagerGoogle;->u:Lkj;

    .line 30
    .line 31
    iget p0, p0, Lkj;->a:I

    .line 32
    .line 33
    if-nez p0, :cond_1

    .line 34
    .line 35
    iget-object p0, v3, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->purchaseToken:Ljava/lang/String;

    .line 36
    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    new-instance v1, Ld5;

    .line 40
    .line 41
    const/4 v2, 0x4

    .line 42
    invoke-direct {v1, v2}, Ld5;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p0, v1, Ld5;->b:Ljava/lang/String;

    .line 46
    .line 47
    iget-object p0, v0, Lcom/supercell/titan/PurchaseManagerGoogle;->p:Lej;

    .line 48
    .line 49
    new-instance v0, Lds0;

    .line 50
    .line 51
    const/16 v2, 0x16

    .line 52
    .line 53
    invoke-direct {v0, v2}, Lds0;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v1, v0}, Lej;->b(Ld5;Lds0;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const p0, 0x7d

    const-string p0, "Purchase token must be set"

    .line 61
    .line 62
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void

    .line 66
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const p0, 0x7e

    const-string p0, "PurchaseManagerGoogle"

    .line 70
    .line 71
    const v0, 0x7f

    const-string v0, "Finishing unknown transaction"

    .line 72
    .line 73
    invoke-static {p0, v0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public static getProductDetails(Ljava/lang/String;)Lcom/supercell/titan/PurchaseManager$ProductInfo;
    .locals 1

    .line 1
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/supercell/titan/PurchaseManagerGoogle;->getProductDetailsImplementation(Ljava/lang/String;)Lcom/supercell/titan/PurchaseManager$ProductInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static isWaitingForTransaction()Z
    .locals 3

    .line 1
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, v0, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    move v1, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object v0, v0, Lcom/supercell/titan/PurchaseManager;->i:Ljava/util/Vector;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    xor-int/2addr v0, v2

    .line 20
    or-int/2addr v0, v1

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    sget-object v1, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 24
    .line 25
    iget v2, v1, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 26
    .line 27
    iget-object v1, v1, Lcom/supercell/titan/PurchaseManager;->i:Ljava/util/Vector;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 30
    .line 31
    .line 32
    :cond_1
    return v0

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw v1
.end method

.method public static refreshPendingPurchases()V
    .locals 2

    .line 1
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lcom/supercell/titan/PurchaseManagerGoogle;->b(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static resetActiveTransactions()V
    .locals 2

    .line 1
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, v0, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 5
    .line 6
    iget-object v1, v0, Lcom/supercell/titan/PurchaseManager;->a:Ljava/util/Vector;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/supercell/titan/PurchaseManager;->i:Ljava/util/Vector;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/Vector;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/supercell/titan/PurchaseManager;->i:Ljava/util/Vector;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static setAccountId(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    sget-object p1, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/supercell/titan/PurchaseManager;->k:Ljava/lang/String;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    :goto_0
    sget-object p1, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 17
    .line 18
    iget-object p1, p1, Lcom/supercell/titan/PurchaseManager;->j:Ljava/util/Set;

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Set;->clear()V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 24
    .line 25
    iput-object p0, p1, Lcom/supercell/titan/PurchaseManager;->k:Ljava/lang/String;

    .line 26
    .line 27
    :cond_1
    sget-object p1, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 28
    .line 29
    iput-object p0, p1, Lcom/supercell/titan/PurchaseManagerGoogle;->x:Ljava/lang/String;

    .line 30
    .line 31
    return-void
.end method

.method public static startBillingTransactions()V
    .locals 2

    .line 1
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/supercell/titan/PurchaseManager;->l:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lcom/supercell/titan/PurchaseManager;->l:Z

    .line 9
    .line 10
    iget-object v1, v0, Lcom/supercell/titan/PurchaseManager;->a:Ljava/util/Vector;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/supercell/titan/PurchaseManager;->i:Ljava/util/Vector;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/Vector;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/supercell/titan/PurchaseManager;->i:Ljava/util/Vector;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public static stopBillingTransactions()V
    .locals 2

    .line 1
    sget-object v0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lcom/supercell/titan/PurchaseManager;->l:Z

    .line 5
    .line 6
    return-void
.end method

.method public static native updateBillingProductDetails([Lcom/supercell/titan/PurchaseManager$ProductInfo;Ljava/lang/String;I)V
.end method

.method public static updateDetails()V
    .locals 13

    .line 1
    sget-object v1, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    iget-object v2, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->p:Lej;

    .line 4
    .line 5
    iget-object v3, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->u:Lkj;

    .line 6
    .line 7
    iget v3, v3, Lkj;->a:I

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    if-eqz v3, :cond_2

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const v0, 0x80

    const-string v3, "updateDetailsImplementation() when billingInitResult.getResponseCode() =="

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v3, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->u:Lkj;

    .line 20
    .line 21
    iget v3, v3, Lkj;->a:I

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const v0, 0x81

    const-string v3, "PurchaseManagerGoogle"

    .line 31
    .line 32
    invoke-static {v3, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    iget-object v2, v1, Lcom/supercell/titan/PurchaseManager;->d:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 38
    .line 39
    .line 40
    const v0, 0x82

    const-string v2, "No Billing service available"

    .line 41
    .line 42
    iput-object v2, v1, Lcom/supercell/titan/PurchaseManager;->e:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v2, v1, Lcom/supercell/titan/PurchaseManagerGoogle;->u:Lkj;

    .line 45
    .line 46
    iget v2, v2, Lkj;->a:I

    .line 47
    .line 48
    if-eq v2, v4, :cond_1

    .line 49
    .line 50
    const/16 v3, 0xc

    .line 51
    .line 52
    if-ne v2, v3, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/16 v2, -0x64

    .line 56
    .line 57
    iput v2, v1, Lcom/supercell/titan/PurchaseManager;->f:I

    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    :goto_0
    const/16 v2, -0x65

    .line 61
    .line 62
    iput v2, v1, Lcom/supercell/titan/PurchaseManager;->f:I

    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    invoke-virtual {v2}, Lej;->c()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    const/4 v5, 0x5

    .line 70
    const/4 v6, 0x0

    .line 71
    if-nez v3, :cond_4

    .line 72
    .line 73
    sget-object v3, Lkf3;->j:Lkj;

    .line 74
    .line 75
    iget v7, v3, Lkj;->a:I

    .line 76
    .line 77
    if-eqz v7, :cond_3

    .line 78
    .line 79
    invoke-virtual {v2, v4, v5, v3}, Lej;->x(IILkj;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_3
    invoke-virtual {v2, v5}, Lej;->z(I)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :cond_4
    sget-object v3, Lkf3;->a:Lkj;

    .line 90
    .line 91
    iget-boolean v3, v2, Lej;->r:Z

    .line 92
    .line 93
    if-eqz v3, :cond_5

    .line 94
    .line 95
    sget-object v3, Lkf3;->i:Lkj;

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    sget-object v3, Lkf3;->o:Lkj;

    .line 99
    .line 100
    :goto_1
    iget v4, v3, Lkj;->a:I

    .line 101
    .line 102
    const/16 v7, 0xa

    .line 103
    .line 104
    const v0, 0x83

    const-string v8, "Unable to create logging payload"

    .line 105
    .line 106
    const v0, 0x84

    const-string v9, "BillingLogger"

    .line 107
    .line 108
    if-eqz v4, :cond_6

    .line 109
    .line 110
    sget v4, Lif3;->a:I

    .line 111
    .line 112
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjz;->zzc()Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzki;->zzc()Lcom/google/android/gms/internal/play_billing/zzke;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    iget v11, v3, Lkj;->a:I

    .line 121
    .line 122
    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/play_billing/zzke;->zzn(I)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 123
    .line 124
    .line 125
    iget-object v11, v3, Lkj;->b:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/play_billing/zzke;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 128
    .line 129
    .line 130
    const/16 v11, 0x14

    .line 131
    .line 132
    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/play_billing/zzke;->zzo(I)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/play_billing/zzjx;->zza(Lcom/google/android/gms/internal/play_billing/zzke;)Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/play_billing/zzjx;->zzn(I)Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 139
    .line 140
    .line 141
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlb;->zzc()Lcom/google/android/gms/internal/play_billing/zzky;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/play_billing/zzky;->zza(I)Lcom/google/android/gms/internal/play_billing/zzky;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v5}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    check-cast v5, Lcom/google/android/gms/internal/play_billing/zzlb;

    .line 153
    .line 154
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/play_billing/zzjx;->zzm(Lcom/google/android/gms/internal/play_billing/zzlb;)Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzjz;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :catch_0
    move-exception v4

    .line 165
    invoke-static {v9, v8, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    move-object v4, v6

    .line 169
    :goto_2
    invoke-virtual {v2, v4}, Lej;->m(Lcom/google/android/gms/internal/play_billing/zzjz;)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_6
    sget v4, Lif3;->a:I

    .line 174
    .line 175
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzkd;->zzc()Lcom/google/android/gms/internal/play_billing/zzkb;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/play_billing/zzkb;->zzn(I)Lcom/google/android/gms/internal/play_billing/zzkb;

    .line 180
    .line 181
    .line 182
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlb;->zzc()Lcom/google/android/gms/internal/play_billing/zzky;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/play_billing/zzky;->zza(I)Lcom/google/android/gms/internal/play_billing/zzky;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    check-cast v5, Lcom/google/android/gms/internal/play_billing/zzlb;

    .line 194
    .line 195
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/play_billing/zzkb;->zza(Lcom/google/android/gms/internal/play_billing/zzlb;)Lcom/google/android/gms/internal/play_billing/zzkb;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzkd;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :catch_1
    move-exception v4

    .line 206
    invoke-static {v9, v8, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    move-object v4, v6

    .line 210
    :goto_3
    invoke-virtual {v2, v4}, Lej;->n(Lcom/google/android/gms/internal/play_billing/zzkd;)V

    .line 211
    .line 212
    .line 213
    :goto_4
    iget v3, v3, Lkj;->a:I

    .line 214
    .line 215
    iget-object v4, v1, Lcom/supercell/titan/PurchaseManager;->g:Ljava/util/LinkedHashMap;

    .line 216
    .line 217
    if-nez v3, :cond_12

    .line 218
    .line 219
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    sget-object v4, Lcom/supercell/titan/PurchaseManager$ProductType;->IN_APP:Lcom/supercell/titan/PurchaseManager$ProductType;

    .line 231
    .line 232
    sget-object v5, Lcom/supercell/titan/PurchaseManager$ProductType;->SUBSCRIPTION:Lcom/supercell/titan/PurchaseManager$ProductType;

    .line 233
    .line 234
    filled-new-array {v4, v5}, [Lcom/supercell/titan/PurchaseManager$ProductType;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    new-instance v5, Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    :cond_7
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    if-eqz v6, :cond_b

    .line 260
    .line 261
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    check-cast v6, Lcom/supercell/titan/PurchaseManager$Product;

    .line 266
    .line 267
    iget-object v7, v6, Lcom/supercell/titan/PurchaseManager$Product;->type:Lcom/supercell/titan/PurchaseManager$ProductType;

    .line 268
    .line 269
    invoke-interface {v4, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    if-eqz v7, :cond_7

    .line 274
    .line 275
    new-instance v7, Lru1;

    .line 276
    .line 277
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 278
    .line 279
    .line 280
    iget-object v8, v6, Lcom/supercell/titan/PurchaseManager$Product;->id:Ljava/lang/String;

    .line 281
    .line 282
    iput-object v8, v7, Lru1;->a:Ljava/lang/String;

    .line 283
    .line 284
    iget-object v6, v6, Lcom/supercell/titan/PurchaseManager$Product;->type:Lcom/supercell/titan/PurchaseManager$ProductType;

    .line 285
    .line 286
    iget-object v6, v6, Lcom/supercell/titan/PurchaseManager$ProductType;->name:Ljava/lang/String;

    .line 287
    .line 288
    iput-object v6, v7, Lru1;->b:Ljava/lang/String;

    .line 289
    .line 290
    const v0, 0x85

    const-string v8, "first_party"

    .line 291
    .line 292
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v6

    .line 296
    if-nez v6, :cond_a

    .line 297
    .line 298
    iget-object v6, v7, Lru1;->a:Ljava/lang/String;

    .line 299
    .line 300
    if-eqz v6, :cond_9

    .line 301
    .line 302
    iget-object v6, v7, Lru1;->b:Ljava/lang/String;

    .line 303
    .line 304
    if-eqz v6, :cond_8

    .line 305
    .line 306
    new-instance v6, Lg02;

    .line 307
    .line 308
    invoke-direct {v6, v7}, Lg02;-><init>(Lru1;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    goto :goto_5

    .line 315
    :cond_8
    const v0, 0x86

    const-string v1, "Product type must be provided."

    .line 316
    .line 317
    invoke-static {v1}, Ln4;->j(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    return-void

    .line 321
    :cond_9
    const v0, 0x87

    const-string v1, "Product id must be provided."

    .line 322
    .line 323
    invoke-static {v1}, Ln4;->j(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :cond_a
    const v0, 0x88

    const-string v1, "Serialized doc id must be provided for first party products."

    .line 328
    .line 329
    invoke-static {v1}, Ln4;->j(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :cond_b
    new-instance v3, Ler0;

    .line 334
    .line 335
    const/16 v4, 0xb

    .line 336
    .line 337
    invoke-direct {v3, v4}, Ler0;-><init>(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    if-nez v4, :cond_10

    .line 345
    .line 346
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    if-nez v4, :cond_f

    .line 351
    .line 352
    new-instance v4, Ljava/util/HashSet;

    .line 353
    .line 354
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    :cond_c
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 362
    .line 363
    .line 364
    move-result v7

    .line 365
    if-eqz v7, :cond_d

    .line 366
    .line 367
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    check-cast v7, Lg02;

    .line 372
    .line 373
    iget-object v8, v7, Lg02;->b:Ljava/lang/String;

    .line 374
    .line 375
    const v0, 0x89

    const-string v9, "play_pass_subs"

    .line 376
    .line 377
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v8

    .line 381
    if-nez v8, :cond_c

    .line 382
    .line 383
    iget-object v7, v7, Lg02;->b:Ljava/lang/String;

    .line 384
    .line 385
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    goto :goto_6

    .line 389
    :cond_d
    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    const/4 v6, 0x1

    .line 394
    if-gt v4, v6, :cond_e

    .line 395
    .line 396
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/zzco;->zzk(Ljava/util/Collection;)Lcom/google/android/gms/internal/play_billing/zzco;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    iput-object v4, v3, Ler0;->b:Ljava/lang/Object;

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_e
    const v0, 0x8a

    const-string v1, "All products should be of the same product type."

    .line 404
    .line 405
    invoke-static {v1}, Ln4;->j(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :cond_f
    const v0, 0x8b

    const-string v1, "Product list cannot be empty."

    .line 410
    .line 411
    invoke-static {v1}, Ln4;->j(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    return-void

    .line 415
    :cond_10
    :goto_7
    iget-object v4, v3, Ler0;->b:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 418
    .line 419
    if-eqz v4, :cond_11

    .line 420
    .line 421
    new-instance v4, Lfs0;

    .line 422
    .line 423
    invoke-direct {v4, v3}, Lfs0;-><init>(Ler0;)V

    .line 424
    .line 425
    .line 426
    new-instance v3, Lcom/supercell/titan/g;

    .line 427
    .line 428
    invoke-direct {v3, v1}, Lcom/supercell/titan/g;-><init>(Lcom/supercell/titan/PurchaseManagerGoogle;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2, v4, v3}, Lej;->e(Lfs0;Lcom/supercell/titan/g;)V

    .line 432
    .line 433
    .line 434
    goto :goto_a

    .line 435
    :cond_11
    const v0, 0x8c

    const-string v1, "Product list must be set to a non empty list."

    .line 436
    .line 437
    invoke-static {v1}, Ln4;->j(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :cond_12
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 446
    .line 447
    .line 448
    move-result v4

    .line 449
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    sget-object v4, Lcom/supercell/titan/PurchaseManager$ProductType;->IN_APP:Lcom/supercell/titan/PurchaseManager$ProductType;

    .line 453
    .line 454
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    new-instance v5, Ljava/util/ArrayList;

    .line 459
    .line 460
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 461
    .line 462
    .line 463
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    :cond_13
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 468
    .line 469
    .line 470
    move-result v7

    .line 471
    if-eqz v7, :cond_14

    .line 472
    .line 473
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v7

    .line 477
    check-cast v7, Lcom/supercell/titan/PurchaseManager$Product;

    .line 478
    .line 479
    iget-object v8, v7, Lcom/supercell/titan/PurchaseManager$Product;->type:Lcom/supercell/titan/PurchaseManager$ProductType;

    .line 480
    .line 481
    invoke-interface {v4, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result v8

    .line 485
    if-eqz v8, :cond_13

    .line 486
    .line 487
    iget-object v7, v7, Lcom/supercell/titan/PurchaseManager$Product;->id:Ljava/lang/String;

    .line 488
    .line 489
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    goto :goto_8

    .line 493
    :cond_14
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    if-nez v3, :cond_15

    .line 498
    .line 499
    new-instance v6, Ljava/util/ArrayList;

    .line 500
    .line 501
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 502
    .line 503
    .line 504
    const v0, 0x8d

    const-string v3, "inapp"

    .line 505
    .line 506
    move-object v12, v6

    .line 507
    move-object v6, v3

    .line 508
    move-object v3, v12

    .line 509
    goto :goto_9

    .line 510
    :cond_15
    move-object v3, v6

    .line 511
    :goto_9
    if-eqz v6, :cond_17

    .line 512
    .line 513
    if-eqz v3, :cond_16

    .line 514
    .line 515
    new-instance v4, Lwe2;

    .line 516
    .line 517
    const/4 v5, 0x0

    .line 518
    invoke-direct {v4, v5}, Lwe2;-><init>(I)V

    .line 519
    .line 520
    .line 521
    iput-object v6, v4, Lwe2;->c:Ljava/lang/Object;

    .line 522
    .line 523
    iput-object v3, v4, Lwe2;->b:Ljava/lang/Object;

    .line 524
    .line 525
    new-instance v3, Lcom/supercell/titan/h;

    .line 526
    .line 527
    invoke-direct {v3, v1}, Lcom/supercell/titan/h;-><init>(Lcom/supercell/titan/PurchaseManagerGoogle;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v2, v4, v3}, Lej;->f(Lwe2;Lcom/supercell/titan/h;)V

    .line 531
    .line 532
    .line 533
    :goto_a
    return-void

    .line 534
    :cond_16
    const v0, 0x8e

    const-string v1, "SKU list must be set"

    .line 535
    .line 536
    invoke-static {v1}, Ln4;->j(Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    return-void

    .line 540
    :cond_17
    const v0, 0x8f

    const-string v1, "SKU type must be set"

    .line 541
    .line 542
    invoke-static {v1}, Ln4;->j(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    return-void
.end method


# virtual methods
.method public doSignInAfterGoogleLogin()V
    .locals 0

    .line 1
    return-void
.end method

.method public getProductType(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/PurchaseManager;->g:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/supercell/titan/PurchaseManager$Product;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lcom/supercell/titan/PurchaseManager$Product;->type:Lcom/supercell/titan/PurchaseManager$ProductType;

    .line 12
    .line 13
    :goto_0
    iget-object p0, p0, Lcom/supercell/titan/PurchaseManager$ProductType;->name:Ljava/lang/String;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object p0, Lcom/supercell/titan/PurchaseManager$ProductType;->IN_APP:Lcom/supercell/titan/PurchaseManager$ProductType;

    .line 17
    .line 18
    goto :goto_0
.end method

.method public getProductsCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/PurchaseManager;->g:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    sput-object p0, Lcom/supercell/titan/PurchaseManager;->n:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 3
    .line 4
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 1
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 1
    return-void
.end method

.method public updateBeforeFrame()V
    .locals 10

    .line 1
    iget-boolean v1, p0, Lcom/supercell/titan/PurchaseManager;->m:Z

    .line 2
    .line 3
    if-nez v1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_a

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, Lcom/supercell/titan/PurchaseManager;->e:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    const v0, 0x90

    const-string v1, ""

    .line 12
    .line 13
    iput-object v1, p0, Lcom/supercell/titan/PurchaseManager;->e:Ljava/lang/String;

    .line 14
    .line 15
    :cond_1
    iget-object v1, p0, Lcom/supercell/titan/PurchaseManager;->d:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, Lcom/supercell/titan/PurchaseManager;->e:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_4

    .line 31
    .line 32
    :cond_2
    iget-object v1, p0, Lcom/supercell/titan/PurchaseManager;->e:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v3, -0x1

    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    iget-object v1, p0, Lcom/supercell/titan/PurchaseManager;->d:Ljava/util/ArrayList;

    .line 42
    .line 43
    monitor-enter v1

    .line 44
    :try_start_0
    iget-object v4, p0, Lcom/supercell/titan/PurchaseManager;->d:Ljava/util/ArrayList;

    .line 45
    .line 46
    new-array v5, v2, [Lcom/supercell/titan/PurchaseManager$ProductInfo;

    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, [Lcom/supercell/titan/PurchaseManager$ProductInfo;

    .line 53
    .line 54
    const v0, 0x91

    const-string v5, ""

    .line 55
    .line 56
    invoke-static {v4, v5, v3}, Lcom/supercell/titan/PurchaseManager;->updateBillingProductDetails([Lcom/supercell/titan/PurchaseManager$ProductInfo;Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    iget-object v4, p0, Lcom/supercell/titan/PurchaseManager;->d:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 62
    .line 63
    .line 64
    monitor-exit v1

    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p0

    .line 69
    :cond_3
    iget-object v1, p0, Lcom/supercell/titan/PurchaseManager;->e:Ljava/lang/String;

    .line 70
    .line 71
    new-array v4, v2, [Lcom/supercell/titan/PurchaseManager$ProductInfo;

    .line 72
    .line 73
    iget v5, p0, Lcom/supercell/titan/PurchaseManager;->f:I

    .line 74
    .line 75
    invoke-static {v4, v1, v5}, Lcom/supercell/titan/PurchaseManager;->updateBillingProductDetails([Lcom/supercell/titan/PurchaseManager$ProductInfo;Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    :goto_0
    const v0, 0x92

    const-string v1, ""

    .line 79
    .line 80
    iput-object v1, p0, Lcom/supercell/titan/PurchaseManager;->e:Ljava/lang/String;

    .line 81
    .line 82
    iput v3, p0, Lcom/supercell/titan/PurchaseManager;->f:I

    .line 83
    .line 84
    :cond_4
    iget-boolean v1, p0, Lcom/supercell/titan/PurchaseManager;->l:Z

    .line 85
    .line 86
    if-eqz v1, :cond_f

    .line 87
    .line 88
    iget-object v1, p0, Lcom/supercell/titan/PurchaseManager;->a:Ljava/util/Vector;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    move v3, v2

    .line 95
    :goto_1
    if-ge v3, v1, :cond_c

    .line 96
    .line 97
    iget-object v4, p0, Lcom/supercell/titan/PurchaseManager;->a:Ljava/util/Vector;

    .line 98
    .line 99
    invoke-virtual {v4, v2}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    check-cast v4, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;

    .line 104
    .line 105
    if-nez v4, :cond_5

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_5
    iget-object v5, v4, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->productID:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v6, v4, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->receipt:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v7, v4, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->signature:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v8, v4, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->transactionId:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v9, v4, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->purchaseToken:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v8, v5, v6, v7, v9}, Lcom/supercell/titan/PurchaseManager;->billingProductBought(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object v5, p0, Lcom/supercell/titan/PurchaseManager;->i:Ljava/util/Vector;

    .line 122
    .line 123
    iget-object v6, p0, Lcom/supercell/titan/PurchaseManager;->j:Ljava/util/Set;

    .line 124
    .line 125
    iget-object v7, v4, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->transactionId:Ljava/lang/String;

    .line 126
    .line 127
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_6

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_6
    move v6, v2

    .line 135
    :goto_2
    invoke-virtual {v5}, Ljava/util/Vector;->size()I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-ge v6, v7, :cond_8

    .line 140
    .line 141
    invoke-virtual {v5, v6}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    check-cast v7, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;

    .line 146
    .line 147
    iget-object v7, v7, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->transactionId:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v8, v4, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->transactionId:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    if-eqz v7, :cond_7

    .line 156
    .line 157
    invoke-virtual {v5, v6}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_8
    :goto_3
    invoke-virtual {v5}, Ljava/util/Vector;->size()I

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    const/16 v7, 0x64

    .line 169
    .line 170
    if-lt v6, v7, :cond_9

    .line 171
    .line 172
    invoke-virtual {v5, v2}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    :cond_9
    move v6, v2

    .line 176
    :goto_4
    invoke-virtual {v5}, Ljava/util/Vector;->size()I

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    if-ge v6, v7, :cond_b

    .line 181
    .line 182
    invoke-virtual {v5, v6}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    check-cast v7, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;

    .line 187
    .line 188
    iget-object v7, v7, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->transactionId:Ljava/lang/String;

    .line 189
    .line 190
    iget-object v8, v4, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->transactionId:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    if-eqz v7, :cond_a

    .line 197
    .line 198
    invoke-virtual {v5, v6}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_b
    :goto_5
    invoke-virtual {v5, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_c
    iget-object v1, p0, Lcom/supercell/titan/PurchaseManager;->b:Ljava/util/Vector;

    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    move v3, v2

    .line 218
    :goto_7
    if-ge v3, v1, :cond_e

    .line 219
    .line 220
    iget-object v4, p0, Lcom/supercell/titan/PurchaseManager;->b:Ljava/util/Vector;

    .line 221
    .line 222
    invoke-virtual {v4, v2}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    check-cast v4, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;

    .line 227
    .line 228
    if-nez v4, :cond_d

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_d
    iget-object v5, v4, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->productID:Ljava/lang/String;

    .line 232
    .line 233
    iget-object v6, v4, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->localizedDescription:Ljava/lang/String;

    .line 234
    .line 235
    iget v4, v4, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->errorCode:I

    .line 236
    .line 237
    invoke-static {v5, v6, v4}, Lcom/supercell/titan/PurchaseManager;->billingProductFailed(Ljava/lang/String;Ljava/lang/String;I)V

    .line 238
    .line 239
    .line 240
    :goto_8
    add-int/lit8 v3, v3, 0x1

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_e
    iget-object v1, p0, Lcom/supercell/titan/PurchaseManager;->c:Ljava/util/Vector;

    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    move v3, v2

    .line 250
    :goto_9
    if-ge v3, v1, :cond_f

    .line 251
    .line 252
    iget-object v4, p0, Lcom/supercell/titan/PurchaseManager;->c:Ljava/util/Vector;

    .line 253
    .line 254
    invoke-virtual {v4, v2}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    check-cast v4, Ljava/lang/String;

    .line 259
    .line 260
    invoke-static {v4}, Lcom/supercell/titan/PurchaseManager;->billingProductCanceled(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    add-int/lit8 v3, v3, 0x1

    .line 264
    .line 265
    goto :goto_9

    .line 266
    :cond_f
    :goto_a
    return-void
.end method
