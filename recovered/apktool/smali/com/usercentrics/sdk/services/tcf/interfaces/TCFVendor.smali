.class public final Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;,
        Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$Companion;

.field public static final x:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/lang/Boolean;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:I

.field public final e:Ljava/lang/Boolean;

.field public final f:Ljava/util/List;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/util/List;

.field public final j:Ljava/util/List;

.field public final k:Ljava/util/List;

.field public final l:Ljava/util/List;

.field public final m:Z

.field public final n:Z

.field public final o:Ljava/lang/Double;

.field public final p:Z

.field public final q:Ljava/lang/String;

.field public final r:Z

.field public final s:Ljava/lang/Boolean;

.field public final t:Ljava/lang/Boolean;

.field public final u:Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

.field public final v:Ljava/util/List;

.field public final w:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->Companion:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$Companion;

    .line 7
    .line 8
    new-instance v0, Lgd;

    .line 9
    .line 10
    sget-object v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName$$serializer;

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
    sget-object v7, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction$$serializer;

    .line 34
    .line 35
    invoke-direct {v6, v7, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 36
    .line 37
    .line 38
    new-instance v7, Lgd;

    .line 39
    .line 40
    invoke-direct {v7, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 41
    .line 42
    .line 43
    new-instance v8, Lgd;

    .line 44
    .line 45
    invoke-direct {v8, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 46
    .line 47
    .line 48
    new-instance v9, Lgd;

    .line 49
    .line 50
    invoke-direct {v9, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Lgd;

    .line 54
    .line 55
    sget-object v10, Lcom/usercentrics/tcf/core/model/gvl/VendorUrl$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/VendorUrl$$serializer;

    .line 56
    .line 57
    invoke-direct {v1, v10, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 58
    .line 59
    .line 60
    const/16 v10, 0x17

    .line 61
    .line 62
    new-array v10, v10, [Lkotlinx/serialization/KSerializer;

    .line 63
    .line 64
    const/4 v11, 0x0

    .line 65
    aput-object v11, v10, v2

    .line 66
    .line 67
    const/4 v2, 0x1

    .line 68
    aput-object v0, v10, v2

    .line 69
    .line 70
    const/4 v0, 0x2

    .line 71
    aput-object v3, v10, v0

    .line 72
    .line 73
    const/4 v0, 0x3

    .line 74
    aput-object v11, v10, v0

    .line 75
    .line 76
    const/4 v0, 0x4

    .line 77
    aput-object v11, v10, v0

    .line 78
    .line 79
    const/4 v0, 0x5

    .line 80
    aput-object v4, v10, v0

    .line 81
    .line 82
    const/4 v0, 0x6

    .line 83
    aput-object v11, v10, v0

    .line 84
    .line 85
    const/4 v0, 0x7

    .line 86
    aput-object v11, v10, v0

    .line 87
    .line 88
    const/16 v0, 0x8

    .line 89
    .line 90
    aput-object v5, v10, v0

    .line 91
    .line 92
    const/16 v0, 0x9

    .line 93
    .line 94
    aput-object v6, v10, v0

    .line 95
    .line 96
    const/16 v0, 0xa

    .line 97
    .line 98
    aput-object v7, v10, v0

    .line 99
    .line 100
    const/16 v0, 0xb

    .line 101
    .line 102
    aput-object v8, v10, v0

    .line 103
    .line 104
    const/16 v0, 0xc

    .line 105
    .line 106
    aput-object v11, v10, v0

    .line 107
    .line 108
    const/16 v0, 0xd

    .line 109
    .line 110
    aput-object v11, v10, v0

    .line 111
    .line 112
    const/16 v0, 0xe

    .line 113
    .line 114
    aput-object v11, v10, v0

    .line 115
    .line 116
    const/16 v0, 0xf

    .line 117
    .line 118
    aput-object v11, v10, v0

    .line 119
    .line 120
    const/16 v0, 0x10

    .line 121
    .line 122
    aput-object v11, v10, v0

    .line 123
    .line 124
    const/16 v0, 0x11

    .line 125
    .line 126
    aput-object v11, v10, v0

    .line 127
    .line 128
    const/16 v0, 0x12

    .line 129
    .line 130
    aput-object v11, v10, v0

    .line 131
    .line 132
    const/16 v0, 0x13

    .line 133
    .line 134
    aput-object v11, v10, v0

    .line 135
    .line 136
    const/16 v0, 0x14

    .line 137
    .line 138
    aput-object v11, v10, v0

    .line 139
    .line 140
    const/16 v0, 0x15

    .line 141
    .line 142
    aput-object v9, v10, v0

    .line 143
    .line 144
    const/16 v0, 0x16

    .line 145
    .line 146
    aput-object v1, v10, v0

    .line 147
    .line 148
    sput-object v10, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->x:[Lkotlinx/serialization/KSerializer;

    .line 149
    .line 150
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Boolean;Ljava/util/List;Ljava/util/List;ILjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLjava/lang/Double;ZLjava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/usercentrics/tcf/core/model/gvl/DataRetention;Ljava/util/List;Ljava/util/List;)V
    .locals 3

    const v0, 0x60bfff

    and-int v1, p1, v0

    const/4 v2, 0x0

    if-ne v0, v1, :cond_6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->a:Ljava/lang/Boolean;

    iput-object p3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->c:Ljava/util/List;

    iput p5, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    iput-object p6, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->e:Ljava/lang/Boolean;

    iput-object p7, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    iput-object p8, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->g:Ljava/lang/String;

    iput-object p9, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->h:Ljava/lang/String;

    iput-object p10, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    iput-object p11, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->j:Ljava/util/List;

    iput-object p12, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->k:Ljava/util/List;

    move-object/from16 p2, p13

    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->l:Ljava/util/List;

    move/from16 p2, p14

    iput-boolean p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->m:Z

    move/from16 p2, p15

    iput-boolean p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->n:Z

    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_0

    iput-object v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->o:Ljava/lang/Double;

    :goto_0
    move/from16 p2, p17

    goto :goto_1

    :cond_0
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->o:Ljava/lang/Double;

    goto :goto_0

    :goto_1
    iput-boolean p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->p:Z

    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_1

    iput-object v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->q:Ljava/lang/String;

    goto :goto_2

    :cond_1
    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->q:Ljava/lang/String;

    :goto_2
    const/high16 p2, 0x20000

    and-int/2addr p2, p1

    if-nez p2, :cond_2

    const/4 p2, 0x0

    :goto_3
    iput-boolean p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->r:Z

    goto :goto_4

    :cond_2
    move/from16 p2, p19

    goto :goto_3

    :goto_4
    const/high16 p2, 0x40000

    and-int/2addr p2, p1

    if-nez p2, :cond_3

    .line 2
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3
    :goto_5
    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->s:Ljava/lang/Boolean;

    goto :goto_6

    :cond_3
    move-object/from16 p2, p20

    goto :goto_5

    :goto_6
    const/high16 p2, 0x80000

    and-int/2addr p2, p1

    if-nez p2, :cond_4

    .line 4
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    :goto_7
    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->t:Ljava/lang/Boolean;

    goto :goto_8

    :cond_4
    move-object/from16 p2, p21

    goto :goto_7

    :goto_8
    const/high16 p2, 0x100000

    and-int/2addr p1, p2

    if-nez p1, :cond_5

    iput-object v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->u:Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

    :goto_9
    move-object/from16 p1, p23

    goto :goto_a

    :cond_5
    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->u:Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

    goto :goto_9

    :goto_a
    iput-object p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->v:Ljava/util/List;

    move-object/from16 p1, p24

    iput-object p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->w:Ljava/util/List;

    return-void

    :cond_6
    sget-object p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;

    invoke-virtual {p0}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p0

    invoke-static {p1, v0, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    throw v2
.end method

.method public constructor <init>(Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;ZZLjava/lang/Double;ZLjava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/usercentrics/tcf/core/model/gvl/DataRetention;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p22 .. p22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p23 .. p23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->a:Ljava/lang/Boolean;

    .line 8
    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->b:Ljava/util/List;

    .line 9
    iput-object p3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->c:Ljava/util/List;

    .line 10
    iput p4, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 11
    iput-object p5, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->e:Ljava/lang/Boolean;

    .line 12
    iput-object p6, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 13
    iput-object p7, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->g:Ljava/lang/String;

    .line 14
    iput-object p8, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->h:Ljava/lang/String;

    .line 15
    iput-object p9, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    .line 16
    iput-object p10, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->j:Ljava/util/List;

    .line 17
    iput-object p11, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->k:Ljava/util/List;

    .line 18
    iput-object p12, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->l:Ljava/util/List;

    .line 19
    iput-boolean p13, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->m:Z

    .line 20
    iput-boolean p14, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->n:Z

    .line 21
    iput-object p15, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->o:Ljava/lang/Double;

    move/from16 p1, p16

    .line 22
    iput-boolean p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->p:Z

    move-object/from16 p1, p17

    .line 23
    iput-object p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->q:Ljava/lang/String;

    move/from16 p1, p18

    .line 24
    iput-boolean p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->r:Z

    move-object/from16 p1, p19

    .line 25
    iput-object p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->s:Ljava/lang/Boolean;

    move-object/from16 p1, p20

    .line 26
    iput-object p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->t:Ljava/lang/Boolean;

    move-object/from16 p1, p21

    .line 27
    iput-object p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->u:Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

    move-object/from16 p1, p22

    .line 28
    iput-object p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->v:Ljava/util/List;

    move-object/from16 p1, p23

    .line 29
    iput-object p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->w:Ljava/util/List;

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
    instance-of v1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

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
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->a:Ljava/lang/Boolean;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->a:Ljava/lang/Boolean;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->b:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->b:Ljava/util/List;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->c:Ljava/util/List;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->c:Ljava/util/List;

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
    iget v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 47
    .line 48
    iget v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 49
    .line 50
    if-eq v1, v3, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->e:Ljava/lang/Boolean;

    .line 54
    .line 55
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->e:Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 65
    .line 66
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->g:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->g:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->h:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->h:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_9

    .line 95
    .line 96
    return v2

    .line 97
    :cond_9
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    .line 98
    .line 99
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    .line 100
    .line 101
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_a

    .line 106
    .line 107
    return v2

    .line 108
    :cond_a
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->j:Ljava/util/List;

    .line 109
    .line 110
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->j:Ljava/util/List;

    .line 111
    .line 112
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_b

    .line 117
    .line 118
    return v2

    .line 119
    :cond_b
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->k:Ljava/util/List;

    .line 120
    .line 121
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->k:Ljava/util/List;

    .line 122
    .line 123
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_c

    .line 128
    .line 129
    return v2

    .line 130
    :cond_c
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->l:Ljava/util/List;

    .line 131
    .line 132
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->l:Ljava/util/List;

    .line 133
    .line 134
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_d

    .line 139
    .line 140
    return v2

    .line 141
    :cond_d
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->m:Z

    .line 142
    .line 143
    iget-boolean v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->m:Z

    .line 144
    .line 145
    if-eq v1, v3, :cond_e

    .line 146
    .line 147
    return v2

    .line 148
    :cond_e
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->n:Z

    .line 149
    .line 150
    iget-boolean v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->n:Z

    .line 151
    .line 152
    if-eq v1, v3, :cond_f

    .line 153
    .line 154
    return v2

    .line 155
    :cond_f
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->o:Ljava/lang/Double;

    .line 156
    .line 157
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->o:Ljava/lang/Double;

    .line 158
    .line 159
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-nez v1, :cond_10

    .line 164
    .line 165
    return v2

    .line 166
    :cond_10
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->p:Z

    .line 167
    .line 168
    iget-boolean v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->p:Z

    .line 169
    .line 170
    if-eq v1, v3, :cond_11

    .line 171
    .line 172
    return v2

    .line 173
    :cond_11
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->q:Ljava/lang/String;

    .line 174
    .line 175
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->q:Ljava/lang/String;

    .line 176
    .line 177
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-nez v1, :cond_12

    .line 182
    .line 183
    return v2

    .line 184
    :cond_12
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->r:Z

    .line 185
    .line 186
    iget-boolean v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->r:Z

    .line 187
    .line 188
    if-eq v1, v3, :cond_13

    .line 189
    .line 190
    return v2

    .line 191
    :cond_13
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->s:Ljava/lang/Boolean;

    .line 192
    .line 193
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->s:Ljava/lang/Boolean;

    .line 194
    .line 195
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-nez v1, :cond_14

    .line 200
    .line 201
    return v2

    .line 202
    :cond_14
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->t:Ljava/lang/Boolean;

    .line 203
    .line 204
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->t:Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-nez v1, :cond_15

    .line 211
    .line 212
    return v2

    .line 213
    :cond_15
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->u:Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

    .line 214
    .line 215
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->u:Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

    .line 216
    .line 217
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-nez v1, :cond_16

    .line 222
    .line 223
    return v2

    .line 224
    :cond_16
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->v:Ljava/util/List;

    .line 225
    .line 226
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->v:Ljava/util/List;

    .line 227
    .line 228
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-nez v1, :cond_17

    .line 233
    .line 234
    return v2

    .line 235
    :cond_17
    iget-object p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->w:Ljava/util/List;

    .line 236
    .line 237
    iget-object p1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->w:Ljava/util/List;

    .line 238
    .line 239
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    if-nez p0, :cond_18

    .line 244
    .line 245
    return v2

    .line 246
    :cond_18
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->a:Ljava/lang/Boolean;

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
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

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
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->b:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->c:Ljava/util/List;

    .line 22
    .line 23
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 28
    .line 29
    invoke-static {v3, v1, v2}, Lcom/appsflyer/internal/j;->a(III)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->e:Ljava/lang/Boolean;

    .line 34
    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    move v3, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    :goto_1
    add-int/2addr v1, v3

    .line 44
    mul-int/2addr v1, v2

    .line 45
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->g:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->h:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    .line 64
    .line 65
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->j:Ljava/util/List;

    .line 70
    .line 71
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->k:Ljava/util/List;

    .line 76
    .line 77
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->l:Ljava/util/List;

    .line 82
    .line 83
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    iget-boolean v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->m:Z

    .line 88
    .line 89
    invoke-static {v1, v2, v3}, Len;->h(IIZ)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    iget-boolean v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->n:Z

    .line 94
    .line 95
    invoke-static {v1, v2, v3}, Len;->h(IIZ)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->o:Ljava/lang/Double;

    .line 100
    .line 101
    if-nez v3, :cond_2

    .line 102
    .line 103
    move v3, v0

    .line 104
    goto :goto_2

    .line 105
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    :goto_2
    add-int/2addr v1, v3

    .line 110
    mul-int/2addr v1, v2

    .line 111
    iget-boolean v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->p:Z

    .line 112
    .line 113
    invoke-static {v1, v2, v3}, Len;->h(IIZ)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->q:Ljava/lang/String;

    .line 118
    .line 119
    if-nez v3, :cond_3

    .line 120
    .line 121
    move v3, v0

    .line 122
    goto :goto_3

    .line 123
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    :goto_3
    add-int/2addr v1, v3

    .line 128
    mul-int/2addr v1, v2

    .line 129
    iget-boolean v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->r:Z

    .line 130
    .line 131
    invoke-static {v1, v2, v3}, Len;->h(IIZ)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->s:Ljava/lang/Boolean;

    .line 136
    .line 137
    if-nez v3, :cond_4

    .line 138
    .line 139
    move v3, v0

    .line 140
    goto :goto_4

    .line 141
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    :goto_4
    add-int/2addr v1, v3

    .line 146
    mul-int/2addr v1, v2

    .line 147
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->t:Ljava/lang/Boolean;

    .line 148
    .line 149
    if-nez v3, :cond_5

    .line 150
    .line 151
    move v3, v0

    .line 152
    goto :goto_5

    .line 153
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    :goto_5
    add-int/2addr v1, v3

    .line 158
    mul-int/2addr v1, v2

    .line 159
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->u:Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

    .line 160
    .line 161
    if-nez v3, :cond_6

    .line 162
    .line 163
    goto :goto_6

    .line 164
    :cond_6
    invoke-virtual {v3}, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->hashCode()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    :goto_6
    add-int/2addr v1, v0

    .line 169
    mul-int/2addr v1, v2

    .line 170
    iget-object v0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->v:Ljava/util/List;

    .line 171
    .line 172
    invoke-static {v1, v2, v0}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    iget-object p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->w:Ljava/util/List;

    .line 177
    .line 178
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    add-int/2addr p0, v0

    .line 183
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TCFVendor(consent="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->a:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", features="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", flexiblePurposes="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->c:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", id="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", legitimateInterestConsent="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->e:Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", legitimateInterestPurposes="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", name="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", policyUrl="

    .line 69
    .line 70
    const-string v2, ", purposes="

    .line 71
    .line 72
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->g:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v4, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->h:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", restrictions="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->j:Ljava/util/List;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", specialFeatures="

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->k:Ljava/util/List;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ", specialPurposes="

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->l:Ljava/util/List;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, ", showConsentToggle="

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->m:Z

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v1, ", showLegitimateInterestToggle="

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->n:Z

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v1, ", cookieMaxAgeSeconds="

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->o:Ljava/lang/Double;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v1, ", usesNonCookieAccess="

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->p:Z

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v1, ", deviceStorageDisclosureUrl="

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->q:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v1, ", usesCookies="

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->r:Z

    .line 170
    .line 171
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v1, ", cookieRefresh="

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->s:Ljava/lang/Boolean;

    .line 180
    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v1, ", dataSharedOutsideEU="

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->t:Ljava/lang/Boolean;

    .line 190
    .line 191
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v1, ", dataRetention="

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->u:Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string v1, ", dataCategories="

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->v:Ljava/util/List;

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v1, ", vendorUrls="

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    iget-object p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->w:Ljava/util/List;

    .line 220
    .line 221
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string p0, ")"

    .line 225
    .line 226
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0
.end method
