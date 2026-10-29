.class public final enum Lwk2;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final enum b:Lwk2;

.field public static final enum c:Lwk2;

.field public static final synthetic d:[Lwk2;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lwk2;

    .line 2
    .line 3
    const-string v1, "FIRST_LAYER"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lwk2;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lwk2;->b:Lwk2;

    .line 11
    .line 12
    new-instance v1, Lwk2;

    .line 13
    .line 14
    const-string v2, "SECOND_LAYER"

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v1, v2, v3, v4}, Lwk2;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lwk2;->c:Lwk2;

    .line 21
    .line 22
    filled-new-array {v0, v1}, [Lwk2;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lwk2;->d:[Lwk2;

    .line 27
    .line 28
    new-instance v0, Lle0;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lwk2;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwk2;
    .locals 1

    .line 1
    const-class v0, Lwk2;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwk2;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lwk2;
    .locals 1

    .line 1
    sget-object v0, Lwk2;->d:[Lwk2;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lwk2;

    .line 8
    .line 9
    return-object v0
.end method
