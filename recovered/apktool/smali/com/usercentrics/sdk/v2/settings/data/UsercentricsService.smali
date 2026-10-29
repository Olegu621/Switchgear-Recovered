.class public final Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService$$serializer;,
        Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService$Companion;

.field public static final V:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final A:Ljava/lang/String;

.field public final B:Ljava/lang/String;

.field public final C:Ljava/lang/String;

.field public final D:Ljava/lang/String;

.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Ljava/lang/String;

.field public final J:Ljava/lang/String;

.field public final K:Ljava/lang/Long;

.field public final L:Ljava/lang/Boolean;

.field public final M:Ljava/lang/String;

.field public final N:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

.field public final O:Ljava/lang/String;

.field public final P:Z

.field public final Q:Ljava/lang/String;

.field public final R:Ljava/lang/Boolean;

.field public final S:Ljava/lang/Boolean;

.field public final T:Ljava/lang/Boolean;

.field public final U:Z

.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/util/List;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/util/List;

.field public final l:Ljava/util/List;

.field public final m:Ljava/util/List;

.field public final n:Ljava/util/List;

.field public final o:Ljava/util/List;

.field public final p:Ljava/util/List;

.field public final q:Ljava/util/List;

.field public final r:Ljava/util/List;

.field public final s:Ljava/lang/String;

.field public final t:Ljava/lang/String;

.field public final u:Ljava/lang/String;

