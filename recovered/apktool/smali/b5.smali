.class public final Lb5;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lsg0;
.implements Lcy;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lb5;->a:I

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 193
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 194
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb5;->d:Ljava/lang/Object;

    .line 195
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lb5;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 164
    iput p1, p0, Lb5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La13;Lg13;Ljava/lang/String;Li03;Lpc2;Lsr2;Lyr;Lac2;Lil2;Ly3;Lx80;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lb5;->a:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object p1, p0, Lb5;->b:Ljava/lang/Object;

    .line 154
    iput-object p2, p0, Lb5;->c:Ljava/lang/Object;

    .line 155
    iput-object p3, p0, Lb5;->d:Ljava/lang/Object;

    .line 156
    iput-object p4, p0, Lb5;->e:Ljava/lang/Object;

    .line 157
    new-instance p1, Lth;

    move-object p4, p6

    move-object p6, p7

    move-object p3, p8

    move-object p7, p10

    move-object p8, p2

    move-object p2, p5

    move-object p5, p9

    move-object p9, p11

    invoke-direct/range {p1 .. p9}, Lth;-><init>(Lpc2;Lac2;Lsr2;Lil2;Lyr;Ly3;Lg13;Lx80;)V

    iput-object p1, p0, Lb5;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lid2;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lb5;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 147
    iput-object p1, p0, Lb5;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 148
    iput-object p1, p0, Lb5;->c:Ljava/lang/Object;

    .line 149
    iput-object p2, p0, Lb5;->d:Ljava/lang/Object;

    .line 150
    new-instance p1, Lod;

    const/16 p2, 0xa

    invoke-direct {p1, p0, p2}, Lod;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    move-result-object p1

    iput-object p1, p0, Lb5;->e:Ljava/lang/Object;

    .line 151
    new-instance p1, Lgd2;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lgd2;-><init>(I)V

    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    move-result-object p1

    iput-object p1, p0, Lb5;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0xd

    iput v0, p0, Lb5;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb5;->b:Ljava/lang/Object;

    .line 166
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lb5;->c:Ljava/lang/Object;

    .line 167
    const-string p2, "eventData"

    .line 168
    const-string v0, "dateCreated"

    const-string v1, "id"

    filled-new-array {v1, p2, v0}, [Ljava/lang/String;

    move-result-object p2

    .line 169
    iput-object p2, p0, Lb5;->f:Ljava/lang/Object;

    .line 170
    new-instance p2, Lbh0;

    invoke-direct {p2, p0, p1}, Lbh0;-><init>(Lb5;Landroid/content/Context;)V

    invoke-static {p2}, Lmf0;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lb5;->a:I

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 186
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lb5;->e:Ljava/lang/Object;

    .line 187
    iput-object p1, p0, Lb5;->b:Ljava/lang/Object;

    .line 188
    const-string p1, "topic_operation_queue"

    iput-object p1, p0, Lb5;->c:Ljava/lang/Object;

    .line 189
    const-string p1, ","

    iput-object p1, p0, Lb5;->d:Ljava/lang/Object;

    .line 190
    iput-object p2, p0, Lb5;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lb5;->a:I

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb5;->f:Ljava/lang/Object;

    .line 174
    iput-object p1, p0, Lb5;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lav;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Lb5;->a:I

    .line 200
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 201
    iput-object p1, p0, Lb5;->b:Ljava/lang/Object;

    .line 202
    check-cast p1, Landroid/view/View;

    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lb5;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 203
    invoke-virtual {p1, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 204
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 205
    new-instance p1, Landroid/graphics/Paint;

    const/4 v1, 0x7

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 206
    new-instance p1, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lb5;->d:Ljava/lang/Object;

    .line 207
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public constructor <init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lur3;Lec;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 8

    const/4 v0, 0x7

    iput v0, p0, Lb5;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    iput-object p1, p0, Lb5;->b:Ljava/lang/Object;

    .line 141
    iput-object p2, p0, Lb5;->c:Ljava/lang/Object;

    .line 142
    iput-object p3, p0, Lb5;->d:Ljava/lang/Object;

    .line 143
    new-instance v0, Lfp0;

    invoke-direct {v0, p1, p2, p3}, Lfp0;-><init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lur3;Lec;)V

    iput-object v0, p0, Lb5;->e:Ljava/lang/Object;

    .line 144
    iget-object p3, p3, Lec;->c:Ljava/lang/Object;

    move-object v7, p3

    check-cast v7, Lnv1;

    .line 145
    new-instance v0, Lip0;

    move-object v1, p1

    move-object v3, p2

    move-object v2, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v7}, Lip0;-><init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;Lur3;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lnv1;)V

    iput-object v0, p0, Lb5;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lb5;->a:I

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 210
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb5;->d:Ljava/lang/Object;

    .line 211
    iput-object p1, p0, Lb5;->b:Ljava/lang/Object;

    .line 212
    sget-object p1, Ltj1;->b:Ltj1;

    iput-object p1, p0, Lb5;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 138
    iput p6, p0, Lb5;->a:I

    iput-object p1, p0, Lb5;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb5;->c:Ljava/lang/Object;

    iput-object p3, p0, Lb5;->d:Ljava/lang/Object;

    iput-object p4, p0, Lb5;->e:Ljava/lang/Object;

    iput-object p5, p0, Lb5;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lb5;->a:I

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    iput-object p1, p0, Lb5;->b:Ljava/lang/Object;

    .line 178
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    iput-object p2, p0, Lb5;->c:Ljava/lang/Object;

    .line 180
    iput-object p3, p0, Lb5;->d:Ljava/lang/Object;

    .line 181
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    iput-object p4, p0, Lb5;->e:Ljava/lang/Object;

    .line 183
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 184
    iput-object p1, p0, Lb5;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lod0;Lod0;Lod0;Lod0;Lod0;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Lb5;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    iput-object p1, p0, Lb5;->b:Ljava/lang/Object;

    .line 160
    iput-object p2, p0, Lb5;->c:Ljava/lang/Object;

    .line 161
    iput-object p3, p0, Lb5;->d:Ljava/lang/Object;

    .line 162
    iput-object p4, p0, Lb5;->e:Ljava/lang/Object;

    .line 163
    iput-object p5, p0, Lb5;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsx;Lcy;)V
    .locals 11

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    iput v0, p0, Lb5;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v2, Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v3, Ljava/util/HashSet;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v4, Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object v5, p1, Lsx;->c:Ljava/util/Set;

    .line 34
    .line 35
    iget-object p1, p1, Lsx;->g:Ljava/util/Set;

    .line 36
    .line 37
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_5

    .line 46
    .line 47
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    check-cast v6, Lr70;

    .line 52
    .line 53
    iget v7, v6, Lr70;->c:I

    .line 54
    .line 55
    iget v8, v6, Lr70;->b:I

    .line 56
    .line 57
    if-nez v7, :cond_0

    .line 58
    .line 59
    const/4 v9, 0x1

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    const/4 v9, 0x0

    .line 62
    :goto_1
    iget-object v6, v6, Lr70;->a:Lf02;

    .line 63
    .line 64
    const/4 v10, 0x2

    .line 65
    if-eqz v9, :cond_2

    .line 66
    .line 67
    if-ne v8, v10, :cond_1

    .line 68
    .line 69
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    if-ne v7, v10, :cond_3

    .line 78
    .line 79
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    if-ne v8, v10, :cond_4

    .line 84
    .line 85
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p1, :cond_6

    .line 98
    .line 99
    const-class p1, Lpz1;

    .line 100
    .line 101
    invoke-static {p1}, Lf02;->a(Ljava/lang/Class;)Lf02;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :cond_6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iput-object p1, p0, Lb5;->b:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iput-object p1, p0, Lb5;->c:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iput-object p1, p0, Lb5;->d:Ljava/lang/Object;

    .line 128
    .line 129
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iput-object p1, p0, Lb5;->e:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object p2, p0, Lb5;->f:Ljava/lang/Object;

    .line 136
    .line 137
    return-void
.end method

