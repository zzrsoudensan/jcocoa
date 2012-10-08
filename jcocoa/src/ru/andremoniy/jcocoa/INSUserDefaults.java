package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSArray;
import static ns.NSArray.*;
import ns.INSArray;
import static ns.INSArray.*;
import ns.NSDictionary;
import static ns.NSDictionary.*;
import ns.INSDictionary;
import static ns.INSDictionary.*;
import ns.NSData;
import static ns.NSData.*;
import ns.INSData;
import static ns.INSData.*;
import ns.NSURL;
import static ns.NSURL.*;
import ns.INSURL;
import static ns.INSURL.*;

import ns.NSObject;

public abstract class INSUserDefaults extends NSObject {

	protected NSObject _private;
	protected void _reserved;

	public NSObject init() { return null;
};
	public NSObject initWithUser(String username) { return null;
};
	public NSObject objectForKey(String defaultName) { return null;
};
	public void setObject(NSObject value, String defaultName) { return ;
};
	public void removeObjectForKey(String defaultName) { return ;
};
	public String stringForKey(String defaultName) { return null;
};
	public NSArray arrayForKey(String defaultName) { return null;
};
	public NSDictionary dictionaryForKey(String defaultName) { return null;
};
	public NSData dataForKey(String defaultName) { return null;
};
	public NSArray stringArrayForKey(String defaultName) { return null;
};
	public Integer integerForKey(String defaultName) { return null;
};
	public double floatForKey(String defaultName) { return null;
};
	public double doubleForKey(String defaultName) { return null;
};
	public Boolean boolForKey(String defaultName) { return null;
};
	public NSURL URLForKey(String defaultName) { return null;
};
	public void setInteger(Integer value, String defaultName) { return ;
};
	public void setFloat(double value, String defaultName) { return ;
};
	public void setDouble(double value, String defaultName) { return ;
};
	public void setBool(Boolean value, String defaultName) { return ;
};
	public void setURL(NSURL url, String defaultName) { return ;
};
	public void registerDefaults(NSDictionary registrationDictionary) { return ;
};
	public void addSuiteNamed(String suiteName) { return ;
};
	public void removeSuiteNamed(String suiteName) { return ;
};
	public NSDictionary dictionaryRepresentation() { return null;
};
	public NSArray volatileDomainNames() { return null;
};
	public NSDictionary volatileDomainForName(String domainName) { return null;
};
	public void setVolatileDomain(NSDictionary domain, String domainName) { return ;
};
	public void removeVolatileDomainForName(String domainName) { return ;
};
	public NSArray persistentDomainNames() { return null;
};
	public NSDictionary persistentDomainForName(String domainName) { return null;
};
	public void setPersistentDomain(NSDictionary domain, String domainName) { return ;
};
	public void removePersistentDomainForName(String domainName) { return ;
};
	public Boolean synchronize() { return null;
};
}