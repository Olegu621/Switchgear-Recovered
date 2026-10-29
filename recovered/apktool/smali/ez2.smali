.class public final enum Lez2;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final enum U:Lez2;

.field public static final enum V:Lez2;

.field public static final enum W:Lez2;

.field public static final enum X:Lez2;

.field public static final synthetic Y:[Lez2;

.field public static final enum b:Lez2;

.field public static final enum c:Lez2;

.field public static final enum d:Lez2;

.field public static final enum e:Lez2;

.field public static final enum f:Lez2;

.field public static final enum i:Lez2;

.field public static final enum v:Lez2;

.field public static final enum w:Lez2;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lez2;

    .line 2
    .line 3
    const-string v1, "CMP_SHOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lez2;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lez2;->b:Lez2;

    .line 11
    .line 12
    new-instance v1, Lez2;

    .line 13
    .line 14
    const-string v2, "ACCEPT_ALL_FIRST_LAYER"

    .line 15
    .line 16
    const/4 v4, 0x5

    .line 17
    invoke-direct {v1, v2, v3, v4}, Lez2;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lez2;->c:Lez2;

    .line 21
    .line 22
    new-instance v2, Lez2;

    .line 23
    .line 24
    const-string v3, "DENY_ALL_FIRST_LAYER"

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    const/4 v6, 0x6

    .line 28
    invoke-direct {v2, v3, v5, v6}, Lez2;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    sput-object v2, Lez2;->d:Lez2;

    .line 32
    .line 33
    new-instance v3, Lez2;

    .line 34
    .line 35
    const-string v5, "SAVE_FIRST_LAYER"

    .line 36
    .line 37
    const/4 v7, 0x3

    .line 38
    const/4 v8, 0x7

    .line 39
    invoke-direct {v3, v5, v7, v8}, Lez2;-><init>(Ljava/lang/String;II)V

    .line 40
    .line 41
    .line 42
    sput-object v3, Lez2;->e:Lez2;

    .line 43
    .line 44
    move v5, v4

    .line 45
    new-instance v4, Lez2;

    .line 46
    .line 47
    const-string v7, "ACCEPT_ALL_SECOND_LAYER"

    .line 48
    .line 49
    const/4 v9, 0x4

    .line 50
    const/16 v10, 0x8

    .line 51
    .line 52
    invoke-direct {v4, v7, v9, v10}, Lez2;-><init>(Ljava/lang/String;II)V

    .line 53
    .line 54
    .line 55
    sput-object v4, Lez2;->f:Lez2;

    .line 56
    .line 57
    move v7, v5

    .line 58
    new-instance v5, Lez2;

    .line 59
    .line 60
    const-string v9, "DENY_ALL_SECOND_LAYER"

    .line 61
    .line 62
    const/16 v11, 0x9

    .line 63
    .line 64
    invoke-direct {v5, v9, v7, v11}, Lez2;-><init>(Ljava/lang/String;II)V

    .line 65
    .line 66
    .line 67
    sput-object v5, Lez2;->i:Lez2;

    .line 68
    .line 69
    move v7, v6

    .line 70
    new-instance v6, Lez2;

    .line 71
    .line 72
    const-string v9, "SAVE_SECOND_LAYER"

    .line 73
    .line 74
    const/16 v12, 0xa

    .line 75
    .line 76
    invoke-direct {v6, v9, v7, v12}, Lez2;-><init>(Ljava/lang/String;II)V

    .line 77
    .line 78
    .line 79
    sput-object v6, Lez2;->v:Lez2;

    .line 80
    .line 81
    new-instance v7, Lez2;

    .line 82
    .line 83
    const-string v9, "IMPRINT_LINK"

    .line 84
    .line 85
    const/16 v13, 0xc

    .line 86
    .line 87
    invoke-direct {v7, v9, v8, v13}, Lez2;-><init>(Ljava/lang/String;II)V

    .line 88
    .line 89
    .line 90
    sput-object v7, Lez2;->w:Lez2;

    .line 91
    .line 92
    new-instance v8, Lez2;

    .line 93
    .line 94
    const-string v9, "MORE_INFORMATION_LINK"

    .line 95
    .line 96
    const/16 v13, 0xd

    .line 97
    .line 98
    invoke-direct {v8, v9, v10, v13}, Lez2;-><init>(Ljava/lang/String;II)V

    .line 99
    .line 100
    .line 101
    sput-object v8, Lez2;->U:Lez2;

    .line 102
    .line 103
    new-instance v9, Lez2;

    .line 104
    .line 105
    const-string v10, "PRIVACY_POLICY_LINK"

    .line 106
    .line 107
    const/16 v13, 0xe

    .line 108
    .line 109
    invoke-direct {v9, v10, v11, v13}, Lez2;-><init>(Ljava/lang/String;II)V

    .line 110
    .line 111
    .line 112
    sput-object v9, Lez2;->V:Lez2;

    .line 113
    .line 114
    new-instance v10, Lez2;

    .line 115
    .line 116
    const-string v11, "CCPA_TOGGLES_ON"

    .line 117
    .line 118
    const/16 v13, 0xf

    .line 119
    .line 120
    invoke-direct {v10, v11, v12, v13}, Lez2;-><init>(Ljava/lang/String;II)V

    .line 121
    .line 122
    .line 123
    sput-object v10, Lez2;->W:Lez2;

    .line 124
    .line 125
    new-instance v11, Lez2;

    .line 126
    .line 127
    const/16 v12, 0xb

    .line 128
    .line 129
    const/16 v13, 0x10

    .line 130
    .line 131
    const-string v14, "CCPA_TOGGLES_OFF"

    .line 132
    .line 133
    invoke-direct {v11, v14, v12, v13}, Lez2;-><init>(Ljava/lang/String;II)V

    .line 134
    .line 135
    .line 136
    sput-object v11, Lez2;->X:Lez2;

    .line 137
    .line 138
    filled-new-array/range {v0 .. v11}, [Lez2;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    sput-object v0, Lez2;->Y:[Lez2;

    .line 143
    .line 144
    new-instance v0, Lle0;

    .line 145
    .line 146
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lez2;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lez2;
    .locals 1

    .line 1
    const-class v0, Lez2;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lez2;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lez2;
    .locals 1

    .line 1
    sget-object v0, Lez2;->Y:[Lez2;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lez2;

    .line 8
    .line 9
    return-object v0
.end method