.field public final v:Ljava/lang/Boolean;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->Companion:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService$Companion;

    .line 7
    .line 8
    new-instance v0, Lgd;

    .line 9
    .line 10
    sget-object v1, Lvh2;->a:Lvh2;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 14
    .line 15
    .line 16
    new-instance v3, Lgd;

    .line 17
    .line 18
    invoke-direct {v3, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lgd;

    .line 22
    .line 23
    invoke-direct {v4, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 24
    .line 25
    .line 26
    new-instance v5, Lgd;

    .line 27
    .line 28
    invoke-direct {v5, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 29
    .line 30
    .line 31
    new-instance v6, Lgd;

    .line 32
    .line 33
    invoke-direct {v6, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 34
    .line 35
    .line 36
    new-instance v7, Lgd;

    .line 37
    .line 38
    invoke-direct {v7, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 39
    .line 40
    .line 41
    const/16 v1, 0x2b

    .line 42
    .line 43
    new-array v1, v1, [Lkotlinx/serialization/KSerializer;

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    aput-object v8, v1, v2

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    aput-object v8, v1, v2

    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    aput-object v8, v1, v2

    .line 53
    .line 54
    const/4 v2, 0x3

    .line 55
    aput-object v0, v1, v2

    .line 56
    .line 57
    const/4 v0, 0x4

    .line 58
    aput-object v8, v1, v0

    .line 59
    .line 60
    const/4 v0, 0x5

    .line 61
    aput-object v3, v1, v0

    .line 62
    .line 63
    const/4 v0, 0x6

    .line 64
    aput-object v8, v1, v0

    .line 65
    .line 66
    const/4 v0, 0x7

    .line 67
    aput-object v8, v1, v0

    .line 68
    .line 69
    const/16 v0, 0x8

    .line 70
    .line 71
    aput-object v8, v1, v0

    .line 72
    .line 73
    const/16 v0, 0x9

    .line 74
    .line 75
    aput-object v8, v1, v0

    .line 76
    .line 77
    const/16 v0, 0xa

    .line 78
    .line 79
    aput-object v8, v1, v0

    .line 80
    .line 81
    const/16 v0, 0xb

    .line 82
    .line 83
    aput-object v4, v1, v0

    .line 84
    .line 85
    const/16 v0, 0xc

    .line 86
    .line 87
    aput-object v8, v1, v0

    .line 88
    .line 89
    const/16 v0, 0xd

    .line 90
    .line 91
    aput-object v8, v1, v0

    .line 92
    .line 93
    const/16 v0, 0xe

    .line 94
    .line 95
    aput-object v8, v1, v0

    .line 96
    .line 97
    const/16 v0, 0xf

    .line 98
    .line 99
    aput-object v5, v1, v0

    .line 100
    .line 101
    const/16 v0, 0x10

    .line 102
    .line 103
    aput-object v6, v1, v0

    .line 104
    .line 105
    const/16 v0, 0x11

    .line 106
    .line 107
    aput-object v7, v1, v0

    .line 108
    .line 109
    const/16 v0, 0x12

    .line 110
    .line 111
    aput-object v8, v1, v0

    .line 112
    .line 113
    const/16 v0, 0x13

    .line 114
    .line 115
    aput-object v8, v1, v0

    .line 116
    .line 117
    const/16 v0, 0x14

    .line 118
    .line 119
    aput-object v8, v1, v0

    .line 120
    .line 121
    const/16 v0, 0x15

    .line 122
    .line 123
    aput-object v8, v1, v0

    .line 124
    .line 125
    const/16 v0, 0x16

    .line 126
    .line 127
    aput-object v8, v1, v0

    .line 128
    .line 129
    const/16 v0, 0x17

    .line 130
    .line 131
    aput-object v8, v1, v0

    .line 132
    .line 133
    const/16 v0, 0x18

    .line 134
    .line 135
    aput-object v8, v1, v0

    .line 136
    .line 137
    const/16 v0, 0x19

    .line 138
    .line 139
    aput-object v8, v1, v0

    .line 140
    .line 141
    const/16 v0, 0x1a

    .line 142
    .line 143
    aput-object v8, v1, v0

    .line 144
    .line 145
    const/16 v0, 0x1b

    .line 146
    .line 147
    aput-object v8, v1, v0

    .line 148
    .line 149
    const/16 v0, 0x1c

    .line 150
    .line 151
    aput-object v8, v1, v0

    .line 152
    .line 153
    const/16 v0, 0x1d

    .line 154
    .line 155
    aput-object v8, v1, v0

    .line 156
    .line 157
    const/16 v0, 0x1e

    .line 158
    .line 159
    aput-object v8, v1, v0

    .line 160
    .line 161
    const/16 v0, 0x1f

    .line 162
    .line 163
    aput-object v8, v1, v0

    .line 164
    .line 165
    const/16 v0, 0x20

    .line 166
    .line 167
    aput-object v8, v1, v0

    .line 168
    .line 169
    const/16 v0, 0x21

    .line 170
    .line 171
    aput-object v8, v1, v0

    .line 172
    .line 173
    const/16 v0, 0x22

    .line 174
    .line 175
    aput-object v8, v1, v0

    .line 176
    .line 177
    const/16 v0, 0x23

    .line 178
    .line 179
    aput-object v8, v1, v0

    .line 180
    .line 181
    const/16 v0, 0x24

    .line 182
    .line 183
    aput-object v8, v1, v0

    .line 184
    .line 185
    const/16 v0, 0x25

    .line 186
    .line 187
    aput-object v8, v1, v0

    .line 188
    .line 189
    const/16 v0, 0x26

    .line 190
    .line 191
    aput-object v8, v1, v0

    .line 192
    .line 193
    const/16 v0, 0x27

    .line 194
    .line 195
    aput-object v8, v1, v0

    .line 196
    .line 197
    const/16 v0, 0x28

    .line 198
    .line 199
    aput-object v8, v1, v0

    .line 200
    .line 201
    const/16 v0, 0x29

    .line 202
    .line 203
    aput-object v8, v1, v0

    .line 204
    .line 205
    const/16 v0, 0x2a

    .line 206
    .line 207
    aput-object v8, v1, v0

    .line 208
    .line 209
    sput-object v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->V:[Lkotlinx/serialization/KSerializer;

    .line 210
    .line 211
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->a:Ljava/lang/String;

    :goto_0
    and-int/lit8 p3, p1, 0x2

    if-nez p3, :cond_1

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->b:Ljava/lang/String;

    :goto_1
    and-int/lit8 p3, p1, 0x4

    if-nez p3, :cond_2

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->c:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p5, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->c:Ljava/lang/String;

    :goto_2
    and-int/lit8 p3, p1, 0x8

    if-nez p3, :cond_3

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->d:Ljava/util/List;

    goto :goto_3

    :cond_3
    iput-object p6, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->d:Ljava/util/List;

    :goto_3
    and-int/lit8 p3, p1, 0x10

    const-string p4, ""

    if-nez p3, :cond_4

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->e:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p7, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->e:Ljava/lang/String;

    :goto_4
    and-int/lit8 p3, p1, 0x20

    if-nez p3, :cond_5

    .line 2
    sget-object p3, Lnd0;->a:Lnd0;

    .line 3
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->f:Ljava/util/List;

    goto :goto_5

    :cond_5
    iput-object p8, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->f:Ljava/util/List;

    :goto_5
    and-int/lit8 p3, p1, 0x40

    if-nez p3, :cond_6

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->g:Ljava/lang/String;

    goto :goto_6

    :cond_6
    iput-object p9, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->g:Ljava/lang/String;

    :goto_6
    and-int/lit16 p3, p1, 0x80

    if-nez p3, :cond_7

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->h:Ljava/lang/String;

    goto :goto_7

    :cond_7
    iput-object p10, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->h:Ljava/lang/String;

    :goto_7
    and-int/lit16 p3, p1, 0x100

    if-nez p3, :cond_8

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->i:Ljava/lang/String;

    goto :goto_8

    :cond_8
    iput-object p11, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->i:Ljava/lang/String;

    :goto_8
    and-int/lit16 p3, p1, 0x200

    if-nez p3, :cond_9

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->j:Ljava/lang/String;

    goto :goto_9

    :cond_9
    iput-object p12, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->j:Ljava/lang/String;

    :goto_9
    and-int/lit16 p3, p1, 0x400

    if-nez p3, :cond_a

    .line 4
    sget-object p3, Lnd0;->a:Lnd0;

    .line 5
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->k:Ljava/util/List;

    goto :goto_a

    :cond_a
    iput-object p13, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->k:Ljava/util/List;

    :goto_a
    and-int/lit16 p3, p1, 0x800

    if-nez p3, :cond_b

    .line 6
    sget-object p3, Lnd0;->a:Lnd0;

    .line 7
    :goto_b
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->l:Ljava/util/List;

    goto :goto_c

    :cond_b
    move-object/from16 p3, p14

    goto :goto_b

    :goto_c
    and-int/lit16 p3, p1, 0x1000

    if-nez p3, :cond_c

    .line 8
    sget-object p3, Lnd0;->a:Lnd0;

    .line 9
    :goto_d
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->m:Ljava/util/List;

    goto :goto_e

    :cond_c
    move-object/from16 p3, p15

    goto :goto_d

    :goto_e
    and-int/lit16 p3, p1, 0x2000

    if-nez p3, :cond_d

    .line 10
    sget-object p3, Lnd0;->a:Lnd0;

    .line 11
    :goto_f
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->n:Ljava/util/List;

    goto :goto_10

    :cond_d
    move-object/from16 p3, p16

    goto :goto_f

    :goto_10
    and-int/lit16 p3, p1, 0x4000

    if-nez p3, :cond_e

    .line 12
    sget-object p3, Lnd0;->a:Lnd0;

    .line 13
    :goto_11
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->o:Ljava/util/List;

    goto :goto_12

    :cond_e
    move-object/from16 p3, p17

    goto :goto_11

    :goto_12
    const p3, 0x8000

    and-int/2addr p3, p1

    if-nez p3, :cond_f

    .line 14
    sget-object p3, Lnd0;->a:Lnd0;

    .line 15
    :goto_13
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->p:Ljava/util/List;

    goto :goto_14

    :cond_f
    move-object/from16 p3, p18

    goto :goto_13

    :goto_14
    const/high16 p3, 0x10000

    and-int/2addr p3, p1

    if-nez p3, :cond_10

    .line 16
    sget-object p3, Lnd0;->a:Lnd0;

    .line 17
    :goto_15
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->q:Ljava/util/List;

    goto :goto_16

    :cond_10
    move-object/from16 p3, p19

    goto :goto_15

    :goto_16
    const/high16 p3, 0x20000

    and-int/2addr p3, p1

    if-nez p3, :cond_11

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->r:Ljava/util/List;

    goto :goto_17

    :cond_11
    move-object/from16 p3, p20

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->r:Ljava/util/List;

    :goto_17
    const/high16 p3, 0x40000

    and-int/2addr p3, p1

    if-nez p3, :cond_12

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->s:Ljava/lang/String;

    goto :goto_18

    :cond_12
    move-object/from16 p3, p21

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->s:Ljava/lang/String;

    :goto_18
    const/high16 p3, 0x80000

    and-int/2addr p3, p1

    if-nez p3, :cond_13

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->t:Ljava/lang/String;

    goto :goto_19

    :cond_13
    move-object/from16 p3, p22

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->t:Ljava/lang/String;

    :goto_19
    const/high16 p3, 0x100000

    and-int/2addr p3, p1

    if-nez p3, :cond_14

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->u:Ljava/lang/String;

    goto :goto_1a

    :cond_14
    move-object/from16 p3, p23

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->u:Ljava/lang/String;

    :goto_1a
    const/high16 p3, 0x200000

    and-int/2addr p3, p1

    if-nez p3, :cond_15

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->v:Ljava/lang/Boolean;

    goto :goto_1b

    :cond_15
    move-object/from16 p3, p24

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->v:Ljava/lang/Boolean;

    :goto_1b
    const/high16 p3, 0x400000

    and-int/2addr p3, p1

    if-nez p3, :cond_16

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->w:Ljava/lang/String;

    goto :goto_1c

    :cond_16
    move-object/from16 p3, p25

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->w:Ljava/lang/String;

    :goto_1c
    const/high16 p3, 0x800000

    and-int/2addr p3, p1

    if-nez p3, :cond_17

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->x:Ljava/lang/String;

    goto :goto_1d

    :cond_17
    move-object/from16 p3, p26

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->x:Ljava/lang/String;

    :goto_1d
    const/high16 p3, 0x1000000

    and-int/2addr p3, p1

    if-nez p3, :cond_18

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->y:Ljava/lang/String;

    goto :goto_1e

    :cond_18
    move-object/from16 p3, p27

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->y:Ljava/lang/String;

    :goto_1e
    const/high16 p3, 0x2000000

    and-int/2addr p3, p1

    if-nez p3, :cond_19

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->z:Ljava/lang/String;

    goto :goto_1f

    :cond_19
    move-object/from16 p3, p28

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->z:Ljava/lang/String;

    :goto_1f
    const/high16 p3, 0x4000000

    and-int/2addr p3, p1

    if-nez p3, :cond_1a

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->A:Ljava/lang/String;

    goto :goto_20

    :cond_1a
    move-object/from16 p3, p29

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->A:Ljava/lang/String;

    :goto_20
    const/high16 p3, 0x8000000

    and-int/2addr p3, p1

    if-nez p3, :cond_1b

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->B:Ljava/lang/String;

    goto :goto_21

    :cond_1b
    move-object/from16 p3, p30

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->B:Ljava/lang/String;

    :goto_21
    const/high16 p3, 0x10000000

    and-int/2addr p3, p1

    if-nez p3, :cond_1c

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->C:Ljava/lang/String;

    goto :goto_22

    :cond_1c
    move-object/from16 p3, p31

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->C:Ljava/lang/String;

    :goto_22
    const/high16 p3, 0x20000000

    and-int/2addr p3, p1

    if-nez p3, :cond_1d

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->D:Ljava/lang/String;

    goto :goto_23

    :cond_1d
    move-object/from16 p3, p32

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->D:Ljava/lang/String;

    :goto_23
    const/high16 p3, 0x40000000    # 2.0f

    and-int/2addr p3, p1

    if-nez p3, :cond_1e

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->E:Ljava/lang/String;

    goto :goto_24

    :cond_1e
    move-object/from16 p3, p33

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->E:Ljava/lang/String;

    :goto_24
    const/high16 p3, -0x80000000

    and-int/2addr p1, p3

    if-nez p1, :cond_1f

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->F:Ljava/lang/String;

    goto :goto_25

    :cond_1f
    move-object/from16 p1, p34

    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->F:Ljava/lang/String;

    :goto_25
    and-int/lit8 p1, p2, 0x1

    if-nez p1, :cond_20

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->G:Ljava/lang/String;

    goto :goto_26

    :cond_20
    move-object/from16 p1, p35

    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->G:Ljava/lang/String;

    :goto_26
    and-int/lit8 p1, p2, 0x2

    if-nez p1, :cond_21

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->H:Ljava/lang/String;

    goto :goto_27

    :cond_21
    move-object/from16 p1, p36

    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->H:Ljava/lang/String;

    :goto_27
    and-int/lit8 p1, p2, 0x4

    if-nez p1, :cond_22

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->I:Ljava/lang/String;

    goto :goto_28

    :cond_22
    move-object/from16 p1, p37

    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->I:Ljava/lang/String;

    :goto_28
    and-int/lit8 p1, p2, 0x8

    if-nez p1, :cond_23

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->J:Ljava/lang/String;

    goto :goto_29

    :cond_23
    move-object/from16 p1, p38

    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->J:Ljava/lang/String;

    :goto_29
    and-int/lit8 p1, p2, 0x10

    if-nez p1, :cond_24

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->K:Ljava/lang/Long;

    goto :goto_2a

    :cond_24
    move-object/from16 p1, p39

    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->K:Ljava/lang/Long;

    :goto_2a
    and-int/lit8 p1, p2, 0x20

    if-nez p1, :cond_25

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->L:Ljava/lang/Boolean;

    goto :goto_2b

    :cond_25
    move-object/from16 p1, p40

    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->L:Ljava/lang/Boolean;

    :goto_2b
    and-int/lit8 p1, p2, 0x40

    if-nez p1, :cond_26

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->M:Ljava/lang/String;

    goto :goto_2c

    :cond_26
    move-object/from16 p1, p41

    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->M:Ljava/lang/String;

    :goto_2c
    and-int/lit16 p1, p2, 0x80

    if-nez p1, :cond_27

    .line 18
    new-instance p1, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    invoke-direct {p1}, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;-><init>()V

    .line 19
    :goto_2d
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->N:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    goto :goto_2e

    :cond_27
    move-object/from16 p1, p42

    goto :goto_2d

    :goto_2e
    and-int/lit16 p1, p2, 0x100

    if-nez p1, :cond_28

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->O:Ljava/lang/String;

    goto :goto_2f

    :cond_28
    move-object/from16 p1, p43

    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->O:Ljava/lang/String;

    :goto_2f
    and-int/lit16 p1, p2, 0x200

    const/4 p3, 0x0

    if-nez p1, :cond_29

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->P:Z

    goto :goto_30

    :cond_29
    move/from16 p1, p44

    iput-boolean p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->P:Z

    :goto_30
    and-int/lit16 p1, p2, 0x400

    if-nez p1, :cond_2a

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->Q:Ljava/lang/String;

    goto :goto_31

    :cond_2a
    move-object/from16 p1, p45

    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->Q:Ljava/lang/String;

    :goto_31
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->R:Ljava/lang/Boolean;

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->S:Ljava/lang/Boolean;

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->T:Ljava/lang/Boolean;

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->U:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V
    .locals 0

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p19 .. p19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p23 .. p23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p24 .. p24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p25 .. p25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p26 .. p26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p29 .. p29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p30 .. p30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p31 .. p31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p32 .. p32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p33 .. p33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p35 .. p35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p40 .. p40}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->a:Ljava/lang/String;

    .line 22
    iput-object p2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->b:Ljava/lang/String;

    .line 23
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->c:Ljava/lang/String;

    .line 24
    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->d:Ljava/util/List;

    .line 25
    iput-object p5, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->e:Ljava/lang/String;

    .line 26
    iput-object p6, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->f:Ljava/util/List;

    .line 27
    iput-object p7, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->g:Ljava/lang/String;

    .line 28
    iput-object p8, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->h:Ljava/lang/String;

    .line 29
    iput-object p9, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->i:Ljava/lang/String;

    .line 30
    iput-object p10, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->j:Ljava/lang/String;

    .line 31
    iput-object p11, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->k:Ljava/util/List;

    .line 32
    iput-object p12, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->l:Ljava/util/List;

    .line 33
    iput-object p13, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->m:Ljava/util/List;

    .line 34
    iput-object p14, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->n:Ljava/util/List;

    .line 35
    iput-object p15, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->o:Ljava/util/List;

    move-object/from16 p1, p16

    .line 36
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->p:Ljava/util/List;

    move-object/from16 p1, p17

    .line 37
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->q:Ljava/util/List;

    move-object/from16 p1, p18

    .line 38
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->r:Ljava/util/List;

    move-object/from16 p1, p19

    .line 39
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->s:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 40
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->t:Ljava/lang/String;

    move-object/from16 p1, p21

    .line 41
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->u:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 42
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->v:Ljava/lang/Boolean;

    move-object/from16 p1, p23

    .line 43
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->w:Ljava/lang/String;

    move-object/from16 p1, p24

    .line 44
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->x:Ljava/lang/String;

    move-object/from16 p1, p25

    .line 45
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->y:Ljava/lang/String;

    move-object/from16 p1, p26

    .line 46
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->z:Ljava/lang/String;

    move-object/from16 p1, p27

    .line 47
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->A:Ljava/lang/String;

    move-object/from16 p1, p28

    .line 48
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->B:Ljava/lang/String;

    move-object/from16 p1, p29

    .line 49
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->C:Ljava/lang/String;

    move-object/from16 p1, p30

    .line 50
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->D:Ljava/lang/String;

    move-object/from16 p1, p31

    .line 51
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->E:Ljava/lang/String;

    move-object/from16 p1, p32

    .line 52
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->F:Ljava/lang/String;

    move-object/from16 p1, p33

    .line 53
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->G:Ljava/lang/String;

    move-object/from16 p1, p34

    .line 54
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->H:Ljava/lang/String;

    move-object/from16 p1, p35

    .line 55
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->I:Ljava/lang/String;

    move-object/from16 p1, p36

    .line 56
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->J:Ljava/lang/String;

    move-object/from16 p1, p37

    .line 57
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->K:Ljava/lang/Long;

    move-object/from16 p1, p38

    .line 58
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->L:Ljava/lang/Boolean;

    move-object/from16 p1, p39

    .line 59
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->M:Ljava/lang/String;

    move-object/from16 p1, p40

    .line 60
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->N:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    move-object/from16 p1, p41

    .line 61
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->O:Ljava/lang/String;

    move/from16 p1, p42

    .line 62
    iput-boolean p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->P:Z

    move-object/from16 p1, p43

    .line 63
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->Q:Ljava/lang/String;

    move-object/from16 p1, p44

    .line 64
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->R:Ljava/lang/Boolean;

    move-object/from16 p1, p45

    .line 65
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->S:Ljava/lang/Boolean;

    move-object/from16 p1, p46

    .line 66
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->T:Ljava/lang/Boolean;

    move/from16 p1, p47

    .line 67
    iput-boolean p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->U:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->d:Ljava/util/List;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->d:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->f:Ljava/util/List;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->f:Ljava/util/List;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->g:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->h:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->h:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->i:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->i:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_a

    .line 110
    .line 111
    return v2

    .line 112
    :cond_a
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->j:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->j:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_b

    .line 121
    .line 122
    return v2

    .line 123
    :cond_b
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->k:Ljava/util/List;

    .line 124
    .line 125
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->k:Ljava/util/List;

    .line 126
    .line 127
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_c

    .line 132
    .line 133
    return v2

    .line 134
    :cond_c
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->l:Ljava/util/List;

    .line 135
    .line 136
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->l:Ljava/util/List;

    .line 137
    .line 138
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_d

    .line 143
    .line 144
    return v2

    .line 145
    :cond_d
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->m:Ljava/util/List;

    .line 146
    .line 147
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->m:Ljava/util/List;

    .line 148
    .line 149
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_e

    .line 154
    .line 155
    return v2

    .line 156
    :cond_e
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->n:Ljava/util/List;

    .line 157
    .line 158
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->n:Ljava/util/List;

    .line 159
    .line 160
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-nez v1, :cond_f

    .line 165
    .line 166
    return v2

    .line 167
    :cond_f
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->o:Ljava/util/List;

    .line 168
    .line 169
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->o:Ljava/util/List;

    .line 170
    .line 171
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-nez v1, :cond_10

    .line 176
    .line 177
    return v2

    .line 178
    :cond_10
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->p:Ljava/util/List;

    .line 179
    .line 180
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->p:Ljava/util/List;

    .line 181
    .line 182
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-nez v1, :cond_11

    .line 187
    .line 188
    return v2

    .line 189
    :cond_11
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->q:Ljava/util/List;

    .line 190
    .line 191
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->q:Ljava/util/List;

    .line 192
    .line 193
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_12

    .line 198
    .line 199
    return v2

    .line 200
    :cond_12
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->r:Ljava/util/List;

    .line 201
    .line 202
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->r:Ljava/util/List;

    .line 203
    .line 204
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-nez v1, :cond_13

    .line 209
    .line 210
    return v2

    .line 211
    :cond_13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->s:Ljava/lang/String;

    .line 212
    .line 213
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->s:Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-nez v1, :cond_14

    .line 220
    .line 221
    return v2

    .line 222
    :cond_14
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->t:Ljava/lang/String;

    .line 223
    .line 224
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->t:Ljava/lang/String;

    .line 225
    .line 226
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-nez v1, :cond_15

    .line 231
    .line 232
    return v2

    .line 233
    :cond_15
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->u:Ljava/lang/String;

    .line 234
    .line 235
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->u:Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-nez v1, :cond_16

    .line 242
    .line 243
    return v2

    .line 244
    :cond_16
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->v:Ljava/lang/Boolean;

    .line 245
    .line 246
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->v:Ljava/lang/Boolean;

    .line 247
    .line 248
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-nez v1, :cond_17

    .line 253
    .line 254
    return v2

    .line 255
    :cond_17
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->w:Ljava/lang/String;

    .line 256
    .line 257
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->w:Ljava/lang/String;

    .line 258
    .line 259
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-nez v1, :cond_18

    .line 264
    .line 265
    return v2

    .line 266
    :cond_18
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->x:Ljava/lang/String;

    .line 267
    .line 268
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->x:Ljava/lang/String;

    .line 269
    .line 270
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    if-nez v1, :cond_19

    .line 275
    .line 276
    return v2

    .line 277
    :cond_19
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->y:Ljava/lang/String;

    .line 278
    .line 279
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->y:Ljava/lang/String;

    .line 280
    .line 281
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-nez v1, :cond_1a

    .line 286
    .line 287
    return v2

    .line 288
    :cond_1a
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->z:Ljava/lang/String;

    .line 289
    .line 290
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->z:Ljava/lang/String;

    .line 291
    .line 292
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    if-nez v1, :cond_1b

    .line 297
    .line 298
    return v2

    .line 299
    :cond_1b
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->A:Ljava/lang/String;

    .line 300
    .line 301
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->A:Ljava/lang/String;

    .line 302
    .line 303
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-nez v1, :cond_1c

    .line 308
    .line 309
    return v2

    .line 310
    :cond_1c
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->B:Ljava/lang/String;

    .line 311
    .line 312
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->B:Ljava/lang/String;

    .line 313
    .line 314
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    if-nez v1, :cond_1d

    .line 319
    .line 320
    return v2

    .line 321
    :cond_1d
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->C:Ljava/lang/String;

    .line 322
    .line 323
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->C:Ljava/lang/String;

    .line 324
    .line 325
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    if-nez v1, :cond_1e

    .line 330
    .line 331
    return v2

    .line 332
    :cond_1e
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->D:Ljava/lang/String;

    .line 333
    .line 334
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->D:Ljava/lang/String;

    .line 335
    .line 336
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    if-nez v1, :cond_1f

    .line 341
    .line 342
    return v2

    .line 343
    :cond_1f
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->E:Ljava/lang/String;

    .line 344
    .line 345
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->E:Ljava/lang/String;

    .line 346
    .line 347
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    if-nez v1, :cond_20

    .line 352
    .line 353
    return v2

    .line 354
    :cond_20
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->F:Ljava/lang/String;

    .line 355
    .line 356
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->F:Ljava/lang/String;

    .line 357
    .line 358
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    if-nez v1, :cond_21

    .line 363
    .line 364
    return v2

    .line 365
    :cond_21
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->G:Ljava/lang/String;

    .line 366
    .line 367
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->G:Ljava/lang/String;

    .line 368
    .line 369
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    if-nez v1, :cond_22

    .line 374
    .line 375
    return v2

    .line 376
    :cond_22
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->H:Ljava/lang/String;

    .line 377
    .line 378
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->H:Ljava/lang/String;

    .line 379
    .line 380
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-nez v1, :cond_23

    .line 385
    .line 386
    return v2

    .line 387
    :cond_23
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->I:Ljava/lang/String;

    .line 388
    .line 389
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->I:Ljava/lang/String;

    .line 390
    .line 391
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-nez v1, :cond_24

    .line 396
    .line 397
    return v2

    .line 398
    :cond_24
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->J:Ljava/lang/String;

    .line 399
    .line 400
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->J:Ljava/lang/String;

    .line 401
    .line 402
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    if-nez v1, :cond_25

    .line 407
    .line 408
    return v2

    .line 409
    :cond_25
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->K:Ljava/lang/Long;

    .line 410
    .line 411
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->K:Ljava/lang/Long;

    .line 412
    .line 413
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    if-nez v1, :cond_26

    .line 418
    .line 419
    return v2

    .line 420
    :cond_26
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->L:Ljava/lang/Boolean;

    .line 421
    .line 422
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->L:Ljava/lang/Boolean;

    .line 423
    .line 424
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-nez v1, :cond_27

    .line 429
    .line 430
    return v2

    .line 431
    :cond_27
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->M:Ljava/lang/String;

    .line 432
    .line 433
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->M:Ljava/lang/String;

    .line 434
    .line 435
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    if-nez v1, :cond_28

    .line 440
    .line 441
    return v2

    .line 442
    :cond_28
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->N:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 443
    .line 444
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->N:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 445
    .line 446
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    if-nez v1, :cond_29

    .line 451
    .line 452
    return v2

    .line 453
    :cond_29
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->O:Ljava/lang/String;

    .line 454
    .line 455
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->O:Ljava/lang/String;

    .line 456
    .line 457
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    if-nez v1, :cond_2a

    .line 462
    .line 463
    return v2

    .line 464
    :cond_2a
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->P:Z

    .line 465
    .line 466
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->P:Z

    .line 467
    .line 468
    if-eq v1, v3, :cond_2b

    .line 469
    .line 470
    return v2

    .line 471
    :cond_2b
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->Q:Ljava/lang/String;

    .line 472
    .line 473
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->Q:Ljava/lang/String;

    .line 474
    .line 475
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    if-nez v1, :cond_2c

    .line 480
    .line 481
    return v2

    .line 482
    :cond_2c
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->R:Ljava/lang/Boolean;

    .line 483
    .line 484
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->R:Ljava/lang/Boolean;

    .line 485
    .line 486
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v1

    .line 490
    if-nez v1, :cond_2d

    .line 491
    .line 492
    return v2

    .line 493
    :cond_2d
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->S:Ljava/lang/Boolean;

    .line 494
    .line 495
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->S:Ljava/lang/Boolean;

    .line 496
    .line 497
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-nez v1, :cond_2e

    .line 502
    .line 503
    return v2

    .line 504
    :cond_2e
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->T:Ljava/lang/Boolean;

    .line 505
    .line 506
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->T:Ljava/lang/Boolean;

    .line 507
    .line 508
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v1

    .line 512
    if-nez v1, :cond_2f

    .line 513
    .line 514
    return v2

    .line 515
    :cond_2f
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->U:Z

    .line 516
    .line 517
    iget-boolean p1, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->U:Z

    .line 518
    .line 519
    if-eq p0, p1, :cond_30

    .line 520
    .line 521
    return v2

    .line 522
    :cond_30
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->a:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v1, v2

    .line 15
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->b:Ljava/lang/String;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    move v3, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    :goto_1
    add-int/2addr v1, v3

    .line 26
    mul-int/2addr v1, v2

    .line 27
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->c:Ljava/lang/String;

    .line 28
    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    move v3, v0

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    :goto_2
    add-int/2addr v1, v3

    .line 38
    mul-int/2addr v1, v2

    .line 39
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->d:Ljava/util/List;

    .line 40
    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    move v3, v0

    .line 44
    goto :goto_3

    .line 45
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    :goto_3
    add-int/2addr v1, v3

    .line 50
    mul-int/2addr v1, v2

    .line 51
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->e:Ljava/lang/String;

    .line 52
    .line 53
    if-nez v3, :cond_4

    .line 54
    .line 55
    move v3, v0

    .line 56
    goto :goto_4

    .line 57
    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    :goto_4
    add-int/2addr v1, v3

    .line 62
    mul-int/2addr v1, v2

    .line 63
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->f:Ljava/util/List;

    .line 64
    .line 65
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->g:Ljava/lang/String;

    .line 70
    .line 71
    if-nez v3, :cond_5

    .line 72
    .line 73
    move v3, v0

    .line 74
    goto :goto_5

    .line 75
    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    :goto_5
    add-int/2addr v1, v3

    .line 80
    mul-int/2addr v1, v2

    .line 81
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->h:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->i:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->j:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->k:Ljava/util/List;

    .line 100
    .line 101
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->l:Ljava/util/List;

    .line 106
    .line 107
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->m:Ljava/util/List;

    .line 112
    .line 113
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->n:Ljava/util/List;

    .line 118
    .line 119
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->o:Ljava/util/List;

    .line 124
    .line 125
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->p:Ljava/util/List;

    .line 130
    .line 131
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->q:Ljava/util/List;

    .line 136
    .line 137
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->r:Ljava/util/List;

    .line 142
    .line 143
    if-nez v3, :cond_6

    .line 144
    .line 145
    move v3, v0

    .line 146
    goto :goto_6

    .line 147
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    :goto_6
    add-int/2addr v1, v3

    .line 152
    mul-int/2addr v1, v2

    .line 153
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->s:Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->t:Ljava/lang/String;

    .line 160
    .line 161
    if-nez v3, :cond_7

    .line 162
    .line 163
    move v3, v0

    .line 164
    goto :goto_7

    .line 165
    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    :goto_7
    add-int/2addr v1, v3

    .line 170
    mul-int/2addr v1, v2

    .line 171
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->u:Ljava/lang/String;

    .line 172
    .line 173
    if-nez v3, :cond_8

    .line 174
    .line 175
    move v3, v0

    .line 176
    goto :goto_8

    .line 177
    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    :goto_8
    add-int/2addr v1, v3

    .line 182
    mul-int/2addr v1, v2

    .line 183
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->v:Ljava/lang/Boolean;

    .line 184
    .line 185
    if-nez v3, :cond_9

    .line 186
    .line 187
    move v3, v0

    .line 188
    goto :goto_9

    .line 189
    :cond_9
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    :goto_9
    add-int/2addr v1, v3

    .line 194
    mul-int/2addr v1, v2

    .line 195
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->w:Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->x:Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->y:Ljava/lang/String;

    .line 208
    .line 209
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->z:Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->A:Ljava/lang/String;

    .line 220
    .line 221
    if-nez v3, :cond_a

    .line 222
    .line 223
    move v3, v0

    .line 224
    goto :goto_a

    .line 225
    :cond_a
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    :goto_a
    add-int/2addr v1, v3

    .line 230
    mul-int/2addr v1, v2

    .line 231
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->B:Ljava/lang/String;

    .line 232
    .line 233
    if-nez v3, :cond_b

    .line 234
    .line 235
    move v3, v0

    .line 236
    goto :goto_b

    .line 237
    :cond_b
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    :goto_b
    add-int/2addr v1, v3

    .line 242
    mul-int/2addr v1, v2

    .line 243
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->C:Ljava/lang/String;

    .line 244
    .line 245
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->D:Ljava/lang/String;

    .line 250
    .line 251
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->E:Ljava/lang/String;

    .line 256
    .line 257
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->F:Ljava/lang/String;

    .line 262
    .line 263
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->G:Ljava/lang/String;

    .line 268
    .line 269
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->H:Ljava/lang/String;

    .line 274
    .line 275
    if-nez v3, :cond_c

    .line 276
    .line 277
    move v3, v0

    .line 278
    goto :goto_c

    .line 279
    :cond_c
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    :goto_c
    add-int/2addr v1, v3

    .line 284
    mul-int/2addr v1, v2

    .line 285
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->I:Ljava/lang/String;

    .line 286
    .line 287
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->J:Ljava/lang/String;

    .line 292
    .line 293
    if-nez v3, :cond_d

    .line 294
    .line 295
    move v3, v0

    .line 296
    goto :goto_d

    .line 297
    :cond_d
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    :goto_d
    add-int/2addr v1, v3

    .line 302
    mul-int/2addr v1, v2

    .line 303
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->K:Ljava/lang/Long;

    .line 304
    .line 305
    if-nez v3, :cond_e

    .line 306
    .line 307
    move v3, v0

    .line 308
    goto :goto_e

    .line 309
    :cond_e
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    :goto_e
    add-int/2addr v1, v3

    .line 314
    mul-int/2addr v1, v2

    .line 315
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->L:Ljava/lang/Boolean;

    .line 316
    .line 317
    if-nez v3, :cond_f

    .line 318
    .line 319
    move v3, v0

    .line 320
    goto :goto_f

    .line 321
    :cond_f
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    :goto_f
    add-int/2addr v1, v3

    .line 326
    mul-int/2addr v1, v2

    .line 327
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->M:Ljava/lang/String;

    .line 328
    .line 329
    if-nez v3, :cond_10

    .line 330
    .line 331
    move v3, v0

    .line 332
    goto :goto_10

    .line 333
    :cond_10
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    :goto_10
    add-int/2addr v1, v3

    .line 338
    mul-int/2addr v1, v2

    .line 339
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->N:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 340
    .line 341
    iget-object v3, v3, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;->a:Ljava/util/List;

    .line 342
    .line 343
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->O:Ljava/lang/String;

    .line 348
    .line 349
    if-nez v3, :cond_11

    .line 350
    .line 351
    move v3, v0

    .line 352
    goto :goto_11

    .line 353
    :cond_11
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    :goto_11
    add-int/2addr v1, v3

    .line 358
    mul-int/2addr v1, v2

    .line 359
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->P:Z

    .line 360
    .line 361
    invoke-static {v1, v2, v3}, Len;->h(IIZ)I

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->Q:Ljava/lang/String;

    .line 366
    .line 367
    if-nez v3, :cond_12

    .line 368
    .line 369
    move v3, v0

    .line 370
    goto :goto_12

    .line 371
    :cond_12
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    :goto_12
    add-int/2addr v1, v3

    .line 376
    mul-int/2addr v1, v2

    .line 377
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->R:Ljava/lang/Boolean;

    .line 378
    .line 379
    if-nez v3, :cond_13

    .line 380
    .line 381
    move v3, v0

    .line 382
    goto :goto_13

    .line 383
    :cond_13
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    :goto_13
    add-int/2addr v1, v3

    .line 388
    mul-int/2addr v1, v2

    .line 389
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->S:Ljava/lang/Boolean;

    .line 390
    .line 391
    if-nez v3, :cond_14

    .line 392
    .line 393
    move v3, v0

    .line 394
    goto :goto_14

    .line 395
    :cond_14
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    :goto_14
    add-int/2addr v1, v3

    .line 400
    mul-int/2addr v1, v2

    .line 401
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->T:Ljava/lang/Boolean;

    .line 402
    .line 403
    if-nez v3, :cond_15

    .line 404
    .line 405
    goto :goto_15

    .line 406
    :cond_15
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    :goto_15
    add-int/2addr v1, v0

    .line 411
    mul-int/2addr v1, v2

    .line 412
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->U:Z

    .line 413
    .line 414
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 415
    .line 416
    .line 417
    move-result p0

    .line 418
    add-int/2addr p0, v1

    .line 419
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", version="

    .line 2
    .line 3
    const-string v1, ", type="

    .line 4
    .line 5
    const-string v2, "UsercentricsService(templateId="

    .line 6
    .line 7
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Len;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", adminSettingsId="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->d:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", dataProcessor="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->e:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", dataPurposes="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->f:Ljava/util/List;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", processingCompany="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", nameOfProcessingCompany="

    .line 56
    .line 57
    const-string v2, ", addressOfProcessingCompany="

    .line 58
    .line 59
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->g:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->h:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v1, ", descriptionOfService="

    .line 67
    .line 68
    const-string v2, ", technologyUsed="

    .line 69
    .line 70
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->i:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->j:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->k:Ljava/util/List;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", languagesAvailable="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->l:Ljava/util/List;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", dataCollectedList="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->m:Ljava/util/List;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", dataPurposesList="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->n:Ljava/util/List;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, ", dataRecipientsList="

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->o:Ljava/util/List;

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v1, ", legalBasisList="

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->p:Ljava/util/List;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v1, ", retentionPeriodList="

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->q:Ljava/util/List;

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v1, ", subConsents="

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->r:Ljava/util/List;

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v1, ", language="

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v1, ", createdBy="

    .line 158
    .line 159
    const-string v2, ", updatedBy="

    .line 160
    .line 161
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->s:Ljava/lang/String;

    .line 162
    .line 163
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->t:Ljava/lang/String;

    .line 164
    .line 165
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->u:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v1, ", isLatest="

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->v:Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v1, ", linkToDpa="

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string v1, ", legalGround="

    .line 189
    .line 190
    const-string v2, ", optOutUrl="

    .line 191
    .line 192
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->w:Ljava/lang/String;

    .line 193
    .line 194
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->x:Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    const-string v1, ", policyOfProcessorUrl="

    .line 200
    .line 201
    const-string v2, ", categorySlug="

    .line 202
    .line 203
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->y:Ljava/lang/String;

    .line 204
    .line 205
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->z:Ljava/lang/String;

    .line 206
    .line 207
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    const-string v1, ", recordsOfProcessingActivities="

    .line 211
    .line 212
    const-string v2, ", retentionPeriodDescription="

    .line 213
    .line 214
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->A:Ljava/lang/String;

    .line 215
    .line 216
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->B:Ljava/lang/String;

    .line 217
    .line 218
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    const-string v1, ", dataProtectionOfficer="

    .line 222
    .line 223
    const-string v2, ", privacyPolicyURL="

    .line 224
    .line 225
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->C:Ljava/lang/String;

    .line 226
    .line 227
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->D:Ljava/lang/String;

    .line 228
    .line 229
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    const-string v1, ", cookiePolicyURL="

    .line 233
    .line 234
    const-string v2, ", locationOfProcessing="

    .line 235
    .line 236
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->E:Ljava/lang/String;

    .line 237
    .line 238
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->F:Ljava/lang/String;

    .line 239
    .line 240
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    const-string v1, ", dataCollectedDescription="

    .line 244
    .line 245
    const-string v2, ", thirdCountryTransfer="

    .line 246
    .line 247
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->G:Ljava/lang/String;

    .line 248
    .line 249
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->H:Ljava/lang/String;

    .line 250
    .line 251
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    const-string v1, ", description="

    .line 255
    .line 256
    const-string v2, ", cookieMaxAgeSeconds="

    .line 257
    .line 258
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->I:Ljava/lang/String;

    .line 259
    .line 260
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->J:Ljava/lang/String;

    .line 261
    .line 262
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->K:Ljava/lang/Long;

    .line 266
    .line 267
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    const-string v1, ", usesNonCookieAccess="

    .line 271
    .line 272
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->L:Ljava/lang/Boolean;

    .line 276
    .line 277
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string v1, ", deviceStorageDisclosureUrl="

    .line 281
    .line 282
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->M:Ljava/lang/String;

    .line 286
    .line 287
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    const-string v1, ", deviceStorage="

    .line 291
    .line 292
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->N:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 296
    .line 297
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const-string v1, ", dpsDisplayFormat="

    .line 301
    .line 302
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->O:Ljava/lang/String;

    .line 306
    .line 307
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    const-string v1, ", isHidden="

    .line 311
    .line 312
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->P:Z

    .line 316
    .line 317
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    const-string v1, ", framework="

    .line 321
    .line 322
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->Q:Ljava/lang/String;

    .line 326
    .line 327
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const-string v1, ", isDeactivated="

    .line 331
    .line 332
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->R:Ljava/lang/Boolean;

    .line 336
    .line 337
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    const-string v1, ", isAutoUpdateAllowed="

    .line 341
    .line 342
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->S:Ljava/lang/Boolean;

    .line 346
    .line 347
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string v1, ", disableLegalBasis="

    .line 351
    .line 352
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->T:Ljava/lang/Boolean;

    .line 356
    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    const-string v1, ", isEssential="

    .line 361
    .line 362
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const-string v1, ")"

    .line 366
    .line 367
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->U:Z

    .line 368
    .line 369
    invoke-static {v0, p0, v1}, Len;->o(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    return-object p0
.end method
