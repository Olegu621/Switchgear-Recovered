.class public final enum Lr42;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final enum a:Lr42;

.field public static final enum b:Lr42;

.field public static final enum c:Lr42;

.field public static final enum d:Lr42;

.field public static final synthetic e:[Lr42;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lr42;

    .line 2
    .line 3
    const-string v1, "OTHER"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lr42;

    .line 10
    .line 11
    const-string v2, "ORIENTATION"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lr42;

    .line 18
    .line 19
    const-string v3, "BYTE_SEGMENTS"

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    sput-object v2, Lr42;->a:Lr42;

    .line 26
    .line 27
    new-instance v3, Lr42;

    .line 28
    .line 29
    const-string v4, "ERROR_CORRECTION_LEVEL"

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    sput-object v3, Lr42;->b:Lr42;

    .line 36
    .line 37
    new-instance v4, Lr42;

    .line 38
    .line 39
    const-string v5, "ISSUE_NUMBER"

    .line 40
    .line 41
    const/4 v6, 0x4

    .line 42
    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    new-instance v5, Lr42;

    .line 46
    .line 47
    const-string v6, "SUGGESTED_PRICE"

    .line 48
    .line 49
    const/4 v7, 0x5

    .line 50
    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    new-instance v6, Lr42;

    .line 54
    .line 55
    const-string v7, "POSSIBLE_COUNTRY"

    .line 56
    .line 57
    const/4 v8, 0x6

    .line 58
    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    new-instance v7, Lr42;

    .line 62
    .line 63
    const-string v8, "UPC_EAN_EXTENSION"

    .line 64
    .line 65
    const/4 v9, 0x7

    .line 66
    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    new-instance v8, Lr42;

    .line 70
    .line 71
    const-string v9, "PDF417_EXTRA_METADATA"

    .line 72
    .line 73
    const/16 v10, 0x8

    .line 74
    .line 75
    invoke-direct {v8, v9, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    new-instance v9, Lr42;

    .line 79
    .line 80
    const-string v10, "STRUCTURED_APPEND_SEQUENCE"

    .line 81
    .line 82
    const/16 v11, 0x9

    .line 83
    .line 84
    invoke-direct {v9, v10, v11}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    sput-object v9, Lr42;->c:Lr42;

    .line 88
    .line 89
    new-instance v10, Lr42;

    .line 90
    .line 91
    const-string v11, "STRUCTURED_APPEND_PARITY"

    .line 92
    .line 93
    const/16 v12, 0xa

    .line 94
    .line 95
    invoke-direct {v10, v11, v12}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    sput-object v10, Lr42;->d:Lr42;

    .line 99
    .line 100
    filled-new-array/range {v0 .. v10}, [Lr42;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sput-object v0, Lr42;->e:[Lr42;

    .line 105
    .line 106
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr42;
    .locals 1

    .line 1
    const-class v0, Lr42;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lr42;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lr42;
    .locals 1

    .line 1
    sget-object v0, Lr42;->e:[Lr42;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lr42;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lr42;

    .line 8
    .line 9
    return-object v0
.end method
