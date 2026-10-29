.class public final enum Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

.field public static final enum ALLOW:Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

.field public static final enum CANCEL:Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;


# instance fields
.field private final value:I


# direct methods
.method private static synthetic $values()[Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;
    .locals 2

    .line 1
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->CANCEL:Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 2
    .line 3
    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->ALLOW:Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 2
    .line 3
    const-string v1, "CANCEL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->CANCEL:Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 10
    .line 11
    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 12
    .line 13
    const-string v1, "ALLOW"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->ALLOW:Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 20
    .line 21
    invoke-static {}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->$values()[Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->$VALUES:[Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 26
    .line 27
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static fromValue(I)Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;
    .locals 5

    .line 1
    invoke-static {}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->values()[Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    iget v4, v3, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->value:I

    .line 12
    .line 13
    if-ne p0, v4, :cond_0

    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const-string v0, "No enum constant: "

    .line 20
    .line 21
    invoke-static {p0, v0}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;
    .locals 1

    .line 1
    const-class v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;
    .locals 1

    .line 1
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->$VALUES:[Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public equalsValue(I)Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->value:I

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public rawValue()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->value:I

    .line 2
    .line 3
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->value:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
