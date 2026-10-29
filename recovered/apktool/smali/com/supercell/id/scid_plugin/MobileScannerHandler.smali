.class public final Lcom/supercell/id/scid_plugin/MobileScannerHandler;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/id/scid_plugin/MobileScannerHandler$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001f\u0010\u0019J\r\u0010 \u001a\u00020\u0017\u00a2\u0006\u0004\u0008 \u0010!J\u001f\u0010\"\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0017\u00a2\u0006\u0004\u0008\"\u0010\u001dJ!\u0010&\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00032\u0008\u0010%\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010*\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008*\u0010)J\u0017\u0010+\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008+\u0010)J\u0017\u0010,\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008,\u0010)J\u001f\u0010-\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008-\u0010\'J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008.\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u00100R$\u00104\u001a\u0012\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001701j\u0002`38\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R$\u00107\u001a\u0012\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001701j\u0002`68\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00105R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u00105\u00a8\u0006B"
    }
    d2 = {
        "Lcom/supercell/id/scid_plugin/MobileScannerHandler;",
        "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;",
        "Landroid/app/Application$ActivityLifecycleCallbacks;",
        "Landroid/app/Activity;",
        "activity",
        "Lcom/supercell/id/scid_plugin/BarcodeHandler;",
        "barcodeHandler",
        "Lio/flutter/plugin/common/BinaryMessenger;",
        "binaryMessenger",
        "Lio/flutter/view/TextureRegistry;",
        "textureRegistry",
        "<init>",
        "(Landroid/app/Activity;Lcom/supercell/id/scid_plugin/BarcodeHandler;Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/view/TextureRegistry;)V",
        "",
        "getCameraPermissionStatus",
        "()I",
        "Landroid/content/Context;",
        "context",
        "",
        "canShowScanCode",
        "(Landroid/content/Context;)Z",
        "Lio/flutter/plugin/common/MethodChannel$Result;",
        "result",
        "",
        "requestCameraAccess",
        "(Lio/flutter/plugin/common/MethodChannel$Result;)V",
        "Lio/flutter/plugin/common/MethodCall;",
        "call",
        "start",
        "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V",
        "scanSingleCode",
        "stop",
        "dispose",
        "()V",
        "onMethodCall",
        "p0",
        "Landroid/os/Bundle;",
        "p1",
        "onActivityCreated",
        "(Landroid/app/Activity;Landroid/os/Bundle;)V",
        "onActivityStarted",
        "(Landroid/app/Activity;)V",
        "onActivityResumed",
        "onActivityPaused",
        "onActivityStopped",
        "onActivitySaveInstanceState",
        "onActivityDestroyed",
        "Landroid/app/Activity;",
        "Lcom/supercell/id/scid_plugin/BarcodeHandler;",
        "Lkotlin/Function1;",
        "",
        "Lcom/supercell/id/scid_plugin/MobileScannerCallback;",
        "callback",
        "Lkotlin/jvm/functions/Function1;",
        "Lcom/supercell/id/scid_plugin/MobileScannerErrorCallback;",
        "errorCallback",
        "Lio/flutter/plugin/common/MethodChannel;",
        "methodChannel",
        "Lio/flutter/plugin/common/MethodChannel;",
        "Lcom/supercell/id/scid_plugin/MobileScanner;",
        "mobileScanner",
        "Lcom/supercell/id/scid_plugin/MobileScanner;",
        "requestedCameraAccess",
        "Lio/flutter/plugin/common/MethodChannel$Result;",
        "rotationStateCallback",
        "Companion",
        "scid_plugin_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/supercell/id/scid_plugin/MobileScannerHandler$Companion;

.field private static final NO_CAMERA:I = 0x1

.field private static final PERMISSION_GRANTED:I = 0x3

.field private static final PERMISSION_NOT_GRANTED:I


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final barcodeHandler:Lcom/supercell/id/scid_plugin/BarcodeHandler;

.field private final callback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final errorCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private methodChannel:Lio/flutter/plugin/common/MethodChannel;

.field private mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

.field private requestedCameraAccess:Lio/flutter/plugin/common/MethodChannel$Result;

.field private final rotationStateCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/supercell/id/scid_plugin/MobileScannerHandler$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/supercell/id/scid_plugin/MobileScannerHandler$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->Companion:Lcom/supercell/id/scid_plugin/MobileScannerHandler$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/supercell/id/scid_plugin/BarcodeHandler;Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/view/TextureRegistry;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->activity:Landroid/app/Activity;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->barcodeHandler:Lcom/supercell/id/scid_plugin/BarcodeHandler;

    .line 19
    .line 20
    new-instance v4, Ljj1;

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-direct {v4, p0, p2}, Ljj1;-><init>(Lcom/supercell/id/scid_plugin/MobileScannerHandler;I)V

    .line 24
    .line 25
    .line 26
    iput-object v4, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->callback:Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    new-instance v5, Ljj1;

    .line 29
    .line 30
    const/4 p2, 0x1

    .line 31
    invoke-direct {v5, p0, p2}, Ljj1;-><init>(Lcom/supercell/id/scid_plugin/MobileScannerHandler;I)V

    .line 32
    .line 33
    .line 34
    iput-object v5, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->errorCallback:Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    new-instance v3, Ljj1;

    .line 37
    .line 38
    const/4 p2, 0x2

    .line 39
    invoke-direct {v3, p0, p2}, Ljj1;-><init>(Lcom/supercell/id/scid_plugin/MobileScannerHandler;I)V

    .line 40
    .line 41
    .line 42
    iput-object v3, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->rotationStateCallback:Lkotlin/jvm/functions/Function1;

    .line 43
    .line 44
    new-instance p2, Lio/flutter/plugin/common/MethodChannel;

    .line 45
    .line 46
    const-string v0, "com.supercell.id.ScidPlugin.mobile_scanner/method"

    .line 47
    .line 48
    invoke-direct {p2, p3, v0}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    .line 52
    .line 53
    invoke-virtual {p2, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 57
    .line 58
    move-object v1, p1

    .line 59
    move-object v2, p4

    .line 60
    invoke-direct/range {v0 .. v5}, Lcom/supercell/id/scid_plugin/MobileScanner;-><init>(Landroid/app/Activity;Lio/flutter/view/TextureRegistry;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/supercell/id/scid_plugin/MobileScanner;->onCreate()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static synthetic a(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->start$lambda$9$lambda$8(Ljava/lang/Exception;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Exception;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->start$lambda$9(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Exception;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Lcom/supercell/id/scid_plugin/MobileScannerHandler;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->callback$lambda$0(Lcom/supercell/id/scid_plugin/MobileScannerHandler;Ljava/lang/String;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final callback$lambda$0(Lcom/supercell/id/scid_plugin/MobileScannerHandler;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->barcodeHandler:Lcom/supercell/id/scid_plugin/BarcodeHandler;

    .line 5
    .line 6
    new-instance v0, Lkotlin/Pair;

    .line 7
    .line 8
    const-string v1, "name"

    .line 9
    .line 10
    const-string v2, "barcode"

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lkotlin/Pair;

    .line 16
    .line 17
    const-string v2, "data"

    .line 18
    .line 19
    invoke-direct {v1, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1}, Lcom/supercell/id/scid_plugin/BarcodeHandler;->publishEvent(Ljava/util/Map;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0
.end method

.method private final canShowScanCode(Landroid/content/Context;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "android.hardware.camera"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/16 v0, 0x1000

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    array-length p1, p0

    .line 30
    move v0, v1

    .line 31
    :goto_0
    if-ge v0, p1, :cond_2

    .line 32
    .line 33
    aget-object v2, p0, v0

    .line 34
    .line 35
    const-string v3, "android.permission.CAMERA"

    .line 36
    .line 37
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catch_0
    :cond_2
    return v1
.end method

.method public static synthetic d(Lcom/supercell/id/scid_plugin/MobileScannerHandler;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->rotationStateCallback$lambda$2(Lcom/supercell/id/scid_plugin/MobileScannerHandler;I)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lio/flutter/plugin/common/MethodChannel$Result;Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->start$lambda$7(Lio/flutter/plugin/common/MethodChannel$Result;Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final errorCallback$lambda$1(Lcom/supercell/id/scid_plugin/MobileScannerHandler;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->barcodeHandler:Lcom/supercell/id/scid_plugin/BarcodeHandler;

    .line 5
    .line 6
    new-instance v0, Lkotlin/Pair;

    .line 7
    .line 8
    const-string v1, "name"

    .line 9
    .line 10
    const-string v2, "error"

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lkotlin/Pair;

    .line 16
    .line 17
    const-string v2, "data"

    .line 18
    .line 19
    invoke-direct {v1, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1}, Lcom/supercell/id/scid_plugin/BarcodeHandler;->publishEvent(Ljava/util/Map;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0
.end method

.method public static synthetic f(Lio/flutter/plugin/common/MethodChannel$Result;Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->start$lambda$7$lambda$6(Lio/flutter/plugin/common/MethodChannel$Result;Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/supercell/id/scid_plugin/MobileScannerHandler;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->errorCallback$lambda$1(Lcom/supercell/id/scid_plugin/MobileScannerHandler;Ljava/lang/String;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getCameraPermissionStatus()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->canShowScanCode(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->activity:Landroid/app/Activity;

    .line 12
    .line 13
    const-string v0, "android.permission.CAMERA"

    .line 14
    .line 15
    invoke-static {p0, v0}, Lv00;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    const/4 p0, 0x3

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method private final requestCameraAccess(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->requestedCameraAccess:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p0, "Another request is ongoing and multiple requests cannot be handled at once."

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const-string v1, "CameraPermissionsRequestOngoing"

    .line 9
    .line 10
    invoke-interface {p1, v1, p0, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->requestedCameraAccess:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 15
    .line 16
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->activity:Landroid/app/Activity;

    .line 17
    .line 18
    const-string p1, "android.permission.CAMERA"

    .line 19
    .line 20
    filled-new-array {p1}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-static {p0, p1, v0}, Lx2;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private static final rotationStateCallback$lambda$2(Lcom/supercell/id/scid_plugin/MobileScannerHandler;I)Lkotlin/Unit;
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->barcodeHandler:Lcom/supercell/id/scid_plugin/BarcodeHandler;

    .line 2
    .line 3
    new-instance v0, Lkotlin/Pair;

    .line 4
    .line 5
    const-string v1, "name"

    .line 6
    .line 7
    const-string v2, "rotation"

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v1, Lkotlin/Pair;

    .line 17
    .line 18
    const-string v2, "data"

    .line 19
    .line 20
    invoke-direct {v1, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lcom/supercell/id/scid_plugin/BarcodeHandler;->publishEvent(Ljava/util/Map;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method

.method private final scanSingleCode(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/supercell/id/scid_plugin/MobileScanner;->scanSingleCode()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    invoke-interface {p1, p0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final start(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 8

    .line 1
    const-string v0, "viewFinderSize"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    const-string v1, "height"

    .line 10
    .line 11
    const-string v2, "width"

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    instance-of v5, v4, Ljava/lang/Double;

    .line 21
    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    check-cast v4, Ljava/lang/Double;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v4, v3

    .line 28
    :goto_0
    if-eqz v4, :cond_1

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    double-to-int v4, v4

    .line 35
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-object v4, v3

    .line 41
    :goto_1
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    instance-of v5, v0, Ljava/lang/Double;

    .line 46
    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    check-cast v0, Ljava/lang/Double;

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v0, v3

    .line 53
    :goto_2
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 56
    .line 57
    .line 58
    move-result-wide v5

    .line 59
    double-to-int v0, v5

    .line 60
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    goto :goto_3

    .line 65
    :cond_3
    move-object v0, v3

    .line 66
    :goto_3
    if-eqz v4, :cond_4

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    new-instance v5, Landroid/util/Size;

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-direct {v5, v4, v0}, Landroid/util/Size;-><init>(II)V

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_4
    move-object v5, v3

    .line 85
    :goto_4
    const-string v0, "scanWindowSize"

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Ljava/util/Map;

    .line 92
    .line 93
    if-eqz p1, :cond_9

    .line 94
    .line 95
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    instance-of v2, v0, Ljava/lang/Double;

    .line 100
    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    check-cast v0, Ljava/lang/Double;

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_5
    move-object v0, v3

    .line 107
    :goto_5
    if-eqz v0, :cond_6

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 110
    .line 111
    .line 112
    move-result-wide v6

    .line 113
    double-to-int v0, v6

    .line 114
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    goto :goto_6

    .line 119
    :cond_6
    move-object v0, v3

    .line 120
    :goto_6
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    instance-of v1, p1, Ljava/lang/Double;

    .line 125
    .line 126
    if-eqz v1, :cond_7

    .line 127
    .line 128
    check-cast p1, Ljava/lang/Double;

    .line 129
    .line 130
    goto :goto_7

    .line 131
    :cond_7
    move-object p1, v3

    .line 132
    :goto_7
    if-eqz p1, :cond_8

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 135
    .line 136
    .line 137
    move-result-wide v1

    .line 138
    double-to-int p1, v1

    .line 139
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    goto :goto_8

    .line 144
    :cond_8
    move-object p1, v3

    .line 145
    :goto_8
    if-eqz v0, :cond_9

    .line 146
    .line 147
    if-eqz p1, :cond_9

    .line 148
    .line 149
    new-instance v3, Landroid/util/Size;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    invoke-direct {v3, v0, p1}, Landroid/util/Size;-><init>(II)V

    .line 160
    .line 161
    .line 162
    :cond_9
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 163
    .line 164
    if-eqz p0, :cond_a

    .line 165
    .line 166
    new-instance p1, Lij1;

    .line 167
    .line 168
    const/4 v0, 0x0

    .line 169
    invoke-direct {p1, v0, p2}, Lij1;-><init>(ILio/flutter/plugin/common/MethodChannel$Result;)V

    .line 170
    .line 171
    .line 172
    new-instance v0, Lij1;

    .line 173
    .line 174
    const/4 v1, 0x2

    .line 175
    invoke-direct {v0, v1, p2}, Lij1;-><init>(ILio/flutter/plugin/common/MethodChannel$Result;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, v5, v3, p1, v0}, Lcom/supercell/id/scid_plugin/MobileScanner;->start(Landroid/util/Size;Landroid/util/Size;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 179
    .line 180
    .line 181
    :cond_a
    return-void
.end method

.method private static final start$lambda$7(Lio/flutter/plugin/common/MethodChannel$Result;Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;)Lkotlin/Unit;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lji1;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, v2, p0, p1}, Lji1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0
.end method

.method private static final start$lambda$7$lambda$6(Lio/flutter/plugin/common/MethodChannel$Result;Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;->getId()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lkotlin/Pair;

    .line 10
    .line 11
    const-string v2, "textureId"

    .line 12
    .line 13
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;->getRotation()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v2, Lkotlin/Pair;

    .line 25
    .line 26
    const-string v3, "rotation"

    .line 27
    .line 28
    invoke-direct {v2, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;->getWidth()D

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v3, Lkotlin/Pair;

    .line 40
    .line 41
    const-string v4, "width"

    .line 42
    .line 43
    invoke-direct {v3, v4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;->getHeight()D

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v0, Lkotlin/Pair;

    .line 55
    .line 56
    const-string v4, "height"

    .line 57
    .line 58
    invoke-direct {v0, v4, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    filled-new-array {v3, v0}, [Lkotlin/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v0, Lkotlin/Pair;

    .line 70
    .line 71
    const-string v3, "size"

    .line 72
    .line 73
    invoke-direct {v0, v3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    filled-new-array {v1, v2, v0}, [Lkotlin/Pair;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-interface {p0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method private static final start$lambda$9(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Exception;)Lkotlin/Unit;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lhj1;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, p1, p0, v2}, Lhj1;-><init>(Ljava/lang/Exception;Lio/flutter/plugin/common/MethodChannel$Result;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0
.end method

.method private static final start$lambda$9$lambda$8(Ljava/lang/Exception;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    .line 1
    instance-of v0, p0, Lcom/supercell/id/scid_plugin/AlreadyStarted;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "MobileScanner"

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Called start() while already started"

    .line 9
    .line 10
    invoke-interface {p1, v2, p0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    instance-of v0, p0, Lcom/supercell/id/scid_plugin/CameraError;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const-string p0, "Error occurred when setting up camera!"

    .line 19
    .line 20
    invoke-interface {p1, v2, p0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    instance-of p0, p0, Lcom/supercell/id/scid_plugin/NoCamera;

    .line 25
    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    const-string p0, "No camera found or failed to open camera!"

    .line 29
    .line 30
    invoke-interface {p1, v2, p0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    const-string p0, "Unknown error occurred."

    .line 35
    .line 36
    invoke-interface {p1, v2, p0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private final stop(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/supercell/id/scid_plugin/MobileScanner;->stop()V

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/supercell/id/scid_plugin/AlreadyStopped; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iput-object v1, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/supercell/id/scid_plugin/MobileScanner;->onDestroy()V

    .line 25
    .line 26
    .line 27
    :cond_1
    iput-object v1, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->requestedCameraAccess:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    const-string v2, "MobileScanner"

    .line 34
    .line 35
    const-string v3, "Plugin disposed before responding."

    .line 36
    .line 37
    invoke-interface {v0, v2, v3, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iput-object v1, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->requestedCameraAccess:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 41
    .line 42
    return-void
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->activity:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/supercell/id/scid_plugin/MobileScanner;->onCreate()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->activity:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/supercell/id/scid_plugin/MobileScanner;->onDestroy()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->activity:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/supercell/id/scid_plugin/MobileScanner;->onPause()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->activity:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    iget-object p1, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->requestedCameraAccess:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->requestedCameraAccess:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->activity:Landroid/app/Activity;

    .line 20
    .line 21
    const-string v1, "android.permission.CAMERA"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lv00;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/supercell/id/scid_plugin/MobileScanner;->onResume()V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->activity:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/supercell/id/scid_plugin/MobileScanner;->onStart()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->activity:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/supercell/id/scid_plugin/MobileScanner;->onStop()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->mobileScanner:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 12
    .line 13
    const-string p1, "Called "

    .line 14
    .line 15
    const-string v0, " before initializing."

    .line 16
    .line 17
    invoke-static {p1, p0, v0}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 p1, 0x0

    .line 22
    const-string v0, "MobileScanner"

    .line 23
    .line 24
    invoke-interface {p2, v0, p0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v0, :cond_5

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sparse-switch v1, :sswitch_data_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :sswitch_0
    const-string p1, "scanSingleCode"

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-direct {p0, p2}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->scanSingleCode(Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :sswitch_1
    const-string p1, "request"

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-direct {p0, p2}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->requestCameraAccess(Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :sswitch_2
    const-string p1, "state"

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_5

    .line 73
    .line 74
    invoke-direct {p0}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->getCameraPermissionStatus()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-interface {p2, p0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :sswitch_3
    const-string v1, "start"

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_3

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    invoke-direct {p0, p1, p2}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->start(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :sswitch_4
    const-string p1, "stop"

    .line 100
    .line 101
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_4

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    invoke-direct {p0, p2}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->stop(Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_5
    :goto_0
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    nop

    .line 117
    :sswitch_data_0
    .sparse-switch
        0x360802 -> :sswitch_4
        0x68ac462 -> :sswitch_3
        0x68ac491 -> :sswitch_2
        0x414ef28f -> :sswitch_1
        0x4520acb2 -> :sswitch_0
    .end sparse-switch
.end method
