.class public final Lcom/supercell/titan/usercentrics/UsercentricsSDK;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/titan/usercentrics/UsercentricsSDK$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086 J\t\u0010\u000b\u001a\u00020\u0005H\u0086 J\t\u0010\u000c\u001a\u00020\u0005H\u0086 J\t\u0010\r\u001a\u00020\u0005H\u0086 J\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001a\u0010\u0014\u001a\u00020\t2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J:\u0010\u0019\u001a\u00020\u00052\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0002J\u0006\u0010 \u001a\u00020\u0005\u00a8\u0006\""
    }
    d2 = {
        "Lcom/supercell/titan/usercentrics/UsercentricsSDK;",
        "",
        "<init>",
        "()V",
        "gotConsent",
        "",
        "consentJson",
        "",
        "didAnyConsentChangeToGiven",
        "",
        "isAnyConsentGiven",
        "gotFailure",
        "popupShowing",
        "popupClosed",
        "getConsentOrShowDialog",
        "activity",
        "Landroid/app/Activity;",
        "buttonLayout",
        "",
        "showDialog",
        "areAllTCFVendorPurposesConsented",
        "vendor",
        "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;",
        "tcfData",
        "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;",
        "applyConsent",
        "consentsBefore",
        "",
        "Lcom/usercentrics/sdk/UsercentricsServiceConsent;",
        "consentsAfter",
        "tcfDataBefore",
        "tcfDataAfter",
        "reset",
        "Companion",
        "usercentrics"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/supercell/titan/usercentrics/UsercentricsSDK$Companion;

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lcom/supercell/titan/usercentrics/UsercentricsSDK;

    const v1, 0x1b

    const-string v0, "UsercentricsSDK"

    sput-object v0, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/supercell/titan/usercentrics/UsercentricsSDK$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/supercell/titan/usercentrics/UsercentricsSDK$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->Companion:Lcom/supercell/titan/usercentrics/UsercentricsSDK$Companion;

    .line 8
    .line 9
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

.method public static synthetic a(Lcom/usercentrics/sdk/UsercentricsReadyStatus;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->reset$lambda$21(Lcom/usercentrics/sdk/UsercentricsReadyStatus;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final applyConsent(Ljava/util/List;Ljava/util/List;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/usercentrics/sdk/UsercentricsServiceConsent;",
            ">;",
            "Ljava/util/List<",
            "Lcom/usercentrics/sdk/UsercentricsServiceConsent;",
            ">;",
            "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;",
            "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p2, :cond_1

    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-eqz v3, :cond_1

    .line 11
    .line 12
    :cond_0
    move p1, v2

    .line 13
    goto :goto_4

    .line 14
    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Lcom/usercentrics/sdk/UsercentricsServiceConsent;

    .line 29
    .line 30
    if-eqz p1, :cond_7

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_4

    .line 41
    .line 42
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    move-object v7, v6

    .line 47
    check-cast v7, Lcom/usercentrics/sdk/UsercentricsServiceConsent;

    .line 48
    .line 49
    iget-object v7, v7, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->a:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v8, v4, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->a:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-eqz v7, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    move-object v6, v0

    .line 61
    :goto_0
    check-cast v6, Lcom/usercentrics/sdk/UsercentricsServiceConsent;

    .line 62
    .line 63
    if-eqz v6, :cond_6

    .line 64
    .line 65
    iget-boolean v5, v6, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->b:Z

    .line 66
    .line 67
    iget-boolean v4, v4, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->b:Z

    .line 68
    .line 69
    if-eq v5, v4, :cond_5

    .line 70
    .line 71
    if-eqz v4, :cond_5

    .line 72
    .line 73
    move v4, v1

    .line 74
    goto :goto_1

    .line 75
    :cond_5
    move v4, v2

    .line 76
    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    goto :goto_2

    .line 81
    :cond_6
    move-object v4, v0

    .line 82
    :goto_2
    if-eqz v4, :cond_7

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    goto :goto_3

    .line 89
    :cond_7
    move v4, v2

    .line 90
    :goto_3
    if-eqz v4, :cond_2

    .line 91
    .line 92
    move p1, v1

    .line 93
    :goto_4
    if-eqz p3, :cond_8

    .line 94
    .line 95
    if-eqz p4, :cond_8

    .line 96
    .line 97
    iget-object v3, p4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->f:Ljava/util/List;

    .line 98
    .line 99
    if-eqz v3, :cond_9

    .line 100
    .line 101
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_9

    .line 106
    .line 107
    :cond_8
    move p3, v2

    .line 108
    goto/16 :goto_a

    .line 109
    .line 110
    :cond_9
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    :cond_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_8

    .line 119
    .line 120
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    check-cast v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 125
    .line 126
    iget-object v5, p3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->f:Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    :cond_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-eqz v6, :cond_c

    .line 137
    .line 138
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    move-object v7, v6

    .line 143
    check-cast v7, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 144
    .line 145
    iget v8, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 146
    .line 147
    iget v7, v7, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 148
    .line 149
    if-ne v8, v7, :cond_b

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_c
    move-object v6, v0

    .line 153
    :goto_5
    check-cast v6, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 154
    .line 155
    invoke-direct {p0, v6, p3}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->areAllTCFVendorPurposesConsented(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    invoke-direct {p0, v4, p4}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->areAllTCFVendorPurposesConsented(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Z

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    if-eqz v5, :cond_e

    .line 164
    .line 165
    if-eqz v6, :cond_d

    .line 166
    .line 167
    iget-object v5, v6, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->a:Ljava/lang/Boolean;

    .line 168
    .line 169
    if-eqz v5, :cond_d

    .line 170
    .line 171
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    goto :goto_6

    .line 176
    :cond_d
    move v5, v2

    .line 177
    :goto_6
    if-eqz v5, :cond_e

    .line 178
    .line 179
    move v5, v1

    .line 180
    goto :goto_7

    .line 181
    :cond_e
    move v5, v2

    .line 182
    :goto_7
    if-eqz v7, :cond_10

    .line 183
    .line 184
    iget-object v4, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->a:Ljava/lang/Boolean;

    .line 185
    .line 186
    if-eqz v4, :cond_f

    .line 187
    .line 188
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    goto :goto_8

    .line 193
    :cond_f
    move v4, v2

    .line 194
    :goto_8
    if-eqz v4, :cond_10

    .line 195
    .line 196
    move v4, v1

    .line 197
    goto :goto_9

    .line 198
    :cond_10
    move v4, v2

    .line 199
    :goto_9
    if-eq v4, v5, :cond_a

    .line 200
    .line 201
    if-eqz v4, :cond_a

    .line 202
    .line 203
    move p3, v1

    .line 204
    :goto_a
    new-instance v0, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    :cond_11
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    if-eqz v4, :cond_12

    .line 218
    .line 219
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    move-object v5, v4

    .line 224
    check-cast v5, Lcom/usercentrics/sdk/UsercentricsServiceConsent;

    .line 225
    .line 226
    iget-boolean v5, v5, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->g:Z

    .line 227
    .line 228
    if-nez v5, :cond_11

    .line 229
    .line 230
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_b

    .line 234
    :cond_12
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_14

    .line 239
    .line 240
    :cond_13
    move v0, v2

    .line 241
    goto :goto_c

    .line 242
    :cond_14
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    :cond_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    if-eqz v3, :cond_13

    .line 251
    .line 252
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    check-cast v3, Lcom/usercentrics/sdk/UsercentricsServiceConsent;

    .line 257
    .line 258
    iget-boolean v3, v3, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->b:Z

    .line 259
    .line 260
    if-eqz v3, :cond_15

    .line 261
    .line 262
    move v0, v1

    .line 263
    :goto_c
    if-eqz p4, :cond_19

    .line 264
    .line 265
    iget-object p4, p4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->f:Ljava/util/List;

    .line 266
    .line 267
    if-eqz p4, :cond_19

    .line 268
    .line 269
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    if-eqz v3, :cond_16

    .line 274
    .line 275
    goto :goto_e

    .line 276
    :cond_16
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 277
    .line 278
    .line 279
    move-result-object p4

    .line 280
    :cond_17
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-eqz v3, :cond_19

    .line 285
    .line 286
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    check-cast v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 291
    .line 292
    iget-object v3, v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->a:Ljava/lang/Boolean;

    .line 293
    .line 294
    if-eqz v3, :cond_18

    .line 295
    .line 296
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    goto :goto_d

    .line 301
    :cond_18
    move v3, v2

    .line 302
    :goto_d
    if-eqz v3, :cond_17

    .line 303
    .line 304
    move p4, v1

    .line 305
    goto :goto_f

    .line 306
    :cond_19
    :goto_e
    move p4, v2

    .line 307
    :goto_f
    new-instance v7, Lt03;

    .line 308
    .line 309
    invoke-direct {v7, v1}, Lt03;-><init>(I)V

    .line 310
    .line 311
    .line 312
    const/16 v8, 0x1e

    .line 313
    .line 314
    const v4, 0x1e

    const-string v4, ","

    .line 315
    .line 316
    const/4 v5, 0x0

    .line 317
    const/4 v6, 0x0

    .line 318
    move-object v3, p2

    .line 319
    invoke-static/range {v3 .. v8}, Lkotlin/collections/CollectionsKt;->x(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p2

    .line 323
    const v3, 0x1f

    const-string v3, "["

    .line 324
    .line 325
    const v4, 0x20

    const-string v4, "]"

    .line 326
    .line 327
    invoke-static {v3, p2, v4}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p2

    .line 331
    if-nez p1, :cond_1b

    .line 332
    .line 333
    if-eqz p3, :cond_1a

    .line 334
    .line 335
    goto :goto_10

    .line 336
    :cond_1a
    move p1, v2

    .line 337
    goto :goto_11

    .line 338
    :cond_1b
    :goto_10
    move p1, v1

    .line 339
    :goto_11
    if-nez v0, :cond_1d

    .line 340
    .line 341
    if-eqz p4, :cond_1c

    .line 342
    .line 343
    goto :goto_12

    .line 344
    :cond_1c
    move v1, v2

    .line 345
    :cond_1d
    :goto_12
    invoke-virtual {p0, p2, p1, v1}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->gotConsent(Ljava/lang/String;ZZ)V

    .line 346
    .line 347
    .line 348
    return-void
.end method

.method private static final applyConsent$lambda$20(Lcom/usercentrics/sdk/UsercentricsServiceConsent;)Ljava/lang/CharSequence;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->a:Ljava/lang/String;

    .line 5
    .line 6
    iget-boolean v1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->b:Z

    .line 7
    .line 8
    iget-boolean v2, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->g:Z

    .line 9
    .line 10
    iget-object p0, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->f:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const v4, 0x21

    const-string v4, "\n\t\t\t\t{\n\t\t\t\t\t\"templateId\": \""

    .line 15
    .line 16
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const v0, 0x22

    const-string v0, "\",\n\t\t\t\t\t\"status\": "

    .line 23
    .line 24
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const v0, 0x23

    const-string v0, ",\n\t\t\t\t\t\"isEssential\": "

    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const v0, 0x24

    const-string v0, ",\n\t\t\t\t\t\"version\": \""

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const p0, 0x25

    const-string p0, "\"\n\t\t\t\t}\n\t\t\t"

    .line 47
    .line 48
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Lkotlin/text/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method private final areAllTCFVendorPurposesConsented(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Z
    .locals 6

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    invoke-static {p1, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 34
    .line 35
    iget v1, v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 36
    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v0, p0

    .line 46
    :cond_1
    const/4 p1, 0x0

    .line 47
    if-eqz v0, :cond_8

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v2, 0x1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    return v2

    .line 57
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_7

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    iget-object v3, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->b:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_5

    .line 88
    .line 89
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    move-object v5, v4

    .line 94
    check-cast v5, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;

    .line 95
    .line 96
    iget v5, v5, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->c:I

    .line 97
    .line 98
    if-ne v5, v1, :cond_4

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    move-object v4, p0

    .line 102
    :goto_1
    check-cast v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;

    .line 103
    .line 104
    if-eqz v4, :cond_6

    .line 105
    .line 106
    iget-object v1, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->e:Ljava/lang/Boolean;

    .line 107
    .line 108
    if-eqz v1, :cond_6

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    goto :goto_2

    .line 115
    :cond_6
    move v1, p1

    .line 116
    :goto_2
    if-nez v1, :cond_3

    .line 117
    .line 118
    return p1

    .line 119
    :cond_7
    return v2

    .line 120
    :cond_8
    return p1
.end method

.method public static synthetic b(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)V
    .locals 0

    .line 1
    invoke-static {p1, p0, p2, p3, p4}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->showDialog$lambda$6$lambda$5$lambda$4(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Landroid/app/Activity;ILcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->showDialog$lambda$6$lambda$5(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Lcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lnz2;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->showDialog$lambda$6$lambda$5$lambda$4$lambda$3(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Lcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lnz2;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lcom/usercentrics/sdk/UsercentricsServiceConsent;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->applyConsent$lambda$20(Lcom/usercentrics/sdk/UsercentricsServiceConsent;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->showDialog$lambda$6(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p1, p0, p2, p3}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->getConsentOrShowDialog$lambda$0(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Landroid/app/Activity;ILcom/usercentrics/sdk/UsercentricsReadyStatus;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final getConsentOrShowDialog$lambda$0(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Landroid/app/Activity;ILcom/usercentrics/sdk/UsercentricsReadyStatus;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p3, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->a:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->showDialog(Landroid/app/Activity;I)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p3, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->b:Ljava/util/List;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p0, p2, p1, p2, p2}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->applyConsent(Ljava/util/List;Ljava/util/List;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final getConsentOrShowDialog$lambda$1(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Ltz2;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->gotFailure()V

    .line 5
    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const v0, 0x26

    const-string v0, "Not ready at getConsentOrShowDialog(). Reason: "

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const p1, 0x27

    const-string p1, "UsercentricsSDK"

    .line 22
    .line 23
    invoke-static {p1, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method

.method public static synthetic h(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Lnz2;Lcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->showDialog$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Lnz2;Lcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic i(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Ltz2;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->getConsentOrShowDialog$lambda$1(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Ltz2;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic j(Ltz2;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->showDialog$lambda$7(Ltz2;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k(Ltz2;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->reset$lambda$22(Ltz2;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final reset$lambda$21(Lcom/usercentrics/sdk/UsercentricsReadyStatus;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final reset$lambda$22(Ltz2;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const v1, 0x28

    const-string v1, "Error clearing Usercentrics user session. Reason: "

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const v0, 0x29

    const-string v0, "UsercentricsSDK"

    .line 19
    .line 20
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0
.end method

.method private static final showDialog$lambda$6(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lde3;->r()Lu03;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lp03;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1, p2, p3}, Lp03;-><init>(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lu03;->a(Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0
.end method

.method private static final showDialog$lambda$6$lambda$5(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Lkotlin/Unit;
    .locals 6

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr03;

    .line 5
    .line 6
    move-object v1, p0

    .line 7
    move-object v2, p1

    .line 8
    move v3, p2

    .line 9
    move-object v4, p3

    .line 10
    move-object v5, p4

    .line 11
    invoke-direct/range {v0 .. v5}, Lr03;-><init>(Landroid/app/Activity;Lcom/supercell/titan/usercentrics/UsercentricsSDK;ILcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final showDialog$lambda$6$lambda$5$lambda$4(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Landroid/app/Activity;ILcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->popupShowing()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkq0;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lgj0;

    .line 10
    .line 11
    invoke-static/range {p2 .. p2}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->showDialog$lambda$6$lambda$5$lambda$4$buttonLayout(I)Lkl;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v1, v2}, Lgj0;-><init>(Lkl;)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Lm82;

    .line 19
    .line 20
    invoke-static/range {p2 .. p2}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->showDialog$lambda$6$lambda$5$lambda$4$buttonLayout(I)Lkl;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-direct {v2, v3}, Lm82;-><init>(Lkl;)V

    .line 25
    .line 26
    .line 27
    new-instance v3, Loh;

    .line 28
    .line 29
    invoke-direct {v3, v0, v1, v2}, Loh;-><init>(Lkq0;Lgj0;Lm82;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lra2;

    .line 33
    .line 34
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v3, v0, Lra2;->a:Ljava/lang/Object;

    .line 41
    .line 42
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 43
    .line 44
    move-object/from16 v2, p1

    .line 45
    .line 46
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iput-object v1, v0, Lra2;->d:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance v1, Ls03;

    .line 52
    .line 53
    move-object/from16 v2, p0

    .line 54
    .line 55
    move-object/from16 v3, p3

    .line 56
    .line 57
    move-object/from16 v4, p4

    .line 58
    .line 59
    invoke-direct {v1, v2, v3, v4}, Ls03;-><init>(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Lcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)V

    .line 60
    .line 61
    .line 62
    iput-object v1, v0, Lra2;->c:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-static {}, Lde3;->r()Lu03;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    new-instance v2, Lsh;

    .line 69
    .line 70
    const/4 v3, 0x1

    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-direct {v2, v3, v4, v0, v1}, Lsh;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    move-object v6, v1

    .line 76
    check-cast v6, La13;

    .line 77
    .line 78
    iget-object v0, v6, La13;->a:Lfb1;

    .line 79
    .line 80
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-nez v1, :cond_0

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-eqz v1, :cond_1

    .line 92
    .line 93
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    goto :goto_0

    .line 98
    :cond_1
    move-object v1, v4

    .line 99
    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :goto_1
    iget-object v1, v0, Lfb1;->t:Lhk2;

    .line 107
    .line 108
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Lsx0;

    .line 113
    .line 114
    iget-object v7, v1, Lsx0;->l:Lg13;

    .line 115
    .line 116
    if-eqz v7, :cond_3

    .line 117
    .line 118
    iget-object v1, v6, La13;->c:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_2

    .line 125
    .line 126
    iget-object v1, v6, La13;->a:Lfb1;

    .line 127
    .line 128
    iget-object v1, v1, Lfb1;->F:Lhk2;

    .line 129
    .line 130
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Lac2;

    .line 135
    .line 136
    iget-object v1, v1, Lac2;->c:Lk61;

    .line 137
    .line 138
    iget-object v1, v1, Lk61;->e:Ljava/lang/String;

    .line 139
    .line 140
    :cond_2
    move-object v8, v1

    .line 141
    invoke-virtual {v0}, Lfb1;->f()Lpc2;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    iget-object v1, v0, Lfb1;->p:Lhk2;

    .line 146
    .line 147
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    move-object v11, v1

    .line 152
    check-cast v11, Lsr2;

    .line 153
    .line 154
    iget-object v1, v0, Lfb1;->I:Lhk2;

    .line 155
    .line 156
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    move-object v12, v1

    .line 161
    check-cast v12, Lyr;

    .line 162
    .line 163
    iget-object v1, v0, Lfb1;->F:Lhk2;

    .line 164
    .line 165
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    move-object v13, v1

    .line 170
    check-cast v13, Lac2;

    .line 171
    .line 172
    invoke-virtual {v6}, La13;->m()Lil2;

    .line 173
    .line 174
    .line 175
    move-result-object v14

    .line 176
    iget-object v1, v0, Lfb1;->X:Lhk2;

    .line 177
    .line 178
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    move-object v15, v1

    .line 183
    check-cast v15, Ly3;

    .line 184
    .line 185
    invoke-virtual {v0}, Lfb1;->b()Lx80;

    .line 186
    .line 187
    .line 188
    move-result-object v16

    .line 189
    invoke-virtual {v0}, Lfb1;->e()Li03;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    new-instance v5, Lb5;

    .line 194
    .line 195
    invoke-direct/range {v5 .. v16}, Lb5;-><init>(La13;Lg13;Ljava/lang/String;Li03;Lpc2;Lsr2;Lyr;Lac2;Lil2;Ly3;Lx80;)V

    .line 196
    .line 197
    .line 198
    new-instance v0, Lsh;

    .line 199
    .line 200
    const/4 v1, 0x2

    .line 201
    invoke-direct {v0, v1, v6, v4, v2}, Lsh;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    iget-object v1, v5, Lb5;->f:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v1, Lth;

    .line 207
    .line 208
    new-instance v2, Loc;

    .line 209
    .line 210
    const/16 v3, 0x10

    .line 211
    .line 212
    invoke-direct {v2, v3, v0, v5}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iget-object v0, v1, Lth;->b:Lac2;

    .line 216
    .line 217
    iget-object v0, v0, Lac2;->c:Lk61;

    .line 218
    .line 219
    iget-object v3, v1, Lth;->h:Lx80;

    .line 220
    .line 221
    new-instance v5, Lqh;

    .line 222
    .line 223
    const/4 v7, 0x0

    .line 224
    invoke-direct {v5, v1, v0, v4, v7}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3, v5}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    new-instance v4, Lsh;

    .line 232
    .line 233
    invoke-direct {v4, v7, v1, v2, v0}, Lsh;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3, v4}, Lec;->H(Lkotlin/jvm/functions/Function1;)V

    .line 237
    .line 238
    .line 239
    sget-object v0, Lez2;->b:Lez2;

    .line 240
    .line 241
    invoke-virtual {v6, v0}, La13;->c(Lez2;)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_3
    new-instance v0, Lvz2;

    .line 246
    .line 247
    const v1, 0x2a

    const-string v1, "Usercentrics is still initializing. Please, check if you are trying to show the UI before the `isReady` was invoked."

    .line 248
    .line 249
    invoke-direct {v0, v1}, Lvz2;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw v0
.end method

.method private static final showDialog$lambda$6$lambda$5$lambda$4$buttonLayout(I)Lkl;
    .locals 1

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p0, v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p0, Lil;

    .line 14
    .line 15
    invoke-direct {p0}, Lil;-><init>()V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    new-instance p0, Ljl;

    .line 20
    .line 21
    invoke-direct {p0}, Ljl;-><init>()V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_2
    new-instance p0, Lhl;

    .line 26
    .line 27
    invoke-direct {p0}, Lhl;-><init>()V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method private static final showDialog$lambda$6$lambda$5$lambda$4$lambda$3(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Lcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lnz2;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-static {}, Lde3;->r()Lu03;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lq03;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, p2, p3}, Lq03;-><init>(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Lcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lnz2;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lu03;->a(Lkotlin/jvm/functions/Function1;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0
.end method

.method private static final showDialog$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Lnz2;Lcom/usercentrics/sdk/UsercentricsReadyStatus;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->popupClosed()V

    .line 5
    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const p1, 0x2b

    const-string p1, ""

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    invoke-virtual {p0, p1, p2, p2}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->gotConsent(Ljava/lang/String;ZZ)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p2, p2, Lcom/usercentrics/sdk/UsercentricsReadyStatus;->b:Ljava/util/List;

    .line 17
    .line 18
    iget-object p1, p1, Lnz2;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-direct {p0, p2, p1, p3, p4}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->applyConsent(Ljava/util/List;Ljava/util/List;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0
.end method

.method private static final showDialog$lambda$7(Ltz2;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const v1, 0x2c

    const-string v1, "Not ready at showDialog(). Reason: "

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const v0, 0x2d

    const-string v0, "UsercentricsSDK"

    .line 19
    .line 20
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0
.end method


# virtual methods
.method public final getConsentOrShowDialog(Landroid/app/Activity;I)V
    .locals 0

    invoke-virtual {p0}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->gotFailure()V

    return-void
.end method

.method public final native gotConsent(Ljava/lang/String;ZZ)V
.end method

.method public final native gotFailure()V
.end method

.method public final native popupClosed()V
.end method

.method public final native popupShowing()V
.end method

.method public final reset()V
    .locals 0

    return-void
.end method

.method public final showDialog(Landroid/app/Activity;I)V
    .locals 0

    invoke-virtual {p0}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->gotFailure()V

    return-void
.end method