.method public constructor <init>(Lzp;Lzp;Lcb0;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lb5;->a:I

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    iput-object p1, p0, Lb5;->c:Ljava/lang/Object;

    .line 198
    iput-object p2, p0, Lb5;->d:Ljava/lang/Object;

    .line 199
    iput-object p3, p0, Lb5;->b:Ljava/lang/Object;

    return-void
.end method

.method public static f(Lb5;Ljava/lang/String;Ljava/lang/Class;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Lb5;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcb;

    .line 8
    .line 9
    iget-object p0, p0, Lb5;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ler0;

    .line 12
    .line 13
    const-string v2, "notificationIcon"

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Ler0;->o(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const-string v3, "notificationLargeIcon"

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Ler0;->o(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const-string v4, "notificationSoundId"

    .line 26
    .line 27
    invoke-virtual {p0, v4}, Ler0;->o(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {v1}, Lcb;->o()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {p1}, Lb40;->r(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string p1, ""

    .line 43
    .line 44
    :goto_0
    const-string v6, "Creating Support notification :\n Title : "

    .line 45
    .line 46
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    const-string v7, "SDKXNotif"

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    invoke-static {v7, v6, v8}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    iget v6, v6, Landroid/content/pm/ApplicationInfo;->logo:I

    .line 61
    .line 62
    if-nez v6, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iget v6, v6, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 69
    .line 70
    :cond_1
    if-eqz v2, :cond_2

    .line 71
    .line 72
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v7, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    if-eqz v7, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catch_0
    :cond_2
    move v2, v6

    .line 84
    :goto_1
    if-eqz v3, :cond_3

    .line 85
    .line 86
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 94
    if-eqz v6, :cond_3

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-static {v6, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    goto :goto_2

    .line 105
    :catch_1
    :cond_3
    move-object v3, v8

    .line 106
    :goto_2
    new-instance v6, Landroid/content/Intent;

    .line 107
    .line 108
    invoke-direct {v6, v0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 109
    .line 110
    .line 111
    const-string v7, "SERVICE_MODE"

    .line 112
    .line 113
    const-string v9, "WEBCHAT_SERVICE_FLAG"

    .line 114
    .line 115
    invoke-virtual {v6, v7, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 116
    .line 117
    .line 118
    const-string v7, "source"

    .line 119
    .line 120
    const-string v9, "notification"

    .line 121
    .line 122
    invoke-virtual {v6, v7, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 123
    .line 124
    .line 125
    const/high16 v7, 0x10000000

    .line 126
    .line 127
    invoke-virtual {v6, v7}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 128
    .line 129
    .line 130
    const/high16 v7, 0x4000000

    .line 131
    .line 132
    const/16 v9, 0x32

    .line 133
    .line 134
    invoke-static {v0, v9, v6, v7}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    new-instance v7, Lpo1;

    .line 139
    .line 140
    invoke-direct {v7, v0, v8}, Lpo1;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object v9, v7, Lpo1;->t:Landroid/app/Notification;

    .line 144
    .line 145
    iput v2, v9, Landroid/app/Notification;->icon:I

    .line 146
    .line 147
    invoke-static {v1}, Lpo1;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iput-object v1, v7, Lpo1;->e:Ljava/lang/CharSequence;

    .line 152
    .line 153
    invoke-static {p1}, Lpo1;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iput-object p1, v7, Lpo1;->f:Ljava/lang/CharSequence;

    .line 158
    .line 159
    iput-object v6, v7, Lpo1;->g:Landroid/app/PendingIntent;

    .line 160
    .line 161
    const/4 p1, 0x1

    .line 162
    invoke-virtual {v7, p1}, Lpo1;->c(Z)V

    .line 163
    .line 164
    .line 165
    if-eqz v3, :cond_4

    .line 166
    .line 167
    invoke-virtual {v7, v3}, Lpo1;->e(Landroid/graphics/Bitmap;)V

    .line 168
    .line 169
    .line 170
    :cond_4
    invoke-static {v0, v5}, Lde3;->w(Landroid/content/Context;I)Landroid/net/Uri;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    if-nez p1, :cond_6

    .line 175
    .line 176
    invoke-static {v0}, Lb40;->s(Landroid/content/Context;)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_5

    .line 181
    .line 182
    const/4 p1, -0x1

    .line 183
    invoke-virtual {v7, p1}, Lpo1;->d(I)V

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_5
    const/4 p1, 0x5

    .line 188
    invoke-virtual {v7, p1}, Lpo1;->d(I)V

    .line 189
    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_6
    invoke-virtual {v7, p1}, Lpo1;->f(Landroid/net/Uri;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v0}, Lb40;->s(Landroid/content/Context;)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-eqz p1, :cond_7

    .line 200
    .line 201
    const/4 p1, 0x6

    .line 202
    invoke-virtual {v7, p1}, Lpo1;->d(I)V

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_7
    const/4 p1, 0x4

    .line 207
    invoke-virtual {v7, p1}, Lpo1;->d(I)V

    .line 208
    .line 209
    .line 210
    :goto_3
    invoke-virtual {v7}, Lpo1;->a()Landroid/app/Notification;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 215
    .line 216
    const-string v2, "AppUtil"

    .line 217
    .line 218
    const/16 v3, 0x1a

    .line 219
    .line 220
    if-lt v1, v3, :cond_c

    .line 221
    .line 222
    :try_start_2
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :catch_2
    move-exception v1

    .line 230
    const-string v5, "Target SDK version not found"

    .line 231
    .line 232
    invoke-static {v2, v5, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 233
    .line 234
    .line 235
    const/4 v1, 0x0

    .line 236
    :goto_4
    if-lt v1, v3, :cond_c

    .line 237
    .line 238
    invoke-static {v0, p1}, Landroid/app/Notification$Builder;->recoverBuilder(Landroid/content/Context;Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    iget-object v1, p0, Ler0;->b:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v1, Ler0;

    .line 245
    .line 246
    const-string v3, "notificationChannelId"

    .line 247
    .line 248
    invoke-virtual {v1, v3}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-static {v1}, Lb40;->p(Ljava/lang/String;)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_a

    .line 257
    .line 258
    invoke-static {v0}, Lb40;->n(Landroid/content/Context;)Landroid/app/NotificationManager;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    if-eqz v1, :cond_9

    .line 263
    .line 264
    invoke-static {v1}, Lp30;->C(Landroid/app/NotificationManager;)Landroid/app/NotificationChannel;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    if-nez v3, :cond_9

    .line 269
    .line 270
    invoke-static {}, Lp30;->a()Landroid/app/NotificationChannel;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-static {v3}, Lp30;->n(Landroid/app/NotificationChannel;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p0, v4}, Ler0;->o(Ljava/lang/String;)I

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    invoke-static {v0, p0}, Lde3;->w(Landroid/content/Context;I)Landroid/net/Uri;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    if-eqz p0, :cond_8

    .line 286
    .line 287
    new-instance v4, Landroid/media/AudioAttributes$Builder;

    .line 288
    .line 289
    invoke-direct {v4}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v4}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-static {v3, p0, v4}, Lp30;->o(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 297
    .line 298
    .line 299
    :cond_8
    invoke-static {v1, v3}, Lp30;->r(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 300
    .line 301
    .line 302
    :cond_9
    const-string v1, "In-app Support"

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_a
    invoke-static {v0}, Lb40;->n(Landroid/content/Context;)Landroid/app/NotificationManager;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    if-eqz p0, :cond_b

    .line 310
    .line 311
    invoke-static {p0}, Lp30;->C(Landroid/app/NotificationManager;)Landroid/app/NotificationChannel;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    if-eqz v3, :cond_b

    .line 316
    .line 317
    invoke-static {p0}, Lp30;->q(Landroid/app/NotificationManager;)V

    .line 318
    .line 319
    .line 320
    :cond_b
    :goto_5
    invoke-static {p1, v1}, Lp30;->m(Landroid/app/Notification$Builder;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    :cond_c
    const-string p0, "notifMngr"

    .line 328
    .line 329
    const-string v1, "Notification built, trying to post now."

    .line 330
    .line 331
    invoke-static {p0, v1, v8}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 332
    .line 333
    .line 334
    const-string p0, "Showing notification : Tag : "

    .line 335
    .line 336
    const-string v1, "hsft_notification_tag_"

    .line 337
    .line 338
    const-string v3, "areNotificationAllowed : "

    .line 339
    .line 340
    if-nez p1, :cond_d

    .line 341
    .line 342
    const-string p0, "notification is null, not showing."

    .line 343
    .line 344
    invoke-static {v2, p0, v8}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 345
    .line 346
    .line 347
    goto :goto_6

    .line 348
    :cond_d
    invoke-static {v0}, Lb40;->n(Landroid/content/Context;)Landroid/app/NotificationManager;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    if-nez v4, :cond_e

    .line 353
    .line 354
    const-string p0, "NotificationManager is null, not showing."

    .line 355
    .line 356
    invoke-static {v2, p0, v8}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 357
    .line 358
    .line 359
    goto :goto_6

    .line 360
    :cond_e
    :try_start_3
    new-instance v5, Lap1;

    .line 361
    .line 362
    invoke-direct {v5, v0}, Lap1;-><init>(Landroid/content/Context;)V

    .line 363
    .line 364
    .line 365
    iget-object v0, v5, Lap1;->a:Landroid/app/NotificationManager;

    .line 366
    .line 367
    invoke-static {v0}, Lzo1;->a(Landroid/app/NotificationManager;)Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    new-instance v5, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-static {v2, v3, v8}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 384
    .line 385
    .line 386
    if-eqz v0, :cond_f

    .line 387
    .line 388
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object p2

    .line 392
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p2

    .line 396
    invoke-virtual {p0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    invoke-static {v2, p0, v8}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 401
    .line 402
    .line 403
    const/16 p0, 0x79

    .line 404
    .line 405
    invoke-virtual {v4, p2, p0, p1}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 406
    .line 407
    .line 408
    goto :goto_6

    .line 409
    :catch_3
    move-exception p0

    .line 410
    const-string p1, "Error showing notification"

    .line 411
    .line 412
    invoke-static {v2, p1, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 413
    .line 414
    .line 415
    :cond_f
    :goto_6
    return-void
.end method

.method public static m(Landroid/content/SharedPreferences;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)Lb5;
    .locals 5

    .line 1
    new-instance v0, Lb5;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lb5;-><init>(Landroid/content/SharedPreferences;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, v0, Lb5;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    iget-object p1, v0, Lb5;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/util/ArrayDeque;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 16
    .line 17
    .line 18
    iget-object p1, v0, Lb5;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroid/content/SharedPreferences;

    .line 21
    .line 22
    iget-object v1, v0, Lb5;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    const-string v2, ""

    .line 27
    .line 28
    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_4

    .line 37
    .line 38
    iget-object v1, v0, Lb5;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_0
    iget-object v1, v0, Lb5;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/lang/String;

    .line 52
    .line 53
    const/4 v2, -0x1

    .line 54
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    array-length v1, p1

    .line 59
    if-nez v1, :cond_1

    .line 60
    .line 61
    const-string v1, "FirebaseMessaging"

    .line 62
    .line 63
    const-string v2, "Corrupted queue. Please check the queue contents and item separator provided"

    .line 64
    .line 65
    invoke-static {v1, v2}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_3

    .line 71
    :cond_1
    :goto_0
    array-length v1, p1

    .line 72
    const/4 v2, 0x0

    .line 73
    :goto_1
    if-ge v2, v1, :cond_3

    .line 74
    .line 75
    aget-object v3, p1, v2

    .line 76
    .line 77
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_2

    .line 82
    .line 83
    iget-object v4, v0, Lb5;->e:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v4, Ljava/util/ArrayDeque;

    .line 86
    .line 87
    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    monitor-exit p0

    .line 94
    return-object v0

    .line 95
    :cond_4
    :goto_2
    monitor-exit p0

    .line 96
    return-object v0

    .line 97
    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    throw p1
.end method

.method public static r(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-string v0, "/"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p0, v0, v1}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v2, 0x6

    .line 14
    invoke-static {p0, v0, v1, v1, v2}, Lkotlin/text/StringsKt;->C(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    :goto_0
    const-string p0, "*"

    .line 24
    .line 25
    return-object p0
.end method


# virtual methods
.method public A(Lqf;)V
    .locals 9

    .line 1
    new-instance v0, Lf42;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lf42;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lb5;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lyr2;

    .line 11
    .line 12
    iget-object v2, p0, Lb5;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lyg;

    .line 15
    .line 16
    iget-object v3, p0, Lb5;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v4, p0, Lb5;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v4, Ler2;

    .line 23
    .line 24
    iget-object p0, p0, Lb5;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lvd0;

    .line 27
    .line 28
    iget-object v5, v1, Lyr2;->c:Ln60;

    .line 29
    .line 30
    invoke-static {}, Lyg;->a()Lec;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    iget-object v7, v2, Lyg;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v6, v7}, Lec;->L(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sget-object v7, Lpx1;->a:Lpx1;

    .line 40
    .line 41
    iput-object v7, v6, Lec;->d:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v2, v2, Lyg;->b:[B

    .line 44
    .line 45
    iput-object v2, v6, Lec;->c:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v6}, Lec;->m()Lyg;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    new-instance v6, Lxy1;

    .line 52
    .line 53
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance v7, Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v7, v6, Lxy1;->f:Ljava/lang/Object;

    .line 62
    .line 63
    iget-object v7, v1, Lyr2;->a:Lyv;

    .line 64
    .line 65
    invoke-interface {v7}, Lyv;->a()J

    .line 66
    .line 67
    .line 68
    move-result-wide v7

    .line 69
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    iput-object v7, v6, Lxy1;->d:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object v1, v1, Lyr2;->b:Lyv;

    .line 76
    .line 77
    invoke-interface {v1}, Lyv;->a()J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iput-object v1, v6, Lxy1;->e:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object v3, v6, Lxy1;->a:Ljava/lang/Object;

    .line 88
    .line 89
    new-instance v1, Lsd0;

    .line 90
    .line 91
    iget-object p1, p1, Lqf;->a:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-interface {v4, p1}, Ler2;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, [B

    .line 98
    .line 99
    invoke-direct {v1, p0, p1}, Lsd0;-><init>(Lvd0;[B)V

    .line 100
    .line 101
    .line 102
    iput-object v1, v6, Lxy1;->c:Ljava/lang/Object;

    .line 103
    .line 104
    const/4 p0, 0x0

    .line 105
    iput-object p0, v6, Lxy1;->b:Ljava/lang/Object;

    .line 106
    .line 107
    invoke-virtual {v6}, Lxy1;->d()Lrf;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    iget-object p1, v5, Ln60;->b:Ljava/util/concurrent/Executor;

    .line 112
    .line 113
    new-instance v1, Lzo;

    .line 114
    .line 115
    invoke-direct {v1, v5, v2, v0, p0}, Lzo;-><init>(Ln60;Lyg;Lf42;Lrf;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public B(Lg71;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Lb5;->u(Lg71;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v1, p0, Lb5;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/ArrayDeque;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lb5;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/util/ArrayDeque;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v1, p0, Lb5;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lkn;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    iget v1, v1, Lkn;->b:I

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    if-eq v1, v2, :cond_3

    .line 42
    .line 43
    :cond_2
    iget-object v1, p0, Lb5;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Ljava/util/ArrayDeque;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lg71;

    .line 52
    .line 53
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Lb5;->I(Lg71;)V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lb5;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ljava/util/ArrayDeque;

    .line 65
    .line 66
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lb5;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Ljava/util/ArrayDeque;

    .line 72
    .line 73
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_0
    invoke-virtual {p0, p1}, Lb5;->K(Lg71;)V

    .line 77
    .line 78
    .line 79
    monitor-exit v0

    .line 80
    return-void

    .line 81
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    throw p0
.end method

.method public C(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb5;->f:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, Lb5;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public D(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb5;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lb5;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public E(Lg71;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lb5;->e:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lb5;->I(Lg71;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lb5;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Ljava/util/ArrayDeque;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Lb5;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/ArrayDeque;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lg71;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lb5;->K(Lg71;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw p0
.end method

.method public F(Lzu;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ViewGroup;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lb5;->e:Ljava/lang/Object;

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v1, p0, Lb5;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lzu;

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    new-instance v1, Lzu;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Lzu;-><init>(Lzu;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lb5;->e:Ljava/lang/Object;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget v2, p1, Lzu;->a:F

    .line 26
    .line 27
    iget v3, p1, Lzu;->b:F

    .line 28
    .line 29
    iget v4, p1, Lzu;->c:F

    .line 30
    .line 31
    iput v2, v1, Lzu;->a:F

    .line 32
    .line 33
    iput v3, v1, Lzu;->b:F

    .line 34
    .line 35
    iput v4, v1, Lzu;->c:F

    .line 36
    .line 37
    :goto_0
    iget v1, p1, Lzu;->c:F

    .line 38
    .line 39
    iget v2, p1, Lzu;->a:F

    .line 40
    .line 41
    iget p1, p1, Lzu;->b:F

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    int-to-float v3, v3

    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    int-to-float v4, v4

    .line 53
    invoke-static {v2, p1, v3, v4}, Lpg3;->h(FFFF)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    const v2, 0x38d1b717    # 1.0E-4f

    .line 58
    .line 59
    .line 60
    add-float/2addr v1, v2

    .line 61
    cmpl-float p1, v1, p1

    .line 62
    .line 63
    if-ltz p1, :cond_2

    .line 64
    .line 65
    iget-object p0, p0, Lb5;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Lzu;

    .line 68
    .line 69
    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 70
    .line 71
    .line 72
    iput p1, p0, Lzu;->c:F

    .line 73
    .line 74
    :cond_2
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public G(Ljava/util/Map;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lb5;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v0}, Lb5;->t()Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const/4 v6, 0x0

    .line 22
    if-eqz v5, :cond_2

    .line 23
    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    array-length v5, v4

    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    array-length v5, v4

    .line 31
    move v7, v6

    .line 32
    :goto_0
    if-ge v7, v5, :cond_1

    .line 33
    .line 34
    aget-object v8, v4, v7

    .line 35
    .line 36
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 37
    .line 38
    .line 39
    add-int/lit8 v7, v7, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_1
    const-string v3, "text"

    .line 46
    .line 47
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Ljava/lang/String;

    .line 52
    .line 53
    const-string v4, "uri"

    .line 54
    .line 55
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Ljava/lang/String;

    .line 60
    .line 61
    const-string v5, "subject"

    .line 62
    .line 63
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Ljava/lang/String;

    .line 68
    .line 69
    const-string v7, "title"

    .line 70
    .line 71
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    check-cast v7, Ljava/lang/String;

    .line 76
    .line 77
    const-string v8, "paths"

    .line 78
    .line 79
    invoke-interface {v1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    check-cast v8, Ljava/util/List;

    .line 84
    .line 85
    if-eqz v8, :cond_4

    .line 86
    .line 87
    new-instance v10, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    :cond_3
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    if-eqz v11, :cond_5

    .line 101
    .line 102
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    instance-of v12, v11, Ljava/lang/String;

    .line 107
    .line 108
    if-eqz v12, :cond_3

    .line 109
    .line 110
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    const/4 v10, 0x0

    .line 115
    :cond_5
    const-string v8, "mimeTypes"

    .line 116
    .line 117
    invoke-interface {v1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Ljava/util/List;

    .line 122
    .line 123
    if-eqz v1, :cond_7

    .line 124
    .line 125
    new-instance v8, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    if-eqz v11, :cond_8

    .line 139
    .line 140
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    instance-of v12, v11, Ljava/lang/String;

    .line 145
    .line 146
    if-eqz v12, :cond_6

    .line 147
    .line 148
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_7
    const/4 v8, 0x0

    .line 153
    :cond_8
    if-eqz v10, :cond_c

    .line 154
    .line 155
    new-instance v1, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    invoke-direct {v1, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    if-eqz v11, :cond_d

    .line 173
    .line 174
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v11

    .line 178
    check-cast v11, Ljava/lang/String;

    .line 179
    .line 180
    new-instance v12, Ljava/io/File;

    .line 181
    .line 182
    invoke-direct {v12, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :try_start_0
    invoke-virtual {v12}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Lb5;->t()Ljava/io/File;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    invoke-virtual {v13}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v13

    .line 200
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-static {v11, v13, v6}, Lkotlin/text/e;->m(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 204
    .line 205
    .line 206
    move-result v11
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 207
    goto :goto_5

    .line 208
    :catch_0
    move v11, v6

    .line 209
    :goto_5
    if-nez v11, :cond_b

    .line 210
    .line 211
    invoke-virtual {v0}, Lb5;->t()Ljava/io/File;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 216
    .line 217
    .line 218
    move-result v13

    .line 219
    if-nez v13, :cond_9

    .line 220
    .line 221
    invoke-virtual {v11}, Ljava/io/File;->mkdirs()Z

    .line 222
    .line 223
    .line 224
    :cond_9
    new-instance v13, Ljava/io/File;

    .line 225
    .line 226
    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    invoke-direct {v13, v11, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-static {v12, v13}, Lji0;->e(Ljava/io/File;Ljava/io/File;)V

    .line 234
    .line 235
    .line 236
    iget-object v11, v0, Lb5;->c:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v11, Landroid/app/Activity;

    .line 239
    .line 240
    if-eqz v11, :cond_a

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_a
    move-object v11, v2

    .line 244
    :goto_6
    iget-object v12, v0, Lb5;->e:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v12, Lhk2;

    .line 247
    .line 248
    invoke-virtual {v12}, Lhk2;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v12

    .line 252
    check-cast v12, Ljava/lang/String;

    .line 253
    .line 254
    invoke-static {v11, v12, v13}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_b
    invoke-virtual {v0}, Lb5;->t()Ljava/io/File;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    const-string v1, "Shared file can not be located in \'"

    .line 271
    .line 272
    const-string v2, "\'"

    .line 273
    .line 274
    invoke-static {v1, v0, v2}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-static {v0}, Lds0;->l(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_c
    const/4 v1, 0x0

    .line 283
    :cond_d
    new-instance v10, Landroid/content/Intent;

    .line 284
    .line 285
    invoke-direct {v10}, Landroid/content/Intent;-><init>()V

    .line 286
    .line 287
    .line 288
    const-string v11, "android.intent.extra.TITLE"

    .line 289
    .line 290
    const-string v12, "android.intent.extra.SUBJECT"

    .line 291
    .line 292
    const-string v13, "android.intent.extra.TEXT"

    .line 293
    .line 294
    const-string v14, "android.intent.action.SEND"

    .line 295
    .line 296
    const/4 v15, 0x1

    .line 297
    if-nez v1, :cond_12

    .line 298
    .line 299
    invoke-virtual {v10, v14}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 300
    .line 301
    .line 302
    const-string v8, "text/plain"

    .line 303
    .line 304
    invoke-virtual {v10, v8}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 305
    .line 306
    .line 307
    if-nez v4, :cond_e

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_e
    move-object v3, v4

    .line 311
    :goto_7
    invoke-virtual {v10, v13, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 312
    .line 313
    .line 314
    if-eqz v5, :cond_10

    .line 315
    .line 316
    invoke-static {v5}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eqz v3, :cond_f

    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_f
    invoke-virtual {v10, v12, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 324
    .line 325
    .line 326
    :cond_10
    :goto_8
    if-eqz v7, :cond_20

    .line 327
    .line 328
    invoke-static {v7}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    if-eqz v3, :cond_11

    .line 333
    .line 334
    goto/16 :goto_10

    .line 335
    .line 336
    :cond_11
    invoke-virtual {v10, v11, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 337
    .line 338
    .line 339
    goto/16 :goto_10

    .line 340
    .line 341
    :cond_12
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    if-nez v4, :cond_27

    .line 346
    .line 347
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 348
    .line 349
    .line 350
    move-result v4

    .line 351
    const-string v9, "android.intent.extra.STREAM"

    .line 352
    .line 353
    const-string v16, "*/*"

    .line 354
    .line 355
    if-ne v4, v15, :cond_15

    .line 356
    .line 357
    if-eqz v8, :cond_14

    .line 358
    .line 359
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-eqz v4, :cond_13

    .line 364
    .line 365
    goto :goto_9

    .line 366
    :cond_13
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->u(Ljava/util/List;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    move-object/from16 v16, v4

    .line 371
    .line 372
    check-cast v16, Ljava/lang/String;

    .line 373
    .line 374
    :cond_14
    :goto_9
    move-object/from16 v4, v16

    .line 375
    .line 376
    invoke-virtual {v10, v14}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v10, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 380
    .line 381
    .line 382
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->u(Ljava/util/List;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    check-cast v4, Landroid/os/Parcelable;

    .line 387
    .line 388
    invoke-virtual {v10, v9, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 389
    .line 390
    .line 391
    goto :goto_c

    .line 392
    :cond_15
    const-string v4, "android.intent.action.SEND_MULTIPLE"

    .line 393
    .line 394
    invoke-virtual {v10, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 395
    .line 396
    .line 397
    if-eqz v8, :cond_16

    .line 398
    .line 399
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    if-nez v4, :cond_16

    .line 404
    .line 405
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    if-ne v4, v15, :cond_17

    .line 410
    .line 411
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->u(Ljava/util/List;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    move-object/from16 v16, v4

    .line 416
    .line 417
    check-cast v16, Ljava/lang/String;

    .line 418
    .line 419
    :cond_16
    move-object/from16 v4, v16

    .line 420
    .line 421
    goto :goto_b

    .line 422
    :cond_17
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->u(Ljava/util/List;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v4

    .line 426
    check-cast v4, Ljava/lang/String;

    .line 427
    .line 428
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 429
    .line 430
    .line 431
    move-result v14

    .line 432
    sub-int/2addr v14, v15

    .line 433
    if-gt v15, v14, :cond_19

    .line 434
    .line 435
    move v6, v15

    .line 436
    :goto_a
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v15

    .line 440
    invoke-static {v4, v15}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v15

    .line 444
    if-nez v15, :cond_18

    .line 445
    .line 446
    invoke-static {v4}, Lb5;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v15

    .line 454
    check-cast v15, Ljava/lang/String;

    .line 455
    .line 456
    invoke-static {v15}, Lb5;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v15

    .line 460
    invoke-virtual {v4, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v4

    .line 464
    if-eqz v4, :cond_16

    .line 465
    .line 466
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    check-cast v4, Ljava/lang/String;

    .line 471
    .line 472
    invoke-static {v4}, Lb5;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    const-string v15, "/*"

    .line 477
    .line 478
    invoke-virtual {v4, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v4

    .line 482
    :cond_18
    if-eq v6, v14, :cond_19

    .line 483
    .line 484
    add-int/lit8 v6, v6, 0x1

    .line 485
    .line 486
    goto :goto_a

    .line 487
    :cond_19
    :goto_b
    invoke-virtual {v10, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v10, v9, v1}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 491
    .line 492
    .line 493
    :goto_c
    if-eqz v3, :cond_1b

    .line 494
    .line 495
    invoke-static {v3}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    if-eqz v4, :cond_1a

    .line 500
    .line 501
    goto :goto_d

    .line 502
    :cond_1a
    invoke-virtual {v10, v13, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 503
    .line 504
    .line 505
    :cond_1b
    :goto_d
    if-eqz v5, :cond_1d

    .line 506
    .line 507
    invoke-static {v5}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 508
    .line 509
    .line 510
    move-result v3

    .line 511
    if-eqz v3, :cond_1c

    .line 512
    .line 513
    goto :goto_e

    .line 514
    :cond_1c
    invoke-virtual {v10, v12, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 515
    .line 516
    .line 517
    :cond_1d
    :goto_e
    if-eqz v7, :cond_1f

    .line 518
    .line 519
    invoke-static {v7}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    if-eqz v3, :cond_1e

    .line 524
    .line 525
    goto :goto_f

    .line 526
    :cond_1e
    invoke-virtual {v10, v11, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 527
    .line 528
    .line 529
    :cond_1f
    :goto_f
    const/4 v3, 0x1

    .line 530
    invoke-virtual {v10, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 531
    .line 532
    .line 533
    :cond_20
    :goto_10
    new-instance v3, Landroid/content/Intent;

    .line 534
    .line 535
    const-class v4, Ldev/fluttercommunity/plus/share/SharePlusPendingIntent;

    .line 536
    .line 537
    invoke-direct {v3, v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 538
    .line 539
    .line 540
    iget-object v4, v0, Lb5;->f:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v4, Lhk2;

    .line 543
    .line 544
    invoke-virtual {v4}, Lhk2;->getValue()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    check-cast v4, Ljava/lang/Number;

    .line 549
    .line 550
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 551
    .line 552
    .line 553
    move-result v4

    .line 554
    const/high16 v5, 0x8000000

    .line 555
    .line 556
    or-int/2addr v4, v5

    .line 557
    const/4 v5, 0x0

    .line 558
    invoke-static {v2, v5, v3, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    invoke-virtual {v3}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    invoke-static {v10, v7, v3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;Landroid/content/IntentSender;)Landroid/content/Intent;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    if-eqz v1, :cond_24

    .line 571
    .line 572
    iget-object v4, v0, Lb5;->c:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast v4, Landroid/app/Activity;

    .line 575
    .line 576
    if-eqz v4, :cond_21

    .line 577
    .line 578
    goto :goto_11

    .line 579
    :cond_21
    move-object v4, v2

    .line 580
    :goto_11
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    const/high16 v5, 0x10000

    .line 585
    .line 586
    invoke-virtual {v4, v3, v5}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 594
    .line 595
    .line 596
    move-result-object v4

    .line 597
    :cond_22
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 598
    .line 599
    .line 600
    move-result v5

    .line 601
    if-eqz v5, :cond_24

    .line 602
    .line 603
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v5

    .line 607
    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 608
    .line 609
    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 610
    .line 611
    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 612
    .line 613
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 614
    .line 615
    .line 616
    move-result-object v6

    .line 617
    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 618
    .line 619
    .line 620
    move-result v7

    .line 621
    if-eqz v7, :cond_22

    .line 622
    .line 623
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v7

    .line 627
    check-cast v7, Landroid/net/Uri;

    .line 628
    .line 629
    iget-object v8, v0, Lb5;->c:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v8, Landroid/app/Activity;

    .line 632
    .line 633
    if-eqz v8, :cond_23

    .line 634
    .line 635
    goto :goto_13

    .line 636
    :cond_23
    move-object v8, v2

    .line 637
    :goto_13
    const/4 v9, 0x3

    .line 638
    invoke-virtual {v8, v5, v7, v9}, Landroid/content/Context;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V

    .line 639
    .line 640
    .line 641
    goto :goto_12

    .line 642
    :cond_24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    iget-object v1, v0, Lb5;->c:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v1, Landroid/app/Activity;

    .line 648
    .line 649
    if-eqz v1, :cond_25

    .line 650
    .line 651
    const/16 v0, 0x5873

    .line 652
    .line 653
    invoke-virtual {v1, v3, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 654
    .line 655
    .line 656
    goto :goto_14

    .line 657
    :cond_25
    const/high16 v1, 0x10000000

    .line 658
    .line 659
    invoke-virtual {v3, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 660
    .line 661
    .line 662
    iget-object v0, v0, Lb5;->d:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v0, Lid2;

    .line 665
    .line 666
    iget-object v1, v0, Lid2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 667
    .line 668
    const/4 v4, 0x1

    .line 669
    const/4 v5, 0x0

    .line 670
    invoke-virtual {v1, v5, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 671
    .line 672
    .line 673
    move-result v1

    .line 674
    if-eqz v1, :cond_26

    .line 675
    .line 676
    iget-object v1, v0, Lid2;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 677
    .line 678
    if-eqz v1, :cond_26

    .line 679
    .line 680
    const-string v4, "dev.fluttercommunity.plus/share/unavailable"

    .line 681
    .line 682
    invoke-interface {v1, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    const/4 v1, 0x0

    .line 686
    iput-object v1, v0, Lid2;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 687
    .line 688
    :cond_26
    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 689
    .line 690
    .line 691
    :goto_14
    return-void

    .line 692
    :cond_27
    const-string v0, "Error sharing files: No files found"

    .line 693
    .line 694
    invoke-static {v0}, Lds0;->l(Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    return-void
.end method

.method public H(Ljava/lang/String;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb5;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lra2;

    .line 4
    .line 5
    sget-object v1, Lrs0;->y:Lrs0;

    .line 6
    .line 7
    iget-boolean v2, v1, Lrs0;->b:Z

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    new-instance p1, Ldt0;

    .line 13
    .line 14
    invoke-direct {p1, p0, v3}, Ldt0;-><init>(Lb5;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lra2;->t(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-boolean v1, v1, Lrs0;->a:Z

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    iget-object p2, p0, Lb5;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p2, Ler0;

    .line 30
    .line 31
    iget-object p2, p2, Ler0;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p2, Ler0;

    .line 34
    .line 35
    iget-object p2, p2, Ler0;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p2, Landroid/content/SharedPreferences;

    .line 38
    .line 39
    const-string v1, "enable_inapp_notificaiton"

    .line 40
    .line 41
    invoke-interface {p2, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    :cond_1
    new-instance p2, Lcp0;

    .line 48
    .line 49
    const/16 v1, 0xa

    .line 50
    .line 51
    invoke-direct {p2, p0, p1, v1, v3}, Lcp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p2}, Lra2;->t(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void
.end method

.method public I(Lg71;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Lb5;->q(Lg71;)Lz61;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v1, p0, Lb5;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lag;

    .line 39
    .line 40
    iget-object v2, p0, Lb5;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ly61;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ly61;->d()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    monitor-exit v0

    .line 58
    return-void

    .line 59
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    throw p0
.end method

.method public J()V
    .locals 6

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lb5;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lag;

    .line 27
    .line 28
    iget-object v3, p0, Lb5;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ly61;

    .line 37
    .line 38
    iget-object v3, v2, Ly61;->a:Ljava/lang/Object;

    .line 39
    .line 40
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    :try_start_1
    iget-object v4, v2, Ly61;->c:Lqq;

    .line 42
    .line 43
    invoke-virtual {v4}, Lqq;->v()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v4, v5}, Lqq;->y(Ljava/util/ArrayList;)V

    .line 50
    .line 51
    .line 52
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 53
    :try_start_2
    iget-object v3, v2, Ly61;->a:Ljava/lang/Object;

    .line 54
    .line 55
    monitor-enter v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    :try_start_3
    iget-object v2, v2, Ly61;->b:Lg71;

    .line 57
    .line 58
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 59
    :try_start_4
    invoke-virtual {p0, v2}, Lb5;->E(Lg71;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    goto :goto_1

    .line 65
    :catchall_1
    move-exception p0

    .line 66
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 67
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 68
    :catchall_2
    move-exception p0

    .line 69
    :try_start_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 70
    :try_start_8
    throw p0

    .line 71
    :cond_0
    monitor-exit v0

    .line 72
    return-void

    .line 73
    :goto_1
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 74
    throw p0
.end method

.method public K(Lg71;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Lb5;->q(Lg71;)Lz61;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v1, p0, Lb5;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lag;

    .line 33
    .line 34
    iget-object v2, p0, Lb5;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ly61;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ly61;->b()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_0

    .line 56
    .line 57
    invoke-virtual {v1}, Ly61;->g()V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    monitor-exit v0

    .line 64
    return-void

    .line 65
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    throw p0
.end method

.method public a(Lf02;)Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lb5;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcy;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Lcy;->a(Lf02;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p0, "Attempting to request an undeclared dependency Set<"

    .line 21
    .line 22
    const-string v0, ">."

    .line 23
    .line 24
    invoke-static {p1, p0, v0}, Lf42;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public b(Ljava/lang/Class;)Liz1;
    .locals 0

    .line 1
    invoke-static {p1}, Lf02;->a(Ljava/lang/Class;)Lf02;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lb5;->d(Lf02;)Liz1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public c(Lf02;)Liz1;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lb5;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcy;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Lcy;->c(Lf02;)Liz1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p0, "Attempting to request an undeclared dependency Provider<Set<"

    .line 21
    .line 22
    const-string v0, ">>."

    .line 23
    .line 24
    invoke-static {p1, p0, v0}, Lf42;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public d(Lf02;)Liz1;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lb5;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcy;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Lcy;->d(Lf02;)Liz1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p0, "Attempting to request an undeclared dependency Provider<"

    .line 21
    .line 22
    const-string v0, ">."

    .line 23
    .line 24
    invoke-static {p1, p0, v0}, Lf42;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public e(Lf02;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lb5;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcy;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Lcy;->e(Lf02;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p0, "Attempting to request an undeclared dependency "

    .line 21
    .line 22
    const-string v0, "."

    .line 23
    .line 24
    invoke-static {p1, p0, v0}, Lf42;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public g(Ljava/lang/Object;Ljava/lang/Object;Lh41;Z)V
    .locals 13

    .line 1
    iget-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "at least one of the `fullPrimitive` or `primitive` must be set"

    .line 13
    .line 14
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    :goto_0
    invoke-virtual/range {p3 .. p3}, Lh41;->D()Lu31;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, Lu31;->c:Lu31;

    .line 23
    .line 24
    if-ne v0, v1, :cond_b

    .line 25
    .line 26
    invoke-virtual/range {p3 .. p3}, Lh41;->B()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual/range {p3 .. p3}, Lh41;->C()Lwq1;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    sget-object v2, Lwq1;->e:Lwq1;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    if-ne v1, v2, :cond_2

    .line 42
    .line 43
    move-object v0, v3

    .line 44
    :cond_2
    sget-object v1, Lal1;->b:Lal1;

    .line 45
    .line 46
    invoke-virtual/range {p3 .. p3}, Lh41;->A()Li31;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2}, Li31;->B()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual/range {p3 .. p3}, Lh41;->A()Li31;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v4}, Li31;->C()Lvl;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual/range {p3 .. p3}, Lh41;->A()Li31;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5}, Li31;->A()Lh31;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual/range {p3 .. p3}, Lh41;->C()Lwq1;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-static {v2, v4, v5, v6, v0}, Lxy1;->g(Ljava/lang/String;Lvl;Lh31;Lwq1;Ljava/lang/Integer;)Lxy1;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v1, v0}, Lal1;->a(Lxy1;)Lde3;

    .line 79
    .line 80
    .line 81
    move-result-object v12

    .line 82
    new-instance v4, Llx1;

    .line 83
    .line 84
    invoke-virtual/range {p3 .. p3}, Lh41;->C()Lwq1;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    const/4 v1, 0x5

    .line 93
    const/4 v2, 0x1

    .line 94
    if-eq v0, v2, :cond_6

    .line 95
    .line 96
    const/4 v2, 0x2

    .line 97
    if-eq v0, v2, :cond_5

    .line 98
    .line 99
    const/4 v2, 0x3

    .line 100
    if-eq v0, v2, :cond_4

    .line 101
    .line 102
    const/4 v2, 0x4

    .line 103
    if-ne v0, v2, :cond_3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    const-string p0, "unknown output prefix type"

    .line 107
    .line 108
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_4
    sget-object v0, Ljb1;->b:[B

    .line 113
    .line 114
    :goto_1
    move-object v7, v0

    .line 115
    goto :goto_3

    .line 116
    :cond_5
    :goto_2
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const/4 v1, 0x0

    .line 121
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual/range {p3 .. p3}, Lh41;->B()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    goto :goto_1

    .line 138
    :cond_6
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual/range {p3 .. p3}, Lh41;->B()I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    goto :goto_1

    .line 159
    :goto_3
    invoke-virtual/range {p3 .. p3}, Lh41;->D()Lu31;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-virtual/range {p3 .. p3}, Lh41;->C()Lwq1;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-virtual/range {p3 .. p3}, Lh41;->B()I

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    invoke-virtual/range {p3 .. p3}, Lh41;->A()Li31;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0}, Li31;->B()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    move-object v5, p1

    .line 180
    move-object v6, p2

    .line 181
    invoke-direct/range {v4 .. v12}, Llx1;-><init>(Ljava/lang/Object;Ljava/lang/Object;[BLu31;Lwq1;ILjava/lang/String;Lde3;)V

    .line 182
    .line 183
    .line 184
    iget-object p1, p0, Lb5;->c:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 187
    .line 188
    iget-object v0, p0, Lb5;->d:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, Ljava/util/ArrayList;

    .line 191
    .line 192
    new-instance v1, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    new-instance v2, Lmx1;

    .line 201
    .line 202
    iget-object v5, v4, Llx1;->c:[B

    .line 203
    .line 204
    if-nez v5, :cond_7

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_7
    array-length v3, v5

    .line 208
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    :goto_4
    invoke-direct {v2, v3}, Lmx1;-><init>([B)V

    .line 213
    .line 214
    .line 215
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {p1, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    check-cast v1, Ljava/util/List;

    .line 224
    .line 225
    if-eqz v1, :cond_8

    .line 226
    .line 227
    new-instance v3, Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {p1, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    :cond_8
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    if-eqz p4, :cond_a

    .line 249
    .line 250
    iget-object p1, p0, Lb5;->e:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast p1, Llx1;

    .line 253
    .line 254
    if-nez p1, :cond_9

    .line 255
    .line 256
    iput-object v4, p0, Lb5;->e:Ljava/lang/Object;

    .line 257
    .line 258
    return-void

    .line 259
    :cond_9
    const-string p0, "you cannot set two primary primitives"

    .line 260
    .line 261
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    :cond_a
    return-void

    .line 265
    :cond_b
    const-string p0, "only ENABLED key is allowed"

    .line 266
    .line 267
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :cond_c
    const-string p0, "addPrimitive cannot be called after build"

    .line 272
    .line 273
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljavax/inject/Provider;

    .line 4
    .line 5
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    iget-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljavax/inject/Provider;

    .line 15
    .line 16
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v3, v0

    .line 21
    check-cast v3, Lei1;

    .line 22
    .line 23
    iget-object v0, p0, Lb5;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lac1;

    .line 26
    .line 27
    invoke-virtual {v0}, Lac1;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v4, v0

    .line 32
    check-cast v4, Lec;

    .line 33
    .line 34
    iget-object v0, p0, Lb5;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljavax/inject/Provider;

    .line 37
    .line 38
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object v5, v0

    .line 43
    check-cast v5, Ls52;

    .line 44
    .line 45
    iget-object p0, p0, Lb5;->f:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Ljavax/inject/Provider;

    .line 48
    .line 49
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    move-object v6, p0

    .line 54
    check-cast v6, Ls52;

    .line 55
    .line 56
    new-instance v1, Ln60;

    .line 57
    .line 58
    invoke-direct/range {v1 .. v6}, Ln60;-><init>(Ljava/util/concurrent/Executor;Lei1;Lec;Ls52;Ls52;)V

    .line 59
    .line 60
    .line 61
    return-object v1
.end method

.method public get(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 62
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-static {p1}, Lf02;->a(Ljava/lang/Class;)Lf02;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 63
    iget-object p0, p0, Lb5;->f:Ljava/lang/Object;

    check-cast p0, Lcy;

    invoke-interface {p0, p1}, Lcy;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    .line 64
    const-class v0, Lpz1;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-object p0

    .line 65
    :cond_0
    new-instance p1, Lh42;

    check-cast p0, Lpz1;

    .line 66
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    .line 67
    :cond_1
    const-string p0, "Attempting to request an undeclared dependency "

    .line 68
    const-string v0, "."

    .line 69
    invoke-static {p1, p0, v0}, Lf42;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public h(Ly61;Ljava/util/List;Ljava/util/List;Lkn;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x1

    .line 9
    xor-int/2addr v1, v2

    .line 10
    invoke-static {v1}, Lde3;->f(Z)V

    .line 11
    .line 12
    .line 13
    iput-object p4, p0, Lb5;->f:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object p4, p1, Ly61;->a:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    :try_start_1
    iget-object v1, p1, Ly61;->b:Lg71;

    .line 19
    .line 20
    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 21
    :try_start_2
    invoke-virtual {p0, v1}, Lb5;->q(Lg71;)Lz61;

    .line 22
    .line 23
    .line 24
    move-result-object p4

    .line 25
    if-nez p4, :cond_0

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_0
    iget-object v3, p0, Lb5;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v3, p4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p4

    .line 40
    check-cast p4, Ljava/util/Set;

    .line 41
    .line 42
    iget-object v3, p0, Lb5;->f:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Lkn;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    iget v3, v3, Lkn;->b:I

    .line 49
    .line 50
    const/4 v4, 0x2

    .line 51
    if-eq v3, v4, :cond_4

    .line 52
    .line 53
    :cond_1
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p4

    .line 57
    :cond_2
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Lag;

    .line 68
    .line 69
    iget-object v4, p0, Lb5;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, Ljava/util/HashMap;

    .line 72
    .line 73
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Ly61;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-nez v4, :cond_2

    .line 87
    .line 88
    invoke-virtual {v3}, Ly61;->b()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_3

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 100
    .line 101
    const-string p1, "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner."

    .line 102
    .line 103
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    :cond_4
    :try_start_3
    iget-object p4, p1, Ly61;->c:Lqq;

    .line 108
    .line 109
    iget-object p4, p4, Lqq;->V:Ljava/lang/Object;

    .line 110
    .line 111
    monitor-enter p4
    :try_end_3
    .catch Loq; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 112
    :try_start_4
    monitor-exit p4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 113
    :try_start_5
    iget-object p4, p1, Ly61;->c:Lqq;

    .line 114
    .line 115
    iget-object v3, p4, Lqq;->V:Ljava/lang/Object;

    .line 116
    .line 117
    monitor-enter v3
    :try_end_5
    .catch Loq; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 118
    :try_start_6
    iput-object p2, p4, Lqq;->w:Ljava/util/List;

    .line 119
    .line 120
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 121
    :try_start_7
    iget-object p2, p1, Ly61;->a:Ljava/lang/Object;

    .line 122
    .line 123
    monitor-enter p2
    :try_end_7
    .catch Loq; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 124
    :try_start_8
    iget-object p1, p1, Ly61;->c:Lqq;

    .line 125
    .line 126
    invoke-virtual {p1, p3}, Lqq;->b(Ljava/util/Collection;)V

    .line 127
    .line 128
    .line 129
    monitor-exit p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 130
    :try_start_9
    invoke-interface {v1}, Lg71;->getLifecycle()Lv61;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, Li71;

    .line 135
    .line 136
    iget-object p1, p1, Li71;->c:Lu61;

    .line 137
    .line 138
    sget-object p2, Lu61;->d:Lu61;

    .line 139
    .line 140
    invoke-virtual {p1, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-ltz p1, :cond_5

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_5
    const/4 v2, 0x0

    .line 148
    :goto_1
    if-eqz v2, :cond_6

    .line 149
    .line 150
    invoke-virtual {p0, v1}, Lb5;->B(Lg71;)V

    .line 151
    .line 152
    .line 153
    :cond_6
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 154
    return-void

    .line 155
    :catchall_1
    move-exception p0

    .line 156
    :try_start_a
    monitor-exit p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 157
    :try_start_b
    throw p0
    :try_end_b
    .catch Loq; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 158
    :catchall_2
    move-exception p0

    .line 159
    :try_start_c
    monitor-exit v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 160
    :try_start_d
    throw p0
    :try_end_d
    .catch Loq; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 161
    :catch_0
    move-exception p0

    .line 162
    goto :goto_2

    .line 163
    :catchall_3
    move-exception p0

    .line 164
    :try_start_e
    monitor-exit p4
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 165
    :try_start_f
    throw p0
    :try_end_f
    .catch Loq; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 166
    :goto_2
    :try_start_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 167
    .line 168
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    throw p1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 172
    :catchall_4
    move-exception p0

    .line 173
    :try_start_11
    monitor-exit p4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 174
    :try_start_12
    throw p0

    .line 175
    :goto_3
    monitor-exit v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 176
    throw p0
.end method

.method public i()Le5;
    .locals 9

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Integer;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_e

    .line 7
    .line 8
    iget-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/Integer;

    .line 11
    .line 12
    if-eqz v0, :cond_d

    .line 13
    .line 14
    iget-object v0, p0, Lb5;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Integer;

    .line 17
    .line 18
    if-eqz v0, :cond_c

    .line 19
    .line 20
    iget-object v2, p0, Lb5;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lc5;

    .line 23
    .line 24
    if-eqz v2, :cond_b

    .line 25
    .line 26
    iget-object v2, p0, Lb5;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ld5;

    .line 29
    .line 30
    if-eqz v2, :cond_a

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iget-object v3, p0, Lb5;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Lc5;

    .line 39
    .line 40
    sget-object v4, Lc5;->c:Lc5;

    .line 41
    .line 42
    if-ne v3, v4, :cond_1

    .line 43
    .line 44
    const/16 v1, 0x14

    .line 45
    .line 46
    if-gt v2, v1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 50
    .line 51
    const-string v1, "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"

    .line 52
    .line 53
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_1
    sget-object v4, Lc5;->d:Lc5;

    .line 66
    .line 67
    if-ne v3, v4, :cond_3

    .line 68
    .line 69
    const/16 v1, 0x1c

    .line 70
    .line 71
    if-gt v2, v1, :cond_2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 75
    .line 76
    const-string v1, "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"

    .line 77
    .line 78
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p0

    .line 90
    :cond_3
    sget-object v4, Lc5;->e:Lc5;

    .line 91
    .line 92
    if-ne v3, v4, :cond_5

    .line 93
    .line 94
    const/16 v1, 0x20

    .line 95
    .line 96
    if-gt v2, v1, :cond_4

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 100
    .line 101
    const-string v1, "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"

    .line 102
    .line 103
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p0

    .line 115
    :cond_5
    sget-object v4, Lc5;->f:Lc5;

    .line 116
    .line 117
    if-ne v3, v4, :cond_7

    .line 118
    .line 119
    const/16 v1, 0x30

    .line 120
    .line 121
    if-gt v2, v1, :cond_6

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_6
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 125
    .line 126
    const-string v1, "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"

    .line 127
    .line 128
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p0

    .line 140
    :cond_7
    sget-object v4, Lc5;->g:Lc5;

    .line 141
    .line 142
    if-ne v3, v4, :cond_9

    .line 143
    .line 144
    const/16 v1, 0x40

    .line 145
    .line 146
    if-gt v2, v1, :cond_8

    .line 147
    .line 148
    :goto_0
    new-instance v3, Le5;

    .line 149
    .line 150
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, Ljava/lang/Integer;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    iget-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Ljava/lang/Integer;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    iget-object v0, p0, Lb5;->d:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    iget-object v0, p0, Lb5;->f:Ljava/lang/Object;

    .line 175
    .line 176
    move-object v7, v0

    .line 177
    check-cast v7, Ld5;

    .line 178
    .line 179
    iget-object p0, p0, Lb5;->e:Ljava/lang/Object;

    .line 180
    .line 181
    move-object v8, p0

    .line 182
    check-cast v8, Lc5;

    .line 183
    .line 184
    invoke-direct/range {v3 .. v8}, Le5;-><init>(IIILd5;Lc5;)V

    .line 185
    .line 186
    .line 187
    return-object v3

    .line 188
    :cond_8
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 189
    .line 190
    const-string v1, "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"

    .line 191
    .line 192
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw p0

    .line 204
    :cond_9
    const-string p0, "unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512"

    .line 205
    .line 206
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-object v1

    .line 210
    :cond_a
    const-string p0, "variant is not set"

    .line 211
    .line 212
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    return-object v1

    .line 216
    :cond_b
    const-string p0, "hash type is not set"

    .line 217
    .line 218
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    return-object v1

    .line 222
    :cond_c
    const-string p0, "tag size is not set"

    .line 223
    .line 224
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    return-object v1

    .line 228
    :cond_d
    const-string p0, "HMAC key size is not set"

    .line 229
    .line 230
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    return-object v1

    .line 234
    :cond_e
    const-string p0, "AES key size is not set"

    .line 235
    .line 236
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    return-object v1
.end method

.method public j()Lmg;
    .locals 8

    .line 1
    iget-object v0, p0, Lb5;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld70;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, " surface"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, ""

    .line 11
    .line 12
    :goto_0
    iget-object v1, p0, Lb5;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/List;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string v1, " sharedSurfaces"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    iget-object v1, p0, Lb5;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Integer;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    const-string v1, " mirrorMode"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_2
    iget-object v1, p0, Lb5;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/lang/Integer;

    .line 39
    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    const-string v1, " surfaceGroupId"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_3
    iget-object v1, p0, Lb5;->f:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lmb0;

    .line 51
    .line 52
    if-nez v1, :cond_4

    .line 53
    .line 54
    const-string v1, " dynamicRange"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    new-instance v2, Lmg;

    .line 67
    .line 68
    iget-object v0, p0, Lb5;->d:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v3, v0

    .line 71
    check-cast v3, Ld70;

    .line 72
    .line 73
    iget-object v0, p0, Lb5;->e:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v4, v0

    .line 76
    check-cast v4, Ljava/util/List;

    .line 77
    .line 78
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    iget-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    iget-object p0, p0, Lb5;->f:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v7, p0

    .line 97
    check-cast v7, Lmb0;

    .line 98
    .line 99
    invoke-direct/range {v2 .. v7}, Lmg;-><init>(Ld70;Ljava/util/List;IILmb0;)V

    .line 100
    .line 101
    .line 102
    return-object v2

    .line 103
    :cond_5
    const-string p0, "Missing required properties:"

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/4 p0, 0x0

    .line 113
    return-object p0
.end method

.method public k()Lpg;
    .locals 8

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/util/Size;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, " resolution"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, ""

    .line 11
    .line 12
    :goto_0
    iget-object v1, p0, Lb5;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lmb0;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string v1, " dynamicRange"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    iget-object v1, p0, Lb5;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Landroid/util/Range;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    const-string v1, " expectedFrameRateRange"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_2
    iget-object v1, p0, Lb5;->f:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/lang/Boolean;

    .line 39
    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    const-string v1, " zslDisabled"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    new-instance v2, Lpg;

    .line 55
    .line 56
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v3, v0

    .line 59
    check-cast v3, Landroid/util/Size;

    .line 60
    .line 61
    iget-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v4, v0

    .line 64
    check-cast v4, Lmb0;

    .line 65
    .line 66
    iget-object v0, p0, Lb5;->d:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v5, v0

    .line 69
    check-cast v5, Landroid/util/Range;

    .line 70
    .line 71
    iget-object v0, p0, Lb5;->e:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v6, v0

    .line 74
    check-cast v6, Lty;

    .line 75
    .line 76
    iget-object p0, p0, Lb5;->f:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    invoke-direct/range {v2 .. v7}, Lpg;-><init>(Landroid/util/Size;Lmb0;Landroid/util/Range;Lty;Z)V

    .line 85
    .line 86
    .line 87
    return-object v2

    .line 88
    :cond_4
    const-string p0, "Missing required properties:"

    .line 89
    .line 90
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/4 p0, 0x0

    .line 98
    return-object p0
.end method

.method public l(Lzp;Lzp;Llj2;Llj2;Ljava/util/Map$Entry;)V
    .locals 10

    .line 1
    invoke-interface {p5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, Llj2;

    .line 7
    .line 8
    iget-object v0, p3, Llj2;->g:Lpg;

    .line 9
    .line 10
    iget-object v4, v0, Lpg;->a:Landroid/util/Size;

    .line 11
    .line 12
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lof;

    .line 17
    .line 18
    iget-object v0, v0, Lof;->a:Lfg;

    .line 19
    .line 20
    iget-object v5, v0, Lfg;->d:Landroid/graphics/Rect;

    .line 21
    .line 22
    iget-boolean p3, p3, Llj2;->c:Z

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    if-eqz p3, :cond_0

    .line 26
    .line 27
    move-object v6, p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v6, v0

    .line 30
    :goto_0
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lof;

    .line 35
    .line 36
    iget-object p1, p1, Lof;->a:Lfg;

    .line 37
    .line 38
    iget v7, p1, Lfg;->f:I

    .line 39
    .line 40
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lof;

    .line 45
    .line 46
    iget-object p1, p1, Lof;->a:Lfg;

    .line 47
    .line 48
    iget-boolean v8, p1, Lfg;->g:Z

    .line 49
    .line 50
    new-instance v3, Lsg;

    .line 51
    .line 52
    invoke-direct/range {v3 .. v8}, Lsg;-><init>(Landroid/util/Size;Landroid/graphics/Rect;Lzp;IZ)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p4, Llj2;->g:Lpg;

    .line 56
    .line 57
    iget-object v5, p1, Lpg;->a:Landroid/util/Size;

    .line 58
    .line 59
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lof;

    .line 64
    .line 65
    iget-object p1, p1, Lof;->b:Lfg;

    .line 66
    .line 67
    iget-object v6, p1, Lfg;->d:Landroid/graphics/Rect;

    .line 68
    .line 69
    iget-boolean p1, p4, Llj2;->c:Z

    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    move-object v7, p2

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move-object v7, v0

    .line 76
    :goto_1
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Lof;

    .line 81
    .line 82
    iget-object p1, p1, Lof;->b:Lfg;

    .line 83
    .line 84
    iget v8, p1, Lfg;->f:I

    .line 85
    .line 86
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Lof;

    .line 91
    .line 92
    iget-object p1, p1, Lof;->b:Lfg;

    .line 93
    .line 94
    iget-boolean v9, p1, Lfg;->g:Z

    .line 95
    .line 96
    new-instance v4, Lsg;

    .line 97
    .line 98
    invoke-direct/range {v4 .. v9}, Lsg;-><init>(Landroid/util/Size;Landroid/graphics/Rect;Lzp;IZ)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Lof;

    .line 106
    .line 107
    iget-object p1, p1, Lof;->a:Lfg;

    .line 108
    .line 109
    iget p1, p1, Lfg;->c:I

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-static {}, Lpg3;->a()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Llj2;->a()V

    .line 118
    .line 119
    .line 120
    iget-boolean p2, v2, Llj2;->j:Z

    .line 121
    .line 122
    const/4 p3, 0x1

    .line 123
    xor-int/2addr p2, p3

    .line 124
    const-string p4, "Consumer can only be linked once."

    .line 125
    .line 126
    invoke-static {p4, p2}, Lde3;->j(Ljava/lang/String;Z)V

    .line 127
    .line 128
    .line 129
    iput-boolean p3, v2, Llj2;->j:Z

    .line 130
    .line 131
    move-object v5, v3

    .line 132
    iget-object v3, v2, Llj2;->l:Lkj2;

    .line 133
    .line 134
    invoke-virtual {v3}, Ld70;->c()Ls81;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    new-instance v1, Ljj2;

    .line 139
    .line 140
    move-object v6, v4

    .line 141
    move v4, p1

    .line 142
    invoke-direct/range {v1 .. v6}, Ljj2;-><init>(Llj2;Lkj2;ILsg;Lsg;)V

    .line 143
    .line 144
    .line 145
    invoke-static {}, Lpg3;->o()Lnt0;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-static {p2, v1, p1}, Lw11;->I(Ls81;Lud;Ljava/util/concurrent/Executor;)Lls;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    new-instance p2, Lcb;

    .line 154
    .line 155
    const/16 p3, 0x1d

    .line 156
    .line 157
    const/4 p4, 0x0

    .line 158
    invoke-direct {p2, p0, v2, p3, p4}, Lcb;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 159
    .line 160
    .line 161
    invoke-static {}, Lpg3;->o()Lnt0;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    new-instance p3, Ldp0;

    .line 166
    .line 167
    invoke-direct {p3, p4, p1, p2}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, p3, p0}, Lyo0;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 171
    .line 172
    .line 173
    return-void
.end method

.method public n(Lg71;Lqq;)Ly61;
    .locals 3

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p2, Lqq;->e:Lhf;

    .line 5
    .line 6
    new-instance v2, Lag;

    .line 7
    .line 8
    invoke-direct {v2, p1, v1}, Lag;-><init>(Lg71;Lhf;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lb5;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    const-string v2, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras"

    .line 25
    .line 26
    invoke-static {v2, v1}, Lde3;->e(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Ly61;

    .line 30
    .line 31
    invoke-direct {v1, p1, p2}, Ly61;-><init>(Lg71;Lqq;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Lqq;->v()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    invoke-virtual {v1}, Ly61;->d()V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    :goto_1
    invoke-interface {p1}, Lg71;->getLifecycle()Lv61;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Li71;

    .line 57
    .line 58
    iget-object p1, p1, Li71;->c:Lu61;

    .line 59
    .line 60
    sget-object p2, Lu61;->a:Lu61;

    .line 61
    .line 62
    if-ne p1, p2, :cond_2

    .line 63
    .line 64
    monitor-exit v0

    .line 65
    return-object v1

    .line 66
    :cond_2
    invoke-virtual {p0, v1}, Lb5;->z(Ly61;)V

    .line 67
    .line 68
    .line 69
    monitor-exit v0

    .line 70
    return-object v1

    .line 71
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    throw p0
.end method

.method public o(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lb5;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v6, v0

    .line 4
    check-cast v6, Landroid/graphics/Paint;

    .line 5
    .line 6
    iget-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    iget-object v1, p0, Lb5;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lzu;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget v1, v1, Lzu;->c:F

    .line 17
    .line 18
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 19
    .line 20
    .line 21
    cmpl-float v1, v1, v2

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 29
    :goto_1
    iget-object v2, p0, Lb5;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lav;

    .line 32
    .line 33
    if-nez v1, :cond_3

    .line 34
    .line 35
    invoke-interface {v2, p1}, Lav;->c(Landroid/graphics/Canvas;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6}, Landroid/graphics/Paint;->getColor()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    int-to-float v4, v1

    .line 53
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    int-to-float v5, v0

    .line 58
    const/4 v2, 0x0

    .line 59
    const/4 v3, 0x0

    .line 60
    move-object v1, p1

    .line 61
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move-object v1, p1

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    move-object v1, p1

    .line 68
    invoke-interface {v2, v1}, Lav;->c(Landroid/graphics/Canvas;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6}, Landroid/graphics/Paint;->getColor()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    int-to-float v4, p1

    .line 86
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    int-to-float v5, p1

    .line 91
    const/4 v2, 0x0

    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    :goto_2
    iget-object p1, p0, Lb5;->f:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 99
    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    iget-object v0, p0, Lb5;->e:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Lzu;

    .line 105
    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object v0, p0, Lb5;->e:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Lzu;

    .line 115
    .line 116
    iget v0, v0, Lzu;->a:F

    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    int-to-float v2, v2

    .line 123
    const/high16 v3, 0x40000000    # 2.0f

    .line 124
    .line 125
    div-float/2addr v2, v3

    .line 126
    sub-float/2addr v0, v2

    .line 127
    iget-object v2, p0, Lb5;->e:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, Lzu;

    .line 130
    .line 131
    iget v2, v2, Lzu;->b:F

    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    int-to-float p1, p1

    .line 138
    div-float/2addr p1, v3

    .line 139
    sub-float/2addr v2, p1

    .line 140
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 141
    .line 142
    .line 143
    iget-object p0, p0, Lb5;->f:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 146
    .line 147
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 148
    .line 149
    .line 150
    neg-float p0, v0

    .line 151
    neg-float p1, v2

    .line 152
    invoke-virtual {v1, p0, p1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 153
    .line 154
    .line 155
    :cond_5
    return-void
.end method

.method public p()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lb5;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/database/sqlite/SQLiteDatabase;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move p0, v0

    .line 16
    :goto_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_1
    return v0
.end method

.method public q(Lg71;)Lz61;
    .locals 3

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lb5;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lz61;

    .line 27
    .line 28
    iget-object v2, v1, Lz61;->b:Lg71;

    .line 29
    .line 30
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-object v1

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    monitor-exit v0

    .line 42
    return-object p0

    .line 43
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p0
.end method

.method public s()Lzu;
    .locals 4

    .line 1
    iget-object v0, p0, Lb5;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzu;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v1, Lzu;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Lzu;-><init>(Lzu;)V

    .line 12
    .line 13
    .line 14
    iget v0, v1, Lzu;->c:F

    .line 15
    .line 16
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 17
    .line 18
    .line 19
    cmpl-float v0, v0, v2

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget v0, v1, Lzu;->a:F

    .line 24
    .line 25
    iget v2, v1, Lzu;->b:F

    .line 26
    .line 27
    iget-object p0, p0, Lb5;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Landroid/view/ViewGroup;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    int-to-float v3, v3

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    int-to-float p0, p0

    .line 41
    invoke-static {v0, v2, v3, p0}, Lpg3;->h(FFFF)F

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    iput p0, v1, Lzu;->c:F

    .line 46
    .line 47
    :cond_1
    return-object v1
.end method

.method public t()Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lb5;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/app/Activity;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p0, p0, Lb5;->b:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v1, p0

    .line 13
    check-cast v1, Landroid/content/Context;

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v1, "share_plus"

    .line 20
    .line 21
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lb5;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lb5;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/List;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "FontRequest {mProviderAuthority: "

    .line 23
    .line 24
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Lb5;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v3, ", mProviderPackage: "

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Lb5;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v3, ", mQuery: "

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lb5;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p0, ", mCertificates:"

    .line 59
    .line 60
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    move v2, p0

    .line 72
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-ge v2, v3, :cond_1

    .line 77
    .line 78
    const-string v3, " ["

    .line 79
    .line 80
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, Ljava/util/List;

    .line 88
    .line 89
    move v4, p0

    .line 90
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-ge v4, v5, :cond_0

    .line 95
    .line 96
    const-string v5, " \""

    .line 97
    .line 98
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, [B

    .line 106
    .line 107
    invoke-static {v5, p0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v5, "\""

    .line 115
    .line 116
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    add-int/lit8 v4, v4, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_0
    const-string v3, " ]"

    .line 123
    .line 124
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    add-int/lit8 v2, v2, 0x1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_1
    const-string p0, "}mCertificatesArray: 0"

    .line 131
    .line 132
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public u(Lg71;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Lb5;->q(Lg71;)Lz61;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v2, p0, Lb5;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lag;

    .line 40
    .line 41
    iget-object v3, p0, Lb5;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ly61;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ly61;->b()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-nez v2, :cond_1

    .line 63
    .line 64
    const/4 p0, 0x1

    .line 65
    monitor-exit v0

    .line 66
    return p0

    .line 67
    :cond_2
    monitor-exit v0

    .line 68
    return v1

    .line 69
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    throw p0
.end method

.method public v(Lzq2;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lb5;->p()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object p0, p0, Lb5;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroid/database/sqlite/SQLiteDatabase;

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    iget-object p1, p1, Lzq2;->b:Ljava/util/HashMap;

    .line 18
    .line 19
    sget v0, Lmn0;->p:I

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/util/Map$Entry;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 p1, 0x0

    .line 68
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 69
    .line 70
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance v2, Ljava/io/ObjectOutputStream;

    .line 74
    .line 75
    invoke-direct {v2, v1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 88
    .line 89
    .line 90
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    goto :goto_1

    .line 92
    :catch_0
    move-exception v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 94
    .line 95
    .line 96
    move-object v0, p1

    .line 97
    :goto_1
    new-instance v1, Landroid/content/ContentValues;

    .line 98
    .line 99
    const/4 v2, 0x2

    .line 100
    invoke-direct {v1, v2}, Landroid/content/ContentValues;-><init>(I)V

    .line 101
    .line 102
    .line 103
    const-string v2, "eventData"

    .line 104
    .line 105
    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 106
    .line 107
    .line 108
    const-string v0, "events"

    .line 109
    .line 110
    invoke-virtual {p0, v0, p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 111
    .line 112
    .line 113
    move-result-wide p0

    .line 114
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    const-string p1, "b5"

    .line 123
    .line 124
    const-string v0, "Added event to database: %s"

    .line 125
    .line 126
    invoke-static {p1, v0, p0}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_2
    :goto_2
    return-void
.end method

.method public w()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lb5;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_1

    .line 16
    .line 17
    monitor-enter p0

    .line 18
    :try_start_0
    iget-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lzq2;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lb5;->v(Lzq2;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    iget-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    monitor-exit p0

    .line 52
    return-void

    .line 53
    :goto_1
    monitor-exit p0

    .line 54
    throw v0

    .line 55
    :cond_1
    return-void
.end method

.method public x()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lav;

    .line 4
    .line 5
    invoke-interface {v0}, Lav;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object p0, p0, Lb5;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lzu;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    iget p0, p0, Lzu;->c:F

    .line 20
    .line 21
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 22
    .line 23
    .line 24
    cmpl-float p0, p0, v2

    .line 25
    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move p0, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    move p0, v0

    .line 32
    :goto_1
    if-eqz p0, :cond_2

    .line 33
    .line 34
    return v0

    .line 35
    :cond_2
    return v1
.end method

.method public y()Ldw1;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ldw1;

    .line 4
    .line 5
    iget-object v2, v0, Lb5;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lur3;

    .line 8
    .line 9
    new-instance v3, Lra2;

    .line 10
    .line 11
    iget-object v4, v0, Lb5;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Lec;

    .line 14
    .line 15
    iget-object v5, v4, Lec;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v5, Leq2;

    .line 18
    .line 19
    iget-object v6, v4, Lec;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v6, Lnv1;

    .line 22
    .line 23
    new-instance v7, Lec0;

    .line 24
    .line 25
    iget-object v8, v5, Leq2;->e:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v8, Ljava/lang/String;

    .line 28
    .line 29
    iget-object v9, v5, Leq2;->f:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v9, Ljava/lang/String;

    .line 32
    .line 33
    iget-object v10, v5, Leq2;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v10, Ljava/lang/String;

    .line 36
    .line 37
    iget-object v11, v0, Lb5;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 40
    .line 41
    iget-object v11, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 42
    .line 43
    iget-object v11, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->c:Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {v7, v8, v9, v10, v11}, Lec0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v4, v4, Lec;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, Lau1;

    .line 51
    .line 52
    invoke-direct {v3, v5, v6, v7, v4}, Lra2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v4, v0, Lb5;->e:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v4, Lfp0;

    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v5, Ljw2;

    .line 63
    .line 64
    iget-object v6, v4, Lfp0;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 65
    .line 66
    iget-object v7, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->v:Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;

    .line 67
    .line 68
    iget-object v8, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 69
    .line 70
    if-eqz v7, :cond_0

    .line 71
    .line 72
    iget-object v9, v7, Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;->e:Lfj0;

    .line 73
    .line 74
    if-nez v9, :cond_1

    .line 75
    .line 76
    :cond_0
    sget-object v9, Ljw2;->Companion:Liw2;

    .line 77
    .line 78
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object v9, Ljw2;->e:Lfj0;

    .line 82
    .line 83
    :cond_1
    iget-boolean v10, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->k:Z

    .line 84
    .line 85
    if-eqz v10, :cond_2

    .line 86
    .line 87
    iget-object v10, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->i:Ljava/lang/String;

    .line 88
    .line 89
    move-object v14, v10

    .line 90
    goto :goto_0

    .line 91
    :cond_2
    const/4 v14, 0x0

    .line 92
    :goto_0
    if-eqz v7, :cond_3

    .line 93
    .line 94
    iget-object v10, v7, Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;->d:Ldj0;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    const/4 v10, 0x0

    .line 98
    :goto_1
    sget-object v12, Ldj0;->a:Ldj0;

    .line 99
    .line 100
    if-ne v10, v12, :cond_4

    .line 101
    .line 102
    iget-object v10, v4, Lfp0;->c:Lec;

    .line 103
    .line 104
    iget-object v10, v10, Lec;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v10, Leq2;

    .line 107
    .line 108
    iget-object v10, v10, Leq2;->i:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v10, Ljava/lang/String;

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    const/4 v10, 0x0

    .line 114
    :goto_2
    iget-object v12, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->h:Ljava/lang/String;

    .line 115
    .line 116
    const-string v13, ""

    .line 117
    .line 118
    if-nez v12, :cond_5

    .line 119
    .line 120
    move-object v12, v13

    .line 121
    move-object v15, v12

    .line 122
    goto :goto_3

    .line 123
    :cond_5
    move-object v15, v12

    .line 124
    move-object v12, v13

    .line 125
    :goto_3
    iget-object v13, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->d:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v11, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->j0:Ljava/lang/String;

    .line 128
    .line 129
    move-object/from16 v16, v10

    .line 130
    .line 131
    if-eqz v7, :cond_7

    .line 132
    .line 133
    iget-object v10, v7, Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;->b:Lej0;

    .line 134
    .line 135
    if-nez v10, :cond_6

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_6
    :goto_4
    move-object/from16 v17, v10

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_7
    :goto_5
    sget-object v10, Lfp0;->d:Lej0;

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :goto_6
    iget-object v10, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    .line 145
    .line 146
    if-eqz v10, :cond_8

    .line 147
    .line 148
    iget-object v10, v10, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->a:Ljava/lang/String;

    .line 149
    .line 150
    move-object/from16 v18, v10

    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_8
    const/16 v18, 0x0

    .line 154
    .line 155
    :goto_7
    sget-object v10, Lev1;->Companion:Ldv1;

    .line 156
    .line 157
    move-object/from16 v19, v10

    .line 158
    .line 159
    iget-object v10, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->D:Ljava/lang/String;

    .line 160
    .line 161
    move-object/from16 v20, v12

    .line 162
    .line 163
    iget-object v12, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    .line 164
    .line 165
    move-object/from16 v21, v13

    .line 166
    .line 167
    sget-object v13, Lez2;->V:Lez2;

    .line 168
    .line 169
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {v10, v12, v13}, Ldv1;->a(Ljava/lang/String;Ljava/lang/String;Lez2;)Lev1;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    iget-object v12, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->C:Ljava/lang/String;

    .line 177
    .line 178
    iget-object v13, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    .line 179
    .line 180
    move-object/from16 v19, v14

    .line 181
    .line 182
    sget-object v14, Lez2;->w:Lez2;

    .line 183
    .line 184
    invoke-static {v12, v13, v14}, Ldv1;->a(Ljava/lang/String;Ljava/lang/String;Lez2;)Lev1;

    .line 185
    .line 186
    .line 187
    move-result-object v12

    .line 188
    if-eqz v7, :cond_9

    .line 189
    .line 190
    iget-object v13, v7, Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;->c:Ln82;

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_9
    const/4 v13, 0x0

    .line 194
    :goto_8
    sget-object v14, Ln82;->a:Ln82;

    .line 195
    .line 196
    if-ne v13, v14, :cond_a

    .line 197
    .line 198
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    new-instance v13, Lev1;

    .line 202
    .line 203
    sget-object v14, Lfv1;->c:Lfv1;

    .line 204
    .line 205
    move-object/from16 v22, v15

    .line 206
    .line 207
    sget-object v15, Lez2;->U:Lez2;

    .line 208
    .line 209
    move-object/from16 v23, v1

    .line 210
    .line 211
    const/4 v1, 0x0

    .line 212
    invoke-direct {v13, v11, v1, v14, v15}, Lev1;-><init>(Ljava/lang/String;Ljava/lang/String;Lfv1;Lez2;)V

    .line 213
    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_a
    move-object/from16 v23, v1

    .line 217
    .line 218
    move-object/from16 v22, v15

    .line 219
    .line 220
    const/4 v13, 0x0

    .line 221
    :goto_9
    filled-new-array {v10, v12, v13}, [Lev1;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-static {v1}, Lqd;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    new-instance v10, Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    :cond_b
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v12

    .line 242
    if-eqz v12, :cond_c

    .line 243
    .line 244
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v12

    .line 248
    move-object v13, v12

    .line 249
    check-cast v13, Lev1;

    .line 250
    .line 251
    invoke-virtual {v13}, Lev1;->a()Z

    .line 252
    .line 253
    .line 254
    move-result v13

    .line 255
    if-nez v13, :cond_b

    .line 256
    .line 257
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    goto :goto_a

    .line 261
    :cond_c
    invoke-static/range {v16 .. v16}, Lhu0;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    if-eqz v7, :cond_d

    .line 266
    .line 267
    iget-object v12, v7, Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;->d:Ldj0;

    .line 268
    .line 269
    if-eqz v12, :cond_d

    .line 270
    .line 271
    sget-object v13, Ldj0;->b:Ldj0;

    .line 272
    .line 273
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v12

    .line 277
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    move-object/from16 v32, v20

    .line 282
    .line 283
    move-object/from16 v20, v12

    .line 284
    .line 285
    move-object/from16 v12, v32

    .line 286
    .line 287
    goto :goto_b

    .line 288
    :cond_d
    move-object/from16 v12, v20

    .line 289
    .line 290
    const/16 v20, 0x0

    .line 291
    .line 292
    :goto_b
    iget-object v13, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->h0:Ljava/lang/String;

    .line 293
    .line 294
    move-object v14, v12

    .line 295
    new-instance v12, Lf31;

    .line 296
    .line 297
    move-object/from16 v15, v19

    .line 298
    .line 299
    move-object/from16 v19, v1

    .line 300
    .line 301
    move-object v1, v14

    .line 302
    move-object v14, v15

    .line 303
    move-object/from16 v15, v21

    .line 304
    .line 305
    move-object/from16 v21, v13

    .line 306
    .line 307
    move-object v13, v15

    .line 308
    move-object/from16 v16, v10

    .line 309
    .line 310
    move-object/from16 v15, v22

    .line 311
    .line 312
    invoke-direct/range {v12 .. v21}, Lf31;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lej0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    iget-object v10, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->a:Ljava/lang/String;

    .line 316
    .line 317
    iget-object v4, v4, Lfp0;->b:Lur3;

    .line 318
    .line 319
    iget-object v13, v4, Lur3;->b:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v13, Lju1;

    .line 322
    .line 323
    iget-object v14, v13, Lju1;->b:Lbx0;

    .line 324
    .line 325
    sget-object v15, Lbu1;->a:Lbu1;

    .line 326
    .line 327
    move-object/from16 v16, v2

    .line 328
    .line 329
    new-instance v2, Luu1;

    .line 330
    .line 331
    invoke-direct {v2, v10, v15, v14}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 332
    .line 333
    .line 334
    if-eqz v7, :cond_e

    .line 335
    .line 336
    iget-object v10, v7, Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;->c:Ln82;

    .line 337
    .line 338
    goto :goto_c

    .line 339
    :cond_e
    const/4 v10, 0x0

    .line 340
    :goto_c
    sget-object v14, Ln82;->b:Ln82;

    .line 341
    .line 342
    if-ne v10, v14, :cond_f

    .line 343
    .line 344
    iget-object v10, v13, Lju1;->f:Lbx0;

    .line 345
    .line 346
    sget-object v14, Lbu1;->e:Lbu1;

    .line 347
    .line 348
    new-instance v15, Luu1;

    .line 349
    .line 350
    invoke-direct {v15, v11, v14, v10}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 351
    .line 352
    .line 353
    move-object/from16 v29, v15

    .line 354
    .line 355
    goto :goto_d

    .line 356
    :cond_f
    const/16 v29, 0x0

    .line 357
    .line 358
    :goto_d
    if-eqz v7, :cond_10

    .line 359
    .line 360
    iget-object v7, v7, Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;->a:Ljava/lang/Boolean;

    .line 361
    .line 362
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 363
    .line 364
    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v7

    .line 368
    goto :goto_e

    .line 369
    :cond_10
    const/4 v7, 0x0

    .line 370
    :goto_e
    if-eqz v7, :cond_11

    .line 371
    .line 372
    iget-object v7, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->b:Ljava/lang/String;

    .line 373
    .line 374
    iget-object v8, v13, Lju1;->c:Lbx0;

    .line 375
    .line 376
    sget-object v11, Lbu1;->b:Lbu1;

    .line 377
    .line 378
    new-instance v13, Luu1;

    .line 379
    .line 380
    invoke-direct {v13, v7, v11, v8}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 381
    .line 382
    .line 383
    move-object/from16 v26, v13

    .line 384
    .line 385
    goto :goto_f

    .line 386
    :cond_11
    const/16 v26, 0x0

    .line 387
    .line 388
    :goto_f
    iget-object v4, v4, Lur3;->d:Ljava/lang/Object;

    .line 389
    .line 390
    move-object/from16 v30, v4

    .line 391
    .line 392
    check-cast v30, Lgl;

    .line 393
    .line 394
    new-instance v24, Lxy1;

    .line 395
    .line 396
    const/16 v28, 0x0

    .line 397
    .line 398
    const/16 v31, 0xc

    .line 399
    .line 400
    const/16 v27, 0x0

    .line 401
    .line 402
    move-object/from16 v25, v2

    .line 403
    .line 404
    invoke-direct/range {v24 .. v31}, Lxy1;-><init>(Luu1;Luu1;Luu1;Luu1;Luu1;Lgl;I)V

    .line 405
    .line 406
    .line 407
    new-instance v2, Lij;

    .line 408
    .line 409
    iget-boolean v4, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->l:Z

    .line 410
    .line 411
    const-string v6, "Powered by Usercentrics Consent Management"

    .line 412
    .line 413
    if-eqz v4, :cond_12

    .line 414
    .line 415
    new-instance v4, Lr4;

    .line 416
    .line 417
    invoke-direct {v4, v6}, Lr4;-><init>(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    goto :goto_10

    .line 421
    :cond_12
    const/4 v4, 0x0

    .line 422
    :goto_10
    invoke-virtual/range {v24 .. v24}, Lxy1;->h()Ljava/util/ArrayList;

    .line 423
    .line 424
    .line 425
    move-result-object v7

    .line 426
    invoke-virtual/range {v24 .. v24}, Lxy1;->i()Ljava/util/List;

    .line 427
    .line 428
    .line 429
    move-result-object v8

    .line 430
    invoke-direct {v2, v4, v7, v8}, Lij;-><init>(Lr4;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 431
    .line 432
    .line 433
    sget-object v4, Lnd0;->a:Lnd0;

    .line 434
    .line 435
    invoke-direct {v5, v9, v12, v2, v4}, Ljw2;-><init>(Lfj0;Lf31;Lij;Ljava/util/List;)V

    .line 436
    .line 437
    .line 438
    iget-object v0, v0, Lb5;->f:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v0, Lip0;

    .line 441
    .line 442
    iget-boolean v2, v0, Lip0;->w:Z

    .line 443
    .line 444
    new-instance v4, Lac1;

    .line 445
    .line 446
    iget-object v7, v0, Lip0;->b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 447
    .line 448
    iget-object v8, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 449
    .line 450
    iget-object v9, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->b:Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;

    .line 451
    .line 452
    iget-object v11, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->p0:Ljava/lang/String;

    .line 453
    .line 454
    invoke-static {v11}, Lhu0;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v11

    .line 458
    if-nez v11, :cond_13

    .line 459
    .line 460
    iget-object v11, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->o0:Ljava/lang/String;

    .line 461
    .line 462
    :cond_13
    move-object/from16 v26, v11

    .line 463
    .line 464
    iget-object v13, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->q0:Ljava/lang/String;

    .line 465
    .line 466
    if-nez v13, :cond_14

    .line 467
    .line 468
    move-object/from16 v25, v1

    .line 469
    .line 470
    goto :goto_11

    .line 471
    :cond_14
    move-object/from16 v25, v13

    .line 472
    .line 473
    :goto_11
    sget-object v28, Lip0;->U:Lej0;

    .line 474
    .line 475
    iget-object v11, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->q:Ljava/util/List;

    .line 476
    .line 477
    new-instance v12, Ljava/util/ArrayList;

    .line 478
    .line 479
    const/16 v13, 0xa

    .line 480
    .line 481
    invoke-static {v11, v13}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 482
    .line 483
    .line 484
    move-result v14

    .line 485
    invoke-direct {v12, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 486
    .line 487
    .line 488
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 489
    .line 490
    .line 491
    move-result-object v11

    .line 492
    :goto_12
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 493
    .line 494
    .line 495
    move-result v14

    .line 496
    if-eqz v14, :cond_15

    .line 497
    .line 498
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v14

    .line 502
    check-cast v14, Ljava/lang/String;

    .line 503
    .line 504
    new-instance v15, Lbv1;

    .line 505
    .line 506
    invoke-direct {v15, v14}, Lbv1;-><init>(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    goto :goto_12

    .line 513
    :cond_15
    new-instance v11, Lwa3;

    .line 514
    .line 515
    const/4 v14, 0x5

    .line 516
    invoke-direct {v11, v14}, Lwa3;-><init>(I)V

    .line 517
    .line 518
    .line 519
    invoke-static {v11, v12}, Lkotlin/collections/CollectionsKt;->E(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 520
    .line 521
    .line 522
    move-result-object v11

    .line 523
    iget-object v12, v9, Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;->f:Ljava/lang/Boolean;

    .line 524
    .line 525
    iget-object v14, v9, Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;->g:Ljava/lang/String;

    .line 526
    .line 527
    iget-object v15, v9, Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;->e:Ljava/lang/Boolean;

    .line 528
    .line 529
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 530
    .line 531
    invoke-static {v12, v10}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    move-result v10

    .line 535
    const/4 v12, 0x1

    .line 536
    if-nez v10, :cond_17

    .line 537
    .line 538
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 542
    .line 543
    .line 544
    move-result v10

    .line 545
    if-le v10, v12, :cond_16

    .line 546
    .line 547
    move v10, v12

    .line 548
    goto :goto_13

    .line 549
    :cond_16
    const/4 v10, 0x0

    .line 550
    :goto_13
    if-nez v10, :cond_18

    .line 551
    .line 552
    :cond_17
    move/from16 v17, v12

    .line 553
    .line 554
    goto :goto_14

    .line 555
    :cond_18
    new-instance v10, Lcv1;

    .line 556
    .line 557
    new-instance v13, Lbv1;

    .line 558
    .line 559
    move/from16 v17, v12

    .line 560
    .line 561
    iget-object v12, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    .line 562
    .line 563
    invoke-direct {v13, v12}, Lbv1;-><init>(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    invoke-direct {v10, v11, v13}, Lcv1;-><init>(Ljava/util/List;Lbv1;)V

    .line 567
    .line 568
    .line 569
    move-object/from16 v30, v10

    .line 570
    .line 571
    goto :goto_15

    .line 572
    :goto_14
    const/16 v30, 0x0

    .line 573
    .line 574
    :goto_15
    iget-object v10, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    .line 575
    .line 576
    if-eqz v10, :cond_19

    .line 577
    .line 578
    iget-object v10, v10, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->a:Ljava/lang/String;

    .line 579
    .line 580
    move-object/from16 v29, v10

    .line 581
    .line 582
    goto :goto_16

    .line 583
    :cond_19
    const/16 v29, 0x0

    .line 584
    .line 585
    :goto_16
    if-eqz v2, :cond_1a

    .line 586
    .line 587
    sget-object v8, Lnd0;->a:Lnd0;

    .line 588
    .line 589
    move-object/from16 v27, v8

    .line 590
    .line 591
    goto :goto_18

    .line 592
    :cond_1a
    sget-object v10, Lev1;->Companion:Ldv1;

    .line 593
    .line 594
    iget-object v11, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->D:Ljava/lang/String;

    .line 595
    .line 596
    iget-object v12, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    .line 597
    .line 598
    sget-object v13, Lez2;->V:Lez2;

    .line 599
    .line 600
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    invoke-static {v11, v12, v13}, Ldv1;->a(Ljava/lang/String;Ljava/lang/String;Lez2;)Lev1;

    .line 604
    .line 605
    .line 606
    move-result-object v10

    .line 607
    iget-object v8, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->C:Ljava/lang/String;

    .line 608
    .line 609
    iget-object v11, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    .line 610
    .line 611
    sget-object v12, Lez2;->w:Lez2;

    .line 612
    .line 613
    invoke-static {v8, v11, v12}, Ldv1;->a(Ljava/lang/String;Ljava/lang/String;Lez2;)Lev1;

    .line 614
    .line 615
    .line 616
    move-result-object v8

    .line 617
    filled-new-array {v10, v8}, [Lev1;

    .line 618
    .line 619
    .line 620
    move-result-object v8

    .line 621
    invoke-static {v8}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 622
    .line 623
    .line 624
    move-result-object v8

    .line 625
    new-instance v10, Ljava/util/ArrayList;

    .line 626
    .line 627
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 628
    .line 629
    .line 630
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 631
    .line 632
    .line 633
    move-result-object v8

    .line 634
    :cond_1b
    :goto_17
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 635
    .line 636
    .line 637
    move-result v11

    .line 638
    if-eqz v11, :cond_1c

    .line 639
    .line 640
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v11

    .line 644
    move-object v12, v11

    .line 645
    check-cast v12, Lev1;

    .line 646
    .line 647
    iget-object v12, v12, Lev1;->a:Ljava/lang/String;

    .line 648
    .line 649
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 650
    .line 651
    .line 652
    move-result v12

    .line 653
    if-lez v12, :cond_1b

    .line 654
    .line 655
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    goto :goto_17

    .line 659
    :cond_1c
    move-object/from16 v27, v10

    .line 660
    .line 661
    :goto_18
    new-instance v24, Lqi1;

    .line 662
    .line 663
    invoke-direct/range {v24 .. v30}, Lqi1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lej0;Ljava/lang/String;Lcv1;)V

    .line 664
    .line 665
    .line 666
    move-object/from16 v8, v24

    .line 667
    .line 668
    iget-object v10, v0, Lip0;->d:Lur3;

    .line 669
    .line 670
    iget-object v11, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 671
    .line 672
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 673
    .line 674
    invoke-static {v15, v12}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    move-result v13

    .line 678
    if-eqz v13, :cond_1d

    .line 679
    .line 680
    move/from16 v18, v2

    .line 681
    .line 682
    const/16 v26, 0x0

    .line 683
    .line 684
    goto :goto_1a

    .line 685
    :cond_1d
    iget-object v13, v9, Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;->h:Ljava/lang/String;

    .line 686
    .line 687
    invoke-static {v15, v12}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    move-result v12

    .line 691
    if-eqz v12, :cond_1e

    .line 692
    .line 693
    move-object v13, v1

    .line 694
    goto :goto_19

    .line 695
    :cond_1e
    if-eqz v13, :cond_1f

    .line 696
    .line 697
    invoke-static {v13}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 698
    .line 699
    .line 700
    move-result v12

    .line 701
    xor-int/lit8 v12, v12, 0x1

    .line 702
    .line 703
    move/from16 v15, v17

    .line 704
    .line 705
    if-ne v12, v15, :cond_1f

    .line 706
    .line 707
    goto :goto_19

    .line 708
    :cond_1f
    iget-object v13, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->b:Ljava/lang/String;

    .line 709
    .line 710
    :goto_19
    iget-object v12, v10, Lur3;->b:Ljava/lang/Object;

    .line 711
    .line 712
    check-cast v12, Lju1;

    .line 713
    .line 714
    iget-object v12, v12, Lju1;->c:Lbx0;

    .line 715
    .line 716
    sget-object v15, Lbu1;->b:Lbu1;

    .line 717
    .line 718
    move/from16 v18, v2

    .line 719
    .line 720
    new-instance v2, Luu1;

    .line 721
    .line 722
    invoke-direct {v2, v13, v15, v12}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 723
    .line 724
    .line 725
    move-object/from16 v26, v2

    .line 726
    .line 727
    :goto_1a
    if-eqz v14, :cond_20

    .line 728
    .line 729
    invoke-static {v14}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 730
    .line 731
    .line 732
    move-result v2

    .line 733
    const/4 v15, 0x1

    .line 734
    xor-int/2addr v2, v15

    .line 735
    if-ne v2, v15, :cond_20

    .line 736
    .line 737
    goto :goto_1b

    .line 738
    :cond_20
    iget-object v14, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->a:Ljava/lang/String;

    .line 739
    .line 740
    :goto_1b
    iget-object v2, v10, Lur3;->b:Ljava/lang/Object;

    .line 741
    .line 742
    check-cast v2, Lju1;

    .line 743
    .line 744
    iget-object v2, v2, Lju1;->b:Lbx0;

    .line 745
    .line 746
    sget-object v12, Lbu1;->a:Lbu1;

    .line 747
    .line 748
    new-instance v13, Luu1;

    .line 749
    .line 750
    invoke-direct {v13, v14, v12, v2}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 751
    .line 752
    .line 753
    iget-object v2, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->c:Ljava/lang/String;

    .line 754
    .line 755
    iget-object v11, v10, Lur3;->b:Ljava/lang/Object;

    .line 756
    .line 757
    check-cast v11, Lju1;

    .line 758
    .line 759
    iget-object v11, v11, Lju1;->d:Lbx0;

    .line 760
    .line 761
    sget-object v12, Lbu1;->d:Lbu1;

    .line 762
    .line 763
    new-instance v14, Luu1;

    .line 764
    .line 765
    invoke-direct {v14, v2, v12, v11}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 766
    .line 767
    .line 768
    new-instance v24, Lxy1;

    .line 769
    .line 770
    iget-object v2, v10, Lur3;->d:Ljava/lang/Object;

    .line 771
    .line 772
    move-object/from16 v30, v2

    .line 773
    .line 774
    check-cast v30, Lgl;

    .line 775
    .line 776
    const/16 v31, 0x18

    .line 777
    .line 778
    const/16 v28, 0x0

    .line 779
    .line 780
    const/16 v29, 0x0

    .line 781
    .line 782
    move-object/from16 v25, v13

    .line 783
    .line 784
    move-object/from16 v27, v14

    .line 785
    .line 786
    invoke-direct/range {v24 .. v31}, Lxy1;-><init>(Luu1;Luu1;Luu1;Luu1;Luu1;Lgl;I)V

    .line 787
    .line 788
    .line 789
    new-instance v2, Lij;

    .line 790
    .line 791
    iget-boolean v10, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->l:Z

    .line 792
    .line 793
    if-eqz v10, :cond_21

    .line 794
    .line 795
    new-instance v10, Lr4;

    .line 796
    .line 797
    invoke-direct {v10, v6}, Lr4;-><init>(Ljava/lang/String;)V

    .line 798
    .line 799
    .line 800
    goto :goto_1c

    .line 801
    :cond_21
    const/4 v10, 0x0

    .line 802
    :goto_1c
    invoke-virtual/range {v24 .. v24}, Lxy1;->h()Ljava/util/ArrayList;

    .line 803
    .line 804
    .line 805
    move-result-object v6

    .line 806
    invoke-virtual/range {v24 .. v24}, Lxy1;->i()Ljava/util/List;

    .line 807
    .line 808
    .line 809
    move-result-object v11

    .line 810
    invoke-direct {v2, v10, v6, v11}, Lij;-><init>(Lr4;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 811
    .line 812
    .line 813
    if-eqz v18, :cond_22

    .line 814
    .line 815
    new-instance v6, Lxv1;

    .line 816
    .line 817
    new-instance v7, Leu1;

    .line 818
    .line 819
    invoke-virtual {v0}, Lip0;->A()Ldu1;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    invoke-static {v0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    invoke-direct {v7, v0}, Leu1;-><init>(Ljava/util/List;)V

    .line 828
    .line 829
    .line 830
    invoke-direct {v6, v1, v7}, Lxv1;-><init>(Ljava/lang/String;Lwv1;)V

    .line 831
    .line 832
    .line 833
    invoke-static {v6}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    goto/16 :goto_20

    .line 838
    .line 839
    :cond_22
    new-instance v1, Lxv1;

    .line 840
    .line 841
    iget-object v6, v9, Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;->a:Ljava/lang/String;

    .line 842
    .line 843
    new-instance v10, Leu1;

    .line 844
    .line 845
    invoke-virtual {v0}, Lip0;->A()Ldu1;

    .line 846
    .line 847
    .line 848
    move-result-object v11

    .line 849
    invoke-static {v11}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 850
    .line 851
    .line 852
    move-result-object v11

    .line 853
    invoke-direct {v10, v11}, Leu1;-><init>(Ljava/util/List;)V

    .line 854
    .line 855
    .line 856
    invoke-direct {v1, v6, v10}, Lxv1;-><init>(Ljava/lang/String;Lwv1;)V

    .line 857
    .line 858
    .line 859
    new-instance v6, Lxv1;

    .line 860
    .line 861
    iget-object v9, v9, Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;->b:Ljava/lang/String;

    .line 862
    .line 863
    new-instance v10, Lpv1;

    .line 864
    .line 865
    iget-object v11, v0, Lip0;->i:Ljava/util/List;

    .line 866
    .line 867
    new-instance v12, Ljava/util/ArrayList;

    .line 868
    .line 869
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 870
    .line 871
    .line 872
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 873
    .line 874
    .line 875
    move-result-object v11

    .line 876
    :cond_23
    :goto_1d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 877
    .line 878
    .line 879
    move-result v13

    .line 880
    if-eqz v13, :cond_24

    .line 881
    .line 882
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v13

    .line 886
    move-object v14, v13

    .line 887
    check-cast v14, Lm61;

    .line 888
    .line 889
    iget-boolean v14, v14, Lm61;->y:Z

    .line 890
    .line 891
    if-nez v14, :cond_23

    .line 892
    .line 893
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    goto :goto_1d

    .line 897
    :cond_24
    new-instance v11, Ljava/util/ArrayList;

    .line 898
    .line 899
    const/16 v13, 0xa

    .line 900
    .line 901
    invoke-static {v12, v13}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 902
    .line 903
    .line 904
    move-result v13

    .line 905
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 906
    .line 907
    .line 908
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 909
    .line 910
    .line 911
    move-result-object v12

    .line 912
    :goto_1e
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 913
    .line 914
    .line 915
    move-result v13

    .line 916
    if-eqz v13, :cond_26

    .line 917
    .line 918
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v13

    .line 922
    check-cast v13, Lm61;

    .line 923
    .line 924
    iget-boolean v14, v0, Lip0;->v:Z

    .line 925
    .line 926
    if-eqz v14, :cond_25

    .line 927
    .line 928
    const/4 v14, 0x0

    .line 929
    goto :goto_1f

    .line 930
    :cond_25
    new-instance v14, Lvv1;

    .line 931
    .line 932
    invoke-direct {v14, v13}, Lvv1;-><init>(Lm61;)V

    .line 933
    .line 934
    .line 935
    :goto_1f
    new-instance v15, Lsv1;

    .line 936
    .line 937
    new-instance v24, Lmv1;

    .line 938
    .line 939
    move-object/from16 p0, v12

    .line 940
    .line 941
    iget-object v12, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    .line 942
    .line 943
    move-object/from16 v17, v7

    .line 944
    .line 945
    iget-object v7, v13, Lm61;->p:Li61;

    .line 946
    .line 947
    invoke-virtual {v0, v7}, Lsq3;->l(Li61;)Lkv1;

    .line 948
    .line 949
    .line 950
    move-result-object v29

    .line 951
    const/16 v30, 0x6

    .line 952
    .line 953
    const/16 v26, 0x0

    .line 954
    .line 955
    const/16 v27, 0x0

    .line 956
    .line 957
    move-object/from16 v28, v12

    .line 958
    .line 959
    move-object/from16 v25, v13

    .line 960
    .line 961
    invoke-direct/range {v24 .. v30}, Lmv1;-><init>(Lm61;Llv1;ZLq90;Lkv1;I)V

    .line 962
    .line 963
    .line 964
    move-object/from16 v7, v24

    .line 965
    .line 966
    invoke-direct {v15, v7}, Lsv1;-><init>(Lmv1;)V

    .line 967
    .line 968
    .line 969
    new-instance v7, Lcu1;

    .line 970
    .line 971
    invoke-direct {v7, v13, v14, v15}, Lcu1;-><init>(Lm61;Lvv1;Lsv1;)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    move-object/from16 v12, p0

    .line 978
    .line 979
    move-object/from16 v7, v17

    .line 980
    .line 981
    goto :goto_1e

    .line 982
    :cond_26
    new-instance v7, Lfu1;

    .line 983
    .line 984
    iget-object v12, v0, Lip0;->c:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 985
    .line 986
    iget-object v12, v12, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->a:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

    .line 987
    .line 988
    iget-object v12, v12, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->f:Ljava/lang/String;

    .line 989
    .line 990
    iget-object v0, v0, Lip0;->e:Ljava/lang/String;

    .line 991
    .line 992
    invoke-direct {v7, v12, v0}, Lfu1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 993
    .line 994
    .line 995
    new-instance v0, Ldu1;

    .line 996
    .line 997
    const/4 v12, 0x0

    .line 998
    invoke-direct {v0, v12, v11, v7}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;Lfu1;)V

    .line 999
    .line 1000
    .line 1001
    invoke-static {v0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    invoke-direct {v10, v0}, Lpv1;-><init>(Ljava/util/List;)V

    .line 1006
    .line 1007
    .line 1008
    invoke-direct {v6, v9, v10}, Lxv1;-><init>(Ljava/lang/String;Lwv1;)V

    .line 1009
    .line 1010
    .line 1011
    filled-new-array {v1, v6}, [Lxv1;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    invoke-static {v0}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    :goto_20
    invoke-direct {v4, v8, v2, v0}, Lac1;-><init>(Lqi1;Lij;Ljava/util/List;)V

    .line 1020
    .line 1021
    .line 1022
    move-object/from16 v2, v16

    .line 1023
    .line 1024
    move-object/from16 v0, v23

    .line 1025
    .line 1026
    invoke-direct {v0, v2, v3, v5, v4}, Ldw1;-><init>(Lur3;Lra2;Ljw2;Lac1;)V

    .line 1027
    .line 1028
    .line 1029
    return-object v0
.end method

.method public z(Ly61;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p1, Ly61;->a:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :try_start_1
    iget-object v2, p1, Ly61;->b:Lg71;

    .line 8
    .line 9
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 10
    :try_start_2
    iget-object v1, p1, Ly61;->c:Lqq;

    .line 11
    .line 12
    iget-object v3, v1, Lqq;->a0:Lg42;

    .line 13
    .line 14
    iget-object v1, v1, Lqq;->b0:Lg42;

    .line 15
    .line 16
    invoke-static {v3, v1}, Lqq;->s(Lg42;Lg42;)Lhf;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v3, Lag;

    .line 21
    .line 22
    invoke-direct {v3, v2, v1}, Lag;-><init>(Lg71;Lhf;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lb5;->q(Lg71;)Lz61;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v4, p0, Lb5;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/util/Set;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    new-instance v4, Ljava/util/HashSet;

    .line 45
    .line 46
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    iget-object v5, p0, Lb5;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-virtual {v5, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    if-nez v1, :cond_1

    .line 60
    .line 61
    new-instance p1, Lz61;

    .line 62
    .line 63
    invoke-direct {p1, v2, p0}, Lz61;-><init>(Lg71;Lb5;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Lb5;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Ljava/util/HashMap;

    .line 69
    .line 70
    invoke-virtual {p0, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    invoke-interface {v2}, Lg71;->getLifecycle()Lv61;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0, p1}, Lv61;->a(Lf71;)V

    .line 78
    .line 79
    .line 80
    :cond_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 81
    return-void

    .line 82
    :catchall_1
    move-exception p0

    .line 83
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    :try_start_4
    throw p0

    .line 85
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 86
    throw p0
.end method
